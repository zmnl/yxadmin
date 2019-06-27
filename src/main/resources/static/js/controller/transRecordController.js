app.filter('switchTime', function() {
	return function(text) {
		var d = new Date(text);
		var datetime = d.getFullYear() + '-' + (d.getMonth() + 1) + '-' + d.getDate() + ' ';
		if (d.getHours() < 10)
			datetime += "0";
		datetime += d.getHours()+":";
		if (d.getMinutes() < 10)
			datetime += "0";
		datetime += d.getMinutes();
//		if (d.getSeconds() < 10)
//			datetime += "0";
//		datetime += d.getSeconds();
		return datetime;
	}
});
 
//控制层 
app.controller('transRecordController' ,function($scope,$controller   ,transRecordService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		transRecordService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		transRecordService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		transRecordService.findOne(id).success(
			function(response){
				$scope.entity= response;
				var d = new Date($scope.entity.time);
				var flag = "AM";
				var datetime = "";
				if (d.getMonth()+1 < 10)
					datetime += "0";
				datetime += d.getMonth()+1 + "/";
				if (d.getDate() < 10)
					datetime += "0";
				datetime += d.getDate() + "/" + d.getFullYear() + " ";
				if (d.getHours() >= 12) {
					flag = "PM";
					if (d.getHours() > 13)
						datetime += d.getHours() - 12;
				} else {
					datetime += d.getHours();
				}
				datetime += ":";
				if (d.getMinutes() < 10)
					datetime += "0";
				datetime += d.getMinutes() + " " + flag;
				//
				$("#time1").val(datetime);				
			}
		);				
	}
	
	//保存 
	$scope.save=function(){		
		var pluginStr = $("#time1").val();

		var databaseStr = "";
		var arr = pluginStr.split("/");
		var arr2 = arr[2].split(" ");
		var hour = Number(arr2[1].split(":")[0]);
		databaseStr += arr2[0] + "-" + arr[0] + "-" + arr[1] + "T";
		
		hour -= 8;
		if (arr2[2] == "PM") {
			hour += 12;
		}
		if (hour < 10)
			hour = "0" + hour;
		databaseStr += hour + ":" + arr2[1].split(":")[1] + ":00.000+0000";
		
		$scope.entity.time = databaseStr;
		
		
		
		
		
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=transRecordService.update( $scope.entity ); //修改  
		}else{
			serviceObject=transRecordService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		transRecordService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		transRecordService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	

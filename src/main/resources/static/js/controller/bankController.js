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
		//if (d.getSeconds() < 10)
			//datetime += "0";
		//datetime += d.getSeconds();
		return datetime;
	}
});

//控制层 
app.controller('bankController' ,function($scope,$controller   ,bankService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		bankService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		bankService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		bankService.findOne(id).success(
			function(response){
				$scope.entity= response;
				var d = new Date($scope.entity.createTime);
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
				
				
				
				
				var d1 = new Date($scope.entity.updateTime);
				var flag1 = "AM";
				var datetime1 = "";
				if (d1.getMonth()+1 < 10)
					datetime1 += "0";
				datetime1 += d1.getMonth()+1 + "/";
				if (d1.getDate() < 10)
					datetime1 += "0";
				datetime1 += d1.getDate() + "/" + d1.getFullYear() + " ";
				if (d1.getHours() >= 12) {
					flag1 = "PM";
					if (d1.getHours() > 13)
						datetime1 += d1.getHours() - 12;
				} else {
					datetime1 += d1.getHours();
				}
				datetime1 += ":";
				if (d1.getMinutes() < 10)
					datetime1 += "0";
				datetime1 += d1.getMinutes() + " " + flag1;
				//
				$("#time2").val(datetime1);
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
		
		$scope.entity.createTime = databaseStr;
		
		
		
		var pluginStr1 = $("#time2").val();

		var databaseStr1 = "";
		var arr1 = pluginStr1.split("/");
		var arr22 = arr1[2].split(" ");
		var hour1 = Number(arr22[1].split(":")[0]);
		databaseStr1 += arr22[0] + "-" + arr1[0] + "-" + arr1[1] + "T";
		
		hour1 -= 8;
		if (arr22[2] == "PM") {
			hour1 += 12;
		}
		if (hour1 < 10)
			hour1 = "0" + hour1;
		databaseStr1 += hour1 + ":" + arr22[1].split(":")[1] + ":00.000+0000";
		
		$scope.entity.updateTime = databaseStr1;
		
		
		
		
		
		
		
		
		
		
		
		
		
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=bankService.update( $scope.entity ); //修改  
		}else{
			serviceObject=bankService.add( $scope.entity  );//增加 
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
		bankService.dele( $scope.selectIds ).success(
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
		bankService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	

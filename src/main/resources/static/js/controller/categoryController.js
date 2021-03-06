 //控制层 
app.controller('categoryController' ,function($scope,$controller   ,categoryService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		categoryService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	
	///查询教师
	$scope.selectUser=function(tid){			
		$scope.entity.fromID = tid;
	}
	
	//分页
	$scope.findPage=function(page,rows){			
		categoryService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		categoryService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=categoryService.update( $scope.entity ); //修改  
		}else{
			serviceObject=categoryService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				alert(response.message);
				if(response.success){
					//重新查询 
					
		        	$scope.reloadList();//重新加载
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		categoryService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	
	//查询用户
		$scope.initList2=function(){			
			categoryService.initList2().success(
					function(response){
						$scope.list2=response;	
					}			
			);
		}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		categoryService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	

//服务层
app.service('transRecordService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('/transRecord/findAll');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('/transRecord/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('/transRecord/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('/transRecord/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('/transRecord/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('/transRecord/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('/transRecord/search?page='+page+"&rows="+rows, searchEntity);
	}  
	//画图
	this.draw2=function(){
		return $http.get("/transRecord/getRecord");
	}
	
	
	//查找所有用户
		this.initList2=function(){
			return $http.post('/user/findAll');
		}    	
		
		
		//查找所有用户
		this.initList3=function(){
			return $http.post('/user/findAll');
		}    
});

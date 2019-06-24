//服务层
app.service('bankService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('/bank/findAll');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('/bank/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('/bank/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('/bank/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('/bank/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('/bank/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('/bank/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});

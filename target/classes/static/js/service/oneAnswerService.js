//服务层
app.service('oneAnswerService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('/oneAnswer/findAll');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('/oneAnswer/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('/oneAnswer/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('/oneAnswer/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('/oneAnswer/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('/oneAnswer/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('/oneAnswer/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});

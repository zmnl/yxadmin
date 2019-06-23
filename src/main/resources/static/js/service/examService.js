//服务层
app.service('examService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('/exam/findAll');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('/exam/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('/exam/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('/exam/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('/exam/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('/exam/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('/exam/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});

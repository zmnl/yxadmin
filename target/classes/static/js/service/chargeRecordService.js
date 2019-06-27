//服务层
app.service('chargeRecordService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('/chargeRecord/findAll');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('/chargeRecord/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('/chargeRecord/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('/chargeRecord/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('/chargeRecord/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('/chargeRecord/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('/chargeRecord/search?page='+page+"&rows="+rows, searchEntity);
	}    	
	//搜索
	this.draw2=function(){
		return $http.get("/chargeRecord/getRecord");
	}    	
});

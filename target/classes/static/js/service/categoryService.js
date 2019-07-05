//服务层
app.service('categoryService', function($http) {

	//读取列表数据绑定到表单中
	this.findAll = function() {
		return $http.get('/category/findAll');
	}
	//分页 
	this.findPage = function(page, rows) {
		return $http.get('/category/findPage?page=' + page + '&rows=' + rows);
	}
	//查询实体
	this.findOne = function(id) {
		return $http.get('/category/findOne?id=' + id);
	}
	//增加 
	this.add = function(entity) {
		return $http.post('/category/add', entity);
	}
	//修改 
	this.update = function(entity) {
		return $http.post('/category/update', entity);
	}
	//删除
	this.dele = function(ids) {
		return $http.get('/category/delete?ids=' + ids);
	}
	//搜索
	this.search = function(page, rows, searchEntity) {
		return $http.post('/category/search?page=' + page + "&rows=" + rows, searchEntity);
	}

	//查找所有用户ID
	this.initList2 = function() {
		return $http.post('/user/findAll');
	}

});
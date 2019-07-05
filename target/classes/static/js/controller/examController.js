app.filter('switchTime', function() {
	return function(text) {
		var d = new Date(text);
		var datetime = d.getFullYear() + '-' + (d.getMonth() + 1) + '-' + d.getDate() + ' ';
		if (d.getHours() < 10)
			datetime += "0";
		datetime += d.getHours() + ":";
		if (d.getMinutes() < 10)
			datetime += "0";
		datetime += d.getMinutes() ;
//		if (d.getSeconds() < 10)
//			datetime += "0";
//		datetime += d.getSeconds();
		return datetime;
	}
});
app.filter('getPic', function() {
	return function(text) {
		return text.split(",")[0];
	}
});
app.filter('getMarks', function() {
	return function(text) {
		var i = text.indexOf(",");
		return text.substr(i + 1, text.length);
	}
});



//控制层 
app.controller('examController', function($scope, $controller, examService) {

	$controller('baseController', {
		$scope : $scope
	}); //继承

	//读取列表数据绑定到表单中  
	$scope.findAll = function() {
		examService.findAll().success(
			function(response) {
				$scope.list = response;
			}
		);
	}
	
	
	//查询教师
	$scope.selectTeacher=function(tid){			
		$scope.entity.teacherId = tid;
	}
	
	//查询教师
	$scope.initList2=function(){			
		examService.initList2().success(
				function(response){
					$scope.list2=response;	
				}			
		);
	}

	//分页
	$scope.findPage = function(page, rows) {
		examService.findPage(page, rows).success(
			function(response) {
				$scope.list = response.rows;
				$scope.paginationConf.totalItems = response.total; //更新总记录数
			}
		);
	}

	//查询实体 
	$scope.findOne = function(id) {
		examService.findOne(id).success(
			function(response) {
				$scope.entity = response;
				var d = new Date($scope.entity.createTime);
				var flag = "AM";
				var datetime = "";
				if (d.getMonth() + 1 < 10)
					datetime += "0";
				datetime += d.getMonth() + 1 + "/";
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




				var d1 = new Date($scope.entity.timeStart);
				var flag1 = "AM";
				var datetime1 = "";
				if (d1.getMonth() + 1 < 10)
					datetime1 += "0";
				datetime1 += d1.getMonth() + 1 + "/";
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






				var d2 = new Date($scope.entity.timeStop);
				var flag2 = "AM";
				var datetime2 = "";
				if (d2.getMonth() + 1 < 10)
					datetime2 += "0";
				datetime2 += d2.getMonth() + 1 + "/";
				if (d2.getDate() < 10)
					datetime2 += "0";
				datetime2 += d2.getDate() + "/" + d2.getFullYear() + " ";
				if (d2.getHours() >= 12) {
					flag2 = "PM";
					if (d2.getHours() > 13)
						datetime2 += d2.getHours() - 12;
				} else {
					datetime2 += d2.getHours();
				}
				datetime2 += ":";
				if (d2.getMinutes() < 10)
					datetime2 += "0";
				datetime2 += d2.getMinutes() + " " + flag2;
				//
				$("#time3").val(datetime2);





				var d3 = new Date($scope.entity.timePublicMarks);
				var flag3 = "AM";
				var datetime3 = "";
				if (d3.getMonth() + 1 < 10)
					datetime3 += "0";
				datetime3 += d3.getMonth() + 1 + "/";
				if (d3.getDate() < 10)
					datetime3 += "0";
				datetime3 += d3.getDate() + "/" + d3.getFullYear() + " ";
				if (d3.getHours() >= 12) {
					flag3 = "PM";
					if (d3.getHours() > 13)
						datetime3 += d3.getHours() - 12;
				} else {
					datetime3 += d3.getHours();
				}
				datetime3 += ":";
				if (d3.getMinutes() < 10)
					datetime3 += "0";
				datetime3 += d3.getMinutes() + " " + flag3;
				//
				$("#time4").val(datetime3);


			}
		);
	}

	//保存 
	$scope.save = function() {
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

		$scope.entity.timeStart = databaseStr1;



		var pluginStr2 = $("#time3").val();

		var databaseStr2 = "";
		var arr2 = pluginStr2.split("/");
		var arr222 = arr2[2].split(" ");
		var hour2 = Number(arr222[1].split(":")[0]);
		databaseStr2 += arr222[0] + "-" + arr2[0] + "-" + arr2[1] + "T";

		hour2 -= 8;
		if (arr222[2] == "PM") {
			hour2 += 12;
		}
		if (hour2 < 10)
			hour2 = "0" + hour2;
		databaseStr2 += hour2 + ":" + arr222[1].split(":")[1] + ":00.000+0000";

		$scope.entity.timeStop = databaseStr2;



		var pluginStr3 = $("#time4").val();

		var databaseStr3 = "";
		var arr3 = pluginStr3.split("/");
		var arr2222 = arr3[2].split(" ");
		var hour3 = Number(arr2222[1].split(":")[0]);
		databaseStr3 += arr2222[0] + "-" + arr3[0] + "-" + arr3[1] + "T";

		hour3 -= 8;
		if (arr2222[2] == "PM") {
			hour3 += 12;
		}
		if (hour3 < 10)
			hour3 = "0" + hour3;
		databaseStr3 += hour3 + ":" + arr2222[1].split(":")[1] + ":00.000+0000";

		$scope.entity.timePublicMarks = databaseStr3;






		var serviceObject; //服务层对象  	
		$scope.entity.marks = $("#marks1").val() + "," + $("#marks2").val();
		if ($scope.entity.id != null) { //如果有ID
			serviceObject = examService.update($scope.entity); //修改  
		} else {
			serviceObject = examService.add($scope.entity); //增加 
		}
		serviceObject.success(
			function(response) {
				alert(response.message);
				if (response.success) {
					//重新查询 
					$scope.reloadList(); //重新加载
				} 
			}
		);
	}


	//批量删除 
	$scope.dele = function() {
		//获取选中的复选框			
		examService.dele($scope.selectIds).success(
			function(response) {
				if (response.success) {
					$scope.reloadList(); //刷新列表
					$scope.selectIds = [];
				}
			}
		);
	}
	
	
	//查询教师
	$scope.selectTeacher=function(tid){			
		$scope.entity.teacherId = tid;
	}
	
	//查询教师
	$scope.initList2=function(){			
		examService.initList2().success(
				function(response){
					$scope.list2=response;	
				}			
		);
	}
	
	
	

	$scope.searchEntity = {}; //定义搜索对象 

	//搜索
	$scope.search = function(page, rows) {
		examService.search(page, rows, $scope.searchEntity).success(
			function(response) {
				$scope.list = response.rows;
				$scope.paginationConf.totalItems = response.total; //更新总记录数
			}
		);
	}

});
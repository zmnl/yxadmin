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

function toDecimal(x) {
	var f = parseFloat(x);
	if (isNaN(f)) {
		return;
	}
	f = Math.round(x * 100) / 100;
	return f;
}
//控制层 
app.controller('chargeRecordController', function($scope, $controller, chargeRecordService) {

	$controller('baseController', {
		$scope : $scope
	}); //继承

	//读取列表数据绑定到表单中  
	$scope.draw = function() {
		//1
		//2
		chargeRecordService.draw2().success(
			function(response) {
				var array = response;
				//更新数据
				var total2this = 0;
				for (var temp = 0; temp < 7; temp++) {
					total2this += array[temp];
				}
				$("#total2").html(toDecimal(total2this));
				var total2last = 0;
				for (var temp = 7; temp < 14; temp++) {
					total2last += array[temp];
				}
				var rate2 = (total2this - total2last) / total2last * 100;
				if (rate2 < 0) {
					rate2 = -rate2;
					$("i#arrow2").attr("class", "fa fa-arrow-down");
				} else if (rate2 > 0) {
					$("i#arrow2").attr("class", "fa fa-arrow-up");
				} else {
					$("i#arrow2").attr("class", "");
				}
				$("aaa#rate2").html(toDecimal(rate2) + "%");
				//画图
				var ticksStyle = {
					fontColor : '#495057',
					fontStyle : 'bold'
				}

				var mode = 'index'
				var intersect = true

				var $salesChart = $('#sales-chart2');
				var week = new Date().getDay();
				var weeks = [ "日", "一", "二", "三", "四", "五", "六" ];
				var salesChart = new Chart($salesChart, {
					type : 'bar',
					data : {
						labels : [ weeks[(week - 6 + 7) % 7], weeks[(week - 5 + 7) % 7], weeks[(week - 4 + 7) % 7], weeks[(week - 3 + 7) % 7], weeks[(week - 2 + 7) % 7], weeks[(week - 1 + 7) % 7], weeks[week] ],
						datasets : [
							{
								backgroundColor : '#007bff',
								borderColor : '#007bff',
								data : [ array[6], array[5], array[4], array[3], array[2], array[1], array[0] ]
							},
							{
								backgroundColor : '#ced4da',
								borderColor : '#ced4da',
								data : [ array[13], array[12], array[11], array[10], array[9], array[8], array[7] ]
							}
						]
					},
					options : {
						maintainAspectRatio : false,
						tooltips : {
							mode : mode,
							intersect : intersect
						},
						hover : {
							mode : mode,
							intersect : intersect
						},
						legend : {
							display : false
						},
						scales : {
							yAxes : [ {
								// display: false,
								gridLines : {
									display : true,
									lineWidth : '4px',
									color : 'rgba(0, 0, 0, .2)',
									zeroLineColor : 'transparent'
								},
								ticks : $.extend({
									beginAtZero : true,

									// Include a dollar sign in the ticks
									callback : function(value, index, values) {
										if (value >= 1000) {
											value /= 1000
											value += 'k'
										}
										return '' + value
									}
								}, ticksStyle)
							} ],
							xAxes : [ {
								display : true,
								gridLines : {
									display : false
								},
								ticks : ticksStyle
							} ]
						}
					}
				})
			}
		);

	//3
	//4
	}

	//读取列表数据绑定到表单中  
	$scope.findAll = function() {
		chargeRecordService.findAll().success(
			function(response) {
				$scope.list = response;
			}
		);
	}

	//分页
	$scope.findPage = function(page, rows) {
		chargeRecordService.findPage(page, rows).success(
			function(response) {
				$scope.list = response.rows;
				$scope.paginationConf.totalItems = response.total; //更新总记录数
			}
		);
	}

	
	
	//查询用户
	$scope.initList2=function(){			
		chargeRecordService.initList2().success(
				function(response){
					$scope.list2=response;	
				}			
		);
	}
	
	
	
	//查询教师
		$scope.selectUser=function(tid){			
			$scope.entity.userId = tid;
		}
	//查询实体 
	$scope.findOne = function(id) {
		chargeRecordService.findOne(id).success(
			function(response) {
				$scope.entity = response;
				// database2plugin
				var d = new Date($scope.entity.time);
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
			}
		);
	}

	//保存 
	$scope.save = function() {

		//plugin2database
		//06/26/2019 9:53 AM
		//2019-06-20 08:01:00
		//2019-06-20T00:01:00.000+0000
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
		//
		var serviceObject; //服务层对象  				
		if ($scope.entity.id != null) { //如果有ID
			serviceObject = chargeRecordService.update($scope.entity); //修改  
		} else {
			serviceObject = chargeRecordService.add($scope.entity); //增加 
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
		chargeRecordService.dele($scope.selectIds).success(
			function(response) {
				if (response.success) {
					$scope.reloadList(); //刷新列表
					$scope.selectIds = [];
				}
			}
		);
	}

	$scope.searchEntity = {}; //定义搜索对象 

	//搜索
	$scope.search = function(page, rows) {
		chargeRecordService.search(page, rows, $scope.searchEntity).success(
			function(response) {
				$scope.list = response.rows;
				$scope.paginationConf.totalItems = response.total; //更新总记录数
			}
		);
	}

});
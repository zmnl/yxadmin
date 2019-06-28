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
//		if (d.getSeconds() < 10)
//			datetime += "0";
//		datetime += d.getSeconds();
		return datetime;
	}
});





//控制层 
app.controller('loginRecordController', function($scope, $controller, loginRecordService) {

	$controller('baseController', {
		$scope : $scope
	}); //继承

	function toDecimal(x) {
		var f = parseFloat(x);
		if (isNaN(f)) {
			return;
		}
		f = Math.round(x * 100) / 100;
		return f;
	}


	//读取列表数据绑定到表单中  
	$scope.draw1 = function() {
		loginRecordService.draw1().success(
			function(response) {
				var array = response;
				//更新数据
				var total2this = 0;
				for (var temp = 0; temp < 7; temp++) {
					total2this += array[temp];
				}
				$("#total1").html("$" + total2this);
				var total2last = 0;
				for (var temp = 7; temp < 14; temp++) {
					total2last += array[temp];
				}
				var rate2 = (total2this - total2last) / total2last * 100;
				if (rate2 < 0) {
					rate2 = -rate2;
					$("i#arrow1").attr("class", "fa fa-arrow-down");
				} else if (rate2 > 0) {
					$("i#arrow1").attr("class", "fa fa-arrow-up");
				} else {
					$("i#arrow1").attr("class", "");
				}
				$("aaa#rate1").html(toDecimal(rate2) + "%");
				//画图
				var ticksStyle = {
					fontColor : '#495057',
					fontStyle : 'bold'
				}
				var mode = 'index'
				var intersect = true
				var $visitorsChart = $('#visitors-chart')
				var week = new Date().getDay();
				var weeks = [ "日", "一", "二", "三", "四", "五", "六" ];
				var visitorsChart = new Chart($visitorsChart, {
					data : {
						labels : [ weeks[(week - 6 + 7) % 7], weeks[(week - 5 + 7) % 7], weeks[(week - 4 + 7) % 7], weeks[(week - 3 + 7) % 7], weeks[(week - 2 + 7) % 7], weeks[(week - 1 + 7) % 7], weeks[week] ],
						datasets : [ {
							type : 'line',
							data : [ array[6], array[5], array[4], array[3], array[2], array[1], array[0] ],
							backgroundColor : 'transparent',
							borderColor : '#007bff',
							pointBorderColor : '#007bff',
							pointBackgroundColor : '#007bff',
							fill : false
						// pointHoverBackgroundColor: '#007bff',
						// pointHoverBorderColor    : '#007bff'
						},
							{
								type : 'line',
								data : [ array[13], array[12], array[11], array[10], array[9], array[8], array[7] ],
								backgroundColor : 'tansparent',
								borderColor : '#ced4da',
								pointBorderColor : '#ced4da',
								pointBackgroundColor : '#ced4da',
								fill : false
							// pointHoverBackgroundColor: '#ced4da',
							// pointHoverBorderColor    : '#ced4da'
							} ]
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
									beginAtZero : true
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
			})
	}
	//读取列表数据绑定到表单中  
	$scope.findAll = function() {
		loginRecordService.findAll().success(
			function(response) {
				$scope.list = response;
			}
		);
	}

	//分页
	$scope.findPage = function(page, rows) {
		loginRecordService.findPage(page, rows).success(
			function(response) {
				$scope.list = response.rows;
				$scope.paginationConf.totalItems = response.total; //更新总记录数
			}
		);
	}

	//查询实体 
	$scope.findOne = function(id) {
		loginRecordService.findOne(id).success(
			function(response) {
				$scope.entity = response;
			}
		);
	}

	//保存 
	$scope.save = function() {
		var serviceObject; //服务层对象  				
		if ($scope.entity.id != null) { //如果有ID
			serviceObject = loginRecordService.update($scope.entity); //修改  
		} else {
			serviceObject = loginRecordService.add($scope.entity); //增加 
		}
		serviceObject.success(
			function(response) {
				if (response.success) {
					//重新查询 
					$scope.reloadList(); //重新加载
				} else {
					alert(response.message);
				}
			}
		);
	}


	//批量删除 
	$scope.dele = function() {
		//获取选中的复选框			
		loginRecordService.dele($scope.selectIds).success(
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
		loginRecordService.search(page, rows, $scope.searchEntity).success(
			function(response) {
				$scope.list = response.rows;
				$scope.paginationConf.totalItems = response.total; //更新总记录数
			}
		);
	}
	
	//搜索
	$scope.showLoginRecord = function() {
		loginRecordService.showLoginRecord($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage).success(
				function(response) {
					$scope.records = response.rows;
					$scope.paginationConf.totalItems = response.total; //更新总记录数
				}
		);
	}

});
var app = angular.module('yunxin', [ 'pagination' ]);
app.filter("database2plugin", function() {
	return function(text) {
		var d = new Date(text);
		var flag = "AM";
		var datetime = "";
		if (d.getMonth() < 10)
			datetime += "0";
		datetime += d.getMonth() + "/";
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
		return datetime;
	}
});
//2019-6-20 08:00:00
//06/26/2019 9:53 AM
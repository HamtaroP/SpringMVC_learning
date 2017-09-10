/**
 * 用户类
 */
define(function(require) {
	var $ = require("jquery");
	var user = {
		checkPassword:function(userName,password){
			console.log(userName+":"+password);
			$.ajax({
				   type: "GET",
				   url: "login/checkPassword",
				   data: "userName="+userName+"&password="+password,
				   success: function(msg){
					   $("body").append('<div id="myAlert" class="alert alert-success" style="width:300px;">'+'<a href="#" class="close" data-dismiss="alert">&times;</a>'+
								+'<strong>'+msg+'</strong>结果是成功的。');
						setTimeout(function(){
							$("#myAlert").fadeOut();
						}, 90000);
				   }
			
				});
		}	
	}
	
	return user;
})
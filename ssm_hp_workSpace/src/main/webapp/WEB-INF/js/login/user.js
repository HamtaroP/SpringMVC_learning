/**
 * 用户类
 */
define(function(require) {
	var $ = require("jquery");
	var user = {
			
		//验证用户名密码
		checkPassword:function(userName,password){
			
			//验证数据
			$.ajax({
				   type: "GET",
				   url: "login/checkPassword",
				   data: "userName="+userName+"&password="+password,
				   success: function(msg){
					   var msgjson = JSON.parse(msg);
					   
//					   $("body").append('<div id="myAlert" class="alert alert-success" style="width:300px;">'+'<a href="javascript:void(0)" class="close" data-dismiss="alert">&times;</a>'+
//								'<strong>'+msgjson["userName"]+'</strong>的年龄是'+msgjson["age"]+'</div>');
//						setTimeout(function(){
//							$("#myAlert").remove();
//						}, 6000);
//						$(".close").click(function(){
//							$("#myAlert").remove();
//						})
				   }
			
				});
		}	
	}
	
	return user;
})
/**
 * 用户类
 */
define(function(require) {
	var $ = require("jquery");
	var user = {
		checkPassword:function(userName,password){
			$.ajax({
				   type: "GET",
				   url: "login/checkPassword",
				   data: "userName="+userName+"&password="+password,
				   success: function(msg){
					   $("body").append('<div id="myAlert" class="alert alert-success" style="width:300px;">'+'<a href="javascript:void(0)" class="close" data-dismiss="alert">&times;</a>'+
								'<strong>'+msg+'</strong>结果是成功的。</div>');
						setTimeout(function(){
							$("#myAlert").remove();
						}, 6000);
						$(".close").click(function(){
							$("#myAlert").remove();
						})
				   }
			
				});
		}	
	}
	
	return user;
})
/**
 * 
 */
requirejs.config({
    baseUrl: './',
    paths:{
    	"jquery":"js/jquery-3.2.1",
    	"bootstrap":"bootstrap.min",
    },
    shim:{
    	'bootstrap':['jquery']
    }
});
require(["js/login/user"], function(user){
	$("#test_login").on('click', function(){
		var userName = $("#userName").val();
		var userPassword = $("#userPassword").val();
		user.checkPassword(userName,userPassword);
		
	});
	
})


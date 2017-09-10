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
require(["js/login/teacher"], function(teacher){
	$("#test_login").on('click', function(){
		teacher.addStudent('胡鹏',24);
		teacher.addStudent('周晗菁',23);
		teacher.addStudent('卢春晴',23);
		teacher.showStudents();
	})
})


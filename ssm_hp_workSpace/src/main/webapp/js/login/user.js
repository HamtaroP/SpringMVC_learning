/**
 * 用户类
 */
define(function(require) {
	var $ = require("jquery");
	var User = function(id,userName,userAge){
		this.id = id;
		this.userName = userName;
		this.userAge = userAge;
		this.showInfo = function(){
			alert('名字叫'+this.userName+'的同学，今年'+this.userAge+'岁了');
		}
	}
	
	return User;
})
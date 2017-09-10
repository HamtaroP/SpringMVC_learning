/**
 * 
 */
define(function(require) {
	var $ = require('jquery')
	var User = require('js/login/user');
	var teacher = {
	}
	teacher.students = [];
	teacher.addStudent = function(userName,userAge){
		this.students.push(new User(this.uuid(),userName,userAge));
	}
	teacher.showStudents = function(){
		$.each(this.students, function(i, elt) {
			elt.showInfo();
		})
	}
	teacher.uuid = function(){
		    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
		        var r = Math.random()*16|0, v = c == 'x' ? r : (r&0x3|0x8);
		        return v.toString(16);
		    });
	}
	return teacher;
})
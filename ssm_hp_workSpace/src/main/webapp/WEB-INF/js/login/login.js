/**
 * 
 */
requirejs.config({
    baseUrl: './',
    paths:{
    	"jquery":"js/jquery-3.2.1",
    	"bootstrap":"js/bootstrap.min",
    	"webuploader":"js/webuploader"
    },
    shim:{
    	'bootstrap':['jquery']
    }
});
require(["js/login/user","webuploader"], function(user,WebUploader){
	var uploader = WebUploader.create({
		auto:false,
	    // swf文件路径
	    swf: 'css/Uploader.swf',
	    // 文件接收服务端。
	    server: 'login/uploadFile',
	    // 选择文件的按钮。可选。
	    // 内部根据当前运行是创建，可能是input元素，也可能是flash.
	    pick: '#picker',
	    // 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
	    resize: false,
	    method:'POST',
	    
	});
	// 当有文件被添加进队列的时候
	uploader.on( 'fileQueued', function( file ) {
	    $("#thelist").append( '<div id="' + file.id + '" class="item">' +
	        '<h4 class="info">' + file.name + '</h4>' +
	        '<p class="state">等待上传...</p>' +
	    '</div>' );
	});
	 
	 uploader.on( 'uploadProgress', function( file, percentage ) {  
	       var $li = $( '#'+file.id ),  
	           $percent = $li.find('.progress .progress-bar');  
	       	debugger;
	       // 避免重复创建  
	       if ( !$percent.length ) {  
	           $percent = $('<div class="progress" >'+
	        		   '<div class="progress-bar" role="progressbar" aria-valuenow="60"'+
	        				 'aria-valuemin="0" aria-valuemax="100" >'+
	        				'<span class="sr-only">40% 完成</span>'+
	        		   '</div></div>')  
	                   .appendTo( $li )  
	                   .find('.progress-bar');  
	       }  
	       $percent.css( 'width', percentage * 100 + '%' );  
	   });  
	 $("#ctlBtn").on("click", function() {
	 	uploader.upload();
	 })
	$("#test_login").on('click', function(){
		var userName = $("#userName").val();
		var userPassword = $("#userPassword").val();
		user.checkPassword(userName,userPassword);
		
	});
	
})


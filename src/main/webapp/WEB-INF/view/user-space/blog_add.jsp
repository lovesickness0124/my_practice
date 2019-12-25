<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>发布文章</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css" href="/libs/bootstrap/css/bootstrap.min.css"/>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.9/summernote.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/cms.css"/>
    
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
    </style>
  </head>
  <body>
    <jsp:include page="/WEB-INF/inc/top.jsp"></jsp:include>
	
	<!-- 横幅 -->
	<div class="container">
		<div class="row">
			<div class="col-xs-12 my_banner">
			</div>
		</div>
	</div>
	<br/>
	<!-- 主体内容区 -->
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<jsp:include page="/WEB-INF/inc/my_left.jsp"><jsp:param value="blog" name="module"/></jsp:include>
			</div>
			<div class="col-md-9">
				<div class="panel panel-default">
				  <div class="panel-body">
				    	<h1>发布文章</h1>
				    	<hr/>
				    	<!-- 发布文章的表单 -->
				    	<form modelAttribute="blog" action="publishArticle.do" enctype="multipart/form-data" method="post" >
				    	<hidden path="id"/>
				    	<p align="center" class="red"><errors path="id"/> </p>
				    	<p>
				    		<input name="title" class="form-control" placeholder="文章标题"/>
				    		<span class="red"><errors path="title"/></span>
				    	</p>
				    	<p>
				    		<textarea name="summary" rows="3" class="form-control" placeholder="文章摘要"></textarea>
				    		<span class="red"><errors path="summary"/></span>
				    	</p>
				    	
				    	<p>
				    		<textarea name="content" id="content" rows="20" class="form-control" placeholder="文章内容"></textarea>
				    		<span class="red"><errors path="content"/></span>
				    	</p>
				    	
				  	    	<p>
				  	    	<!-- 栏目 -->
				  	    		<select name="channel_id" class="form-control" id="channel">
				  	    			<c:forEach items="${channelList}" var="c">
				    					<option  value="${c.id}">${c.name}</option>
				  	    			</c:forEach>
				    			</select>
				    		
				    		<span class="red"><errors path="category"/></span>
				    	</p>
				    	
				    	<p>
				    	<!-- 类型 -->
				    		<select name="category_id" class="form-control" id="category">
				    			
				    		</select>
				    		<span class="red"><errors path="category"/></span>
				    	</p>
				    	
				    	<p>上传图片：<input type="file" name="file"/></p>
				    	
				    	<p>
				    		<button type="submit" class="btn btn-info btn-block">保存</button> 
				    	</p>
				    	
				    	</form>
				  </div>
				</div>
				
			</div>
		</div>
	</div>
	
	<jsp:include page="/WEB-INF/inc/footer.jsp"/>
	
	<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.9/summernote.js"></script>
	<!-- 显示了类型 -->
	<script type="text/javascript">
		$("#channel").change(function(){
			var id = $(this).val();
			$("#category option").remove();
			$.post("getcategory.do",{"id":id},function(obj){
				for ( var i in obj) {
					$("#category").append("<option value='"+obj[i].id+"'>"+obj[i].name+"</option>");
				}
			},"json");
		});
	</script>
</body>
</html>
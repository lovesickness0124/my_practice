<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="howsun">

<title></title>

<!-- Bootstrap core CSS-->
<link href="/libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template-->
<link href="/libs/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">

<!-- Custom styles for this template-->
<link href="/libs/sb-admin/sb-admin.css" rel="stylesheet">


</head>
<body>


	<form action="complaindes.do" method="post">
		<input type="hidden" name="pageNum">
	</form>

	<div style="width: 100%;text-align: center;background-color: lightgrey">
		<table class="table table-bordered">
					<tr class="success">
						<th>编号</th>
						<th>标题</th>
						<th>投诉人</th>
						<!-- <th>投诉事件</th> -->
						<th>类型</th>
						<th>证据</th>
					</tr>
					<c:forEach items="${page.list}" var="c">
						<tr class="warning">
							<td>${c.id}</td>
							<td style="width: 220px;">${c.title}</td>
							<td>${c.username}</td>
							<td>${c.ctype}</td>
							<td>${c.urlip}</td>
						</tr>
					</c:forEach>

					<tr>
						<td colspan="10"><input type="button" value="首页"
							onclick="paging(1)" class="btn btn-info"> <input
							type="button" value="上一页"
							onclick="paging(${page.pageNum==1?1:page.prePage})"
							class="btn btn-info"> <input type="button" value="下一页"
							onclick="paging(${page.pageNum==page.lastPage?page.lastPage:page.nextPage})"
							class="btn btn-info"> <input type="button" value="尾页"
							onclick="paging(${page.lastPage})" class="btn btn-info">
						</td>
					</tr>
				</table>
	</div>	
	<!-- Bootstrap core JavaScript-->
	<script src="/libs/jquery/jquery.min.js"></script>
	<script src="/libs/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="/libs/sb-admin/sb-admin.min.js"></script>
	
	<script type="text/javascript">
		// 分页
		function paging(pageNum){
			$("[name=pageNum]").val(pageNum);
			$("form").submit();
		}
	</script>
</body>




</html>
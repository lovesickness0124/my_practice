<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% String path=request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=path%>/resource/css/css.css" rel="styleSheet">
<script type="text/javascript" src="<%=path%>/resource/js/jquery-1.8.2.min.js"></script>
<!-- 引入日期插件 -->
<script type="text/javascript" src="<%=path%>/resource/js/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<!-- <%=path%>/ -->	
	<jsp:forward page="home.do"></jsp:forward>
</body>

<script type="text/javascript">

</script>


</html>
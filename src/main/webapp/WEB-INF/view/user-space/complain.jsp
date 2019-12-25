<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">

<head>


<style type="text/css">
	.error{
		color: red;
	}
</style>

</head>

	<div style="width: 100%;text-align: center;background-color: lightgrey">
		
 		<%-- <form action="complain.do" method="post">
 			<h1>投诉内容</h1>
 			投诉url地址:<input type="text" name="urlip"><br><br>
 			<input type="radio" value="1">涉及黄色
 			<input type="radio" value="2">涉及暴力
 			<input type="radio" value="3">涉及为违教政策
 			<input type="radio" value="4">涉及国家安全
 			<input type="radio" value="5">涉及抄袭内容
 			<input type="radio" value="6">其他<br><br>
 			<input type="submit" value="保存">
 		</form> --%>
 		<form:form action="complain.do" method="post" modelAttribute="complain">
 			<h1>投诉内容</h1>
 			<input type="hidden" value="${article_id}" name="article_id">
 			<input type="hidden" value="${user.id}" name="user_id">
 			投诉url地址:<form:input path="urlip"/> <span> <form:errors path="urlip" cssClass="error"/> </span><br><br>
 			<form:radiobutton path="complaintype" value="1"/>涉及黄色
 			<form:radiobutton path="complaintype" value="2"/>涉及暴力
 			<form:radiobutton path="complaintype" value="3"/>涉及违宗教政策
 			<form:radiobutton path="complaintype" value="4"/>涉及国家安全
 			<form:radiobutton path="complaintype" value="5"/>涉及抄袭内容
 			<form:radiobutton path="complaintype" value="6"/>其他<br><br>
 			<input type="submit" value="保存">
 		</form:form>
	</div>
 		
	

  </body>

</html>

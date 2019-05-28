<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.0.min.js"></script>
<script>
	$(function(){
		$("#btn").on("click",function(){
			if(${type==1}){
			location.href="reprompt.na";
			}else if(${type==2}){
				location.href="reprompt.ka";
			}
		});
	});
</script>
<style>
	
</style>
</head>
<body>
<h1>필수 입력 정보 수집을 모두 동의 해 주세요</h1>

<input type="button" value="동의하러가기" id= 'btn'>
</body> 
</html>
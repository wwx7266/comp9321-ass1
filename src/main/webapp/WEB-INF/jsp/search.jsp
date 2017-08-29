<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Assignment1</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="/">Home</a></li>
					<li class="active"><a href="/search">Search</a></li>
					<li><a href="/about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	<form name="SearchParam" action="/result">
		Agency:<br>
		<input type="text" name="agency"><br>
		Headline:<br>
		<input type="text" name="headline"><br>
		Date:<br>
		<input type="date" name="date"><br>
		City:<br>
		<input type="text" name="city"><br>
		Content:<br>
		<input type="text" name="content"><br>
		
		<input type="submit" value="Submit">
	</form>
</body>
</html>
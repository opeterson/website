<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><tiles:getAsString name="title"/></title>
	<link rel="stylesheet" href="<c:url value="/resources/styles/base-styles.css"/>" type="text/css" media="screen" />
	</head>
	<div class="header-container">
		<tiles:insertAttribute name="header" />
	</div>
	<div class="menu-container">
		<tiles:insertAttribute name="menu" />
	</div>
	<div class="body-container">
		<tiles:insertAttribute name="body" />
	</div>
	<div class="footer-container">
		<tiles:insertAttribute name="footer" />
	</div>
</html>
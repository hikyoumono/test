<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<link rel="stylesheet" type="text/css" href="./css/style.css"/>
<title>Login</title>
</head>
<body>
<div id="header">
<div id="pr">
</div>
</div>

<div id="main">
<div id="top">
<p>MyPage</p>
</div>
<div>
<p>ログインをお願いします</p>
<s:form action="LoginAction">
<s:textfield name="loginUserId"/>
<s:textfield name="loginPassword"/>
<s:submit value="ログイン"/>
</s:form>
</div>
</div>

<div id="footer">
<div id="pr">
</div>
</div>

</body>
</html>
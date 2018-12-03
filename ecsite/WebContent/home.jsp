<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="./css/style.css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no"/>
<title>HomeAction</title>
</head>
<body>
<div id=header>
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
<p>実験中</p>
</div>
<s:form action="HomeAction">
<s:submit value="ログイン"/>
</s:form>

<s:if test="#session.id != null">
<p>ログアウトする場合はこちら</p>
<p><a href='<s:url action="LogoutAction"/>'>こちら</a></p>
</s:if>

</div>
<div id="footer">
<div id="pr">
</div>
</div>


</body>
</html>
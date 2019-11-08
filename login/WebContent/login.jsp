<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 【strutsタグ】を使用するときに以下のコードを記述 -->
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html">
<html>
	<head>
		<meta charset="utf-8">
		<title>ログイン画面</title>
	</head>
	<body>
		<!-- formタグ内の"name"と"password"を
		LoginActionへ"submit"(送信)する -->
		<s:form action="LoginAction">
			<s:textfield name="name"/>
			<s:password name="password"/>
			<s:submit value="ログイン"/>
		</s:form>
	</body>
</html>
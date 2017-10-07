<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'counter.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   	<%--定义一个 Session范围内的计数器 记录个人的登录信息 --%>
   	<jsp:useBean id="persionCounter" class="com.coderlong.bean.Counter" scope="session"></jsp:useBean>
   	
   	
   	<%-- 定义一个 applicaiton范围内的 计数器  --%>
   	<jsp:useBean id="totalCounter" class="com.coderlong.bean.Counter" scope="application"></jsp:useBean>
   	
   	<table>
   		<tr>
   			<td>您的访问次数:</td>
   			<td><jsp:getProperty property="counter" name="persionCounter"/></td>
   		</tr>
   		<tr>
   			<td>总的访问次数</td>
   			<td><jsp:getProperty property="counter" name="totalCounter"/></td>
   		</tr>
   	</table>
  </body>
</html>

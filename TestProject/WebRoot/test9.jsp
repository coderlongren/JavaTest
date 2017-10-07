<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test9.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <jsp:useBean id="persion" class="com.coderlong.bean.Persion"></jsp:useBean>
  <body>
   	<%
   		out.println("测试 out jsp 隐藏对象");
   	 %>
   	 
   	 欢迎你  ${persion }<br/>
   	 您的年龄是  ${persion.age }
   	 
   	 <p>这里是测试一下EL表达式的使用 </p>
   	 读取地址栏参数 ${param["param"] }<br/>
   	 读取header参数 ${header["host"] }
   	 
   	 
   	 
  </body>
</html>

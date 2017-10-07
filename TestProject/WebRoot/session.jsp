<%@page import="com.coderlong.bean.Persion"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
////日期格式化器 
 	request.setCharacterEncoding("UTF-8");
 	response.setCharacterEncoding("UTF-8");
 	
  %>
    	<%
  		Persion[] persions = {
				new Persion(12,"sailong"),
				new Persion(13,"wenge")
  		};
  		
  		String message = "";//要显示的消息 
  		if (request.getMethod().equals("POST")){
  			for (Persion persion : persions){
  				if (persion.getName().equals(request.getParameter("username"))){
  					session.setAttribute("persion", persion);
  					response.sendRedirect(request.getContextPath() + "/welcome.jsp");
  					return;
  				}
  			}
  			message = "用户名不正确";
  			
  		}
  		
  	 %>
 
 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'session.jsp' starting page</title>
    
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
	<form action="session.jsp" method = "POST">
		用户名 <input type = "text" name="username"><br/>
		<input type = "submit" value = "提交 "><br/>
		<%= message %>>
	</form>
  </body>
</html>

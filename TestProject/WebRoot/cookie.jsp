<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
String username = "";
int visittime = 0;
Cookie[] cookies = request.getCookies();
 for(int i = 0; i < cookies.length; i++){
 	Cookie cookie = cookies[i];
 	if("username".equals(cookie.getName())){
 		username = cookie.getValue();
 	}
 	else if ("visittime".equals(cookie.getName()))
 	{
 		visittime = Integer.parseInt(cookie.getValue());
 	}
 	
 }
 if (username == null || username == "")
 {
 	throw new Exception("对不起 请先登录 ");
 }
 //修改登陆的次数 
 Cookie visittimeCookie = new Cookie("visittime",Integer.toString(++visittime));
 response.addCookie(visittimeCookie);
 
 


%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'cookie.jsp' starting page</title>
    
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
    你的账号 <%= username %>><br/>
    访问次数 <%= visittime %>>
  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test1.jsp' starting page</title>
    
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
   	<%
   		String param = request.getParameter("param");
   		if ("1".equals(param))
   		{
   	 %>
   	 蒹葭苍苍，白露为霜。
   	 所谓伊人，在水一方。
   	 <%
   	 }
   	 else if("2".equals(param))
   	 {
   	  %>
   	  溯洄从之，道阻且长。
   	  溯游从之，宛在水中央。
   	  
   	 <%
   	 }
   	 else
   	 {
   	  %>
   	  fdgdfgdgdfg
   	  <%
   	  }
   	   %>
  </body>
</html>

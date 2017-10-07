<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
Locale locate = request.getLocale();
Calendar calendar = Calendar.getInstance(locate);
int hour = calendar.get(Calendar.HOUR_OF_DAY);//获取小时
String greeting = "";
hour = 2;
if (hour < 6){
	greeting = "凌晨好 美好的一天开始了";
}else if(hour < 9){
	greeting = "早上好 你的早餐吃什么？";
}else if (hour < 12){
	greeting = "上午好 工作室注意保护眼睛";
}else if (hour < 18){
	greeting = "下午好 注意休息";
}else {
	greeting = "晚上好,请注意休息 保护眼睛";
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<title>欢迎页面</title>
	
  </head>
  
  <body>
    <%= greeting %> <br>
  </body>
</html>

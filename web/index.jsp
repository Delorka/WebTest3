<%--
  Created by IntelliJ IDEA.
  User: Sviridova
  Date: 14.11.2017
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="java.util.*, java.text.*" %>
<%@ page import="larisasviridova.GetDate" %>

<html>
  <head>
    <title>Добро пожаловать , JSP!</title>
  </head>
  <body>
  <h1>Добро пожаловать</h1>
  <%--
  <i>Сегодня <%= getFormattedDate() %></i>
  --%>


  <i>Сегодня <%
      GetDate getDate = new GetDate();
      out.print(getDate.getFormattedDate());
             %>
  </i>

  <%
      String name = request.getParameter("name");
      if (name == null || name.length() == 0) {
  %>
  Hello, world !
  <%            } else {
  %>
  Hello, world ! I'm <%= name%>
  <%
      }
  %>

  <form method="Get" action="/Servlet2">
                  <div>Введите А:</div>
                  <div><input  name="a" type="text" value="0"/></div>
                  <div>Введите В:</div>
                  <div><input  name="b" type="text" value="0"/></div>
                  <div><button type="submit">Ввод</button></div>
                  <div>Результат:</div>
                  <div><%
                         String cc = String.valueOf(request.getAttribute("c"));
                         if (cc != null){%><%= cc%><%}%></div>
  </form>
<!--div in html
    this in java-->
  </body>
</html>




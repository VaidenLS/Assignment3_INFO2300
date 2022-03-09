<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Assignment 2</title>
</head>
<body>
    <br>
    <jsp:useBean id="myBean" class="com.vaiden.assignment2_vls.MyWeek"/>
    <div align="center">
        <jsp:setProperty name="myBean" property="name" value="Vaiden"/>
        <h3><jsp:getProperty name="myBean" property="description"/></h3>
        There are of course <jsp:getProperty name="myBean" property="numberDays"/> days in the week.
        <br/><br/>
        <jsp:getProperty name="myBean" property="name"/> works on <jsp:getProperty name="myBean" property="workingDays"/>
        leaving <jsp:getProperty name="myBean" property="daysOff"/> days to enjoy other things in life.
        <br/><br/>
        <jsp:getProperty name="myBean" property="percentage"/>
    </div>
<br/>
</body>
</html>
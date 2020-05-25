<%-- 
    Document   : Register
    Created on : May 14, 2020, 10:52:45 AM
    Author     : luuka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>REGISTER PAGE</title>
        <style type="text/css">
            .button-register {background-color: green;color: white;}
        </style>
    </head>
     <style>
        body{
            margin: 0;
            padding: 0;
            background-image: url("pic1.jpg");
            background-size: cover;
            background-position: center;
            font-family: sans-serif;
        }
    </style>
    <body>
        <h1>REGISTER PAGE</h1>
        <s:form action="RegisterForm" method="post">
            <s:textfield label="UserName" name="uname" />
            <s:textfield label="Email" name="uemail" />
            <s:password label="Password" name="upass" />
            <s:textfield label="Re-PassWord" name="repass" />
            <s:submit cssClass="button-register" value="Resgister" />
        </s:form>
        <s:if test="ctr>0">
            <span style="color: green;"><s:property value="msg" /></span>
        </s:if>
        <s:else>
            <span style="color: red;"><s:property value="msg" /></span>
        </s:else>
    </body>
</html>

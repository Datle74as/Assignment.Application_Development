<%-- 
    Document   : Index
    Created on : May 12, 2020, 6:36:49 PM
    Author     : luuka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <style>
        body{
            height: 350px;
            background-image: url("pic1.jpg");
            margin: 0;
            padding: 0;
            /*background-size: cover;*/
            background-position: center;
            font-family: sans-serif;
        }

        .loginbox{
            width: 320px;
            height: 420px;
            background: #000;
            color: #fff;
            top: 50%;
            left: 50%;
            position: absolute;
            transform: translate(-50%,-50%);
            box-sizing: border-box;
            padding: 70px 30px;
        }

        .avatar{
            width: 100px;
            height: 100px;
            border-radius: 50%;
            position: absolute;
            top: -50px;
            left: calc(50% - 50px);
        }

        h1{
            margin: 0;
            padding: 0 0 20px;
            text-align: center;
            font-size: 22px;
        }

        .loginbox p{
            margin: 0;
            padding: 0;
            font-weight: bold;
        }

        .loginbox input{
            width: 100%;
            margin-bottom: 20px;
        }

        .loginbox input[type="text"], input[type="password"]
        {
            border: none;
            border-bottom: 1px solid #fff;
            background: transparent;
            outline: none;
            height: 40px;
            color: #fff;
            font-size: 16px;
        }
        .loginbox [type="submit"]
        {
            border: none;
            outline: none;
            width: 255px;
            height: 40px;
            background: #fb2525;
            color: #fff;
            font-size: 18px;
            border-radius: 20px;
        }
        .loginbox [type="submit"]:hover
        {
            cursor: pointer;
            background: #ffc107;
            color: #000;
        }
        .loginbox a{
            text-decoration: none;
            font-size: 12px;
            line-height: 20px;
            color: darkgrey;
        }

        .loginbox a:hover
        {
            color: #ffc107;
        }
    </style>
    <body>
        <div class="loginbox">            
            <img src="avatar.png" class="avatar">
            <h1>Login here</h1>
            <s:form action="login" method="POST">
                <p>Username</p>
                <input type="text" name="user" placeholder="Enter Username" required>
                <p>Password</p>
                <input type="password" name="pass" placeholder="Enter Password" required>
                <s:submit value="Login" method="execute"/>
            </s:form> 
            <a href="#">Lost your password?</a><br>
            <a href="Register.jsp">Don't have an account?</a>
        </div>
    </body>
</html>


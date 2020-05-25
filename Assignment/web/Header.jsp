<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <title>TRAINING MANAGEMENT SYSTEM</title>
    </head>
    <style>
        body{
            margin: 0;
            padding: 0;
            background-image: url("fl.jpg");
            background-size: cover;
            background-position: center;
            font-family: sans-serif;

        }
        header, footer {
            padding: 1em;
            color: white;
            background-color: black;
            clear: left;
            text-align: center;
        }
        ul#menu, ul#menu ul#sub{
            padding: 17px 0 0 0;
            margin: 0;
        }

        ul#menu li{
            list-style-type: none;
            float: left;
            margin-right: 10px;
        }

        ul#menu li a{
            text-decoration: none;
            background-color: transparent;
            padding: 5px;
            color: white;
        }

        ul#menu li a:hover{
            background-color: transparent;
            color: aqua;
        }

        ul#menu li{
            position: relative;
        }

        ul#menu li ul#sub{
            display: none;
            position: absolute;
            width: 115px;
        }

        ul#menu li ul#sub li{
            margin-top: 10px;
            margin-bottom: 5px;
        }

        ul#menu li:hover ul#sub{
            display: block;
        }

        ul#menu li ul#sub li a:hover{
            background-color: transparent;
            color: aqua;
        }

        .logo{
            margin: 0;
            padding: 0;
            background-position: center;
            font-family: sans-serif;
        }

        ul#prof, ul#prof ul#subP{
            padding: 0;
            margin: 0;
        }

        ul#prof li{
            list-style-type: none;
            float: right;
            margin-right: 10px;
        }

        ul#prof li a{
            text-decoration: none;
            background-color: transparent;
            padding: 5px;
            color: white;
        }

        ul#prof li a:hover{
            background-color: transparent;
            color: chartreuse;
        }

        ul#prof li{
            position: relative;
        }

        ul#prof li ul#subP{
            display: none;
            position: absolute;
            width: 115px;
        }

        ul#prof li ul#subP li{
            margin-top: 10px;
            margin-bottom: 5px;
        }

        ul#prof li:hover ul#subP{
            display: block;
        }

        ul#prof li ul#subP li a:hover{
            background-color: transparent;
            color: chartreuse;
        }

        ul#prof li ul#subP li{
            float: left;
        }
        #avt{
            width: 50px;
            height: 50px;
            border-radius: 50%;
            position: absolute;
            float: left;
        }
        .logo{
            background-image: url("FPT Corporation.jpg");
            background-size: cover;
        }
        .logo a{
            color: orange;
            text-decoration: none;
        }
        .logo a:hover{
            color: aqua;
        }
        .logo .contact{
            float: right;
        }
    </style>
    <style>
        .container-4{
            overflow: hidden;
            width: 100%;
            vertical-align: middle;
            white-space: nowrap;
        }
        .container-4 input#search:focus{
            width: 600px;
        }
        .container-4 input#search{
            width: 300px;
            height: 50px;
            background: transparent;
            font-size: 10pt;
            float: left;
            color: #fff;
            padding-left: 15px;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            box-sizing: border-box;
            border: 1px solid black;
            border-radius: 5px;
            outline:none;
            padding: 12px 14px;
            color: white;
        }
        .container-4 input#search::-webkit-input-placeholder {
            color: #65737e;
        }

        .container-4 input#search:-moz-placeholder { /* Firefox 18- */
            color: #65737e;  
        }

        .container-4 input#search::-moz-placeholder {  /* Firefox 19+ */
            color: #65737e;  
        }

        .container-4 input#search:-ms-input-placeholder {  
            color: #65737e;  
        }
        .container-4 button.icon{
            -webkit-border-top-right-radius: 5px;
            -webkit-border-bottom-right-radius: 5px;
            -moz-border-radius-topright: 5px;
            -moz-border-radius-bottomright: 5px;
            border-top-right-radius: 5px;
            border-bottom-right-radius: 5px;

            border: none;
            background: white;
            height: 49px;
            width: 50px;
            color: #4f5b66;
            opacity: 0;
            font-size: 10pt;

            -webkit-transition: all .55s ease;
            -moz-transition: all .55s ease;
            -ms-transition: all .55s ease;
            -o-transition: all .55s ease;
            transition: all .55s ease;
        }
        .container-4:hover button.icon, .container-4:active button.icon, .container-4:focus button.icon{
            outline: none;
            opacity: 1;
            margin-left: -50px;
        }

        .container-4:hover button.icon:hover{
            background: aqua;
        }
        .box{
            float: right;
        }
    </style>
    <body>
    <center>       
        <div style="width: 100%; height: 200px; background-color: transparent;" class="logo">
            <div class="contact" style="width: 25%; height: 100%; background-color: transparent; color: white">
                <p>Email:<a href="#">ExampleEmail@gmail.com</a></p> <p>Phone:<a href="#">0123456789</a></p>
            </div>       
        </div>
        <div style="width: 100%; height: 50px; background-color: darkseagreen">
            <div class="left-menu" style="width: 50%; height: 100%; float: left; background-color:transparent ">
                <ul id="menu">
                    <li><a href="IndexCourse.jsp">Home</a>|
                        <ul id="sub">
                            <li><a href="IndexCourse.jsp">Course</a></li>
                            <li><a href="IndexTopic.jsp">Topic</a></li>
                            <li><a href="IndexCate.jsp">Category</a></li>
                        </ul>
                    </li>
                    <li><a href="#">About</a>|</li>
                    <li><a href="#">Contact</a></li>
                </ul>
            </div>
            <div class="right-menu" style="width: 50%; height: 100%; float: right; background-color: transparent">
                <ul id="prof">
                    <li><p style="color: cyan"><a href="#">Welcome,Admin!</a></p>
                        <ul id="subP">
                            <li><a href="#">Profile</a></li>
                            <li><a href="#">Setting</a></li>
                            <li><a href="#">Log off</a></li>  
                        </ul>
                    </li>        
                </ul>
            </div>
        </div>
        <div style="width: 100%; height: 800px">
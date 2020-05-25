<%-- 
    Document   : ViewCourse
    Created on : May 12, 2020, 7:01:27 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<h1>
    COURSE LIST
</h1>
<table border="1">
    <tr>
        <td colspan="9">
            <div class="box">
                <div class="container-4">
                    <input type="search" id="search" placeholder="Search..." />
                    <button class="icon"><i class="fa fa-search"></i></button>
                </div>
            </div>
        </td>
    </tr>
    <tr>
        <th>No.</th>
        <th>ID</th>
        <th>NAME</th>
        <th>LOCATION</th>
        <th>DESCRIPTION</th>
        <th colspan="4">ACTION</th>
    </tr>
    <s:iterator var="c" value="list" status="number">
        <tr>
            <td><s:property value="#number.count"/></td>
            <td><s:property value="#c.id"/></td>
            <td><s:property value="#c.name"/></td>
            <td><s:property value="#c.location"/></td>
            <td><s:property value="#c.des"/></td>
            <td><a href="AddCourse.jsp"><input type="button" value="Insert"/></a></td>
            <td><a href="updateCourse?id=<s:property value="#c.id"/>"><input type="button" value="Edit"/></a></td>
            <td><a href="delete?id=<s:property value="#c.id"/>" onclick="return confirmDel()"><input type="button" value="Delete"/></a></td>
            <td><a href="detail?id=<s:property value="#c.id"/>"><input type="button" value="View"/></a></td>
        </tr>
    </s:iterator>
</table>   
<%@include file="Footer.jsp" %>

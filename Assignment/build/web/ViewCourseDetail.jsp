<%-- 
    Document   : ViewCourseDetail
    Created on : May 12, 2020, 7:01:27 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<h1>VIEW COURSE LIST DETAIL</h1>
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
        <th>START DATE</th>
        <th>END DATE</th>
        <th>FEE</th>
        <th>CONTENT</th>
        <th>LOCATION</th>
        <th>TOPIC</th>
        <th>DESCRIPTION</th>
        <th colspan="3">ACTION</th>
    </tr>
    <s:iterator var="v" value="list" status="number">
        <tr>
            <td><s:property value="#number.count"/></td>
            <td><s:property value="#v.id"/></td>
            <td><s:property value="#v.name"/></td>
            <td><s:property value="#v.start"/></td>
            <td><s:property value="#v.end"/></td>
            <td><s:property value="#v.fee"/></td>
            <td><s:property value="#v.cont"/></td>
            <td><s:property value="#v.location"/></td>
            <td><s:property value="#v.topic"/></td>
            <td><s:property value="#v.des"/></td>
            <td><a href="AddCourse.jsp"><input type="button" value="Insert"/></a></td>
            <td><a href="updateCourse?id=<s:property value="#v.id"/>"><input type="button" value="Edit"/></a></td>
            <td><a href="delete?id=<s:property value="#v.id"/>"><input type="button" value="Delete" onclick="return ConfirmDel()"/></a></td>
        </tr>
    </s:iterator>
</table>
<%@include file="Footer.jsp" %>
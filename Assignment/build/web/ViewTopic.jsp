<%-- 
    Document   : ViewTopic
    Created on : May 16, 2020, 9:09:18 AM
    Author     : pc
--%>
<%@include file="Header.jsp" %>
<hr><h1>LIST TOPIC</h1>
<table border = "1">
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
        <th>ID</th>
        <th>NAME</th>
        <th>DESCRIPTION</th>
        <th>DATE ASSIGNED</th>
        <th>STATUS</th>
        <th colspan="4">Action</th>
            <s:iterator var="t" value="topic">
        <tr>
            <td><s:property value="#t.topId"/></td>
            <td><s:property value="#t.topName"/></td>
            <td><s:property value="#t.topDes"/> </td>
            <td><s:property value="#t.assigned"/> </td>
            <td><s:property value="#t.status"/> </td>
            <td><a href="AddTopic.jsp"><input type="button" value="Insert"/></a></td>
            <td><a href="deleteTopic?topId=<s:property value="#t.topId"/>"><input type="button" value="Delete"/></a></td>
            <td><a href="updateTopic?topId=<s:property value="#t.topId"/>"><input type="button" value="Update"/></a></td>
        </tr>
    </s:iterator>
</table>
<%@include  file="Footer.jsp" %>

<%-- 
    Document   : ViewCate
    Created on : May 23, 2020, 5:29:00 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<div style="width: 100%; height: 800px">
    <hr><h1>LIST OF CATEGORY</h1>
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
            <th colspan="4">ACTION</th>
                <s:iterator var="c" value="cate">
            <tr>
                <td><s:property value="#c.cateId"/></td>
                <td><s:property value="#c.cateName"/></td>
                <td><s:property value="#c.cateDes"/> </td>
                <td><a href="AddCategory.jsp"><input type="button" value="Insert"/></a></td>
                <td><a href="deleteCategory?cateId=<s:property value="#c.cateId"/>"><input type="button" value="Delete"/></a></td>
                <td><a href="updateCategory?cateId=<s:property value="#c.cateId"/>"><input type="button" value="Update"/></a></td>
                <td><a href="detailCategory?cateId=<s:property value="#c.cateId"/>"><input type="button" value="View"/></a></td>
            </tr>
        </s:iterator>
    </table>
</div>
<%@include file="Footer.jsp" %>
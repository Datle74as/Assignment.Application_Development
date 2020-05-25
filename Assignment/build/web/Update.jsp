<%-- 
    Document   : Update
    Created on : May 13, 2020, 1:50:12 AM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<h1>UPDATE COURSE INFORMATION</h1>
<jsp:useBean id="beans" scope="session" class="Model.UpdateProcess"></jsp:useBean>
<s:form action="updateForm" method="POST">
    <table border="1">
        <tr><td>COURSE ID:</td><td><input type="text" name="id" value="<s:property value="%{c.id}"/>" readonly="true" autofocus required/></td></tr>
        <tr><td>NAME:</td><td><input type="text" name="name" value="<s:property value="%{c.name}"/>" autofocus required/></td></tr>
        <tr><td>START DATE:</td><td><input type="date" name="start" value="<s:property value="%{c.start}"/>" autofocus required/></td></tr>
        <tr><td>END DATE:</td><td><input type="date" name="end" value="<s:property value="%{c.end}"/>" autofocus required/></td></tr>
        <tr><td>FEE:</td><td><input type="text" name="fee" value="<s:property value="%{c.fee}"/>" autofocus required/></td></tr>
        <tr><td>LOCATION:</td><td><select name="location">
                    <option value="DN">DA NANG</option>
                    <option value="HN">HA NOI</option>
                    <option value="TP.HCM">TP.HCM</option>
                </select></td></tr>
        <tr><td>TOPIC:</td><td><select name="topic">
                    <c:forEach var="t" items="${beans.topic}">
                        <option value="${t.topId}">
                            ${t.topName}
                        </option>
                    </c:forEach>
                </select></td></tr>
        <tr><td>CONTENT:</td><td><textarea name="cont" rows="5" cols="22" placeholder="Content"autofocus></textarea></td></tr>
        <tr><td>DESCRIPTION:</td><td><textarea name="des" rows="8" cols="22" placeholder="Descibe something news"autofocus></textarea></td></tr>
        <tr><td colspan="2"><s:submit value="SAVE" align="center"/></td></tr>
    </table>
</s:form>
<%@include file="Footer.jsp" %>

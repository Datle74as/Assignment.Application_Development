<%-- 
    Document   : Insert
    Created on : May 12, 2020, 11:22:32 PM
    Author     : luuka
--%>

<%@include file="Header.jsp" %>
<jsp:useBean id="beans" scope="session" class="Model.UpdateProcess"></jsp:useBean>
<s:form action="addForm" method="POST">
    <h1>ADD NEW COURSE INFORMATION</h1>
    <table border="1">
        <tr>
            <td>COURSE ID:</td>
            <td><input type="text" name="id" autofocus required/></td>
        </tr>
        <tr>
            <td>NAME:</td>
            <td><input type="text" name="name" autofocus required/></td>
        </tr>
        <tr>
            <td>START DATE:</td>
            <td><input type="date" name="start" autofocus required/></td>
        </tr>
        <tr>
            <td>END DATE:</td>
            <td><input type="date" name="end" autofocus required/></td>
        </tr>
        <tr>
            <td>FEE:</td>
            <td><input type="text" name="fee" autofocus required/></td>
        </tr>
        <tr>
            <td>LOCATION:</td>
            <td> 
                <select name="location">
                    <option value="DN">DA NANG</option>
                    <option value="HN">HA HOI</option>
                    <option value="TP.HCM">TP.HCM</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>TOPIC:</td>
            <td>
                <select name="topic">
                    <c:forEach var="t" items="${beans.topic}">
                        <option value="${t.topId}">
                            ${t.topName}
                        </option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>CONTENT:</td>
            <td><textarea name="cont" rows="5" cols="25" placeholder="Content"autofocus></textarea></td>
        </tr>
        <tr>
            <td>DESCRIPTION:</td>
            <td><textarea name="des" rows="8" cols="25" placeholder="Descibe something news" autofocus></textarea></td>
        </tr>
        <tr>
            <td colspan="2"><s:submit align="center" value="ADD"/></td></tr>
    </table>
</s:form>
<%@include file="Footer.jsp" %>
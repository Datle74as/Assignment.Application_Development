<%-- 
    Document   : UpdateTopic
    Created on : May 16, 2020, 3:23:30 PM
    Author     : pc
--%>
<%@include file="Header.jsp" %>
<h1>Update Topic Form!</h1>
<s:form action="EditTop" method="POST">
    <table border="1">
        <tr><td colspan="2"><s:textfield label="TOPIC ID" readonly="true" name="topId" /></td></tr>
        <tr><td>Name:</td><td><input type="text" name="topName" required value="<s:property value="%{t.topName}"/>"/></td></tr>
        <tr><td>Description:</td><td><textarea name="topDes" cols="21" rows="5" placeholder="Describe about topic"></textarea></td></tr>
        <tr>
            <td>
                Date Assigned:
            </td>
            <td>
                <input type="date" name="assigned" value="<s:property value="%{t.assigned}"/>"/>
            </td>
        <tr>
            <td>
                Status:
            </td>
            <td>
                <select name="status" value="<s:property value="%{t.status}"/>">
                    <option>On</option>
                    <option>Over</option>
                </select>
            </td>
        </tr>
        <tr><td colspan="2"> <s:submit value="SAVE" align="center"/></td></tr>             
    </table>
</s:form>
<%@include file="Footer.jsp" %>

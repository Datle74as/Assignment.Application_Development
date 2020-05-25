<%-- 
    Document   : AddTopic
    Created on : May 16, 2020, 8:33:32 AM
    Author     : pc
--%>
<%@include file="Header.jsp" %>
<h1>ADD NEW TOPIC</h1>
<s:form action="addTopic" method="POST" >
    <table border="1">
        <tr>
            <td>
                TOPIC ID:
            </td>
            <td>
                <input type="text" name="topId"/>
            </td>
        </tr>
        <tr>
            <td>
                Name:
            </td>
            <td>
                <input type="text" name="topName"/>
            </td>
        </tr>
        <tr>
            <td>
                Description:
            </td>
            <td>
                <textarea name="topDes" cols="21" rows="5" placeholder="Describe about topic"></textarea>
            </td>
        </tr>
        <tr>
            <td>
                Date Assigned:
            </td>
            <td>
                <input type="date" name="assigned"/>
            </td>
        <tr>
            <td>
                Status:
            </td>
            <td>
                <select name="status">
                    <option>On</option>
                    <option>Over</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <s:submit value="ADD" method="execute"/>
            </td>
        </tr>
    </table>
</s:form>
<%@include file="Footer.jsp" %>

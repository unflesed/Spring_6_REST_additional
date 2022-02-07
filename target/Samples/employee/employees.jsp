<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>

<h1>List of employee</h1>
${employees}

<br/>

<h2>To add new employee press "Add employee" button</h2>
<form method="POST" action="/Samples_war_exploded/employee/add">
    <table>
        <tr>
            <td><label for="name">Name</label></td>
            <td><input type="text" name="name" id="name"/></td>
        </tr>
        <tr>
            <td><label for="position">Position</label></td>
            <td><input type="text" name="position" id="position"/></td>
        </tr>
        <tr>
            <td><label for="phone">Phone</label></td>
            <td><input type="text" name="phone" id="phone"/></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add Employee">
            </td>
        </tr>
    </table>
</form>

<br/><br/>
<form method="POST" action="/Samples_war_exploded/employee/findByName">
    <table>
        <tr>
            <td><label for="name">Name</label></td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Search by name">
            </td>
        </tr>
    </table>
</form>

<br/><br/>
<form method="POST" action="/Samples_war_exploded/employee/findByNameAndPosition">
    <table>
        <tr>
            <td><label for="name">Name</label></td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td><label for="position">Position</label></td>
            <td><input type="text" name="position"/></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Search by name and position">
            </td>
        </tr>
    </table>
</form>

</body>
</html>


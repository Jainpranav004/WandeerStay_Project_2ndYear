<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <h1>Registered Users</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${not empty userDatabase}">
                    <c:forEach var="entry" items="${userDatabase}">
                        <tr>
                            <td>${entry.value}</td>
                            <td>${entry.key}</td>
                        </tr>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td colspan="2">No users registered yet.</td>
                    </tr>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>
    <a href="UserServlet">Register a New User</a>
</body>
</html>
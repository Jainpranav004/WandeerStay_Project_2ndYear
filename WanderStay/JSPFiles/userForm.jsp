<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h1>User Registration Form</h1>
    <form method="POST" action="UserServlet">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        <button type="submit">Register</button>
    </form>
</body>
</html>
2. userProfile.jsp
Displays the user profile after registration.

jsp
Copy code
<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
    <h1>User Profile</h1>
    <p><strong>Name:</strong> ${name}</p>
    <p><strong>Email:</strong> ${email}</p>
    <a href="UserServlet">Register Another User</a>
</body>
</html>
3. userList.jsp
Displays a list of all registered users (optional enhancement).

jsp
Copy code
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
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
            <%
                Map<String, String> userDatabase = (Map<String, String>) getServletContext().getAttribute("userDatabase");
                if (userDatabase != null) {
                    for (Map.Entry<String, String> entry : userDatabase.entrySet()) {
            %>
            <tr>
                <td><%= entry.getValue() %></td>
                <td><%= entry.getKey() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="2">No users registered yet.</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
    <a href="UserServlet">Register a New User</a>
</body>
</html>
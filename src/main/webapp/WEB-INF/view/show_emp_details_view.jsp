<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, you are welcome</h2>
<br><br>
Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your department: ${employee.department}
<br><br>
Your car: ${employee.carBrand}
<br><br>
Your Language (s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<br><br>
Your phone: ${employee.phoneNumber}
<br><br>
Your email: ${employee.email}
</body>
</html>
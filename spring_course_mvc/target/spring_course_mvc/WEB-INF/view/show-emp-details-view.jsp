<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<body>

<h2>Dear Employee, you are welcome!!!</h2>

<br>
<br>
<br>

Your name: ${employeeVar.nameFromClass}
<br>
Your surname: ${employeeVar.surnameFromClass}
<br>
Your salary: ${employeeVar.salaryFromClass}
<br>
Your department: ${employeeVar.departmentFromClass}
<br>
Your car: ${employeeVar.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employeeVar.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br>
Phone number: ${employeeVar.phoneNumber}
<br>
Email: ${employeeVar.email}
</body>
</html>
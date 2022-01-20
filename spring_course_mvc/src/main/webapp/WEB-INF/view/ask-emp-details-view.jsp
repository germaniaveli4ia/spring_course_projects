<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<body>

<h2>Dear Employee, please enter your details</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employeeVar">

    Name <form:input path="nameFromClass"/>
    <form:errors path="nameFromClass"/>

    <br><br>
    Surname <form:input path="surnameFromClass"/>
    <form:errors path="surnameFromClass"/>
    <br><br>
    Salary <form:input path="salaryFromClass"/>
    <form:errors path="salaryFromClass"/>
    <br><br>
    Department <form:select path="departmentFromClass">
    <form:options items="${employeeVar.departments}"/>
</form:select>

    <br><br>
    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employeeVar.cars}"/>

    <br><br>
    Foreign language(s)
    <form:checkboxes path="languages" items="${employeeVar.langList}"/>

    <br><br>
    Phone number
    <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>

    <br><br>
    Email
    <form:input path="email"/>
    <form:errors path="email"/>

    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
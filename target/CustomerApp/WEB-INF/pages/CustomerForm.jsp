<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1 style="color:blue;">New Customer</h1>
        <form:form action="saveCustomer" method="post" modelAttribute="customer">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>First Name:</td>
                <td><form:input path="firstname" /></td>
            </tr>
             <tr>
                  <td>Last Name:</td>
                  <td><form:input path="lastname" /></td>
              </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" /></td>
            </tr>
            <tr>
                 <td>Mobile</td>
                 <td><form:input path="mobile" maxlength="10 " minlength="10 "/></td>
            </tr>
            <tr>
                     <td><form:label path="gender">Gender</form:label></td>
                                         <td> Male<form:radiobutton path="gender" value="Male"/>
                                         Female <form:radiobutton path="gender" value="Female"/></td
            </tr>
            <tr>
                 <td>Age</td>
                  <td><form:input path="age" maxlength="2 "/></td>
             </tr>

            <tr>
                <td>Address:</td>
                <td><form:input path="address" /></td>
            </tr>
            <tr>
                <td>Nationality:</td>
                <td><form:input path="nationality" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>
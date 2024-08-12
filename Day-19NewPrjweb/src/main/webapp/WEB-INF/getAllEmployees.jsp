<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ page isELIgnored="false" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Insert title here</title>
            </head>

            <body>
                <table border="1">
                    <thead>
                        <tr>
                            <th>EmpName</th>
                            <th>EmpID</th>
                            <th>EmpSal</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="employee" items="${emplist}">
                            <tr>
                                <td>
                                    <c:out value="${employee.empName}" />
                                </td>
                                <td>
                                    <c:out value="${employee.empId}" />
                                </td>
                                <td>
                                    <c:out value="${employee.empSal}" />
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </body>

            </html>
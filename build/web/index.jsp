<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh s�ch h�ng laptop</title>
</head>
<body>
    <h1>Danh s�ch h�ng laptop:</h1>
    <p>
        <c:forEach var="laptop" items="${laptops}">
            ${laptop}<c:if test="${!laptop.equals(laptops[laptops.size() - 1])}">, </c:if>
        </c:forEach>
    </p>
</body>
</html>

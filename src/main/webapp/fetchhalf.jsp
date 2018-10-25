<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"  %>

<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" %>
<html>
<head>
    <title>Michael Keaton</title>
</head>
<body>
<h3><c:out value="${sessionScope.name}..."/></h3>
<h2><c:out value="${sessionScope.name}......"/></h2>

<meta http-equiv="refresh" content="3;url=/fetch2.jsp" />
</body>
</html>

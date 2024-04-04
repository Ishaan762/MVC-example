<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Recipes</title>
</head>
<body>
    <h1>Recipe Catalog</h1>
    <ul>
        <c:forEach items="${recipes}" var="recipe">
            <li><a href="/recipes/${recipe.id}">${recipe.title}</a></li>
        </ul>
    </c:forEach>
</body>
</html>
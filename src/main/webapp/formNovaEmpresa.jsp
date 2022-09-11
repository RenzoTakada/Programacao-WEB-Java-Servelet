<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="NovasEmpresasServelet" var="caminhoEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action ="${caminhoEmpresa}" method = "post">
		Nome : <input type ="text" name = "nome"  />
		Data: <input type ="text" name = "dataEmpresa"  />
		<input type = "submit" />

	
</body>
</html>
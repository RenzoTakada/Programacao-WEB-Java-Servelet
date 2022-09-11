<%@page import="br.com.gerenciador.servelet.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Lista de Empresas
<ul>
<c:forEach items ="${empresas }" var="empresa">

<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>

<a href = "/Gerenciadorex/EditarEmpresaServelet?id=${empresa.id }">Editar</a>
<a href = "/Gerenciadorex/removeEmpresaServelet?id=${empresa.id }">remover</a>
</li>
</c:forEach>
</ul>

</body>
</html>
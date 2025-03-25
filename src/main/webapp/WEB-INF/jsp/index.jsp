<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Login</title>
</head>
<body>

    <h2><c:out value="${texto}" /></h2> <!-- Muestra el texto enviado desde el controlador -->

    <h1>Formulario de Inicio de Sesión</h1>
    
    <form action="/procesarFormulario" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required />
        <br><br>

        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required />
        <br><br>

        <button type="submit">Iniciar Sesión</button>
    </form>

    <h2>Datos enviados:</h2>
    <p>Email: <c:out value="${email}" /></p>
    <p>Contraseña: <c:out value="${password}" /></p>

</body>
</html>
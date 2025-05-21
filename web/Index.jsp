<%-- 
    Document   : Index.jsp
    Created on : 17/05/2025, 11:10:16 AM
    Author     : funda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuario - JP Systems</title>
        <link rel="stylesheet" href="estilos.css">
    </head>
    <body>
        <div class="contenedor">
    <!-- Imagen de fondo -->
    <div class="lado-izquierdo">
        <img src="Logo.png" alt="Logo JP Systems" class="logo">
      <div class="texto-bienvenida">
        <h1>Regístrate</h1>
        <p>Ingresa tus datos y comienza a agendar tus citas de forma rápida y sencilla.</p>
      </div>
    </div>

    <!-- Formulario de registro -->
    <div class="formulario-login">
      <div class="caja-login">
        <h2>Crear cuenta</h2>

        <form action="guardar" method="POST">
          <label for="nombre">Nombre completo</label>
          <input type="text" id="nombre" name="nombre" placeholder="Tu nombre completo" required>

          <label for="email">Correo electrónico</label>
          <input type="email" id="email" name="email" placeholder="correo@ejemplo.com" required>

          <label for="password">Contraseña</label>
          <input type="password" id="password" name="password" placeholder="Contraseña segura" required>

          <label for="confirmar">Confirmar contraseña</label>
          <input type="password" id="confirmar" name="confirmar" placeholder="Vuelve a escribir tu contraseña" required>

          <!-- Género -->
<label for="genero">Género</label>
<select id="genero" name="genero" required>
  <option value="" disabled selected>Selecciona tu género</option>
  <option value="Masculino">Masculino</option>
  <option value="Femenino">Femenino</option>
  <option value="Otro">Otro</option>
</select>

<!-- Tipo de documento -->
<label for="tipo_doc">Tipo de documento</label>
<select id="tipo_doc" name="tipo_doc" required>
  <option value="" disabled selected>Selecciona un tipo</option>
  <option value="CC">Cédula de ciudadanía</option>
  <option value="TI">Tarjeta de identidad</option>
  <option value="CE">Cédula de extranjería</option>
</select>

<!-- Número de documento -->
<label for="numero_doc">Número de documento</label>
<input type="text" id="numero_doc" name="numero_doc" placeholder="Ej: 1234567890" required>

          <!-- Campo oculto para rol: cliente -->
          <input type="hidden" name="rol" value="cliente">

          <!-- Campo oculto para estado activo -->
          <input type="hidden" name="estado" value="1">

          <button type="submit">Registrarme</button>
        </form>

        <p class="registro">¿Ya tienes cuenta? <a href="login.html">Inicia sesión</a></p>
      </div>
    </div>
  </div>
    </body>
</html>

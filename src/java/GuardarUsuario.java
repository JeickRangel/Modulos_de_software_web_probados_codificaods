/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/GuardarUsuario"})
public class GuardarUsuario extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmar = request.getParameter("confirmar");
        String genero = request.getParameter("genero");
        String tipo_doc = request.getParameter("tipo_doc");
        String numero_doc = request.getParameter("numero_doc");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/sistema_barberia", "root", "");

            PreparedStatement sentencia = conexion.prepareStatement(
                "INSERT INTO clientes(nombre, email, password, confirmar, genero, tipo_doc, numero_doc) VALUES (?, ?, ?, ?, ?, ?, ?)"
            );

            sentencia.setString(1, nombre);
            sentencia.setString(2, email);
            sentencia.setString(3, password);
            sentencia.setString(4, confirmar);
            sentencia.setString(5, genero);
            sentencia.setString(6, tipo_doc);
            sentencia.setString(7, numero_doc);
            sentencia.executeUpdate();

            sentencia.close();
            conexion.close();

            request.setAttribute("Registro completado", nombre);
            RequestDispatcher redireccion = request.getRequestDispatcher("Mensaje.jsp");
            redireccion.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.toString());
        }
    }
}

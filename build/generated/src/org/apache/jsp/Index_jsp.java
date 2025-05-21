package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro de Usuario - JP Systems</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("    <!-- Imagen de fondo -->\n");
      out.write("    <div class=\"lado-izquierdo\">\n");
      out.write("        <img src=\"Logo.png\" alt=\"Logo JP Systems\" class=\"logo\">\n");
      out.write("      <div class=\"texto-bienvenida\">\n");
      out.write("        <h1>Regístrate</h1>\n");
      out.write("        <p>Ingresa tus datos y comienza a agendar tus citas de forma rápida y sencilla.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Formulario de registro -->\n");
      out.write("    <div class=\"formulario-login\">\n");
      out.write("      <div class=\"caja-login\">\n");
      out.write("        <h2>Crear cuenta</h2>\n");
      out.write("\n");
      out.write("        <form action=\"guardar\" method=\"POST\">\n");
      out.write("          <label for=\"nombre\">Nombre completo</label>\n");
      out.write("          <input type=\"text\" id=\"nombre\" name=\"nombre\" placeholder=\"Tu nombre completo\" required>\n");
      out.write("\n");
      out.write("          <label for=\"email\">Correo electrónico</label>\n");
      out.write("          <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"correo@ejemplo.com\" required>\n");
      out.write("\n");
      out.write("          <label for=\"password\">Contraseña</label>\n");
      out.write("          <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"Contraseña segura\" required>\n");
      out.write("\n");
      out.write("          <label for=\"confirmar\">Confirmar contraseña</label>\n");
      out.write("          <input type=\"password\" id=\"confirmar\" name=\"confirmar\" placeholder=\"Vuelve a escribir tu contraseña\" required>\n");
      out.write("\n");
      out.write("          <!-- Género -->\n");
      out.write("<label for=\"genero\">Género</label>\n");
      out.write("<select id=\"genero\" name=\"genero\" required>\n");
      out.write("  <option value=\"\" disabled selected>Selecciona tu género</option>\n");
      out.write("  <option value=\"Masculino\">Masculino</option>\n");
      out.write("  <option value=\"Femenino\">Femenino</option>\n");
      out.write("  <option value=\"Otro\">Otro</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<!-- Tipo de documento -->\n");
      out.write("<label for=\"tipo_doc\">Tipo de documento</label>\n");
      out.write("<select id=\"tipo_doc\" name=\"tipo_doc\" required>\n");
      out.write("  <option value=\"\" disabled selected>Selecciona un tipo</option>\n");
      out.write("  <option value=\"CC\">Cédula de ciudadanía</option>\n");
      out.write("  <option value=\"TI\">Tarjeta de identidad</option>\n");
      out.write("  <option value=\"CE\">Cédula de extranjería</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<!-- Número de documento -->\n");
      out.write("<label for=\"numero_doc\">Número de documento</label>\n");
      out.write("<input type=\"text\" id=\"numero_doc\" name=\"numero_doc\" placeholder=\"Ej: 1234567890\" required>\n");
      out.write("\n");
      out.write("          <!-- Campo oculto para rol: cliente -->\n");
      out.write("          <input type=\"hidden\" name=\"rol\" value=\"cliente\">\n");
      out.write("\n");
      out.write("          <!-- Campo oculto para estado activo -->\n");
      out.write("          <input type=\"hidden\" name=\"estado\" value=\"1\">\n");
      out.write("\n");
      out.write("          <button type=\"submit\">Registrarme</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <p class=\"registro\">¿Ya tienes cuenta? <a href=\"login.html\">Inicia sesión</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

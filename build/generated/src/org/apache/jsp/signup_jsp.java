package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import controls.Connections;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                    /*PreparedStament prepara una variabale en la cual va la consulta*/
                   PreparedStatement ps=null;
                   Connections conn=new Connections();
                   Connection con=conn.Connectiondb();
                

                PreparedStatement  p2=null;
                ResultSet rs, r2=null;
            
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/all.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/signup.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("          <header>\n");
      out.write("            <a href=\"index.html\"><img class=\"logo\" src=\"images/logologin.png\"></a>\n");
      out.write("            <h1>Crear una cuenta</h1>\n");
      out.write("          </header>\n");
      out.write("\n");
      out.write("          <div class=\"options-register\">\n");
      out.write("            <button type=\"button\" name=\"facebook\">\n");
      out.write("                <i class=\"icon fab fa-facebook-f\"></i><span>acebook</span>\n");
      out.write("            </button>\n");
      out.write("            <button type=\"button\" name=\"google\">\n");
      out.write("                  <i class=\"icon fab fa-google\"></i><span>oogle</span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"creation-container grid-parent\">\n");
      out.write("            <form action=\"\" class=\"form-register\" method=\"post\">\n");
      out.write("              <div class=\"container-inputs\">\n");
      out.write("              <fieldset>\n");
      out.write("                <select class=\"set-all-sel\" name=\"city\" >\n");
      out.write("                    <option value=\"mosquera\">Mosquera</option>\n");
      out.write("                    <option value=\"madrid\">Madrid</option>\n");
      out.write("                    <option value=\"funza\">Funza</option>\n");
      out.write("                </select>\n");
      out.write("                <input class=\"set-side\" type=\"text\" name=\"name\" placeholder=\"Nombre\">\n");
      out.write("                <input class=\"set-side\"  type=\"text\" name=\"lastname\" placeholder=\"Apellido\">\n");
      out.write("              </fieldset>\n");
      out.write("\n");
      out.write("              <fieldset>\n");
      out.write("                <input class=\"set-all\" type=\"date\" name=\"datebirth\" placeholder=\"Fecha de Nacimiento\">\n");
      out.write("              </fieldset>\n");
      out.write("\n");
      out.write("              <fieldset >\n");
      out.write("                <input class=\"set-all\" type=\"email\" name=\"email\" placeholder=\"Correo electrónico\">\n");
      out.write("                <input class=\"set-all\" type=\"password\" name=\"password\" placeholder=\"Contraseña\">\n");
      out.write("              </fieldset>\n");
      out.write("\n");
      out.write("              <fieldset>\n");
      out.write("                <input  class=\"set-all\" type=\"phone\" name=\"phone\" placeholder=\"Teléfono\">\n");
      out.write("              </fieldset>\n");
      out.write("              <fieldset>\n");
      out.write("                <select class=\"set-sideb\" name=\"doctype\">\n");
      out.write("                    <option value=\"CC\">CC</option>\n");
      out.write("                    <option value=\"TI\">TI</option>\n");
      out.write("                </select>\n");
      out.write("                <input class=\"set-sideb\" type=\"text\" name=\"document\" placeholder=\"Documento\">\n");
      out.write("              </fieldset>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container-actionbtn\">\n");
      out.write("                <input type=\"checkbox\" name=\"terms\" value=\"\">\n");
      out.write("                <label class=\"terms\">I agree to the <a href=\"#\">Terms of Use</a> and I have read and acknowledge the <a class=\"Privacidad\" href=\"#\">Politica de privacidad</a></label>\n");
      out.write("                <input class=\"free-account\" type=\"submit\" name=\"create_account\" value=\"Create a free account\">\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");

                    if(request.getParameter("create_account") !=null) {
                        //Statement Variables
                        
                        String name, secondname, lastname, nick, birth, city, 
                        email, password, doctype, document, phone, ustype;
                        int id, uscoins, avatar;
                        name = request.getParameter("name");
                        secondname = "secondname";
                        lastname = request.getParameter("lastname");
                        nick = "nick";
                        birth = request.getParameter("datebirth");
                        city = request.getParameter("city");
                        email = request.getParameter("email");
                        password = request.getParameter("password");
                        doctype = request.getParameter("doctype");
                        document = request.getParameter("document");
                        phone = request.getParameter("phone");
                        ustype = "user";
                        uscoins = 0;
                        avatar = 1;
                        id = 0;
                        try {
                            ps = con.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                            ps.setInt(1, id);
                            ps.setString(2 , name);
                            ps.setString(3, secondname);
                            ps.setString(4, lastname);
                            ps.setString(5, nick);
                            ps.setString(6, birth);
                            ps.setString(7, city);
                            ps.setString(8, email);
                            ps.setString(9, password);
                            ps.setString(10, doctype);
                            ps.setString(11, document);
                            ps.setString(12, phone);
                            ps.setString(13, ustype);
                            ps.setInt(14, uscoins);
                            ps.setInt(15, avatar);
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Succesfull");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                   
                
      out.write("\n");
      out.write("                <a href=\"login.html\"><button class=\"free-login\" type=\"button\" name=\"login\">¿Ya tienes una cuenta?</button></a>\n");
      out.write("              </div>\n");
      out.write("              </form>\n");
      out.write("              </div>\n");
      out.write("                <!-- Aquie usted decide el estilo como lo quiere si usa el boton o la etiqueta <a> para colocarle\n");
      out.write("                    la accion de ir al login -->\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <table>\n");
      out.write("            <tr>\n");
      out.write("            <th>TAG</th>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>Second Name</th>\n");
      out.write("            <th>Last Name</th>\n");
      out.write("            <th>Nick</th>\n");
      out.write("            <th>Birth Day</th>\n");
      out.write("            <th>City</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Document Type</th>\n");
      out.write("            <th>Document</th>\n");
      out.write("            <th>Phone</th>\n");
      out.write("            <th>Coins</th>\n");
      out.write("            <th>Avatar</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                Connections conn=new Connections();
                Connection con=conn.Connectiondb();
                try {
                ps=con.prepareStatement("SELECT * FROM user");
            rs=ps.executeQuery();

            while(rs.next()){
            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(10));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(12));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(13));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(14));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(15));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
}
                }
                catch(Exception e) {
                      JOptionPane.showMessageDialog(null, e);
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </footer>\n");
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

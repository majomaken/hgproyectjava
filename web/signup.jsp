<%-- 
    Document   : index
    Created on : Aug 15, 2018, 12:24:12 PM
    Author     : mikejimenez
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.Connection"%>
<%@page import="controls.Connections"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <script type="text/javascript" src="assets/js/all.js"></script>

        <title>Sign Up</title>
        <link rel="stylesheet" type="text/css" href="assets/css/signup.css">
    </head>
    <body>

          <header>
            <a href="index.html"><img class="logo" src="images/logologin.png"></a>
            <h1>Crear una cuenta</h1>
          </header>

          <div class="options-register">
            <button type="button" name="facebook">
                <i class="icon fab fa-facebook-f"></i><span>acebook</span>
            </button>
            <button type="button" name="google">
                  <i class="icon fab fa-google"></i><span>oogle</span>
            </button>
          </div>
          <div class="creation-container grid-parent">
            <form action="" class="form-register" method="post">
              <div class="container-inputs">
              <fieldset>
                <select class="set-all-sel" name="city" >
                    <option value="Mosquera">Mosquera</option>
                    <option value="Madrid">Madrid</option>
                    <option value="Funza">Funza</option>
                </select>
                <input class="set-side" type="text" name="name" placeholder="Nombre">
                <input class="set-side"  type="text" name="lastname" placeholder="Apellido">
              </fieldset>

              <fieldset>
                <input class="set-all" type="date" name="datebirth" placeholder="Fecha de Nacimiento">
              </fieldset>

              <fieldset >
                <input class="set-all" type="email" name="email" placeholder="Correo electrónico">
                <input class="set-all" type="password" name="password" placeholder="Contraseña">
              </fieldset>

              <fieldset>
                <input  class="set-all" type="phone" name="phone" placeholder="Teléfono">
              </fieldset>
              <fieldset>
                <select class="set-sideb" name="doctype">
                    <option value="CC">CC</option>
                    <option value="TI">TI</option>
                </select>
                <input class="set-sideb" type="text" name="document" placeholder="Documento">
              </fieldset>

                </div>
                <div class="container-actionbtn">
                <input type="checkbox" name="terms" value="">
                <label class="terms">I agree to the <a href="#">Terms of Use</a> and I have read and acknowledge the <a class="Privacidad" href="#">Politica de privacidad</a></label>
                <input class="free-account" type="submit" name="create_account" value="Create a free account">
                <%!
                    /*PreparedStament prepara una variabale en la cual va la consulta*/
                   PreparedStatement ps=null;
                   Connections conn=new Connections();
                   Connection con=conn.Connectiondb();
                %>
                <%
                    if(request.getParameter("create_account") !=null) {
                        //Statement Variables
                        
                        String name, secondname, lastname, nick, birth, city, 
                        email, password, doctype, document, phone, ustype;
                        int id, uscoins, avatar;
                        boolean conditions;
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
                        conditions = true;
                        id = 0;
                        try {
                            ps = con.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
                            ps.setBoolean(16, conditions);
                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Succesfull");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                   
                %>
                <a href="login.jsp"><button class="free-login" type="button" name="login">¿Ya tienes una cuenta?</button></a>
              </div>
              </form>
              </div>
                <!-- Aquie usted decide el estilo como lo quiere si usa el boton o la etiqueta <a> para colocarle
                    la accion de ir al login -->

        <footer>
            <table>
            <tr>
            <th>TAG</th>
            <th>Name</th>
            <th>Second Name</th>
            <th>Last Name</th>
            <th>Nick</th>
            <th>Birth Day</th>
            <th>City</th>
            <th>Email</th>
            <th>Document Type</th>
            <th>Document</th>
            <th>Phone</th>
            <th>Coins</th>
            <th>Avatar</th>
            </tr>
            <%!
                PreparedStatement  p2=null;
                ResultSet rs, r2=null;
            %>

            <%
                Connections conn=new Connections();
                Connection con=conn.Connectiondb();
                try {
                ps=con.prepareStatement("SELECT * FROM user");
            rs=ps.executeQuery();

            while(rs.next()){
            %>

            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                <td><%=rs.getString(6)%></td>
                <td><%=rs.getString(7)%></td>
                <td><%=rs.getString(8)%></td>
                <td><%=rs.getString(10)%></td>
                <td><%=rs.getString(12)%></td>
                <td><%=rs.getString(13)%></td>
                <td><%=rs.getString(14)%></td>
                <td><%=rs.getString(15)%></td>
            </tr>

            <%}
                }
                catch(Exception e) {
                      JOptionPane.showMessageDialog(null, e);
                }
            %>
        </table>
        </footer>
    </body>
</html>

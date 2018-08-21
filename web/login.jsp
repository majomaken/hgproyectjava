<%-- 
    Document   : login
    Created on : Aug 20, 2018, 8:54:57 PM
    Author     : mikejimenez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <script type="text/javascript" src="assets/js/all.js"></script>
        <link rel="stylesheet" type="text/css" href="assets/css/login.css">
        <title>Login</title>
    </head>
    <body>
      <header>
        <h1 class="logo"><img  src="images/logologin.png" alt=""></h1>
      </header>
        <div class="login">
            <form action="LoginSession" method="post">
                <input class="login-id-password" type="email" placeholder="Email">
                <input class="login-id-password" type="password" name="password" placeholder="Password">
                <input class="login-hg" type="submit" name="login_hg" value="Let's Go!">
            </form>
            <div class="thirdparty-line">
                <span>OR LOG IN WITH</span>
            </div>
            <div class="options-login">
              <button type="button" name="facebook">
                  <i class="icon fab fa-facebook-f"></i><span>acebook</span>
              </button>
              <button type="button" name="google">
                    <i class="icon fab fa-google"></i><span>oogle</span>
              </button>
            </div>

                <ul id="help-links">
                    <li>
                        <a href="signup.jsp">Crea una cuenta de HG gratis</a>
                    </li>

                    <li>
                        <a href="#">¿No puedes iniciar sesión?</a>
                    </li>
                </ul>
        </div>
    </body>
</html>

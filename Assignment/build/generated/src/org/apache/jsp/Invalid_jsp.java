package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Invalid_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>TRAINING MANAGEMENT SYSTEM</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("        body{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-image: url(\"fl.jpg\");\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            font-family: sans-serif;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        header, footer {\r\n");
      out.write("            padding: 1em;\r\n");
      out.write("            color: white;\r\n");
      out.write("            background-color: black;\r\n");
      out.write("            clear: left;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        ul#menu, ul#menu ul#sub{\r\n");
      out.write("            padding: 17px 0 0 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li{\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            background-color: transparent;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li a:hover{\r\n");
      out.write("            background-color: black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li{\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li ul#sub{\r\n");
      out.write("            display: none;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            width: 115px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li ul#sub li{\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li:hover ul#sub{\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#menu li ul#sub li a:hover{\r\n");
      out.write("            background-color: black;\r\n");
      out.write("            color: orange;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .logo{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            font-family: sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof, ul#prof ul#subP{\r\n");
      out.write("            padding: 17px 0 0 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li{\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            float: right;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            background-color: transparent;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li a:hover{\r\n");
      out.write("            background-color: orange;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li{\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li ul#subP{\r\n");
      out.write("            display: none;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            width: 115px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li ul#subP li{\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li:hover ul#subP{\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li ul#subP li a:hover{\r\n");
      out.write("            background-color: orange;\r\n");
      out.write("            color: green;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ul#prof li ul#subP li{\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("        /*        #avt{\r\n");
      out.write("                    width: 50px;\r\n");
      out.write("                    height: 50px;\r\n");
      out.write("                    border-radius: 50%;\r\n");
      out.write("                    position: absolute;\r\n");
      out.write("                    top: -95%;\r\n");
      out.write("                                left: calc(50% - 50px);\r\n");
      out.write("                }*/\r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("    <center>       \r\n");
      out.write("        <div style=\"width: 100%; height: 150px; background-color: transparent;\" class=\"logo\">\r\n");
      out.write("            <img src=\"Logo.PNG\" style=\"width: 200px; height: 150px; float: left;\"/>\r\n");
      out.write("            <div style=\"width: 50%; height: 150px; float: right; text-align: center; background-color:transparent\">\r\n");
      out.write("                <div style=\"width: 100%; height: 50px; background-color: transparent\"></div>\r\n");
      out.write("                <div style=\"width: 100%; height: 50px; background-color: transparent\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Email:</td>\r\n");
      out.write("                            <td>...</td>\r\n");
      out.write("                            <td>Phone:</td>\r\n");
      out.write("                            <td>...</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"width: 100%; height: 50px; background-color: transparent\">\r\n");
      out.write("                    <marquee behavior=\"alternate\" ><marquee width=\"150\">--------------Developed by TinhDz--------------</marquee></marquee>\r\n");
      out.write("                    <marquee behavior=\"alternate\" style=\"width: 10%\">>></marquee>--------------Developed by TinhDz--------------<marquee style=\"width: 10%\" behavior=\"alternate\"><<</marquee>\r\n");
      out.write("                </div>                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"width: 100%; height: 50px; background-color: darkseagreen\">\r\n");
      out.write("            <div class=\"left-menu\" style=\"width: 50%; height: 100%; float: left; background-color:transparent \">\r\n");
      out.write("                <ul id=\"menu\">\r\n");
      out.write("                    <li><a href=\"IndexCourse.jsp\">Home</a>|\r\n");
      out.write("                        <ul id=\"sub\">\r\n");
      out.write("                            <li><a href=\"IndexCourse.jsp\">Course</a></li>\r\n");
      out.write("                            <li><a href=\"IndexTopic.jsp\">Topic</a></li>\r\n");
      out.write("                            <li><a href=\"IndexCate.jsp\">Category</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">About</a>|</li>\r\n");
      out.write("                    <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right-menu\" style=\"width: 50%; height: 100%; float: right; background-color: transparent\">\r\n");
      out.write("                <ul id=\"prof\">     \r\n");
      out.write("                    <!--                    <img src=\"avatar.png\" id=\"avt\" title=\"avatar\"/>-->\r\n");
      out.write("                    <li><a href=\"#\">Hello,</a>\r\n");
      out.write("                        <ul id=\"subP\">\r\n");
      out.write("                            <li><a href=\"\">Profile</a></li>\r\n");
      out.write("                            <li><a href=\"\">Setting</a></li>\r\n");
      out.write("                            <li><a href=\"\">Log off</a></li>  \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>        \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"width: 100%; height: 800px\">");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <h1>Invalid username or password!</h1>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("    <footer>Copyright &copy;2020 Develop by BTEC TU Group </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
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

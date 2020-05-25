package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_method_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_method_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_form_method_action.release();
    _jspx_tagPool_s_submit_value_method_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-image: url(\"pic1.jpg\");\n");
      out.write("            /*background-size: cover;*/\n");
      out.write("            background-position: center;\n");
      out.write("            font-family: sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .loginbox{\n");
      out.write("            width: 320px;\n");
      out.write("            height: 420px;\n");
      out.write("            background: #000;\n");
      out.write("            color: #fff;\n");
      out.write("            top: 50%;\n");
      out.write("            left: 50%;\n");
      out.write("            position: absolute;\n");
      out.write("            transform: translate(-50%,-50%);\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            padding: 70px 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .avatar{\n");
      out.write("            width: 100px;\n");
      out.write("            height: 100px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            position: absolute;\n");
      out.write("            top: -50px;\n");
      out.write("            left: calc(50% - 50px);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0 0 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 22px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .loginbox p{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .loginbox input{\n");
      out.write("            width: 100%;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .loginbox input[type=\"text\"], input[type=\"password\"]\n");
      out.write("        {\n");
      out.write("            border: none;\n");
      out.write("            border-bottom: 1px solid #fff;\n");
      out.write("            background: transparent;\n");
      out.write("            outline: none;\n");
      out.write("            height: 40px;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        .loginbox [type=\"submit\"]\n");
      out.write("        {\n");
      out.write("            border: none;\n");
      out.write("            outline: none;\n");
      out.write("            width: 255px;\n");
      out.write("            height: 40px;\n");
      out.write("            background: #fb2525;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 18px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("        }\n");
      out.write("        .loginbox [type=\"submit\"]:hover\n");
      out.write("        {\n");
      out.write("            cursor: pointer;\n");
      out.write("            background: #ffc107;\n");
      out.write("            color: #000;\n");
      out.write("        }\n");
      out.write("        .loginbox a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 12px;\n");
      out.write("            line-height: 20px;\n");
      out.write("            color: darkgrey;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .loginbox a:hover\n");
      out.write("        {\n");
      out.write("            color: #ffc107;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"loginbox\">            \n");
      out.write("            <img src=\"avatar.png\" class=\"avatar\">\n");
      out.write("            <h1>Login here</h1>\n");
      out.write("            ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                <a href=\"#\">Lost your password?</a><br>\n");
      out.write("            <a href=\"Register.jsp\">Don't have an account?</a>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_method_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("login");
    _jspx_th_s_form_0.setMethod("POST");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                <p>Username</p>\n");
        out.write("                <input type=\"text\" name=\"user\" placeholder=\"Enter Username\" required>\n");
        out.write("                <p>Password</p>\n");
        out.write("                <input type=\"password\" name=\"pass\" placeholder=\"Enter Password\" required>\n");
        out.write("                ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_method_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_method_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setValue("Login");
    _jspx_th_s_submit_0.setMethod("execute");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_method_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_method_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }
}

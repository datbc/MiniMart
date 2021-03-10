package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<footer class=\"page-footer text-center font-small mt-4 wow fadeIn\">\n");
      out.write("\n");
      out.write("    <!--Call to action-->\n");
      out.write("    <div class=\"pt-4\">\n");
      out.write("      <a class=\"btn btn-outline-white\" href=\"https://mdbootstrap.com/docs/jquery/getting-started/download/\" target=\"_blank\"\n");
      out.write("        role=\"button\">Download MDB\n");
      out.write("        <i class=\"fas fa-download ml-2\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a class=\"btn btn-outline-white\" href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\" role=\"button\">Start\n");
      out.write("        free tutorial\n");
      out.write("        <i class=\"fas fa-graduation-cap ml-2\"></i>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("    <!--/.Call to action-->\n");
      out.write("\n");
      out.write("    <hr class=\"my-4\">\n");
      out.write("\n");
      out.write("    <!-- Social icons -->\n");
      out.write("    <div class=\"pb-4\">\n");
      out.write("      <a href=\"https://www.facebook.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-facebook-f mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://twitter.com/MDBootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-twitter mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://www.youtube.com/watch?v=7MUISDJ5ZZ4\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-youtube mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://plus.google.com/u/0/b/107863090883699620484\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-google-plus-g mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://dribbble.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-dribbble mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://pinterest.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-pinterest mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://github.com/mdbootstrap/bootstrap-material-design\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-github mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"http://codepen.io/mdbootstrap/\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-codepen mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("    <!-- Social icons -->\n");
      out.write("\n");
      out.write("    <!--Copyright-->\n");
      out.write("    <div class=\"footer-copyright py-3\">\n");
      out.write("      © 2019 Copyright:\n");
      out.write("      <a href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\"> MDBootstrap.com </a>\n");
      out.write("    </div>\n");
      out.write("    <!--/.Copyright-->\n");
      out.write("\n");
      out.write("  </footer>\n");
      out.write("  <!--/.Footer-->\n");
      out.write("\n");
      out.write("  <!-- SCRIPTS -->\n");
      out.write("  <!-- JQuery -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery-3.4.1.min.js\"></script>\n");
      out.write("  <!-- Bootstrap tooltips -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/popper.min.js\"></script>\n");
      out.write("  <!-- Bootstrap core JavaScript -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <!-- MDB core JavaScript -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\n");
      out.write("  <!-- Initializations -->\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    // Animations initialization\n");
      out.write("    new WOW().init();\n");
      out.write("\n");
      out.write("  </script>\n");
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

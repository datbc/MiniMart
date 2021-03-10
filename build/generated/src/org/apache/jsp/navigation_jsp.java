package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!-- Navbar -->\n");
      out.write("  <nav class=\"navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <!-- Brand -->\n");
      out.write("      <a class=\"navbar-brand waves-effect\" href=\"https://mdbootstrap.com/docs/jquery/\" target=\"_blank\">\n");
      out.write("        <strong class=\"blue-text\">MDB</strong>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <!-- Collapse -->\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <!-- Links -->\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\n");
      out.write("        <!-- Left -->\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link waves-effect\" href=\"#\">Home\n");
      out.write("              <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link waves-effect\" href=\"https://mdbootstrap.com/docs/jquery/\" target=\"_blank\">About MDB</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link waves-effect\" href=\"https://mdbootstrap.com/docs/jquery/getting-started/download/\"\n");
      out.write("              target=\"_blank\">Free download</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link waves-effect\" href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\">Free\n");
      out.write("              tutorials</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <!-- Right -->\n");
      out.write("        <ul class=\"navbar-nav nav-flex-icons\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link waves-effect\">\n");
      out.write("                <span class=\"badge red z-depth-1 mr-1\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts!=null ? sessionScope.carts.size() :\n                    0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span>\n");
      out.write("              <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("              <span class=\"clearfix d-none d-sm-inline-block\"> Cart </span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a href=\"https://www.facebook.com/mdbootstrap\" class=\"nav-link waves-effect\" target=\"_blank\">\n");
      out.write("              <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a href=\"https://twitter.com/MDBootstrap\" class=\"nav-link waves-effect\" target=\"_blank\">\n");
      out.write("              <i class=\"fab fa-twitter\"></i>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a href=\"https://github.com/mdbootstrap/bootstrap-material-design\" class=\"nav-link border border-light rounded waves-effect\"\n");
      out.write("              target=\"_blank\">\n");
      out.write("              <i class=\"fab fa-github mr-2\"></i>MDB GitHub\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <!-- Navbar -->");
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

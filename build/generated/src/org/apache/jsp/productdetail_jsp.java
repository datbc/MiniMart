package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigation.jsp", out, false);
      out.write("\n");
      out.write("        <main class=\"mt-5 pt-4\">\n");
      out.write("            <div class=\"container dark-grey-text mt-5\">\n");
      out.write("\n");
      out.write("                <!--Grid row-->\n");
      out.write("                <div class=\"row wow fadeIn\">\n");
      out.write("\n");
      out.write("                    <!--Grid column-->\n");
      out.write("                    <div class=\"col-md-4 mb-4\">\n");
      out.write("\n");
      out.write("                        <img height=\"400px\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-fluid\" alt=\"\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--Grid column-->\n");
      out.write("\n");
      out.write("                    <!--Grid column-->\n");
      out.write("                    <div class=\"col-md-6 mb-4\">\n");
      out.write("\n");
      out.write("                        <!--Content-->\n");
      out.write("                        <div class=\"p-4\">\n");
      out.write("\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                \n");
      out.write("                                    <span class=\"badge purple mr-1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getCategoryName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"lead\">\n");
      out.write("                                <span>$100</span>\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <p class=\"lead font-weight-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getDes()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                            <form class=\"d-flex justify-content-left\">\n");
      out.write("                                <!-- Default input -->\n");
      out.write("                                <input type=\"number\" value=\"1\" aria-label=\"Search\" class=\"form-control\" style=\"width: 100px\">\n");
      out.write("                                <button class=\"btn btn-primary btn-md my-0 p\" type=\"submit\">Add to cart\n");
      out.write("                                    <i class=\"fas fa-shopping-cart ml-1\"></i>\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!--Content-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--Grid column-->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!--Grid row-->\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <!--Grid row-->\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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

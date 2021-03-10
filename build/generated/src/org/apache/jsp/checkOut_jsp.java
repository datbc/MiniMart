package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkOut_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigation.jsp", out, false);
      out.write("\n");
      out.write("        <!--Section: Block Content-->\n");
      out.write("        <div class=\"container\" style=\"margin-top: 150px\">\n");
      out.write("            <section>\n");
      out.write("\n");
      out.write("  <!--Grid row-->\n");
      out.write("  <div class=\"row\">\n");
      out.write("\n");
      out.write("    <!--Grid column-->\n");
      out.write("    <div class=\"col-lg-8\">\n");
      out.write("\n");
      out.write("      <!-- Card -->\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <div class=\"pt-4 wish-list\">\n");
      out.write("\n");
      out.write("          <h5 class=\"mb-4\">Cart (<span>2</span> items)</h5>\n");
      out.write("\n");
      out.write("          <div class=\"row mb-4\">\n");
      out.write("            <div class=\"col-md-5 col-lg-3 col-xl-3\">\n");
      out.write("              <div class=\"view zoom overlay z-depth-1 rounded mb-3 mb-md-0\">\n");
      out.write("                <img class=\"img-fluid w-100\"\n");
      out.write("                  src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/12a.jpg\" alt=\"Sample\">\n");
      out.write("                <a href=\"#!\">\n");
      out.write("                  <div class=\"mask\">\n");
      out.write("                    <img class=\"img-fluid w-100\"\n");
      out.write("                      src=\"https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Vertical/12.jpg\">\n");
      out.write("                    <div class=\"mask rgba-black-slight\"></div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-7 col-lg-9 col-xl-9\">\n");
      out.write("              <div>\n");
      out.write("                <div class=\"d-flex justify-content-between\">\n");
      out.write("                  <div>\n");
      out.write("                    <h5>Description</h5>\n");
      out.write("                    <p class=\"mb-3 text-muted text-uppercase small\">Shirt - blue</p>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                  <div>\n");
      out.write("                    <div class=\"def-number-input number-input safari_only mb-0 w-100\">\n");
      out.write("                      <button onclick=\"this.parentNode.querySelector('input[type=number]').stepDown()\"\n");
      out.write("                        class=\"minus decrease\">-</button>\n");
      out.write("                      <input class=\"quantity\" min=\"0\" name=\"quantity\" value=\"1\" type=\"number\">\n");
      out.write("                      <button onclick=\"this.parentNode.querySelector('input[type=number]').stepUp()\"\n");
      out.write("                        class=\"plus increase\">+</button>\n");
      out.write("                    </div>\n");
      out.write("                    <small id=\"passwordHelpBlock\" class=\"form-text text-muted text-center\">\n");
      out.write("                      (Note, 1 piece)\n");
      out.write("                    </small>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                  <div>\n");
      out.write("                    <a href=\"#!\" type=\"button\" class=\"card-link-secondary small text-uppercase mr-3\"><i\n");
      out.write("                        class=\"fas fa-trash-alt mr-1\"></i> Remove item </a>\n");
      out.write("                  </div>\n");
      out.write("                  <p class=\"mb-0\"><span><strong id=\"summary\">$17.99</strong></span></p class=\"mb-0\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <hr class=\"mb-4\">\n");
      out.write("         \n");
      out.write("          <p class=\"text-primary mb-0\"><i class=\"fas fa-info-circle mr-1\"></i> Do not delay the purchase, adding\n");
      out.write("            items to your cart does not mean booking them.</p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Card -->\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--Grid column-->\n");
      out.write("\n");
      out.write("    <!--Grid column-->\n");
      out.write("    <div class=\"col-lg-4\">\n");
      out.write("\n");
      out.write("      <!-- Card -->\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <div class=\"pt-4\">\n");
      out.write("\n");
      out.write("          <h5 class=\"mb-3\">The total amount of</h5>\n");
      out.write("\n");
      out.write("          <ul class=\"list-group list-group-flush\">\n");
      out.write("            <li class=\"list-group-item d-flex justify-content-between align-items-center border-0 px-0 pb-0\">\n");
      out.write("              Temporary amount\n");
      out.write("              <span>$25.98</span>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-group-item d-flex justify-content-between align-items-center px-0\">\n");
      out.write("              Shipping\n");
      out.write("              <span>Gratis</span>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-group-item d-flex justify-content-between align-items-center border-0 px-0 mb-3\">\n");
      out.write("              <div>\n");
      out.write("                <strong>The total amount of</strong>\n");
      out.write("                <strong>\n");
      out.write("                  <p class=\"mb-0\">(including VAT)</p>\n");
      out.write("                </strong>\n");
      out.write("              </div>\n");
      out.write("              <span><strong>$53.98</strong></span>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary btn-block\">go to checkout</button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Card -->\n");
      out.write("\n");
      out.write("      <!-- Card -->\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <div class=\"pt-4\">\n");
      out.write("\n");
      out.write("          \n");
      out.write("            <h2>Shipping information</h2>\n");
      out.write("            \n");
      out.write("              <div class=\"md-form md-outline mb-0\">\n");
      out.write("                <input type=\"text\" id=\"discount-code\" class=\"form-control font-weight-light\"\n");
      out.write("                  placeholder=\"Enter ship phone\">\n");
      out.write("                <input type=\"text\" id=\"discount-code\" class=\"form-control font-weight-light\"\n");
      out.write("                  placeholder=\"Enter name\">\n");
      out.write("                <input type=\"text\" id=\"discount-code\" class=\"form-control font-weight-light\"\n");
      out.write("                  placeholder=\"Enter address\">\n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Card -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--Grid column-->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Grid row -->\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("<!--Section: Block Content-->\n");
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

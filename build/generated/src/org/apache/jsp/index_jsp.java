package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_step_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_step_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_step_end_begin.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigation.jsp", out, false);
      out.write("  \n");
      out.write("    <div id=\"carousel-example-1z\" class=\"carousel slide carousel-fade pt-4\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("    <!--Indicators-->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#carousel-example-1z\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#carousel-example-1z\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#carousel-example-1z\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("    <!--/.Indicators-->\n");
      out.write("\n");
      out.write("    <!--Slides-->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\n");
      out.write("      <!--First slide-->\n");
      out.write("      <div class=\"carousel-item active\">\n");
      out.write("        <div class=\"view\" style=\"background-image: url('https://images.unsplash.com/photo-1566385101042-1a0aa0c1268c?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1189&q=80'); background-repeat: no-repeat; background-size: cover;\">\n");
      out.write("\n");
      out.write("          <!-- Mask & flexbox options-->\n");
      out.write("          <div class=\"mask rgba-black-strong d-flex justify-content-center align-items-center\">\n");
      out.write("\n");
      out.write("            <!-- Content -->\n");
      out.write("            <div class=\"text-center white-text mx-5 wow fadeIn\">\n");
      out.write("              <h1 class=\"mb-4\">\n");
      out.write("                <strong>Shopping on my store</strong>\n");
      out.write("              </h1>\n");
      out.write("\n");
      out.write("              <h5>\n");
      out.write("                <strong>Diversification of goods </strong>\n");
      out.write("              </h5>\n");
      out.write("\n");
      out.write("              <h5 class=\"mb-4 d-none d-md-block\">\n");
      out.write("                <strong>High-quality products</strong>\n");
      out.write("              </h5>\n");
      out.write("\n");
      out.write("              <a target=\"_blank\" href=\"#\" class=\"btn btn-outline-white btn-lg\">Start Shopping                \n");
      out.write("               \n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Content -->\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <!-- Mask & flexbox options-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!--/First slide-->\n");
      out.write("\n");
      out.write("      <!--Second slide-->\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <div class=\"view\" style=\"background-image: url('https://images.unsplash.com/photo-1575218823251-f9d243b6f720?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80'); background-repeat: no-repeat; background-size: cover;\">\n");
      out.write("\n");
      out.write("          <!-- Mask & flexbox options-->\n");
      out.write("          <div class=\"mask rgba-black-strong d-flex justify-content-center align-items-center\">\n");
      out.write("\n");
      out.write("            <!-- Content -->\n");
      out.write("            <div class=\"text-center white-text mx-5 wow fadeIn\">\n");
      out.write("              <h1 class=\"mb-4\">\n");
      out.write("                <strong>Shopping on my store</strong>\n");
      out.write("              </h1>\n");
      out.write("\n");
      out.write("              <h5>\n");
      out.write("                <strong>Diversification of goods</strong>\n");
      out.write("              </h5>\n");
      out.write("\n");
      out.write("              <h5 class=\"mb-4 d-none d-md-block\">\n");
      out.write("                <strong>High-quality products</strong>\n");
      out.write("              </h5>\n");
      out.write("\n");
      out.write("              <a target=\"_blank\" href=\"#\" class=\"btn btn-outline-white btn-lg\">Start Shopping \n");
      out.write("                \n");
      out.write("              \n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Content -->\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <!-- Mask & flexbox options-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!--/Second slide-->\n");
      out.write("\n");
      out.write("      <!--Third slide-->\n");
      out.write("      <div class=\"carousel-item\">\n");
      out.write("        <div class=\"view\" style=\"background-image: url('https://images.unsplash.com/photo-1498837167922-ddd27525d352?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80'); background-repeat: no-repeat; background-size: cover;\">\n");
      out.write("\n");
      out.write("          <!-- Mask & flexbox options-->\n");
      out.write("          <div class=\"mask rgba-black-strong d-flex justify-content-center align-items-center\">\n");
      out.write("\n");
      out.write("            <!-- Content -->\n");
      out.write("            <div class=\"text-center white-text mx-5 wow fadeIn\">\n");
      out.write("              <h1 class=\"mb-4\">\n");
      out.write("                <strong>Shopping on my store</strong>\n");
      out.write("              </h1>\n");
      out.write("\n");
      out.write("              <h5>\n");
      out.write("                <strong>Diversification of goods</strong>\n");
      out.write("              </h5>\n");
      out.write("\n");
      out.write("              <h5 class=\"mb-4 d-none d-md-block\">\n");
      out.write("                <strong>High-quality products</strong>\n");
      out.write("              </h5>\n");
      out.write("\n");
      out.write("              <a target=\"_blank\" href=\"#\" class=\"btn btn-outline-white btn-lg\">Start Shopping \n");
      out.write("               \n");
      out.write("               \n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Content -->\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <!-- Mask & flexbox options-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!--/Third slide-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--/.Slides-->\n");
      out.write("\n");
      out.write("    <!--Controls-->\n");
      out.write("    <a class=\"carousel-control-prev\" href=\"#carousel-example-1z\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"carousel-control-next\" href=\"#carousel-example-1z\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("    <!--/.Controls-->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!--/.Carousel Wrapper-->\n");
      out.write("\n");
      out.write("  <!--Main layout-->\n");
      out.write("  <main>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <!--Navbar-->\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-dark mdb-color lighten-3 mt-3 mb-5\">\n");
      out.write("\n");
      out.write("        <!-- Navbar brand -->\n");
      out.write("        <span class=\"navbar-brand\">Categories:</span>\n");
      out.write("\n");
      out.write("        <!-- Collapse button -->\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#basicExampleNav\"\n");
      out.write("          aria-controls=\"basicExampleNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <!-- Collapsible content -->\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"basicExampleNav\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          <!-- Links -->\n");
      out.write("          <ul class=\"navbar-nav mr-auto\">\n");
      out.write("              <li class=\"nav-item ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryId!=null ? \"\" : \"active\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("              <a class=\"nav-link\" href=\"Home\">All\n");
      out.write("                  <span class=\"sr-only\">(current)</span>\n");
      out.write("              </a>\n");
      out.write("          </li>\n");
      out.write("          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </ul>\n");
      out.write("          <!-- Links -->\n");
      out.write("\n");
      out.write("          <form class=\"form-inline\" action=\"Search\">\n");
      out.write("            <div class=\"md-form my-0\">\n");
      out.write("                <input  name=\"search\" class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <!-- Collapsible content -->\n");
      out.write("\n");
      out.write("      </nav>\n");
      out.write("      <!--/.Navbar-->\n");
      out.write("\n");
      out.write("      <!--Section: Products v.3-->\n");
      out.write("      <section class=\"text-center mb-4\">\n");
      out.write("          ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      \n");
      out.write("      </section>\n");
      out.write("          \n");
      out.write("      <!--Section: Products v.3-->\n");
      out.write("\n");
      out.write("      <!--Pagination-->\n");
      out.write("      <nav class=\"d-flex justify-content-center wow fadeIn\">\n");
      out.write("        <ul class=\"pagination pg-blue\">\n");
      out.write("\n");
      out.write("          <!--Arrow left-->\n");
      out.write("          <li class=\"page-item disabled\">\n");
      out.write("            <a class=\"page-link\" href=\"#\" aria-label=\"Previous\">\n");
      out.write("              <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("              <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"page-item active\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">1\n");
      out.write("              <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">2</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">3</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">4</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\">5</a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"page-item\">\n");
      out.write("            <a class=\"page-link\" href=\"#\" aria-label=\"Next\">\n");
      out.write("              <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("              <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("      <!--Pagination-->\n");
      out.write("      \n");
      out.write("        \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("ca");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("            \n");
          out.write("                  <li class=\"nav-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.getId()==categoryId ? \"active\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                      <a class=\"nav-link\" href=\"Filter?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ca.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                  </li>\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size>0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_step_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_1.setBegin(0);
    _jspx_th_c_forEach_1.setStep(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size-1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("          \n");
          out.write("          <!--Grid row-->\n");
          out.write("        <div class=\"row wow fadeIn\">\n");
          out.write("            ");
          if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("          \n");
          out.write("\n");
          out.write("        </div>\n");
          out.write("        <!--Grid row-->\n");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_step_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_step_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_forEach_2.setBegin(0);
    _jspx_th_c_forEach_2.setStep(1);
    _jspx_th_c_forEach_2.setEnd(3);
    _jspx_th_c_forEach_2.setVar("j");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"col-lg-3 col-md-6 mb-4\">\n");
          out.write("                    ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("            <!--Card-->\n");
          out.write("            \n");
          out.write("            <!--Card-->\n");
          out.write("\n");
          out.write("          </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_step_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(4*i+j)<product.size()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"card hover_tag\">\n");
        out.write("\n");
        out.write("              <!--Card image-->\n");
        out.write("              <div class=\"view overlay\">\n");
        out.write("                <img height=\"300px\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.get(4*i+j).getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"card-img-top\"\n");
        out.write("                  alt=\"\">\n");
        out.write("                <a href=\"Detail?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.get(4*i+j).getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                  <div class=\"mask rgba-white-slight\"></div>\n");
        out.write("                </a>\n");
        out.write("              </div>\n");
        out.write("              <!--Card image-->\n");
        out.write("\n");
        out.write("              <!--Card content-->\n");
        out.write("              <div class=\"card-body text-center\">\n");
        out.write("                <!--Category & Title-->\n");
        out.write("                <a href=\"\" class=\"grey-text\">\n");
        out.write("                  <h5>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.get(4*i+j).getCategoryName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h5>\n");
        out.write("                </a>\n");
        out.write("                <h5>\n");
        out.write("                  <strong>\n");
        out.write("                    <a href=\"\" class=\"dark-grey-text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.get(4*i+j).getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                      <span class=\"badge badge-pill danger-color\">NEW</span>\n");
        out.write("                    </a>\n");
        out.write("                  </strong>\n");
        out.write("                </h5>\n");
        out.write("\n");
        out.write("                <h4 class=\"font-weight-bold blue-text\">\n");
        out.write("                  <strong>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.get(4*i+j).getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("$</strong>\n");
        out.write("                </h4>\n");
        out.write("\n");
        out.write("              </div>\n");
        out.write("              <!--Card content-->\n");
        out.write("\n");
        out.write("            </div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}

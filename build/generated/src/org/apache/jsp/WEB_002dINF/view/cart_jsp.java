package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/affablebean.css\">\n");
      out.write("        <title>The Affable Bean</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div id=\"centerColumn\">\n");
      out.write("\n");
      out.write("                <p>Your shopping cart contains x items.</p>\n");
      out.write("\n");
      out.write("                <div id=\"actionBar\">\n");
      out.write("                    <a href=\"#\" class=\"bubble hMargin\">clear cart</a>\n");
      out.write("                    <a href=\"#\" class=\"bubble hMargin\">continue shopping</a>\n");
      out.write("                    <a href=\"#\" class=\"bubble hMargin\">proceed to checkout</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <h4 id=\"subtotal\">[ subtotal: xxx ]</h4>\n");
      out.write("\n");
      out.write("                <table id=\"cartTable\">\n");
      out.write("\n");
      out.write("                    <tr class=\"header\">\n");
      out.write("                        <th>product</th>\n");
      out.write("                        <th>name</th>\n");
      out.write("                        <th>price</th>\n");
      out.write("                        <th>quantity</th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("                            <img src=\"#\" alt=\"product image\">\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"lightBlue\">[ product name ]</td>\n");
      out.write("                        <td class=\"lightBlue\">[ price ]</td>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("\n");
      out.write("                            <form action=\"updateCart\" method=\"post\">\n");
      out.write("                                <input type=\"text\"\n");
      out.write("                                       maxlength=\"2\"\n");
      out.write("                                       size=\"2\"\n");
      out.write("                                       value=\"1\"\n");
      out.write("                                       name=\"quantity\">\n");
      out.write("                                <input type=\"submit\"\n");
      out.write("                                       name=\"submit\"\n");
      out.write("                                       value=\"update button\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                     <tr>\n");
      out.write("                        <td class=\"white\">\n");
      out.write("                            <img src=\"#\" alt=\"product image\">\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"white\">[ product name ]</td>\n");
      out.write("                        <td class=\"white\">[ price ]</td>\n");
      out.write("                        <td class=\"white\">\n");
      out.write("\n");
      out.write("                            <form action=\"updateCart\" method=\"post\">\n");
      out.write("                                <input type=\"text\"\n");
      out.write("                                       maxlength=\"2\"\n");
      out.write("                                       size=\"2\"\n");
      out.write("                                       value=\"1\"\n");
      out.write("                                       name=\"quantity\">\n");
      out.write("                                <input type=\"submit\"\n");
      out.write("                                       name=\"submit\"\n");
      out.write("                                       value=\"update button\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("                            <img src=\"#\" alt=\"product image\">\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"lightBlue\">[ product name ]</td>\n");
      out.write("                        <td class=\"lightBlue\">[ price ]</td>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("\n");
      out.write("                            <form action=\"updateCart\" method=\"post\">\n");
      out.write("                                <input type=\"text\"\n");
      out.write("                                       maxlength=\"2\"\n");
      out.write("                                       size=\"2\"\n");
      out.write("                                       value=\"1\"\n");
      out.write("                                       name=\"quantity\">\n");
      out.write("                                <input type=\"submit\"\n");
      out.write("                                       name=\"submit\"\n");
      out.write("                                       value=\"update button\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
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

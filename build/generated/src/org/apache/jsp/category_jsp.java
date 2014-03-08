package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"widgetBar\">\n");
      out.write("\n");
      out.write("                    <div class=\"headerWidget\">\n");
      out.write("                        [ language toggle ]\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"headerWidget\">\n");
      out.write("                        [ checkout button ]\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"headerWidget\">\n");
      out.write("                        [ shopping cart widget ]\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"#\" id=\"logo\" alt=\"Affable Bean logo\">\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <img src=\"#\" id=\"logoText\" alt=\"the affable bean\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"categoryLeftColumn\">\n");
      out.write("                <div class=\"categoryButton\" id=\"selectedCategory\">\n");
      out.write("                    <span class=\"categoryText\">dairy</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a href=\"#\" class=\"categoryButton\">\n");
      out.write("                    <span class=\"categoryText\">meats</span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"#\" class=\"categoryButton\">\n");
      out.write("                    <span class=\"categoryText\">bakery</span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"#\" class=\"categoryButton\">\n");
      out.write("                    <span class=\"categoryText\">fruit & veg</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"categoryRightColumn\">\n");
      out.write("                <p id=\"categoryTitle\">[ selected category ]</p>\n");
      out.write("\n");
      out.write("                <table id=\"productTable\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("                            <img src=\"#\" alt=\"product image\">\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("                            [ product name ]\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"smallText\">[ product description ]</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"lightBlue\">[ price ]</td>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <input type=\"submit\" value=\"purchase button\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"white\">\n");
      out.write("                            <img src=\"#\" alt=\"product image\">\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"white\">\n");
      out.write("                            [ product name ]\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"smallText\">[ product description ]</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"white\">[ price ]</td>\n");
      out.write("                        <td class=\"white\">\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <input type=\"submit\" value=\"purchase button\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("                            <img src=\"#\" alt=\"product image\">\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("                            [ product name ]\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"smallText\">[ product description ]</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"lightBlue\">[ price ]</td>\n");
      out.write("                        <td class=\"lightBlue\">\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <input type=\"submit\" value=\"purchase button\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"white\">\n");
      out.write("                            <img src=\"#\" alt=\"product image\">\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"white\">\n");
      out.write("                            [ product name ]\n");
      out.write("                            <br>\n");
      out.write("                            <span class=\"smallText\">[ product description ]</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"white\">[ price ]</td>\n");
      out.write("                        <td class=\"white\">\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <input type=\"submit\" value=\"purchase button\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <hr>\n");
      out.write("                <p id=\"footerText\">[ footer text ]</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
}

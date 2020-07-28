package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Identity-Based Secure Distributed Data Storage</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.5.2.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/Molengo_400.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/Expletus_Sans_400.font.js\"></script>\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script type=\"text/javascript\" src=\"js/html5.js\"></script>\n");
      out.write("<style type=\"text/css\">.bg, .box2{behavior:url(\"js/PIE.htc\");}</style>\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body id=\"page1\">\n");
      out.write("<div class=\"body1\">\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <!-- header -->\n");
      out.write("    <header>\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <nav>\n");
      out.write("          <ul id=\"menu\">\n");
      out.write("              <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("              <li><a href=\"dataowner.jsp\">Data-Owner</a></li>\n");
      out.write("            <li><a href=\"datauser.jsp\">Data-User</a></li>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("        <ul id=\"icon\">\n");
      out.write("          <li><a href=\"#\"><img src=\"images/icon1.jpg\" alt=\"\"></a></li>\n");
      out.write("          <li><a href=\"#\"><img src=\"images/icon2.jpg\" alt=\"\"></a></li>\n");
      out.write("          <li><a href=\"#\"><img src=\"images/icon3.jpg\" alt=\"\"></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <h1><a href=\"index.html\" id=\"logo\">Learn Center</a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"slogan\"> Distributed Data Storage<span>Identity-based System</span><span> Access Control, Security</span> </div>\n");
      out.write("      <ul class=\"banners\">\n");
      out.write("          <li><a href=\"dataowner.jsp\"><img src=\"images/banner1.jpg\" alt=\"\"></a></li>\n");
      out.write("          <li><a href=\"datauser.jsp\"><img src=\"images/banner2.jpg\" alt=\"\"></a></li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("    </header>\n");
      out.write("    <!-- / header -->\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    \n");
      out.write("<script type=\"text/javascript\">Cufon.now();</script>\n");
      out.write("<div align=center>copyright: jp infotech</div>\n");
      out.write("<div style=\"position: absolute; left:315px; top: 100px\">\n");
      out.write("<img src=\"images/hd.png\" height=\"80\" width=\"550\"></div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    \n");
      out.write("    <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("     <!-- <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"js/respond.min.js\"></script>\n");
      out.write("       -->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header>\n");
      out.write("      <div class=\"jumbotron\">\n");
      out.write("        <div class=\"container well\">\n");
      out.write("          <h1><center>Staff Information</center></h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <a href=\"template2.php\"><strong>Login</strong></a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("  \n");
      out.write("      <div class=\"container well\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("          \n");
      out.write("          \n");
      out.write("              <\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("                <form method=\"post\" action=\"validate.php\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"fname\">First Name</label>\n");
      out.write("                <input type=\"textbox\" name=\"fname\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                <label for=\"mname\">Middle Name</label>\n");
      out.write("                <input type=\"textbox\" name=\"mname\" class=\"form-control\" required>\n");
      out.write("               </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label for=\"lname\">Last Name</label>\n");
      out.write("                <input type=\"textbox\" name=\"mname\" class=\"form-control\" required>\n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                <label for=\"dob\">Date Of Birth</label>\n");
      out.write("                <input type=\"date\" name=\"dob\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label for=\"phone\">Gender</label>\n");
      out.write("                <input type=\"radio\" name=\"gender\"  value=\"male\" required>Male<br>\n");
      out.write("                <input type=\"radio\" name=\"gender\"  value=\"female\">Female\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("                <hr>\n");
      out.write("                <p style=\"font-size:150%;\"><em><center>Employment Details</center></em></p>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label for=\"date\">Date of Employment</label>\n");
      out.write("                <input type=\"date\" name=\"doe-2\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                <label for=\"rank\">Rank</label>\n");
      out.write("                <input type=\"text\" name=\"rank\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                <label for=\"position\">Position</label>\n");
      out.write("                <input type=\"text\" name=\"position\" class=\"form-control\" required>\n");
      out.write("               </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                <label for=\"category\">Category</label>\n");
      out.write("                <input type=\"text\" name=\"phone-1\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                <label for=\"phone-1\">Department ID</label>\n");
      out.write("                <input type=\"number\" name=\"deptid\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <hr>\n");
      out.write("\n");
      out.write("               <p>  \n");
      out.write("               <input type=\"submit\"  name=\"submit\" class=\"btn btn-primary\">\n");
      out.write("               </P>     \n");
      out.write("              \n");
      out.write("              </div>\n");
      out.write("               \n");
      out.write("\n");
      out.write("                          \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"col-lg-6\">\n");
      out.write("                <hr>\n");
      out.write("                <p><em><center>Contact Details</center></em></p>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label for=\"mail\">Email</label>\n");
      out.write("                <input type=\"email\" name=\"mail\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                <label for=\"raddress\">Residential Address</label>\n");
      out.write("                <input type=\"text\" name=\"raddress\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                <label for=\"paddress\">Postal Address</label>\n");
      out.write("                <input type=\"textbox\" name=\"paddress\" class=\"form-control\" required>\n");
      out.write("               </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                <label for=\"phone-1\">Phone Number</label>\n");
      out.write("                <input type=\"number\" name=\"phone-1\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <hr>\n");
      out.write("\n");
      out.write("               \n");
      out.write("              \n");
      out.write("              </div>\n");
      out.write("          </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("        <form method=\"post\" action=\"validate.php\">\n");
      out.write("        <div class=\"col-lg-6\">\n");
      out.write("                <hr>\n");
      out.write("                <p><em><center>Employment Details</center></em></p>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                <label for=\"date\">Date of Employment</label>\n");
      out.write("                <input type=\"date\" name=\"doe-2\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                <label for=\"rank\">Rank</label>\n");
      out.write("                <input type=\"text\" name=\"rank\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                <label for=\"position\">Position</label>\n");
      out.write("                <input type=\"text\" name=\"position\" class=\"form-control\" required>\n");
      out.write("               </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                <label for=\"category\">Category</label>\n");
      out.write("                <input type=\"text\" name=\"phone-1\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                <label for=\"phone-1\">Department ID</label>\n");
      out.write("                <input type=\"number\" name=\"deptid\" class=\"form-control\" required>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <hr>\n");
      out.write("\n");
      out.write("               <p>  \n");
      out.write("               <input type=\"submit\"  name=\"submit\" class=\"btn btn-primary\">\n");
      out.write("               </P>     \n");
      out.write("              \n");
      out.write("              </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
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

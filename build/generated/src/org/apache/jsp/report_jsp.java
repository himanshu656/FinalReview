package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.ResultSet;
import com.util.DbConnector;
import java.sql.PreparedStatement;

public final class report_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Cloud</title>\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Arvo\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Coda:400,800\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"menu-wrapper\">\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"userHome.jsp\">User Home</a></li>\n");
      out.write("                    <li><a href=\"Insert_tags.jsp\">Upload</a></li>\n");
      out.write("                    <li class=\"current_page_item\"><a href=\"report.jsp\">Report</a></li>\n");
      out.write("                    <li><a href=\"searchFile.jsp\">Search File</a></li>\n");
      out.write("                    <li><a href=\"index.jsp\">Log out</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- end #menu -->\n");
      out.write("        </div>\n");
      out.write("        <div id=\"header-wrapper\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <h1><a href=\"#\">Storing of Encrypted Data on Cloud using  <span>KNN Algorithm</span></a></h1>                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"banner\"><img src=\"images/img04.jpg\" width=\"1000\" height=\"350\" alt=\"\" /></div>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <!-- end #header -->\n");
      out.write("            <div id=\"page\">\n");
      out.write("                <div id=\"page-bgtop\">\n");
      out.write("                    <div id=\"page-bgbtm\">\n");
      out.write("                        <div id=\"content\">\n");
      out.write("                            <div class=\"post\">\n");
      out.write("                                <h3>Report</h3>\n");
      out.write("                                <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                                <div class=\"entry\">\n");
      out.write("                                    ");
if (request.getParameter("msg") != null) {
                                            out.println(request.getParameter("msg"));
                                        }
      out.write("\n");
      out.write("                                    <h2>Users</h2>\n");
      out.write("                                    <table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Status</th>\n");
      out.write("                                            <th>Date & Time</th>\n");
      out.write("                                            <th>File Name</th>\n");
      out.write("                                          <!--  <th>Download</th>-->\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            HttpSession se= request.getSession();                                            
                                             String user=(String)se.getAttribute("userid");
                                            out.print("<h2>Hello : "+user+"</h2>");
                                            Connection con = DbConnector.getConnection();
                                            PreparedStatement pstm = null;
                                            String sql = "select * from transaction where name='"+user+"' group by filename ";
                                            pstm = con.prepareStatement(sql);
                                            ResultSet rs = pstm.executeQuery();
                                            while (rs.next()) {
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                                            <!--<td>");
      out.print(rs.getString(5));
      out.write("</td> -->\n");
      out.write("                                           <!-- <td><a href=\"FileDownload?ip=");
      out.print(rs.getString(4));
      out.write("&file=");
      out.print(rs.getString(2));
      out.write("\">Download</a></td> -->\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");
}
                                        
      out.write("\n");
      out.write("                                    </table>      \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end #content -->\n");
      out.write("\n");
      out.write("                        <!-- end #sidebar -->\n");
      out.write("                        <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- end #page -->\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <!-- end #footer -->\n");
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

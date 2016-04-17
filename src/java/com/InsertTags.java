package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class InsertTags extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession se= request.getSession();
            Class.forName("com.mysql.jdbc.Driver");
           
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ftp","root","password");
           
           String tags=request.getParameter("tags");
           se.setAttribute("tags", tags);
         //   String owner_email=(String)se.getAttribute("userid");
         /*  String file_name=(String)se.getAttribute("file_name");
           
           String size=(String)se.getAttribute("size");
           out.println("yaha tak thik hai!!");
           String owner_email=(String)se.getAttribute("owner_email");
            
           Date dNow = new Date( );
           SimpleDateFormat ft =new SimpleDateFormat ("yyyy-MM-dd");
           //out.println("<br>Current Date: " + ft.format(dNow));
           
           out.print(""+tags);
           String pyarakey=(String)se.getAttribute("pyarakey");
           
           String query="insert into csp_data values('"+owner_email+"', '"+file_name+"','"+size+"','"+tags+"','"+ft.format(dNow)+"','"+pyarakey+"')";       
           Statement st= con.createStatement();
           int x=st.executeUpdate(query);
              String msg="";
           
           if(x>0)
           {
              // out.println("Inserted sucess!!");
               msg+="Insert Sucess!!";
           }
           else
           {
              // out.println("failed");
                msg+="Insert failed!!";
           }
        se.setAttribute("msg_report", msg);
           */
           response.sendRedirect("fileUpload.jsp");
           
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
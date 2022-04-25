/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tamim
 */
@WebServlet(name = "register_process", urlPatterns = {"/register_process"})
public class register_process extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       
       
        
        String fullname = request.getParameter("fullname");
        String telephone = request.getParameter("telephone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String pwd = request.getParameter("pwd");
        
        
        String url = "jdbc:mysql://localhost:3306/rentacar";
        String user = "root";
        String password = "";
        Connection conn = null;
        
        try {
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        }
         catch (ClassNotFoundException e)
         {
            e.printStackTrace();
         } 
        
        conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement stmt = conn.prepareStatement("insert into User values(?, ?, ?, ?, ?, ?, ?, ?)");
        
        stmt.setString(1, null);
        stmt.setString(2, fullname);
        stmt.setString(3, email);
        stmt.setString(4, address);
        stmt.setString(5, city);
        stmt.setString(6, telephone);
        stmt.setString(7, pwd);
        stmt.setString(8, "active");
        int insert = stmt.executeUpdate();
        
        if(insert > 0)
            request.getRequestDispatcher("register-success.jsp").forward(request, response);
        else request.getRequestDispatcher("register.jsp").forward(request, response);
   
        stmt.close();
        conn.close();     
      }
       
       catch (SQLException e)
       {
       }
        
       
    }
}

    
        
       
            
       
 
        
        
      


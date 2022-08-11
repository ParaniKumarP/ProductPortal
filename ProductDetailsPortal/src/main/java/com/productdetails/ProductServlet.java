package com.productdetails;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
       

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");
int cost = Integer.parseInt(request.getParameter("cost"));


HttpSession session = request.getSession();
session.setAttribute("id", id);
session.setAttribute("name", name);
session.setAttribute("cost", cost);

PrintWriter out = response.getWriter();
 out.print("<a href='show.jsp'> Display Details</a>");
}



}
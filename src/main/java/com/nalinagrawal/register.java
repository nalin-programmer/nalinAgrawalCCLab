package com.nalinagrawal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nalinagrawal.dao.RegisterDao;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	public register() {
        super();
        // TODO Auto-generated constructor stub
    }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String Employee_ID_Number_111915077 = request.getParameter("Employee_ID_Number_111915077");
	        String First_Name_111915077 = request.getParameter("First_Name_111915077");
	        String Last_Name_111915077 = request.getParameter("Last_Name_111915077");
	        String Date_of_Birth_111915077 = request.getParameter("Date_of_Birth_111915077");
	        String Contact_Number_111915077 = request.getParameter("Contact_Number_111915077");
	        String Job_Role_111915077 = request.getParameter("Job_Role_111915077");
	        String Monthly_Salary_111915077 = request.getParameter("Monthly_Salary_111915077");
	        String Yearly_Bonus_111915077 = request.getParameter("Yearly_Bonus_111915077");
	        String Password_111915077 = request.getParameter("Password_111915077");
	        System.out.print(Employee_ID_Number_111915077);
        RegisterDao dao = new RegisterDao();

        if(dao.addUser_111915077(Employee_ID_Number_111915077, First_Name_111915077, Last_Name_111915077, Date_of_Birth_111915077, Contact_Number_111915077, Job_Role_111915077, Monthly_Salary_111915077, Yearly_Bonus_111915077, Password_111915077)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", Employee_ID_Number_111915077);
            response.sendRedirect("login.jsp");
        }
        else {
            response.sendRedirect("register.jsp");
        }

	} 

}

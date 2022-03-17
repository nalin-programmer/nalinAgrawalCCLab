package com.nalinagrawal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nalinagrawal.dao.LoginDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	public login() {
		super();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Employee_ID_Number_111915077 = request.getParameter("Employee_ID_Number_111915077");
        String Password_111915077 = request.getParameter("Password_111915077");

        LoginDao dao = new LoginDao();
        
        if(dao.check(Employee_ID_Number_111915077, Password_111915077)) {
            HttpSession session = request.getSession();
            session.setAttribute("Employee_ID_Number_111915077", Employee_ID_Number_111915077);
            session.setAttribute("First_Name_111915077", dao.First_Name_111915077);
            session.setAttribute("Last_Name_111915077", dao.Last_Name_111915077);
            session.setAttribute("Date_of_Birth_111915077", dao.Date_of_Birth_111915077);
            session.setAttribute("Contact_Number_111915077", dao.Contact_Number_111915077);
            session.setAttribute("Job_Role_111915077", dao.Job_Role_111915077);
            session.setAttribute("Monthly_Salary_111915077", dao.Monthly_Salary_111915077);
            session.setAttribute("Yearly_Bonus_111915077", dao.Yearly_Bonus_111915077);
            
            response.sendRedirect("report.jsp");
        }
        else {
            response.sendRedirect("login.jsp");
        }

	}

}

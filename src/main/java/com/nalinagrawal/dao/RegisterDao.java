package com.nalinagrawal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDao {
	String url="jdbc:mysql://localhost:3306/nalin";
	String sql1="insert into nalinagrawal_111915077_detail values(?,?,?,?,?,?)";
	String sql2="insert into nalinagrawal_111915077_salary values(?,?,?,?)";
	String username="root";
	String password="root";
	public boolean addUser_111915077(String Employee_ID_Number_111915077, String First_Name_111915077, String Last_Name_111915077, String Date_of_Birth_111915077,
			String Contact_Number_111915077, String Job_Role_111915077, String Monthly_Salary_111915077, String Yearly_Bonus_111915077, String Password_111915077) {
		 try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con1 = DriverManager.getConnection(url,username,password);
           PreparedStatement st1 = con1.prepareStatement(sql1);
           st1.setString(1, Employee_ID_Number_111915077);
           st1.setString(2, First_Name_111915077);
           st1.setString(3, Last_Name_111915077);
           st1.setString(4, Date_of_Birth_111915077);
           st1.setString(5, Contact_Number_111915077);
           st1.setString(6, Password_111915077);
           st1.execute();
           con1.close();
           
           System.out.println(Employee_ID_Number_111915077);
           
           Connection con2 = DriverManager.getConnection(url,username,password);
           PreparedStatement st2 = con2.prepareStatement(sql2);
           st2.setString(1, Employee_ID_Number_111915077);
           st2.setString(2, Job_Role_111915077);
           st2.setString(3, Yearly_Bonus_111915077);
           st2.setString(4, Monthly_Salary_111915077);
           st2.execute();
           con2.close();
           
           return true;

       } catch (Exception e) {

           e.printStackTrace();
           System.out.println("Failed Register Dao");
           return false;

       }
}
	}

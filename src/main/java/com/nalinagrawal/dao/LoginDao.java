package com.nalinagrawal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql="select * from nalinagrawal_111915077_detail where employee_id_number=? and password=?";
	String sql1="select * from nalinagrawal_111915077_salary where employee_id_number=?";
	String url="jdbc:mysql://localhost:3306/nalin";
	String username="root";
	String password="root";
	
	 public String Employee_ID_Number_111915077 ="";
	 public String First_Name_111915077="";
	 public String Last_Name_111915077="";
	 public String Date_of_Birth_111915077 ="";
	 public String Contact_Number_111915077="";
	 public String Job_Role_111915077 ="";
	 public String Monthly_Salary_111915077 ="";
	 public String Yearly_Bonus_111915077="";
     
     
	public boolean check(String Employee_ID_Number111915077, String Password_111915077) {
		 try {

			 Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Employee_ID_Number111915077);
            st.setString(2, Password_111915077);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()) {
            	Employee_ID_Number_111915077 =rs.getString("employee_id_number");
            	First_Name_111915077 =rs.getString("first_name");
            	Last_Name_111915077 =rs.getString("last_name");
            	Date_of_Birth_111915077 =rs.getString("date_of_birth");
            	Contact_Number_111915077 =rs.getString("contact_number");
            	
            	st = con.prepareStatement(sql1);
                st.setString(1, Employee_ID_Number_111915077);
                rs = st.executeQuery();
                
                if(rs.next()) {
                	Job_Role_111915077 = rs.getString("job_role");
                	Monthly_Salary_111915077 = rs.getString("monthly_salary");
                	Yearly_Bonus_111915077 = rs.getString("yearly_bonus");
                }
                return true;
            }
            
            

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;
	}
}


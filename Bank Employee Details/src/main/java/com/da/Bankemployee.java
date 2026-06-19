package com.da;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")

public class Bankemployee extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id = req.getParameter("empid");
		int EmployeeId =Integer.parseInt(id) ;
		String EmployeeName = req.getParameter("empname");
		String Email = req.getParameter("email");
		
		String mobno = req.getParameter("MobNo");
		long PhoneNo =Long.parseLong(mobno) ;
		
		String Gender = req.getParameter("Gender");
		String Address = req.getParameter("Address");
		String Department = req.getParameter("DEPT");
		String Position = req.getParameter("Position");
		String Salary = req.getParameter("salary");
		
		String Exp = req.getParameter("Exp");
		float Experience  = Float.parseFloat(Exp);
		
		String Branchname = req.getParameter("branch");
		String IFSC = req.getParameter("ifsc");
		
		String acnum = req.getParameter("AcNum");
		long AccountNo =Long.parseLong(acnum) ;

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root" ,"root");
			PreparedStatement ps = con.prepareStatement("insert into Bankemployee(EmployeeId , EmployeeName ,Email ,PhoneNo ,Gender ,Address ,Department ,Position ,Salary ,Experience ,Branchname ,IFSC ,AccountNo)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, EmployeeId);
			ps.setString(2, EmployeeName);
			ps.setString(3, Email);
			ps.setLong(4, PhoneNo);
			ps.setString(5, Gender);
			ps.setString(6, Address);
			ps.setString(7, Department);
			ps.setString(8, Position);
			ps.setString(9, Salary);
			ps.setFloat(10, Experience);
			ps.setString(11, Branchname);
			ps.setString(12, IFSC);
			ps.setLong(13, AccountNo);
			int check = ps.executeUpdate();
			if(check > 0) {
				out.println("Inserted...!");
			}else{
				out.println("Not Inserted...!");
			}
		} 
			catch (Exception e) {
//			   
			}
			
		
		
		
//		out.println(id);
//		out.println(EmployeeName);
//		out.println(Email);
//		out.println(mobno);
//		out.println(Gender);
//		out.println(Address);
//		out.println(Department);
//		out.println(Position);
//		out.println(Salary);
//		out.println(Exp);
//		out.println(Branchname);
//		out.println(IFSC);
//		out.println(acnum);
	


		
	}
	

}

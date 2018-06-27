package com.std.controller;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.std.bean.Student;
import com.std.service.Service;
import com.std.service.ServiceImpl;

@WebServlet("/Controller")
public class Controller extends HttpServlet {              
	private static final long serialVersionUID = 1L;            
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		       
			String button=request.getParameter("action");    
			if(button.equalsIgnoreCase("login")) {     
				 Student st=new    Student();     
			    	String value1=request.getParameter("name");     
			    	      st.setF_Name(value1);               
			    	      String value2=request.getParameter("lastname");   	  
			    	      st.setL_Name(value2);  
			    	      long value3=Long.parseLong(request.getParameter("pancard"));   	  
			    	      st.setPancard(value3); 
			    	      String value4=request.getParameter("address");   	  
			    	      st.setAdress(value4);  
			    	      String value5=request.getParameter("country");  
			    	      st.setCountry(value5);
			    	      String value6=request.getParameter("qualification");   	  
			    	      st.setQualification(value6);
			    	      String value7=request.getParameter("specialization");   	  
			    	      st.setSpecialization(value7);  
			    	      String value8=request.getParameter("yop");   	  
			    	      st.setYop(value8);
			    	      long value9=Long.parseLong(request.getParameter("phoneno")); 
			    	      st.setPhone_no(value9);
			    	      long value10=Long.parseLong(request.getParameter("uniqueid")); 
			    	      st.setUniqueid(value10);
			    	      int value11=Integer.parseInt(request.getParameter("percentage")); 
			    	      st.setPercentage(value11);
			    	      String value12=request.getParameter("dob");   	          
			    	      st.setDob(value12);
			    	      String value13=request.getParameter("doj");   	  
			    	      st.setDoj(value13);    
			    	      String value14=request.getParameter("state");   	  
			    	      st.setState(value14);
			    	      Service service=new  ServiceImpl();  
			    	         
		     }//if   method          
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}   

}

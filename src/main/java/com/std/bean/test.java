package com.std.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.std.util.HibernateUtil;   

public class test {
	  //private static SessionFactory sessionFactory;   

	public static void main(String[] args) {
		                   
		Configuration  cfg=new Configuration();                                
		                                           
		SessionFactory sf=cfg.configure("hibernateconfiguration.cfg.xml").buildSessionFactory();
			  Session ses=sf.openSession();
			         Transaction tr = ses.beginTransaction();
	Student st=new Student();       
	st.setF_Name("swetha");                         
	st.setL_Name("Reddy");
	st.setQualification("B.TECH");     
	st.setSpecialization("C.S.E");
	st.setYop("2016");
	st.setPercentage(70);
	st.setDob("11-08-1995");
	st.setDoj("11-02-2018");
	st.setAdress("Hyderabad");
	st.setPancard(1234567L);
	st.setCountry("India");
	st.setUniqueid(987654321L);
	st.setPhone_no(1234567890L);
	st.setState("india");   
	Transaction tx=ses.beginTransaction();
	
	tx.commit();
	ses.close();   
	System.out.println("Inserted done");   
}  
}
package com.std.bean;

import java.io.Serializable;

import javax.persistence.Column;

import org.hibernate.annotations.Type;

public class StudentDTO implements Serializable{
	private int studentid;
	private String F_Name;
	private String L_Name;
	private String qualification;
	private String specialization;
	private String yop;
	private int percentage;
	private String dob;
	private String doj;
	private String adress;
	private String state;
	private long pancard;
	private String country;
	private long uniqueid;   
	private long phone_no;
	
	public int getStudentid() {
		return studentid;   
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getF_Name() {
		return F_Name;
	}

	public void setF_Name(String f_Name) {
		F_Name = f_Name;
	}

	public String getL_Name() {
		return L_Name;
	}

	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPancard() {
		return pancard;
	}

	public void setPancard(long pancard) {
		this.pancard = pancard;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getUniqueid() {
		return uniqueid;
	}

	public void setUniqueid(long uniqueid) {
		this.uniqueid = uniqueid;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

}

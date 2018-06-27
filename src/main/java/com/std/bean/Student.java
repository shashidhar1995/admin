package com.std.bean;

import java.util.Date;

import javax.persistence.Column;        
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="Students-Details")
public class Student {    
	@Id
	@GenericGenerator(name="gen1",strategy="sequence")
	@GeneratedValue(generator="gen1")
	@Column(name="Student_Id")
	@Type(type="int")
	private int studentid;
	@Column(name="F_name")
	@Type(type="String")
	private String F_Name;
	@Column(name="L_name")
	@Type(type="String")
	private String L_Name;
	@Column(name="Qualification")
	@Type(type="String")
	private String qualification;
	@Column(name="Specialization")
	@Type(type="String")
	private String specialization;
	@Column(name="Y.O.P")
	@Type(type="String")
	private String yop;
	@Column(name="Percentage")
	@Type(type="int")
	private int percentage;
	@Column(name="D.O.B")
	@Type(type="String")
	private String dob;
	@Column(name="D.O.J")
	@Type(type="String")
	private String doj;
	@Column(name="Adress")
	@Type(type="String")
	private String adress;
	@Column(name="State")
	@Type(type="String")
	private String state;
	@Column(name="PANCARD")
	@Type(type="long")
	private long pancard;
	@Column(name="Country")
	@Type(type="String")
	private String country;
	@Column(name="UniqueId")
	@Type(type="long")
	private long uniqueid;
	@Column(name="PhoneNum")
	@Type(type="long")
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	
		

	 public Student(int studentid, String f_Name, String l_Name, String qualification, String specialization, String yop,
			int percentage, String dob, String doj, String adress, long pancard, String country, long uniqueid,
			long phone_no) {
		super();
		this.studentid = studentid;
		F_Name = f_Name;
		L_Name = l_Name;
		this.qualification = qualification;
		this.specialization = specialization;
		this.yop = yop;
		this.percentage = percentage;
		this.dob = dob;
		this.doj = doj;
		this.adress = adress;
		this.pancard = pancard;
		this.country = country;
		this.uniqueid = uniqueid;
		this.phone_no = phone_no;
	}
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", F_Name=" + F_Name + ", L_Name=" + L_Name + ", qualification="
				+ qualification + ", specialization=" + specialization + ", yop=" + yop + ", percentage=" + percentage
				+ ", dob=" + dob + ", doj=" + doj + ", adress=" + adress + ", state=" + state + ", pancard=" + pancard
				+ ", country=" + country + ", uniqueid=" + uniqueid + ", phone_no=" + phone_no + "]";
	}
	
	
}

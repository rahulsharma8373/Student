package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "STUDENT1")
public class Student {

	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int st_id;
	private String cityname;
	private  String add;
	
	public String getCityname() {
		return cityname;
	}
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Student(int st_id, String cityname, String add) {
		super();
		this.st_id = st_id;
		this.cityname = cityname;
		this.add = add;
	}
	@Override
	public String toString() {
		return "student [id=" + st_id + ", cityname=" + cityname + ", add=" + add + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

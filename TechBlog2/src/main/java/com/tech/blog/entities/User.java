package com.tech.blog.entities;

import java.sql.Timestamp;

public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", dateTime=" + dateTime + ", about=" + about + "]";
	}
	private int id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private Timestamp dateTime;
	private String about;
	private String profile;
	
	public User(int id, String name, String email, String password, String gender, Timestamp dateTime, String about) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dateTime = dateTime;
		this.about = about;
	}
	public User(String name, String email, String password, String gender, Timestamp dateTime, String about) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dateTime = dateTime;
		this.about = about;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Timestamp getDateTime() {
		return dateTime;
	}
	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
	
	
}

package com.bwf.entity;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String gender;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
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
	public User(Integer id, String userName, String password, String gender) {
		super();
		this.id = id;
		this.username = userName;
		this.password = password;
		this.gender = gender;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + username + ", password=" + password + ", gender=" + gender + "]";
	}
	
}
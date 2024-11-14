package com.example.foodorderback.dto;

public class JWTLogin {
	public String username;
	public String role;
	public String firstName;
	public String lastName;
	
	public JWTLogin() {
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {return firstName; }

	public void setFirstName(String firstName) {	this.firstName = firstName;}

	public String getLastName() {return lastName; }

	public void setLastName(String firstName) {	this.lastName = lastName;}
}

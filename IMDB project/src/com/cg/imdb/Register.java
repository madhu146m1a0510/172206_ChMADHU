package com.cg.imdb;

public class Register {
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String email;
    private String mobilenum;
    private String address;
	
	public Register(String firstname, String lastname, String username, String password, String email, String mobilenum,
			String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobilenum = mobilenum;
		this.address = address;
	}
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Register [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username + ", password="
				+ password + ", email=" + email + ", mobilenum=" + mobilenum + ", address=" + address + "]";
	}

}

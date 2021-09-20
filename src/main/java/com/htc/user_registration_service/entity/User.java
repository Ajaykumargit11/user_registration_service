package com.htc.user_registration_service.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6527413633782078597L;
	@Id
	private long userId;
	@Column
	private String userName;
	@Column
	private String phoneno;
	@Column
	private String email;
	@Column
	private String age;
	@Column
	private String gender;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userId, String userName, String phoneno, String email, String age, String gender) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phoneno = phoneno;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, email, gender, phoneno, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(age, other.age) && Objects.equals(email, other.email)
				&& Objects.equals(gender, other.gender) && Objects.equals(phoneno, other.phoneno)
				&& userId == other.userId && Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", phoneno=" + phoneno + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
}
	
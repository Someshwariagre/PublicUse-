package com.xworkz.somu_project.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
@NamedQuery(name = "findByName", query = "select find from ProjectEntity find where find.name=:nm")
@NamedQuery(name = "find", query = "select ent from ProjectEntity ent")
//@NamedQuery(name = "userId", query = "select count(*) from  UserEntity ent where ent.userId=:userBy")
@NamedQuery(name = "emailId", query = "select count(*) from  ProjectEntity pe where pe.email=:em")
@NamedQuery(name = "mobileId", query = "select count(*) from  ProjectEntity pm where pm.mobile=:mb")
//@NamedQuery(name = "user", query = "select ent from UserEntity ent where ent.userId=:ui")
//@NamedQuery(name = "users", query = "select ent from UserEntity ent where ent.userId=:uis")
@NamedQuery(name = "emailid", query = "select pe from ProjectEntity pe where pe.email=:EI")
@NamedQuery(name = "updateLoginCount", query = "update ProjectEntity pu set pu.loginCount=:count where pu.userId=:userID")
@NamedQuery(name = "updatePassword", query = "update ProjectEntity pup set pup.password=:up , pup.resetPassword=:urp ,pup.passwordChangedTime=:pct where pup.userId=:uu")
public class ProjectEntity {
	@Id

	private int id;
	private String name;
	private String email;
	private long mobile;
	private String password;
	private int loginCount;
	private Boolean resetPassword;
	private LocalTime passwordChangedTime;
	private String picName;

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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public int getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	public Boolean getResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(Boolean resetPassword) {
		this.resetPassword = resetPassword;
	}

	public LocalTime getPasswordChangedTime() {
		return passwordChangedTime;
	}

	public void setPasswordChangedTime(LocalTime passwordChangedTime) {
		this.passwordChangedTime = passwordChangedTime;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	

	public ProjectEntity(int id, String name, String email, long mobile, String password, int loginCount,
			Boolean resetPassword, LocalTime passwordChangedTime, String picName) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.loginCount = loginCount;
		this.resetPassword = resetPassword;
		this.passwordChangedTime = passwordChangedTime;
		this.picName = picName;
	}

	public ProjectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProjectEntity [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", loginCount=" + loginCount + ", resetPassword=" + resetPassword
				+ ", passwordChangedTime=" + passwordChangedTime + ", picName=" + picName + "]";
	}


}

package com.xworkz.somu_project.dto;

import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ProjectDto {
	
	private int id;
	@NotBlank
	@Size(max = 25, min = 3, message = "Name should be greater than 3 charcters and less than 25 charcter")
	private String name;
	@NotBlank
	@Size(max = 40, min = 3, message = "Main should be greater than 3 charcters and less than 40 charcter")
	private String email;
	private Long mobile;
	private String password;
	private String confirmPassword;
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
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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
	

	
	public ProjectDto(int id,
			@NotBlank @Size(max = 25, min = 3, message = "Name should be greater than 3 charcters and less than 25 charcter") String name,
			@NotBlank @Size(max = 40, min = 3, message = "Main should be greater than 3 charcters and less than 40 charcter") String email,
			Long mobile, String password, String confirmPassword, int loginCount, Boolean resetPassword,
			LocalTime passwordChangedTime, String picName) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.loginCount = loginCount;
		this.resetPassword = resetPassword;
		this.passwordChangedTime = passwordChangedTime;
		this.picName = picName;
	}
	
	@Override
	public String toString() {
		return "ProjectDto [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", confirmPassword=" + confirmPassword + ", loginCount=" + loginCount + ", resetPassword="
				+ resetPassword + ", passwordChangedTime=" + passwordChangedTime + ", picName=" + picName + "]";
	}
	public ProjectDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	}
	
	
	
	
	

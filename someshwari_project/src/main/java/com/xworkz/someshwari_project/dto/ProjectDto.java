package com.xworkz.someshwari_project.dto;

import java.time.LocalTime;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.xworkz.someshwari_project.entity.TechnologyEntity;

import lombok.Data;

@Data
public class ProjectDto {
	@NotNull
	private int id;
	@NotBlank
	@Size(min = 4, max = 30, message = "UserId should be greater then 4 and less then 30")
	private String userId;
	@NotBlank
	@Size(min = 4, max = 40, message = "email should be greater then 4 and less then 40")
	private String email;
	@NotNull
	private Long mobile;
	@NotBlank
	@Size(min = 4, max = 12, message = "password should be greater then 4 and less then 12")
	private String password;
	@NotNull
	@NotBlank
	private String confirmPassword;
	@NotNull
	private Boolean agreement;
	private int loginCount;
	private Boolean resetPassword;
	private LocalTime passwordChangedTime;
	private String picName;
	private List <TechnologyEntity>technology;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public Boolean getAgreement() {
		return agreement;
	}
	public void setAgreement(Boolean agreement) {
		this.agreement = agreement;
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
	public List<TechnologyEntity> getTechnology() {
		return technology;
	}
	public void setTechnology(List<TechnologyEntity> technology) {
		this.technology = technology;
	}
	public ProjectDto(@NotNull int id,
			@NotBlank @Size(min = 4, max = 30, message = "UserId should be greater then 4 and less then 30") String userId,
			@NotBlank @Size(min = 4, max = 40, message = "email should be greater then 4 and less then 40") String email,
			@NotNull Long mobile,
			@NotBlank @Size(min = 4, max = 12, message = "password should be greater then 4 and less then 12") String password,
			@NotNull @NotBlank String confirmPassword, @NotNull Boolean agreement, int loginCount,
			Boolean resetPassword, LocalTime passwordChangedTime, String picName, List<TechnologyEntity> technology) {
		super();
		this.id = id;
		this.userId = userId;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.agreement = agreement;
		this.loginCount = loginCount;
		this.resetPassword = resetPassword;
		this.passwordChangedTime = passwordChangedTime;
		this.picName = picName;
		this.technology = technology;
	}
	public ProjectDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProjectDto [id=" + id + ", userId=" + userId + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", confirmPassword=" + confirmPassword + ", agreement=" + agreement + ", loginCount="
				+ loginCount + ", resetPassword=" + resetPassword + ", passwordChangedTime=" + passwordChangedTime
				+ ", picName=" + picName + ", technology=" + technology + "]";
	}
	
	
	
}


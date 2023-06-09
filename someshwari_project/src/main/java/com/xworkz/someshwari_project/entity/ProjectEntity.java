package com.xworkz.someshwari_project.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_details")
@NamedQuery(name = "find", query = "select ent from UserEntity ent")
@NamedQuery(name = "userId", query = "select count(*) from  UserEntity ent where ent.userId=:userBy")
@NamedQuery(name = "emailId", query = "select count(*) from  UserEntity ent where ent.email=:emailBy")
@NamedQuery(name = "mobileId", query = "select count(*) from  UserEntity ent where ent.mobile=:mobileBy")
@NamedQuery(name = "user", query = "select ent from UserEntity ent where ent.userId=:ui")
@NamedQuery(name = "users", query = "select ent from UserEntity ent where ent.userId=:uis")
@NamedQuery(name = "emailid", query = "select ent from UserEntity ent where ent.email=:ei")
//"update Employee emp set emp.surname=:surname where emp.name=:name\"")
@NamedQuery(name = "updateLoginCount", query = "update UserEntity ent set ent.loginCount=:count where ent.userId=:user")
@NamedQuery(name = "updatePassword", query = "update UserEntity ent set ent.password=:up , ent.resetPassword=:urp ,ent.passwordChangedTime=:pct where ent.userId=:uu")
public class ProjectEntity extends AbstractAudit implements Serializable {
	@Id
	
	private int id;
	
	private String userId;
	
	private String email;
	
	private long mobile;
	
	private String password;
	
	private Boolean agreement;

	
	private int loginCount;

	private Boolean resetPassword;

	
	private LocalTime passwordChangedTime;

	private String picName;

	@OneToMany(mappedBy = "userEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<TechnologyEntity> technology;

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

	public ProjectEntity(int id, String userId, String email, long mobile, String password, Boolean agreement,
			int loginCount, Boolean resetPassword, LocalTime passwordChangedTime, String picName,
			List<TechnologyEntity> technology) {
		super();
		this.id = id;
		this.userId = userId;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.agreement = agreement;
		this.loginCount = loginCount;
		this.resetPassword = resetPassword;
		this.passwordChangedTime = passwordChangedTime;
		this.picName = picName;
		this.technology = technology;
	}

	public ProjectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProjectEntity [id=" + id + ", userId=" + userId + ", email=" + email + ", mobile=" + mobile
				+ ", password=" + password + ", agreement=" + agreement + ", loginCount=" + loginCount
				+ ", resetPassword=" + resetPassword + ", passwordChangedTime=" + passwordChangedTime + ", picName="
				+ picName + ", technology=" + technology + "]";
	}
	
	
}

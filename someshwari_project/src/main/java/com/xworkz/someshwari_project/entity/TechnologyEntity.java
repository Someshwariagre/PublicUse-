package com.xworkz.someshwari_project.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "technologies")
@NamedQuery(name = "searchTechnology", query = "select ent from Technology ent where ent.teName=:techName or ent.teLangauge=:techLangauge or ent.teVersion=:techVersion or ent.teOwner=:techOwner or ent.teSupportFrom=:techSupportFrom or ent.teSupportTo=:techSupportTo or ent.teLicense=:techLicense or ent.teOpenSource=:techOpenSource or ent.teOsType=:techOsType and ent.userEntity.id=:tid")
public class TechnologyEntity extends AbstractAudit {
	@Id
	
	private int tId;

	
	private String teName;

	
	private String teLangauge;

	
	private String teVersion;

	
	private String teOwner;

	
	private String teSupportFrom;

	
	private String teSupportTo;

	
	private String teLicense;

	
	private String teOpenSource;

	
	private String teOsType;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private ProjectEntity entity;

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getTeName() {
		return teName;
	}

	public void setTeName(String teName) {
		this.teName = teName;
	}

	public String getTeLangauge() {
		return teLangauge;
	}

	public void setTeLangauge(String teLangauge) {
		this.teLangauge = teLangauge;
	}

	public String getTeVersion() {
		return teVersion;
	}

	public void setTeVersion(String teVersion) {
		this.teVersion = teVersion;
	}

	public String getTeOwner() {
		return teOwner;
	}

	public void setTeOwner(String teOwner) {
		this.teOwner = teOwner;
	}

	public String getTeSupportFrom() {
		return teSupportFrom;
	}

	public void setTeSupportFrom(String teSupportFrom) {
		this.teSupportFrom = teSupportFrom;
	}

	public String getTeSupportTo() {
		return teSupportTo;
	}

	public void setTeSupportTo(String teSupportTo) {
		this.teSupportTo = teSupportTo;
	}

	public String getTeLicense() {
		return teLicense;
	}

	public void setTeLicense(String teLicense) {
		this.teLicense = teLicense;
	}

	public String getTeOpenSource() {
		return teOpenSource;
	}

	public void setTeOpenSource(String teOpenSource) {
		this.teOpenSource = teOpenSource;
	}

	public String getTeOsType() {
		return teOsType;
	}

	public void setTeOsType(String teOsType) {
		this.teOsType = teOsType;
	}

	public ProjectEntity getEntity() {
		return entity;
	}

	public void setEntity(ProjectEntity entity) {
		this.entity = entity;
	}

	public TechnologyEntity(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			int tId, String teName, String teLangauge, String teVersion, String teOwner, String teSupportFrom,
			String teSupportTo, String teLicense, String teOpenSource, String teOsType, ProjectEntity entity) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.tId = tId;
		this.teName = teName;
		this.teLangauge = teLangauge;
		this.teVersion = teVersion;
		this.teOwner = teOwner;
		this.teSupportFrom = teSupportFrom;
		this.teSupportTo = teSupportTo;
		this.teLicense = teLicense;
		this.teOpenSource = teOpenSource;
		this.teOsType = teOsType;
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "TechnologyEntity [tId=" + tId + ", teName=" + teName + ", teLangauge=" + teLangauge + ", teVersion="
				+ teVersion + ", teOwner=" + teOwner + ", teSupportFrom=" + teSupportFrom + ", teSupportTo="
				+ teSupportTo + ", teLicense=" + teLicense + ", teOpenSource=" + teOpenSource + ", teOsType=" + teOsType
				+ ", entity=" + entity + "]";
	}

	public TechnologyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnologyEntity(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		// TODO Auto-generated constructor stub
	}


}

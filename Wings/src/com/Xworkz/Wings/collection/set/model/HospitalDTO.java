package com.Xworkz.Wings.collection.set.model;

import java.util.HashSet;

public class HospitalDTO {
private String name;
HashSet<DoctorDTO> doctors;

public HospitalDTO(){
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public HashSet<DoctorDTO> getDoctors() {
	return doctors;
}

public void setDoctors(HashSet<DoctorDTO> doctors) {
	this.doctors = doctors;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((doctors == null) ? 0 : doctors.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	HospitalDTO other = (HospitalDTO) obj;
	if (doctors == null) {
		if (other.doctors != null)
			return false;
	} else if (!doctors.equals(other.doctors))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public String toString() {
	return "HospitalDTO [name=" + name + ", doctors=" + doctors + "]";
}


}



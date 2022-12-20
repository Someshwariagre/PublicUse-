package com.Xworkz.Wings.collection.set.model;

public class DoctorDTO {
   private String name;
  private String specailization;
   
   public DoctorDTO(){
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSpecailization() {
	return specailization;
}

public void setSpecailization(String specailization) {
	this.specailization = specailization;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((specailization == null) ? 0 : specailization.hashCode());
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
	DoctorDTO other = (DoctorDTO) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (specailization == null) {
		if (other.specailization != null)
			return false;
	} else if (!specailization.equals(other.specailization))
		return false;
	return true;
}

@Override
public String toString() {
	return "DoctorDTO [name=" + name + ", specailization=" + specailization + "]";
}
   
}

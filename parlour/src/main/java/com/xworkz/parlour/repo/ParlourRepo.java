package com.xworkz.parlour.repo;

import java.util.List;

import com.xworkz.parlour.entity.ParlourEntity;
public interface ParlourRepo {
	
	public boolean onSave(ParlourEntity entity);
	
	public default ParlourEntity findById(int id) {
		return null;
	}
	
    default List<ParlourEntity> findByName(String name){
		return null;
	}
    

	default List<ParlourEntity> findAll() {
		return null;
	}
     
    public boolean onUpdate(ParlourEntity entity);
    
    public boolean onDelete(int id);

}

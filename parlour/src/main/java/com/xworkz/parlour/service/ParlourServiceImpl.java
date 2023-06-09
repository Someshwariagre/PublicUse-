package com.xworkz.parlour.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.parlour.dto.ParlourDto;
import com.xworkz.parlour.entity.ParlourEntity;
import com.xworkz.parlour.repo.ParlourRepo;

@Service
public class ParlourServiceImpl implements ParlourService {
	public ParlourServiceImpl() {
		System.out.println("Parlour Service Impl");
	}

	@Autowired
	private ParlourRepo repo;

	@Override
	public boolean onSave(ParlourDto dto) {
		ParlourEntity pe = new ParlourEntity();
		BeanUtils.copyProperties(dto, pe);
		this.repo.onSave(pe);
		return true;
	}

	@Override
	public ParlourDto findById(int id) {
		ParlourEntity entity = this.repo.findById(id);
		System.out.println("Entity in service  " + entity);

		ParlourDto dto = new ParlourDto();
		if (entity != null) {
			BeanUtils.copyProperties(entity, dto);
		}
		System.out.println("Entity in service  " + dto);

		return dto;
	}

	@Override
	public List<ParlourDto> findByName(String name) {
		List<ParlourEntity> lentity = this.repo.findByName(name);
		List<ParlourDto> ldto = new ArrayList<ParlourDto>();
		for (ParlourEntity parlourEntity : lentity) {
			ParlourDto pdto = new ParlourDto();
			BeanUtils.copyProperties(parlourEntity, pdto);
			ldto.add(pdto);
			System.out.println(pdto);

		}
		return ldto;
	}
	
	@Override
	public List<ParlourDto> findAll() {
		List<ParlourEntity> lentity = this.repo.findAll();
		List<ParlourDto> ldto = new ArrayList<ParlourDto>();
		for (ParlourEntity parlourEntity : lentity) {
			ParlourDto pdto = new ParlourDto();
			BeanUtils.copyProperties(parlourEntity, pdto);
			ldto.add(pdto);
			System.out.println(pdto);

		}
		return ldto;
	}

	@Override
	public boolean onUpdate(ParlourDto udto) {
		ParlourEntity pe = new ParlourEntity();
		BeanUtils.copyProperties(udto, pe);
		boolean update = this.repo.onUpdate(pe);
		System.out.println("updated succssfully" + update);
		return true;
	}

	@Override
	public boolean onDelete(int id) {
		boolean del = this.repo.onDelete(id);
		System.out.println("deleted succfully" + del);
		return true;
	}

}

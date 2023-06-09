package com.xworkz.doctorsinfo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.doctorsinfo.dto.DoctorsDto;
import com.xworkz.doctorsinfo.entity.DoctorsEntity;
import com.xworkz.doctorsinfo.repository.DoctorsRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DoctorsServiceImpl implements DoctorsService{
	
	@Autowired
	private DoctorsRepo repositery;

	public DoctorsServiceImpl() {
		System.out.println("Running in highwayService");
	}

	@Override
	public Set<ConstraintViolation<DoctorsDto>> validateAndSave(DoctorsDto dto) {
		Set<ConstraintViolation<DoctorsDto>> vailation = validate(dto);
		if (vailation != null && !vailation.isEmpty()) {
			System.out.println("there is vailation in dto");
			return vailation;

		} else {
			System.out.println("constraintViolations does not exist,data is good");
			System.out.println("Dto--"+dto);
			DoctorsEntity entity = new DoctorsEntity();
			BeanUtils.copyProperties(dto, entity);
			boolean saved = this.repositery.save(entity);
			System.out.println("entity--" + entity);
			return Collections.emptySet();
		}

	}

	private Set<ConstraintViolation<DoctorsDto>> validate(DoctorsDto dto) {
		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validationFactory.getValidator();
		Set<ConstraintViolation<DoctorsDto>> vailation = validator.validate(dto);
		return vailation;
	}

	@Override
	public DoctorsDto findById(int id) {
		System.out.println("running in findById in service");
		if (id > 0) {
			DoctorsEntity entity = this.repositery.findById(id);
			if (entity != null) {
				DoctorsDto dto = new DoctorsDto();
				BeanUtils.copyProperties(entity, dto);
				return dto;
			}
		}
		return DoctorsService.super.findById(id);
	}

	@Override
	public List<DoctorsDto> findByName(String name) {
		if (name != null && !name.isEmpty()) {
			List<DoctorsEntity> hentity = this.repositery.findByName(name);
			List<DoctorsDto> lists = new ArrayList<DoctorsDto>();
			for (DoctorsEntity entity : hentity) {
				DoctorsDto dto = new DoctorsDto();
				BeanUtils.copyProperties(entity, dto);
				lists.add(dto);

			}
			return lists;
		} else {
			System.err.println("data not fond in table");
		}
		return DoctorsService.super.findByName(name);
	}

	@Override
	public Set<ConstraintViolation<DoctorsDto>> updateAndSave(DoctorsDto dto) {
		Set<ConstraintViolation<DoctorsDto>> vailations = validate(dto);
		if (vailations != null && !vailations.isEmpty()) {
			System.out.println("there is vailation in dto");
			return vailations;

		} else {
			System.out.println("constraintViolations does not exist,data is good and started to update");
			DoctorsEntity entity = new DoctorsEntity();
			BeanUtils.copyProperties(dto, entity);
			boolean saved = this.repositery.update(entity);
			System.out.println("" + saved);
			System.out.println("" + entity);
			return Collections.emptySet();
		}
	}

	@Override
	public boolean deletById(int id) {
		System.out.println("running in deletById in service");
		if (id > 0) {
			this.repositery.deletById(id);
		}
		return true;

	}

	@Override
	public List<DoctorsDto> findAll() {
		List<DoctorsEntity> hentity = this.repositery.findAll();
		List<DoctorsDto> lists = new ArrayList<DoctorsDto>();
		for (DoctorsEntity entity : hentity) {
			DoctorsDto dto = new DoctorsDto();
			BeanUtils.copyProperties(entity, dto);
			lists.add(dto);			
		}
		
		return lists;
	}

}

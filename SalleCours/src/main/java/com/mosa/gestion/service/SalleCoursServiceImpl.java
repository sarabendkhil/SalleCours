package com.mosa.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mosa.gestion.entities.SalleCours;
import com.mosa.gestion.repos.SalleCoursRepository;

@Service
public class SalleCoursServiceImpl implements SalleCoursService {
	
	@Autowired
	SalleCoursRepository salleCoursRepository;

	@Override
	public SalleCours saveSalleCours(SalleCours p) {
		return salleCoursRepository.save(p);
	}

	@Override
	public SalleCours updateSalleCours(SalleCours p) {
		return salleCoursRepository.save(p);
	}

	@Override
	public void deleteSalleCours(SalleCours p) {
		salleCoursRepository.delete(p);		
	}

	@Override
	public void deleteSalleCoursById(Long id) {
		salleCoursRepository.deleteById(id);		
	}

	@Override
	public SalleCours getSalleCours(Long id) {
		return salleCoursRepository.findById(id).get();
	}

	@Override
	public List<SalleCours> getAllSalleCourss() {
		return salleCoursRepository.findAll();
	}

	@Override
	public Page<SalleCours> getAllSalleCourssParPage(int page, int size) {
		return salleCoursRepository.findAll(PageRequest.of(page, size));
	}

}

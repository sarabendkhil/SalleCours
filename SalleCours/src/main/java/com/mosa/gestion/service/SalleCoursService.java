package com.mosa.gestion.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mosa.gestion.entities.SalleCours;

public interface SalleCoursService {
	SalleCours saveSalleCours(SalleCours p);
	SalleCours updateSalleCours(SalleCours p);
	void deleteSalleCours(SalleCours p);
	void deleteSalleCoursById(Long id);
	SalleCours getSalleCours(Long id);
	List<SalleCours> getAllSalleCourss();
	Page<SalleCours> getAllSalleCourssParPage(int page, int size);


}

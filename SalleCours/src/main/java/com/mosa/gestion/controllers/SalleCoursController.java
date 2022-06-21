package com.mosa.gestion.controllers;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mosa.gestion.entities.SalleCours;
import com.mosa.gestion.service.SalleCoursService;

@Controller
public class SalleCoursController {
	@Autowired
	SalleCoursService salleCoursService;
	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap)
	{
	modelMap.addAttribute("salleCours", new SalleCours());
	modelMap.addAttribute("mode", "new");
	return "formSalleCours";
	}
	@RequestMapping("/saveSalleCours")
	public String saveSalleCours(@Valid SalleCours salleCours,

	BindingResult bindingResult)

	{
	if (bindingResult.hasErrors()) return "createSalleCours";
	salleCoursService.saveSalleCours(salleCours);
	return "formSalleCours";
	}
	@RequestMapping("/ListeSalleCours")
	public String listeProduits(ModelMap modelMap,

	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)

	{
	Page<SalleCours> satps = salleCoursService.getAllSalleCourssParPage(page, size);
	modelMap.addAttribute("salleCours", satps);

	modelMap.addAttribute("pages", new int[satps.getTotalPages()]);

	modelMap.addAttribute("currentPage", page);
	return "listeSalleCours";
	}
	
	@RequestMapping("/supprimerSalleCours")
	public String supprimerSalleCours(@RequestParam("id") Long id,

	ModelMap modelMap,
	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)

	{
	salleCoursService.deleteSalleCoursById(id);
	Page<SalleCours> satps = salleCoursService.getAllSalleCourssParPage(page,

	size);

	modelMap.addAttribute("salleCours", satps);
	modelMap.addAttribute("pages", new int[satps.getTotalPages()]);
	modelMap.addAttribute("currentPage", page);
	modelMap.addAttribute("size", size);
	return "listeSalleCours";
	}
	@RequestMapping("/modifierSalleCours")
	public String editerSalleCours(@RequestParam("id") Long id,ModelMap modelMap)
	{
		SalleCours p= salleCoursService.getSalleCours(id);
	modelMap.addAttribute("salleCours", p);
	modelMap.addAttribute("mode", "edit");
	return "editerSalleCours";
	}
	@RequestMapping("/updateSalleCours")
	public String updateSalleCours(@ModelAttribute("salleCours") SalleCours salleCours,
			ModelMap modelMap) throws ParseException

			{
			
			salleCoursService.updateSalleCours(salleCours);
			List<SalleCours> satps = salleCoursService.getAllSalleCourss();
			modelMap.addAttribute("salleCourss", satps);
			return "ListeSalleCours";

			}

}

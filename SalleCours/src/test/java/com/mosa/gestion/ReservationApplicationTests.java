package com.mosa.gestion;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mosa.gestion.entities.SalleCours;
import com.mosa.gestion.repos.SalleCoursRepository;

@SpringBootTest
class ReservationApplicationTests {
	@Autowired
	private SalleCoursRepository salleCoursRepository;

	@Test
	public void testCreateSalleCours() {
		SalleCours satp = new SalleCours("IEEE","developpement");
		salleCoursRepository.save(satp);
		}
	
	@Test
	public void testFindSalleCours()
	{
		SalleCours p = salleCoursRepository.findById(1L).get();

	System.out.println(p);
	}
	@Test
	public void testUpdateSalleCours()
	{
		SalleCours p = salleCoursRepository.findById(1L).get();
	salleCoursRepository.save(p);
	}
	@Test
	public void testDeleteSalleCours()
	{
	salleCoursRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousSalleCourss()
	{
	List<SalleCours> satps = salleCoursRepository.findAll();
	for (SalleCours p : satps)
	{
	System.out.println(p);
	}

	}

}

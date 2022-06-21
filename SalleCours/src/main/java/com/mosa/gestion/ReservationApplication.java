package com.mosa.gestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mosa.gestion.entities.SalleCours;
import com.mosa.gestion.service.SalleCoursService;

@SpringBootApplication
public class ReservationApplication {
	@Autowired
	SalleCoursService salleCoursService;

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	salleCoursService.saveSalleCours(new SalleCours("ANCU", "111"));
	salleCoursService.saveSalleCours(new SalleCours("GOOGLE dev", "123"));

	}

}

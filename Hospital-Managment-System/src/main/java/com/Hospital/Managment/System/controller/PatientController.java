package com.Hospital.Managment.System.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Managment.System.entity.Patient;
import com.Hospital.Managment.System.repository.PatientRepository;




@RestController
@RequestMapping("/api/v1")
public class PatientController {

	private PatientRepository patientRepository;

	public PatientController(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	
	@PostMapping("/insert")
	public Patient createpatient (@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}
	
	
	
}

package com.example.demo;

import com.example.demo.model.Demography;
import com.example.demo.repository.CustomDemographyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("Demography")

public class DemoApplication {

	@Autowired
	private CustomDemographyRepository respository;

	//Method for creating a demographic event
	//You can create a single event or several events.
	@PostMapping("/create")
	public List<Demography> create(@RequestBody List<Demography> demographies) {
		respository.saveAll(demographies);
		
		return demographies;
	}

	@GetMapping("findByPersonName/{personName}")
	private List<Demography> create(@PathVariable String personName) {
		return respository.findByPersonName(personName);
	}




	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



}

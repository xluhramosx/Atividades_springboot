package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
		
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
		
	}
	@GetMapping
	public String generationBSMs() {
		return "Persistência, Mentalidade de Crescimento, Responsabilidade Pessoal,"
				+ " Orientação ao Futuro, Proatividade, Comunicação, Trabalho em Equipe, "
				+ "Orientação ao Detalhe.";
	}
	@GetMapping
	public String objetivos() {
		return "Trabalhar minha orientação ao detalhe e meu trabalho em equipe!";
		
	}

}

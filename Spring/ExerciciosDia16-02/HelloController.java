package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String getHello() {
		return "Hello world!";
	}
	
	@GetMapping("/bsm")
	public String getHello2 () {
		return "A mentalidade que utilizei pra realizar essa atividade foi a persistência, e a habilidade foi a de atenção aos detalhes";
	}
	
	@GetMapping("/pergunta2")
	public String getHello3 () {
		return "Meus objetivos de aprendizagem nessa semana é melhorar a persistência e a atenção aos detalhes";
	}

	
}

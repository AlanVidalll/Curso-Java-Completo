package com.spring.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	// /calculadora/somar/10/20

	@GetMapping("/somar/{a}/{b}")
	public int somar1(@PathVariable int a,@PathVariable int b) {

		return a + b;
	}
	
	// /calculadora/subtrair?valor1=100&valor2=39
	 @GetMapping("/subtrair")
	public int subtrair(
			@RequestParam(name = "valor1")int a,
			@RequestParam(name = "valor2")int b) {
		return a - b;
		
	}
}
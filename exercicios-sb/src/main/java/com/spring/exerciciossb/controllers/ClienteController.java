package com.spring.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {

		return new Cliente(28, "Pedro", "345.254.147-00");
	}

	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {

		return new Cliente(id, "Maria", "125.584.877-58");

	}

	@GetMapping
	public Cliente obterClientePorId2(
			@RequestParam(name = "id",defaultValue = "1") int id) {

		return new Cliente(id, "Joana", "124.458.784-98");

	}

}

package com.spring.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.exerciciossb.model.entities.Produto;
import com.spring.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@PutMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;

	}

	@PatchMapping
	public @ResponseBody Produto alterarProduto(int id, @Valid Produto produto) {

		produtoRepository.save(produto);
		return produto;
	}

	@DeleteMapping
	public @ResponseBody Produto deletarProduto(int id, Produto produto) {
		produtoRepository.delete(produto);
		return produto;
	}

}

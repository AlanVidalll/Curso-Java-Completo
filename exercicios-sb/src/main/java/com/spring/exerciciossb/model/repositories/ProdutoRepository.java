package com.spring.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;
import com.spring.exerciciossb.model.entities.Produto;

public interface ProdutoRepository 
	extends CrudRepository<Produto, Integer> {
	
	
	

}

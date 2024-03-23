package com.github.acnweb.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.acnweb.thymeleaf.model.Pessoa;
import com.github.acnweb.thymeleaf.model.SexoTipo;

public class PessoaRepositoryMockup {

	// 1 Pelé M
	// 2 Rainha Elizabeth F

	public List<Pessoa> list() {
		List<Pessoa> result = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa(1L, "Pelé", SexoTipo.M );		
		result.add(pessoa);
		
		pessoa = new Pessoa(2L, "Rainha Elizabeth", SexoTipo.F );
		result.add(pessoa);
		
		result.add(new Pessoa(3L, "Madona", SexoTipo.F ));

		return result;
	}

}

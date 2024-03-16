package com.github.gubisss.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.gubisss.thymeleaf.model.Pessoa;

public class PessoaRepositoryMockup {

	public List<Pessoa> list(){
		
		List<Pessoa> result = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa(1L, "Pele", "M");
		result.add(pessoa);
		
		pessoa = new Pessoa(2L, "Rainha Elizabeth", "F");
		result.add(pessoa);
		
		result.add(new Pessoa(3L, "Madonna", "F"));
		
		return result;
	}
	
}

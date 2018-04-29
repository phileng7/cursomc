package com.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Categoria;
import com.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository catRepo;

	public Categoria buscarPorId(Integer id) {
		Optional<Categoria> obj = catRepo.findById(id);
		return obj.orElse(null);
		//return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id , Categoria.class.getName()));
	}
}

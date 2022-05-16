package com.example.demo.Services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import com.example.demo.Repository.CategoriaRepository;
import com.example.demo.model.Qacatego;

@Service
public class ServicesCatego
{
	@Autowired
	private CategoriaRepository repositorio;
	
	public Qacatego Add(Qacatego c)
	{
		return repositorio.save(c);
	}
	
	public List<Qacatego> getAllCategorias()
	{
		return repositorio.findAll();
	}
	
	public Qacatego Delete(Qacatego c)
	{
		return repositorio.save(c);
	}
	
	public Optional<Qacatego> findById(Long id)
	{
		return repositorio.findById(id);
	}
	
	public Qacatego actualizar(Qacatego c)
	{
		return repositorio.save(c);
	}

	
}

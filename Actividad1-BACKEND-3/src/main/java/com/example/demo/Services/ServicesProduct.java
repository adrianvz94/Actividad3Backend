package com.example.demo.Services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import com.example.demo.Repository.ProductoRepository;
import com.example.demo.model.Qaproduct;

@Service
public class ServicesProduct 
{
	@Autowired
	private ProductoRepository Produrepositorio;
	
	public Qaproduct Add (Qaproduct categoria)
	{return Produrepositorio.save(categoria); }
	
	public Qaproduct Update (Qaproduct categoria)
	{return Produrepositorio.save(categoria); }
	
	public Qaproduct Delete (Qaproduct categoria)
	{return Produrepositorio.save(categoria); }
	
	public List<Qaproduct> getAllCategorias()
	{
		return Produrepositorio.findAll();
	}
	
	public Optional<Qaproduct> findById(Long id)
	{
		return Produrepositorio.findById(id);
	}

}

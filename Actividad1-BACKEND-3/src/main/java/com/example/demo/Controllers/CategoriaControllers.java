package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Qacatego;
import com.example.demo.Repository.CategoriaRepository;
import com.example.demo.Services.ServicesCatego;

@RestController
@RequestMapping("/categoria")
public class CategoriaControllers 
{
	@Autowired
	private ServicesCatego cateservicio;
	
	@GetMapping
	public List<Qacatego> MostrarCategorias()
	{
		return cateservicio.getAllCategorias();
	}
	
	@PostMapping("/Agregar")
	public Qacatego Add (@RequestBody Qacatego categoria)
	{
		return this.cateservicio.Add(categoria);
	}
	
	@PutMapping("/Actualizar")
	public Qacatego Update (@RequestBody Qacatego categoria)
	{
		return this.cateservicio.actualizar(categoria);
	}
	
	@DeleteMapping("/Eliminar")
	public Qacatego Delete (@RequestBody Qacatego categoria)
	{
		return this.cateservicio.Delete(categoria);
	}
	
}


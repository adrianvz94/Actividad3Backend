package com.example.demo.Controllers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.junit.*;


import com.example.demo.model.Qacatego;

import io.swagger.annotations.ApiOperation;

import com.example.demo.Repository.CategoriaRepository;
import com.example.demo.Services.ServicesCatego;

@RestController
@RequestMapping("/categoria")
public class CategoriaControllers 
{
	@Autowired
	private ServicesCatego cateservicio;
	
	@Test
	public void ObtenerTest()
	{
		List<Qacatego> catego = cateservicio.getAllCategorias();
		assertThat(catego).size().isGreaterThan(0);
		System.out.println("Muetsra de Test");
	}
	
	@GetMapping
	@ApiOperation (value = "Mostrar informacion", notes= "Motrar Registros de la tabla Categoria")
	public List<Qacatego> MostrarCategorias()
	{
		return cateservicio.getAllCategorias();
	}
	@ApiOperation (value = "Agregar un Registro", notes= "Este metodo es utilizado para agregar un registro.")
	@PostMapping("/Agregar")
	public Qacatego Add (@RequestBody Qacatego categoria)
	{
		return this.cateservicio.Add(categoria);
	}
	@ApiOperation (value = "Actualizar Registros", notes= "Actualizo los registros de la BD.")
	@PutMapping("/Actualizar")
	public Qacatego Update (@RequestBody Qacatego categoria)
	{
		return this.cateservicio.actualizar(categoria);
	}
	@ApiOperation (value = "Elimina Registros", notes= "Eliminar registro de la base de datos.")
	@DeleteMapping("/Eliminar")
	public Qacatego Delete (@RequestBody Qacatego categoria)
	{
		return this.cateservicio.Delete(categoria);
	}
	
}


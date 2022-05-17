package com.example.demo.Controllers;

import java.util.Optional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.junit.*;

import com.example.demo.model.Qacatego;
import com.example.demo.model.Qaproduct;
import com.example.demo.Services.ServicesProduct;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/producto")
public class ProductoControllers 
{

	@Autowired
	private ServicesProduct prodservicio;
	
	@Test
	public void ObtenerTest()
	{
		List<Qaproduct> Product = prodservicio.getAllCategorias();
		assertThat(Product).size().isGreaterThan(0);
		System.out.println("Muetsra de Test");
	}
	

	@GetMapping("/Mostrar")
	public List<Qaproduct> MostrarCategorias()
	{
		return prodservicio.getAllCategorias();
	}
	
	@PostMapping("/Agregar")
	public Qaproduct Add (@RequestBody Qaproduct categoria)
	{
		return this.prodservicio.Add(categoria);
	}
	
	@PutMapping("/Actualizar")
	public Qaproduct Update (@RequestBody Qaproduct categoria)
	{
		return this.prodservicio.Update(categoria);
	}
	
	@DeleteMapping("/Eliminar")
	public Qaproduct Delete (@RequestBody Qaproduct categoria)
	{
		return this.prodservicio.Delete(categoria);
	}
	
}

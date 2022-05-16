package com.example.demo.DO;

import java.util.List;
import com.example.demo.model.Qaproduct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="actividad", url =" http://localhost:8080/api/productos")
public interface VentaService 
{
	@GetMapping("")
	List<Qaproduct> getall();
	
	@GetMapping("/{idProducto}")
	Qaproduct getProduct(@PathVariable("idProdcuto")int idProducto);
	
	
}

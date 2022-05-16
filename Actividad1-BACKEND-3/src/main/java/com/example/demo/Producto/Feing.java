package com.example.demo.Producto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;

import com.example.demo.model.Qaproduct;
import java.util.*;

@FeignClient(value="feingVentas", url="http://localhost:8080")
public interface Feing {

	@GetMapping("/producto")
	List<Qaproduct> listar();

}

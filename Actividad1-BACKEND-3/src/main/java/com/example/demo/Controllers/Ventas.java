package com.example.demo.Controllers;

import com.example.demo.model.Qaproduct;
import com.example.demo.Producto.Feing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class Ventas 
{
    @Autowired
    private Feing ventaService;

    @GetMapping("")
	public ResponseEntity<List<Qaproduct>> listarProd()
	{
		return new ResponseEntity<>(ventaService.listar(),HttpStatus.OK);
	}
}

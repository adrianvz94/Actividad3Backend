package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Qacatego;

@Repository
public interface CategoriaRepository extends JpaRepository<Qacatego, Long>
{
	
}

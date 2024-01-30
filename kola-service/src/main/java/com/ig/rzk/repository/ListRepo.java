package com.ig.rzk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ig.rzk.model.IG_Kola;
import com.ig.rzk.model.IG_Lista;

public interface ListRepo extends JpaRepository<IG_Lista, Integer>{


    @Query("SELECT l FROM IG_Lista l JOIN l.igListaHasKolas lhk WHERE lhk.igKola.id = :carId")
    public List<IG_Lista> findByCarId(@Param("carId") Integer carId);

   
	
	
	
}

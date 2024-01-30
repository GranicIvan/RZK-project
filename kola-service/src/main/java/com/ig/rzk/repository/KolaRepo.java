package com.ig.rzk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ig.rzk.model.IG_Kola;
import com.ig.rzk.model.IG_Lista;

public interface KolaRepo extends JpaRepository<IG_Kola, Integer>{
	
	//@Query("SELECT k FROM IG_Kola k JOIN k.igListaHasKolas lhk WHERE lhk.igLista.id = :listId")
	@Query("SELECT k FROM IG_Kola k JOIN k.igListaHasKolas lhk WHERE lhk.igLista.id = :listId")
	public List<IG_Kola> findByListaId(@Param("listId") int idLista);

	
	//public List<IG_Kola> findByListaId(@Param("listId") int idLista);

	
	
	
}

package com.ig.rzk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ig.rzk.model.IG_Kola;
import com.ig.rzk.model.IG_Lista;

public interface ListRepo extends JpaRepository<IG_Lista, Integer>{

	
	//public List<IG_Lista> findByigListaHasKolas(IG_Kola kola);
	
	//select c from covek, where c.id=vlasnik.covekId and vlasnik.opremaid and oprema.naziv="nike"
	//@Query("select l from Lista, where l.idLista=")
	
	String hql = "SELECT l FROM Lista l "
	           + "INNER JOIN l.listaHasKolas lhk "
	           + "WHERE lhk.kola.idKola = :kolaId";

	//@Query(hql)
	//public List<IG_Lista> igListaHasKolas(@Param("kolaId")int kola);
	//public List<IG_Lista> igListaHasKolas(IG_Kola kola);
	//public List<IG_Lista> igKolaHasigListaHasKolas(IG_Kola kola);
	
	
	
	//3
	//@Query("SELECT l FROM IG_Lista l JOIN l.listaHasKolas lhk WHERE lhk.kola.id = :carId")
    //public List<IG_Lista> findByCarId(@Param("carId") Integer carId);
    
    //4
    @Query("SELECT l FROM IG_Lista l JOIN l.igListaHasKolas lhk WHERE lhk.igKola.id = :carId")
    public List<IG_Lista> findByCarId(@Param("carId") Integer carId);

	
	
	
}

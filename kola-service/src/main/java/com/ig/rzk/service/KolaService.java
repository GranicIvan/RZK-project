package com.ig.rzk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ig.rzk.model.IG_Kola;
import com.ig.rzk.model.IG_Lista;
import com.ig.rzk.model.IG_Lista_has_Kola;
import com.ig.rzk.repository.KolaRepo;
import com.ig.rzk.repository.ListRepo;
import com.ig.rzk.repository.ListaHasKolaRepo;

import jakarta.validation.Valid;

@Service
public class KolaService {

	@Autowired
	KolaRepo kr;
	
	@Autowired
	ListRepo lr;
	
	@Autowired
	ListaHasKolaRepo lhkr;
	
	
	public List<IG_Kola> vratiSvaKola(){
		return  kr.findAll();
	}
	
	
	public List<IG_Lista> listeSaAutom(int idKola){				
		return lr.findByCarId(idKola);
	}


	public List<IG_Lista> vratiSveListe() {
		return lr.findAll();
	}


	public IG_Kola saveKola(@RequestBody @Valid IG_Kola kola) {
		return kr.save(kola);
	}


	public IG_Lista_has_Kola ubaciKolaUListu(@Valid IG_Lista_has_Kola lista) {
		lhkr.save(lista);
		return null;
	}
	
	

	
	
}

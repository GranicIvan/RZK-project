package com.ig.rzk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ig.rzk.model.IG_Kola;
import com.ig.rzk.model.IG_Lista;
import com.ig.rzk.repository.KolaRepo;
import com.ig.rzk.repository.ListRepo;

@Service
public class KolaService {

	@Autowired
	KolaRepo kr;
	
	@Autowired
	ListRepo lr;
	
	
	public List<IG_Kola> vratiSvaKola(){
		return  kr.findAll();
	}
	
	
	public List<IG_Lista> listeSaAutom(int idKola){
		
//		Optional<IG_Kola> kolaO = kr.findById(idKola);
//		
//		if(kolaO.isEmpty()) {
//			System.err.println("Nismo nasli kola");
//			return null;
//		}
//		
//		IG_Kola kola = kolaO.get();
		
		//return lr.igKolaHasigListaHasKolas(kola);
		
		return lr.findByCarId(idKola);
	}
	
	
	
}

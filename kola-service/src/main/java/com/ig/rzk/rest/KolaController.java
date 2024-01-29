package com.ig.rzk.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ig.rzk.model.IG_Kola;
import com.ig.rzk.model.IG_Lista;
import com.ig.rzk.service.KolaService;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
public class KolaController {
	
	
	@Autowired
	KolaService service;
	
	

	@GetMapping("/svaKola")
	public List<IG_Kola> svaKola(){		
		return service.vratiSvaKola();
		
	}
	
	
	@GetMapping("/listaByKola/{idKola}")
	public List<IG_Lista> listaPoKolima(@PathVariable @Min(value=0, message="id kola mora biti nenegativan ceo broj") int idKola){
		System.out.println("----- Pokrenuli smo listaPoKolima ---");
		return service.listeSaAutom(idKola);
	}
	
	
	
}

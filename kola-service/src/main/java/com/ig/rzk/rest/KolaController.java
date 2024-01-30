package com.ig.rzk.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ig.rzk.model.IG_Kola;
import com.ig.rzk.model.IG_Lista;
import com.ig.rzk.model.IG_Lista_has_Kola;
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
	
	@GetMapping("/sveListe")
	public List<IG_Lista> sveListe(){		
		return service.vratiSveListe();
	}
	
	
	@GetMapping("/listaByKola/{idKola}")
	public List<IG_Lista> listaPoKolima(@PathVariable @Min(value=0, message="id kola mora biti nenegativan ceo broj") int idKola){
		//System.out.println("----- Pokrenuli smo listaPoKolima ---");
		return service.listeSaAutom(idKola);
	}
	
	@PostMapping("/kola")
	public ResponseEntity<IG_Kola> saveKola(@RequestBody @Valid IG_Kola kola) {
		IG_Kola k = service.saveKola(kola);
		return new ResponseEntity<IG_Kola>(k, HttpStatus.CREATED);
	}
	
	
	
	@PostMapping("/ubaciKolaUListu")
	public ResponseEntity<IG_Lista_has_Kola> ubaciKolaUListu(@RequestBody @Valid IG_Lista_has_Kola listaHasKola) {
		IG_Lista_has_Kola lhk = service.ubaciKolaUListu(listaHasKola);
		return new ResponseEntity<IG_Lista_has_Kola>(lhk, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/kolaUListi/{idLista}")
	public List<IG_Kola> kolaUListi(@PathVariable @Min(value=0, message="id liste mora biti nenegativan ceo broj") int idLista){
		return service.autiUListi(idLista);
	}
	
}

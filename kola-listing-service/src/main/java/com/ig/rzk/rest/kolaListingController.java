package com.ig.rzk.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ig.rzk.beans.IG_Kola;
import com.ig.rzk.proxy.KolaProxy;

@RestController
public class kolaListingController {

	
	@Autowired
	KolaProxy proxy;
	
	
	@GetMapping("/svaKolaKorisnika/{idKorisnika}")
	public List<IG_Kola> svaKolaKorisnika(@PathVariable int idKorisnika){
		proxy.sveListe();
		//TODO sada nadjemo korisnika i onda uzmemo samo ta kola
		return null;
	}
	
}

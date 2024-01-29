package com.ig.rzk.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ig.rzk.model.IG_Korisnik;
import com.ig.rzk.service.KorisnikService;

@RestController
public class KorisnikController {

	@Autowired
	KorisnikService service;
	
	@GetMapping("/sviKorisnici")
	public List<IG_Korisnik> svoKorisnici(){
		return service.vratiSveKorisnike();
	}
}

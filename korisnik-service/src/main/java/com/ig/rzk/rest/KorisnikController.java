package com.ig.rzk.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ig.rzk.model.IG_Korisnik;
import com.ig.rzk.service.KorisnikService;

import org.springframework.core.env.Environment;

@RestController
public class KorisnikController {

	@Autowired
	KorisnikService service;
	
	@Autowired
	Environment env;
	
	@GetMapping("/sviKorisnici")
	public List<IG_Korisnik> svoKorisnici(){
		return service.vratiSveKorisnike();
	}
	
	@GetMapping("/hello")
	public String hello() {
		return env.getProperty("local.server.port");
	}
}

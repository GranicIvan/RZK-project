package com.ig.rzk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ig.rzk.model.IG_Korisnik;
import com.ig.rzk.repository.KorisnikRepo;

@Service
public class KorisnikService {

	@Autowired
	KorisnikRepo kr;
	
	public List<IG_Korisnik> vratiSveKorisnike(){
		return kr.findAll();
	}
	
}

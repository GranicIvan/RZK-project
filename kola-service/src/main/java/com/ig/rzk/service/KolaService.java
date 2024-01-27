package com.ig.rzk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ig.rzk.model.IG_Kola;
import com.ig.rzk.repository.KolaRepo;

@Service
public class KolaService {

	@Autowired
	KolaRepo kr;
	
	
	public List<IG_Kola> vratiSvaKola(){
		return  kr.findAll();
	}
	
}

package com.ig.rzk.rest;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ig.rzk.model.IG_Kola;

@RestController
public class KolaController {

	@PostMapping("/svaKola")
	public List<IG_Kola> svaKola(){
		return null;
	}
	
}

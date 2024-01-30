package com.ig.rzk.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.ig.rzk.beans.IG_Lista;

@FeignClient(name="kola-service",url="localhost:8888")
public interface KolaProxy {
	@GetMapping("/sveListe")
	public List<IG_Lista> sveListe();
}

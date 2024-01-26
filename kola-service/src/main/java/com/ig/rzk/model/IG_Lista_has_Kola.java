package com.ig.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the IG_Lista_has_Kola database table.
 * 
 */
@Entity
@NamedQuery(name="IG_Lista_has_Kola.findAll", query="SELECT i FROM IG_Lista_has_Kola i")
public class IG_Lista_has_Kola implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IG_Lista_has_KolaPK id;

	//bi-directional many-to-one association to IG_Kola
	@ManyToOne
	@JoinColumn(name="Kola_idKola")
	private IG_Kola igKola;

	//bi-directional many-to-one association to IG_Lista
	@ManyToOne
	@JoinColumn(name="Lista_idLista")
	private IG_Lista igLista;

	public IG_Lista_has_Kola() {
	}

	public IG_Lista_has_KolaPK getId() {
		return this.id;
	}

	public void setId(IG_Lista_has_KolaPK id) {
		this.id = id;
	}

	public IG_Kola getIgKola() {
		return this.igKola;
	}

	public void setIgKola(IG_Kola igKola) {
		this.igKola = igKola;
	}

	public IG_Lista getIgLista() {
		return this.igLista;
	}

	public void setIgLista(IG_Lista igLista) {
		this.igLista = igLista;
	}

}
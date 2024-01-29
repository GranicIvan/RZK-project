package com.ig.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the IG_Lista database table.
 * 
 */
@Entity
@NamedQuery(name="IG_Lista.findAll", query="SELECT i FROM IG_Lista i")
public class IG_Lista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLista;

	@Column(name="ime_liste")
	private String imeListe;

	private int korisnik_idKorisnik1;

	private String opis;

	@JsonIgnore
	//bi-directional many-to-one association to IG_Lista_has_Kola
	@OneToMany(mappedBy="igLista")
	private List<IG_Lista_has_Kola> igListaHasKolas;

	public IG_Lista() {
	}

	public int getIdLista() {
		return this.idLista;
	}

	public void setIdLista(int idLista) {
		this.idLista = idLista;
	}

	public String getImeListe() {
		return this.imeListe;
	}

	public void setImeListe(String imeListe) {
		this.imeListe = imeListe;
	}

	public int getKorisnik_idKorisnik1() {
		return this.korisnik_idKorisnik1;
	}

	public void setKorisnik_idKorisnik1(int korisnik_idKorisnik1) {
		this.korisnik_idKorisnik1 = korisnik_idKorisnik1;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public List<IG_Lista_has_Kola> getIgListaHasKolas() {
		return this.igListaHasKolas;
	}

	public void setIgListaHasKolas(List<IG_Lista_has_Kola> igListaHasKolas) {
		this.igListaHasKolas = igListaHasKolas;
	}

	public IG_Lista_has_Kola addIgListaHasKola(IG_Lista_has_Kola igListaHasKola) {
		getIgListaHasKolas().add(igListaHasKola);
		igListaHasKola.setIgLista(this);

		return igListaHasKola;
	}

	public IG_Lista_has_Kola removeIgListaHasKola(IG_Lista_has_Kola igListaHasKola) {
		getIgListaHasKolas().remove(igListaHasKola);
		igListaHasKola.setIgLista(null);

		return igListaHasKola;
	}

}
package com.ig.rzk.beans;

import java.util.List;


public class IG_Lista {

	private int idLista;

	private String imeListe;

	private int korisnik_idKorisnik1;

	private String opis;
	
	private List<IG_Kola> igListaHasKolas;

	public int getIdLista() {
		return idLista;
	}

	public void setIdLista(int idLista) {
		this.idLista = idLista;
	}

	public String getImeListe() {
		return imeListe;
	}

	public void setImeListe(String imeListe) {
		this.imeListe = imeListe;
	}

	public int getKorisnik_idKorisnik1() {
		return korisnik_idKorisnik1;
	}

	public void setKorisnik_idKorisnik1(int korisnik_idKorisnik1) {
		this.korisnik_idKorisnik1 = korisnik_idKorisnik1;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public IG_Lista(int idLista, String imeListe, int korisnik_idKorisnik1, String opis) {
		super();
		this.idLista = idLista;
		this.imeListe = imeListe;
		this.korisnik_idKorisnik1 = korisnik_idKorisnik1;
		this.opis = opis;
	}
	
	

	public List<IG_Kola> getIgListaHasKolas() {
		return igListaHasKolas;
	}

	public void setIgListaHasKolas(List<IG_Kola> igListaHasKolas) {
		this.igListaHasKolas = igListaHasKolas;
	}

	public IG_Lista() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

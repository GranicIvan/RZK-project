package com.ig.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the IG_Lista_has_Kola database table.
 * 
 */
@Embeddable
public class IG_Lista_has_KolaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int lista_idLista;

	private int lista_Korisnik_idKorisnik;

	@Column(insertable=false, updatable=false)
	private int kola_idKola;

	public IG_Lista_has_KolaPK() {
	}
	public int getLista_idLista() {
		return this.lista_idLista;
	}
	public void setLista_idLista(int lista_idLista) {
		this.lista_idLista = lista_idLista;
	}
	public int getLista_Korisnik_idKorisnik() {
		return this.lista_Korisnik_idKorisnik;
	}
	public void setLista_Korisnik_idKorisnik(int lista_Korisnik_idKorisnik) {
		this.lista_Korisnik_idKorisnik = lista_Korisnik_idKorisnik;
	}
	public int getKola_idKola() {
		return this.kola_idKola;
	}
	public void setKola_idKola(int kola_idKola) {
		this.kola_idKola = kola_idKola;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IG_Lista_has_KolaPK)) {
			return false;
		}
		IG_Lista_has_KolaPK castOther = (IG_Lista_has_KolaPK)other;
		return 
			(this.lista_idLista == castOther.lista_idLista)
			&& (this.lista_Korisnik_idKorisnik == castOther.lista_Korisnik_idKorisnik)
			&& (this.kola_idKola == castOther.kola_idKola);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.lista_idLista;
		hash = hash * prime + this.lista_Korisnik_idKorisnik;
		hash = hash * prime + this.kola_idKola;
		
		return hash;
	}
}
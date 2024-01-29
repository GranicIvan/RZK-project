package com.ig.rzk.model;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the IG_Kola database table.
 * 
 */
@Entity
@NamedQuery(name="IG_Kola.findAll", query="SELECT i FROM IG_Kola i")
public class IG_Kola implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idKola;

	@Max(value = 2026, message="Godina")
	@Column(name="godina_proizvodnje")
	private String godinaProizvodnje;

	private int hp;

	private String kolacol;

	private String marka;

	private String model;

	@Column(name="motor_size")
	private float motorSize;

	//bi-directional many-to-one association to IG_Lista_has_Kola
	@JsonIgnore
	@OneToMany(mappedBy="igKola")
	private List<IG_Lista_has_Kola> igListaHasKolas;

	public IG_Kola() {
	}

	public int getIdKola() {
		return this.idKola;
	}

	public void setIdKola(int idKola) {
		this.idKola = idKola;
	}

	
	public String getGodinaProizvodnje() {
		return this.godinaProizvodnje;
	}

	public void setGodinaProizvodnje(String godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getKolacol() {
		return this.kolacol;
	}

	public void setKolacol(String kolacol) {
		this.kolacol = kolacol;
	}

	public String getMarka() {
		return this.marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getMotorSize() {
		return this.motorSize;
	}

	public void setMotorSize(float motorSize) {
		this.motorSize = motorSize;
	}

	public List<IG_Lista_has_Kola> getIgListaHasKolas() {
		return this.igListaHasKolas;
	}

	public void setIgListaHasKolas(List<IG_Lista_has_Kola> igListaHasKolas) {
		this.igListaHasKolas = igListaHasKolas;
	}

	public IG_Lista_has_Kola addIgListaHasKola(IG_Lista_has_Kola igListaHasKola) {
		getIgListaHasKolas().add(igListaHasKola);
		igListaHasKola.setIgKola(this);

		return igListaHasKola;
	}

	public IG_Lista_has_Kola removeIgListaHasKola(IG_Lista_has_Kola igListaHasKola) {
		getIgListaHasKolas().remove(igListaHasKola);
		igListaHasKola.setIgKola(null);

		return igListaHasKola;
	}

}
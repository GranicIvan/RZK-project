package com.ig.rzk.beans;



public class IG_Kola {


	private String godinaProizvodnje;

	private int hp;

	private String marka;

	private String model;

	private float motorSize;

	public IG_Kola(String godinaProizvodnje, int hp, String marka, String model, float motorSize) {
		super();
		this.godinaProizvodnje = godinaProizvodnje;
		this.hp = hp;
		this.marka = marka;
		this.model = model;
		this.motorSize = motorSize;
	}

	public IG_Kola() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(String godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getMotorSize() {
		return motorSize;
	}

	public void setMotorSize(float motorSize) {
		this.motorSize = motorSize;
	}

	@Override
	public String toString() {
		return "IG_Kola [godinaProizvodnje=" + godinaProizvodnje + ", hp=" + hp + ", marka=" + marka + ", model="
				+ model + ", motorSize=" + motorSize + "]";
	}
	
	
	
	
	
	
	
}

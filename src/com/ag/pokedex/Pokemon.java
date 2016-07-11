package com.ag.pokedex;

public class Pokemon {
	
	public int entryNum;
	public String name;
	public String type;
	public String bio;
	public String pokeType;
	public double weight;
	public double height;
	
	public Pokemon(){
		this.entryNum = 0;
		this.name = "";
		this.type = "";
		this.bio = "";
		this.pokeType = "";
		this.weight = 0.0;
		this.height = 0.0;
	}
	
	public Pokemon(int e, String n, String t, String b, String pT, double w, double h){
		this.entryNum = e;
		this.name = n;
		this.type = t;
		this.bio = b;
		this.pokeType = pT;
		this.weight = w;
		this.height = h;
	}

	public int getEntryNum() {
		return entryNum;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getBio() {
		return bio;
	}

	public String getPokeType() {
		return pokeType;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
	
	
	
	
}

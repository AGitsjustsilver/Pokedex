package com.ag.pokedex;

import java.util.ArrayList;

public class Data extends Pokemon {

	public ArrayList<Pokemon> pok;
	
	public Data(){
		super();
	}
	
	public void addPokemon(Pokemon p){
		pok.add(p);
	}
	
	
}

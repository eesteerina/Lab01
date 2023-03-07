package it.polito.tdp.Lab01.model;

import java.util.List;
import java.util.*;

public class Parole {
	
	private List<String> listaParole;
		
	public Parole() {
		//listaParole = new LinkedList<String>();
		listaParole = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		listaParole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(listaParole);
		return listaParole;
	}
	
	public void reset() {
		listaParole.clear();
	}
	
	public void cancella(String daEliminare) {
		listaParole.remove(daEliminare);
	}

}
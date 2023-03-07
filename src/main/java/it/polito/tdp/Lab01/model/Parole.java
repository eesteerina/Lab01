package it.polito.tdp.Lab01.model;

import java.util.List;
import java.util.*;

public class Parole {
	
	private List<String> listaParole;
	private TreeMap<String, String> mappaParole;
		
	public Parole() {
		 listaParole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		listaParole.add(p);
	}
	
	public List<String> getElenco() {
		mappaParole = new TreeMap<String, String>();
		
		for(String s : listaParole) {
			mappaParole.put(s, s);
		}
		LinkedList<String> ritorno = new LinkedList(mappaParole.values());
		
		return ritorno;
	}
	
	public void reset() {
		listaParole.clear();
	}

}
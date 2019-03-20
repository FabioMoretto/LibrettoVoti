package it.polito.tdp.libretto;

import java.util.*;

public class Libretto {
	
	private List <Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList <Voto>();
	}
	
	/**
	 * Aggiunge un nuov voto nel libretto
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		voti.add(v);
	}
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * @param punti punteggio di ricerca
	 * @returnlista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
	public List<Voto> cercaVoti (int punti ){
		List <Voto> result = new ArrayList <Voto>();
		for(Voto v: this.voti) {
			if(v.getPunti()==punti) {
				result.add(v);
			}
		}
		return result;
	}

}

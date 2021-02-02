package no.hvl.dat103.oppg2.egenKlasse;

import java.util.List;

public class Semafor {
	
	private int value;
	
	
	public Semafor(){}
	
	
	public Semafor(int value) {
		this.value = value;
		
	}
	
	public void vent() {
		while(value <= 0) {
			//waiting
		}
		value--;
	}
	
	public void signal() {
		value++;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	
	

}

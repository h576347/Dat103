package no.hvl.dat103.oppg2.egenKlasse;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	int n;
	Semafor mutex;
	Semafor empty;
	Semafor full;
	private Queue<Integer> buffer;
	
	
	public Buffer() {
		n = 10;
		mutex = new Semafor(1);
		empty = new Semafor(n);
		full = new Semafor(0);
		buffer = new LinkedList<Integer>();
		
	}
	
	public void add(Integer tall) {
		int item = tall;
			empty.vent();
			mutex.vent();
			buffer.add(item);
			mutex.signal();
			full.signal();
			
	
	}
	
	public Integer remove() {
		int tilbake = 0;
	
			full.vent();
			mutex.vent();
			tilbake = buffer.remove();
			mutex.signal();
			empty.signal();
		
		
		
		return tilbake;
	
		
	}
	
	

}

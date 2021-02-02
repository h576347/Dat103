package no.hvl.dat103.oppg2.egenKlasse;

import java.util.Random;

public class Consumer implements Runnable {
	private Buffer buffer;

	
	public Consumer() {}
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	
	}


	@Override
	public void run() {
		while(true) {
			Integer item = null;
			item = buffer.remove();
			System.out.println("Consumer");
		}
		
	}

}

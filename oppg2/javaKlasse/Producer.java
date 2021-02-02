package no.hvl.dat103.oppg2.javaKlasse;

import java.util.Random;

public class Producer implements Runnable{
	
	private Buffer buffer;
	Random rand = new Random();
	
	public Producer() {}
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	
	}



	@Override
	public void run() {
		while(true) {
			int tall = rand.nextInt(100);
			buffer.add(tall);
			
			System.out.println("Producer");
		}
		
	}
	
	
	

}

package no.hvl.dat103.oppg2.egenKlasse;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer buffer = new Buffer();
		Consumer consumer = new Consumer(buffer);
		Producer producer = new Producer(buffer);
		Thread prod = new Thread(producer);
		Thread con = new Thread(consumer);
		
		prod.start();
		con.start();
		
		

	}
	
	
}

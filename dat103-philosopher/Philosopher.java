package no.hvl.dat103;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread{
	
	private String filosof;
	private Semaphore cs1;
	private Semaphore cs2;
	
	public Philosopher(String filosof, Semaphore cs1, Semaphore cs2) {
		this.filosof = filosof;
		this.cs1 = cs1;
		this.cs2 = cs2;
	}

	public String getFilosof() {
		return filosof;
	}

	@Override
	public void run() {
		do {

			try {
				cs1.acquire();
				cs2.acquire();
				
				System.out.println(filosof + " spiser.");
				
				cs1.release();
				cs2.release();
				
				System.out.println(filosof + " tenker.");
				
				
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}	while (true);
	}
}

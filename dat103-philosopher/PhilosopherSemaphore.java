package no.hvl.dat103;

public class PhilosopherSemaphore extends Thread{
	
	private String filosof;
	private ChopstickSemaphore cs1;
	private ChopstickSemaphore cs2;
	
	public PhilosopherSemaphore(String filosof, ChopstickSemaphore cs1, ChopstickSemaphore cs2) {
		this.filosof = filosof;
		this.cs1 = cs1;
		this.cs2 = cs2;
	}

	public String getFilosof() {
		return filosof;
	}

	public void run() {
		do {
				cs1.acquire();
				cs2.acquire();
				
				System.out.println(filosof + " spiser.");
				
				cs1.release();
				cs2.release();
				
				System.out.println(filosof + " tenker.");
			
		}	while (true);
	}

}

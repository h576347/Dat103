package no.hvl.dat103.oppg2.javaKlasse;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Buffer {
	int n;
	Semaphore mutex;
	Semaphore empty;
	Semaphore full;
	private Queue<Integer> buffer;
	
	
	public Buffer() {
		n = 10;
		mutex = new Semaphore(1);
		empty = new Semaphore(n);
		full = new Semaphore(0);
		buffer = new LinkedList<Integer>();
		
	}
	
	public void add(Integer tall) {
		int item = tall;
			try {
				empty.acquire();
				mutex.acquire();
				buffer.add(item);
				mutex.release();
				full.release();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
			
		
	}
	
	public Integer remove() {
		int tilbake = 0;
	
			try {
				full.acquire();
				mutex.acquire();
				tilbake = buffer.remove();
				mutex.release();
				empty.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		return tilbake;
	
		
	}
	
	

}

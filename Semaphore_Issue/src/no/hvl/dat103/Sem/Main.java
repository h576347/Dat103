package no.hvl.dat103.Sem;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Random;
import java.util.concurrent.Semaphore;

import com.sun.jdi.Value;


public class Main {
	final static int BUFFER_SIZE = 5;
	int buffer_item;
	
	Random rand = new Random();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int n = 6;
		Semaphore mutex = new Semaphore(1);
		Semaphore empty = new Semaphore(n);
		Semaphore full = new Semaphore(0);
		Buffer[] bi = new Buffer[BUFFER_SIZE];
	
		
		try {
			do { 
			
			full.wait();
			mutex.wait();;
			
			
			
			mutex.acquire();
			empty.acquire();
		}while(true);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	
	void producer(Semaphore s) {
		IntBuffer item;
		
		while(true) {
			
			item = rand.IntBuffer();
			if(insert_item(item) != 0) {
				System.out.println("report error condition");
			}else {
				System.out.println("producer produced %d\n",item);
			}
		}
		
	}
	int insert_item(IntBuffer item) {
		
		return 1;
		
		
	}
	
	int remove_item(Buffer item) {
		
		return 1;
	}

}

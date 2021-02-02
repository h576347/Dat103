package no.hvl.dat103;

import java.util.concurrent.Semaphore;

public class MainJavaSemaphore {

	public static void main(String[] args) {
		
		Semaphore[] chopstick = {new Semaphore(1), new Semaphore(1), 
				new Semaphore(1), new Semaphore(1), new Semaphore(1)};
		
		Thread p1 = new Philosopher("Philosopher 1", chopstick[0], chopstick[1]);
		Thread p2 = new Philosopher("Philosopher 2", chopstick[1], chopstick[2]);
		Thread p3 = new Philosopher("Philosopher 3", chopstick[2], chopstick[3]);
		Thread p4 = new Philosopher("Philosopher 4", chopstick[3], chopstick[4]);
		Thread p5 = new Philosopher("Philosopher 5", chopstick[4], chopstick[0]);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();

	}

}

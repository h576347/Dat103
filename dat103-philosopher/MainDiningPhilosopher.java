package no.hvl.dat103;

public class MainDiningPhilosopher {

	public static void main(String[] args) {

		ChopstickSemaphore[] chopstick = {new ChopstickSemaphore(1), new ChopstickSemaphore(1), 
				new ChopstickSemaphore(1), new ChopstickSemaphore(1), new ChopstickSemaphore(1)};
	
	Thread p1 = new PhilosopherSemaphore("Philosopher 1", chopstick[0], chopstick[1]);
	Thread p2 = new PhilosopherSemaphore("Philosopher 2", chopstick[1], chopstick[2]);
	Thread p3 = new PhilosopherSemaphore("Philosopher 3", chopstick[2], chopstick[3]);
	Thread p4 = new PhilosopherSemaphore("Philosopher 4", chopstick[3], chopstick[4]);
	Thread p5 = new PhilosopherSemaphore("Philosopher 5", chopstick[4], chopstick[0]);
	
	p1.start();
	p2.start();
	p3.start();
	p4.start();
	p5.start();

	}
}


package no.hvl.dat103;

public class ChopstickSemaphore {
	
	private int value;
	
	public ChopstickSemaphore(int value) {
		this.value = value;
	}
	
	public void release() {
		value++;
	}
	
	public void acquire() {
		while(value <= 0) {}
		value--;
	}

}

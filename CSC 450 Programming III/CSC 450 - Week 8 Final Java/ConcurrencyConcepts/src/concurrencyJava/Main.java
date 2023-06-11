package concurrencyJava;

public class Main {
	
	public static void main(String[] args){
		// Constructors for CountUp and CountDown
		Up up = new Up();
		Down down = new Down();
		//Create two threads
		Thread t1 = new Thread(up);
		Thread t2 = new Thread(down);
		//Start threads to run concurrently
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted!");
			e.printStackTrace();
		}
		System.out.println();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted!");
			e.printStackTrace();
		}
	}
}

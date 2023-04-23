package concurrencyJava;

public class Down implements Runnable{
	/** creates a run method for counting up*/
	@Override
	public synchronized void run() {
		for(int i = 20; i >= 0; i--)
			System.out.print(i + " ");
		
	}
}

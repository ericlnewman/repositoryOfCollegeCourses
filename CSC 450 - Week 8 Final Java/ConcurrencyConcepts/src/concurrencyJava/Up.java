package concurrencyJava;

public class Up implements Runnable{

		/** creates a run method for counting up*/
		@Override
		public synchronized void run() {
			for(int i = 0; i <= 20; i++)
			System.out.print(i + " ");
	}
}

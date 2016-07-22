package lck00_J_NCES;

public class TestThread implements Runnable {

		public void run() {
			// Untrusted code
			synchronized (SomeObject.class) {
			while (true) {
			try {
				Thread.sleep(Integer.MAX_VALUE);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Indefinitely delay someObject
			} }
		}
		public static void main(String[] args) throws Exception { 
			
			TestThread t = new TestThread();
			Thread t1 = new Thread(t);
			Thread t2 = new Thread(t);
			Thread t3 = new Thread(t);
			t1.start();
			t2.start();
			t3.start();
		}
}

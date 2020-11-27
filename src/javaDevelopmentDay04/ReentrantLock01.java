package javaDevelopmentDay04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lock lock = new ReentrantLock();
		
		MyRunnable myRunnable = new MyRunnable(lock);
		
		Thread thread1 = new Thread(myRunnable);
		thread1.setName("Customer-1");
		thread1.start();
		
		Thread thread2 = new Thread(myRunnable, "Customer-2");
		thread2.start();
		
		Thread thread3 = new Thread(myRunnable, "Customer-3");
		thread3.start();

	}

}

class MyRunnable implements Runnable {
	
	public int numOfAvailableTickets = 2;
	Lock lock;
  public MyRunnable(Lock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " is waiting to book the ticket");
		lock.lock();
		
		if(numOfAvailableTickets>0) {
			
			System.out.println(Thread.currentThread().getName() + " is booking the ticket");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " booked the ticket");
			numOfAvailableTickets--;
			System.out.println("After " + Thread.currentThread().getName() + " booked the ticket, the num of available tickets: " + numOfAvailableTickets);
			
			
		}else {
			System.out.println(Thread.currentThread().getName() + " could not book any ticket");
		}
		
		lock.unlock();

}
}

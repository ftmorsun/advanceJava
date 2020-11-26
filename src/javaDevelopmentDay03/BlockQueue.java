package javaDevelopmentDay03;
import java.util.concurrent.ArrayBlockingQueue;
public class BlockQueue {

		
		static public int counter = 1;

		public static void main(String[] args) {
			
			ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
			
			Producer producer = new Producer(queue);
			Thread producerThread = new Thread(producer);
			producerThread.start();

			Consumer consumer = new Consumer(queue);
			Thread consumerThread = new Thread(consumer);
			consumerThread.start();

		}}
	

	class Producer implements Runnable{

		private ArrayBlockingQueue<Integer> queue;
		
		public Producer(ArrayBlockingQueue<Integer> queue) {
			this.queue = queue;
		}
		
		@Override
		public void run() {
			
			while(true) {
				
				try {
					Thread.sleep(1000);
					queue.put(BlockQueue.counter);
					System.out.println("counter removed from this queue "+queue.toString());
					System.out.println("counter value is put to the queue array: " + BlockQueue.counter);
					BlockQueue.counter++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			
		}

}
	class Consumer implements Runnable{
		
		private ArrayBlockingQueue<Integer> queue;
		
		public Consumer(ArrayBlockingQueue<Integer> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
					queue.take();
					BlockQueue.counter--;
					System.out.println("counter removed from this queue "+queue.toString());
					System.out.println("counter value is removed from the queue array: " + BlockQueue.counter);			
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}


	}


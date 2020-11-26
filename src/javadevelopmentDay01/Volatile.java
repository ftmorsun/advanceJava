package javadevelopmentDay01;

public class Volatile {
	volatile public static int age=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a thread for age==0
		Thread thread1 = new Thread(new Runnable() {
			public void run()
			{
				while (true)
				{
					if (age==0)
						System.out.println("thread is running");
					else
						break;
				}
			}
		});
		thread1.start();
		
		
		//create a thread for age==0
		Thread thread2 = new Thread(new Runnable() {
					public void run()
					{
						try {
							Thread.sleep(100);
						}catch (InterruptedException e)
						{
							e.printStackTrace();
						}
						
						age=1;
						System.out.println("age is updated");
					}
				});
				thread2.start();

	}

}

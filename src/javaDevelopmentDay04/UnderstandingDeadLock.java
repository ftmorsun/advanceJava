package javaDevelopmentDay04;




public class UnderstandingDeadLock {
    public static void main(String[] args) {
        String lock1= "lock1";
        String lock2 = "lock2";
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(lock1) {
                    System.out.println("I am in thread-1 on lock1");
                    synchronized(lock2) {
                        System.out.println("I am in thread-1 on lock2");
                    };
                    
                }
                
            }
            
        });
        thread1.start();
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(lock2) {
                    System.out.println("I am in thread-2 on lock2");
                    synchronized(lock1) {
                        System.out.println("I am in thread-2 on lock1");
                    };
                    
                }
                
            }
            
        });
        thread2.start();
        
     

    }
}

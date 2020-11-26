package javadevelopmentDay02;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ThreadNums {
	public static int transform(int number)
	{
	
		System.out.println("t  :"+ number+"--"+ Thread.currentThread());
		sleep(1000);
		System.out.println();
		return number*-1;
		
	}
	private static boolean sleep(int ms)
	{
		try {
			Thread.sleep(ms);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> numbers= Arrays.asList(10,2,30,4,95,6,7,8,2,10, 11, 22, 13, 14,16,19,20,15);
		 
		// System.out.println(ForkJoinPool.commonPool());
		 
		 numbers.parallelStream()
		 .map(e->transform(e))
		 .forEach(e->{});

	}

}

package javadevelopmentDay02;

import java.util.Arrays;
import java.util.List;

public class Sample {
	public static int transform(int number)
	{
	
		System.out.println("t  :"+ number+"--"+ Thread.currentThread());
		sleep(1000);
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
//	private static boolean use(Stream<Integer> stream)
//	{
//		stream.parallel().
//		.mapToInt(e->transform(e))
//		.forEach(Sytem.out::println);
//	}
	public static int add(int a, int b)
	{
		int result=a+b;
		System.out.println(a+" +" +b+ " = "+result +"---" + Thread.currentThread());
		return result;
	}
	
	private static void printIt(int num)
	{
		System.out.println("p  :"+ num+"--"+ Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub numbers= 
   List<Integer> numbers= Arrays.asList(10,2,30,4,95,6,7,8,2,10);
   
//   numbers.parallelStream()
//	.mapToInt(e->transform(e))
//	.forEachOrdered(e->printIt(e));
   
    
   //with reduce parallel
   //you have to use identitiy value 
   numbers.parallelStream()
 	.reduce(30, (total,e)->add(total,e));
 	
   //with reduce sequential
   numbers.stream()
 	.reduce(30, (total,e)->add(total,e));
   
   
   
	}

}

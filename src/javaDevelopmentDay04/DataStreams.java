package javaDevelopmentDay04;

public class DataStreams {
	/*
    1) System.out: It is used to send data outside of the program.
    2) System.in : It is used to get data into our program
    3) System.err: It is used to send data outside of the program.
                   a) System.err prints the outputs on the console in red
                      System.out prints the outputs on the console in black
                   b) Java stores System.err outputs in a different file  
                      Java stores System.out outputs in another different file 
 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(12/0);
		}catch(ArithmeticException e){
			System.out.println("Catch block is executed...");
			System.err.println("You divided a number by zero...");
		}

	}

}

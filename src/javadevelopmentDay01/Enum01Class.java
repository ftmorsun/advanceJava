package javadevelopmentDay01;

public class Enum01Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enum01 browserName = Enum01.CHROME;
		switch (browserName)
		{
		case CHROME:
			System.out.println("Chrome is running");
			break;
		case SAFARI:
			System.out.println("Safari is running");
			break;
		default:
			break;
		}

	}

}

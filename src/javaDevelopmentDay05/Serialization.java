package javaDevelopmentDay05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle bike= new Vehicle("Bike", 200, 'B');
		Vehicle car= new Vehicle("car", 20000, 'C');
		Vehicle jeep= new Vehicle("Jeep", 50000, 'J');
		
		try (FileOutputStream fos = new FileOutputStream("Vehicle.dat"){
			
		} catch (Exception e) {
			// TODO: handle exception
		} ;
		

	}

}

class Vehicle
{
      String name;
      int prince;
      char initial;
	/**
	 * @param name
	 * @param prince
	 * @param initial
	 */
	public Vehicle(String name, int prince, char initial) {
		super();
		this.name = name;
		this.prince = prince;
		this.initial = initial;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", prince=" + prince + ", initial=" + initial + "]";
	}
	
      
}

class ReadableObjects{
	
	try (FileInputStream fis = new FileInputStream("Vehicle.dat"))
	{
		ObjectInputStream obj= new ObjectInputStream(fis);
		
		try {
			
			Vehicle vBike= (Vehicle)obj.readObject();
			Vehicle vCar= (Vehicle)obj.readObject();
			Vehicle vJeep= (Vehicle)obj.readObject();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}catch (IOException e)
	{
		e.printStackTrace();
	}
	
	
	
}

package javadevelopmentDay01;

import java.util.HashMap;

//T stands for Type
//E stands for Element
//K-> stands for Key
//V-> stands for value
//N-> stands for Number


public class Generic02
{
	public static void main(String[] args) {
	Generic02Nt01<String, Integer> obj1= new Generic02Nt01<>("Ali", 33);
	
	System.out.println(obj1);
	}
}

class Generic02Nt01<K,V>{
	
	private K key;
	private V value;
	
	public Generic02Nt01(K key, V value)
	{
		this.key=key;
		this.value=value;

	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "GenericNt01 [key=" + key + ", value=" + value + "]";
	}
	public <E, N> void display(E element, N number)
	{
		System.out.println("Element:"+element+ "Number:"+number);
		
	}
}
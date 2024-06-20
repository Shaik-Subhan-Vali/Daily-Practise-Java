package Assignments;

public class Smartphone {

	public static void main(String[] args) {
	System.out.println("Below are the smartphone details:");
	Battery B = new Battery();
	System.out.println(B.manufacturer);
	System.out.println(B.capacity);
 
	}

    public static class Battery {
	int capacity = 5000; 
	String manufacturer = "samsung" ;
	
	}

}

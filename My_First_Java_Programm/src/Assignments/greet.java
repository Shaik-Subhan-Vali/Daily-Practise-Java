package Assignments;

public class greet {

	public static void main(String[] args) {
		//Write a method called greet that takes a String name as an argument and prints a greeting message to the console (e.g., "Hello, name!").
		String s ="Scoop";
		System.out.println(greet(s));

	}
	public static String greet(String x) {
		String str ="Hello, "+x+"!";
		return str;
	}

}

package Assignments;

public class reverseString {

	public static void main(String[] args) {
		String s= "hello" ;
		System.out.println(Rev(s));
	}
	public static String Rev(String x) {
		StringBuilder r = new StringBuilder(x);
		return r.reverse().toString();
		
	}

}

package Assignments;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		System.out.println("Addition is "+ (a+b));
		System.out.println("Subtraction is "+ (a-b));
		System.out.println("Multiplication is "+(a*b));
		System.out.println("Division is "+(a/b));
		
	}

}

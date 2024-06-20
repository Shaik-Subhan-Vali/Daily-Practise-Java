package Assignments;

public class calculateArea {

	public static void main(String[] args) {
		int l= 20;
		int b =10;
		System.out.println("Area of the rectange : "+calculateArea(l,b));
		
		//Write a method called calculateArea that takes two integers as arguments (length and width) and returns the area of a rectangle.

	}
	public static int calculateArea(int x, int y) {
		int area =x*y;
		return area;
	}

}

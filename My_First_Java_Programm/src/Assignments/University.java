package Assignments;

public class University {

	public static void main(String[] args) {
		Department d =new Department();
		
		adddeps("Maths", 20);
		adddeps("English",5);
		
	}
	public static class Department{
		String name ="Physics";
		int numberOfProfessors =10 ;
	}
	public static void adddeps(String s, int n) {
		Department dep = new Department();
		dep.name =s;
		dep.numberOfProfessors =n;
		System.out.println( s + " department has " + n +" professors");
		
	}

}

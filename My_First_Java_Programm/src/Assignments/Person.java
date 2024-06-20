package Assignments;

public class Person 
{
	
	String name;
	int age;
	
	
	Person(String name, int age)  
	{
		this.name=name;
		this.age=age;		
	}
	
	void dispaydetails()
	{
		System.out.println(this.name);
		System.out.println(this.age);		
	}
		

	public static void main(String[] args)
	{		
		Person p = new Person("hello", 77 );
		p.dispaydetails();	
	}
	
}

    
  
package Assignments;

public class StatementsDemo {

	public static void main(String[] args) {
		
		// if else
		int x =10;
		if (x >10)
		{
			System.out.println("x is greater than "+x);
		}
		else 
		{
			System.out.println("x is not greater than "+x);
		}
		
		//Switch statement (switch)
		
		int y = 4; // y ranges from 0 to 5 only
		switch(y) 
		{
		case 1 : System.out.println("y value is "+ y); break;
		case 2 : System.out.println("y value is "+ y); break;
		case 3 : System.out.println("y value is "+ y); break;
		case 4 : System.out.println("y value is "+ y); break;
		case 5 : System.out.println("y value is "+ y); break;
		default  : System.out.println("y value is "+ "0"); break;
		
		}
		//Iterative statement
		//while loop
		int z =1;
		while(z <=3) {
			System.out.println("z : "+ z);
			z++;
		}
		//for loop
		int a=4;
		for(int i=0;i<=a;i++) {
			System.out.println("a is "+ a);
		}
		//do-while loop 
		int b=5;
		do
		{
			System.out.println(b);
			b ++;
		}while(b <= 2);
		
		//break
		int s=5;
		for(int i=1;i<s;i++) {
			System.out.println(i);
			if(i==4)
			{
			break;
			}
			 // shouldn't print
			
		}
		//continue
		int t=4;
		for(int i=1;i<t;i++) {
			System.out.println(i);
			if(i==3)
				{
				continue;
				}
            //3 will be skipped
		}
	
	
		
		}
	}



package Assignments;

public class PrimeFinder {

	public static void main(String[] args) {
		int x =20;
		while(true) {
			  if (prime(x))
			  {
	                System.out.println(x);
	                break;
	           }
	            x++;
		}
		
	}

public static boolean prime(int num) {
    if (num <= 1)
    {
        return false;
    }
    for (int i = 2; i <= num/2; i++)
    {
        if (num % i == 0)
        {
            return false;
        }
    }
    return true;
}
}
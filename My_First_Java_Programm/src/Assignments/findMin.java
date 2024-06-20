package Assignments;

public class findMin {

    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int c = 30;
        System.out.println(minof(a, b, c));
    }

    public static int minof(int a, int b, int c) {
        if (a < b && a < c) 
        {
           return a;
        } 
        else if(b < a && b < c)
        {
           return b;
        }
        else
        {
        	return c;
        }
    }
}

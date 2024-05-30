package Assignments;

import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int sum =0;
		int x ;

        do {
            x = sc.nextInt();
            if (x >= 0) {
                sum += x;
            }
        } while (x >= 0);

        System.out.println("Total sum is " + sum);

	}

} //5 4 3 1 -5 ans is 13



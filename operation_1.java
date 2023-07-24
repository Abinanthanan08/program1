package day1_program;

import java.util.Scanner;

public class operation_1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number:");
		int a=s.nextInt();
		int b=15,c;
		
		//Addition
		c=a+b;
		System.out.println(c);
		
		//subtraction
		c=a-b;
		System.out.println(c);
		
		//multiple
		c=a*b;
		System.out.println(c);
		
		//division
		c=a/b;
		System.out.println(c);
		
		//modulus
		c=a%b;
		System.out.println(c);
		
	}

}

package day1_program;
import java.util.*;
public class condition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		if(n%2==0) {
			System.out.println("The given number " +n+ " is even");
		}
		else {
			System.out.println("The given number " +n+ " is odd");
		}
		
	}

}

import java.util.Scanner;
    public class len {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string:");
		String n=s.nextLine();
		String[] a=n.split(" ");
        int b=a.length;
        System.out.println("The total no.of.words are "+b);



	}
}
    
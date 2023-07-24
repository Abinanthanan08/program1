import java.util.Scanner;
    public class string {
   public static void main(String args[]){
      int count = 0;
      System.out.println("Enter a string :");
      Scanner sc = new Scanner(System.in);
      String sen = sc.nextLine();

      for (int i=0 ; i<sen.length(); i++){
         char ch = sen.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            count ++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+count);
   }
}



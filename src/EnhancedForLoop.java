import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int length = scanner.nextInt();
       int[] sides =  new int[length];
       for (int i = 0; i < length; i++) {
           sides[i] = scanner.nextInt();
       }
            
      for(int s: sides){
      System.out.println(s*s);
      }
   }
}

//sololearn.com 23.2 Practice: Geometry Code
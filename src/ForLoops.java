import java.util.Scanner;

public class ForLoops {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int firstBadGuy = read.nextInt();
       int secondBadGuy = read.nextInt();

       //your code goes here
       for (int i = 1; i < 8; i++) {
        if (i == firstBadGuy || i == secondBadGuy){
            System.out.println("Bad guy");
        }
        else{
            System.out.println("Good guy");
        }

       
       }
   }
}

//sololearn.com 17.3 Practice: Board Game Players
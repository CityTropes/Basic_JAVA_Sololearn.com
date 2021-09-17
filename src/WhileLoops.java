import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
            int  number = scanner.nextInt();
            int fact = 1;
            //your code goes here
            int result = 1;
            while(fact <= number){
                result *= fact;
                fact++;
            }
            System.out.println(result);
            
    }
}

//sololearn.com 16.2 Practice: Math Class
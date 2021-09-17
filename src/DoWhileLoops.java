import java.util.Scanner;

public class DoWhileLoops {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = scanner.nextInt();
            switch (number) {
                case 1: System.out.println("Language selection");
                break;
                case 2: System.out.println("Customer support");
                break;
                case 3: System.out.println("Check the balance");
                break;
                case 4: System.out.println("Check loan balance");
                break;
                case 0: System.out.println("Exit");
                break;
            }
        }
        while(number != 0);
   }
}

//sololearn.com 18.3 Practice: press 2 to contact customer support
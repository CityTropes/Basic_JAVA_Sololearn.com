import java.util.Scanner;

public class LoanCalculator
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		
		//your code goes here
		int i = 1;
		do{
			amount -= (amount*0.1);
			i++;

		} while (i <= 3);

		System.out.println(amount);
	}
}


//sololearn.com Module 2: Loan Calculator
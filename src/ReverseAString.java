import java.util.Scanner;

public class ReverseAString
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		
		for(int a = arr.length - 1; a >= 0; a--) {  
         System.out.print(arr[a] + "");  
      }
	}
}

//sololearn.com Module 3: Reverse a String (arrays)
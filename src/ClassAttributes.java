import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       Customer customer = new Customer();
       
       //set customer's data to object here
       Customer.firstName = firstName;
       Customer.secondName = secondName;
       Customer.age = age;
       Customer.roomNumber = roomNumber;
      
       customer.saveCustomerInfo();
   }
}

class Customer {
   //add all necessary attributes here
        static  String firstName;
       static String secondName;
       static int age;
       static int roomNumber;

  
   public void saveCustomerInfo() {
       System.out.println("First name: " + firstName);
       System.out.println("Second name: " + secondName);
       System.out.println("Age: " + age);
       System.out.println("Room number: " + roomNumber);
   }
}

//sololearn.com 31.2 Practice: Tracking Customer Data
package strongpassword;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

   // this method return first two letter of string with 1st capital letter
   public static String initcapTwoLwtters(String str) {
       str = str.substring(0, 2);
       str = str.replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
       str = str.replace(str.charAt(1), Character.toLowerCase(str.charAt(1)));
       return str;
   }

   // member function to generate random number between 10 to 90
    public static int generateRandomNumber() { 
       Random random = new Random();
       return random.nextInt(99 - 10 + 1) + 10;
   }

   public static void main(String[] args) {

       // variable declaration
       String password;
       String firstName;
       String lastName;
       String cityOfBirth;
       int favouriteNumber;
       int randomNumber;
       int num1;
       int num2;
       String favouriteNumberStr;
       String randomNumberStr;

       // Code for firstname
       Scanner scanner = new Scanner(System.in);
       System.out.print("Please enter your first name : ");
       firstName = scanner.nextLine();
       firstName = PasswordGenerator.initcapTwoLwtters(firstName);
       password = firstName;
       System.out.println("Pwd so far : " + password);

       // Code for lastname
       System.out.print("Please enter your last name : ");
       lastName = scanner.nextLine();
       lastName = PasswordGenerator.initcapTwoLwtters(lastName);
       password += lastName;
       System.out.println("Pwd so far : " + password);

       // Code for favourite number
       System.out.print("Please enter your 2-digits favourite number : ");
       favouriteNumber = Integer.parseInt(scanner.nextLine());
       num1 = favouriteNumber / 10;
       num2 = favouriteNumber % 10;
       favouriteNumberStr = String.valueOf(num1) + "^" + String.valueOf(num2);
       password += favouriteNumberStr;
       System.out.println("Pwd so far : " + password);

       // Code for city of birth
       System.out.print("Please enter your city of birth : ");
       cityOfBirth = scanner.nextLine();
       cityOfBirth = PasswordGenerator.initcapTwoLwtters(cityOfBirth);
       password += cityOfBirth;
       System.out.println("Pwd so far : " + password);

       // Code for random number
       randomNumber = PasswordGenerator.generateRandomNumber();
       System.out.println("Your 2-digits random number : " + randomNumber);
       num1 = randomNumber / 10;
       num2 = randomNumber % 10;
       randomNumberStr = String.valueOf(num1) + "." + String.valueOf(num2);
       password += randomNumberStr;
       System.out.println("Your final Pwd is : " + password);

   }
}

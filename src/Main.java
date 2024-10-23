// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1
        /*String firstName = "Joey";
        String lastName = "Ferrari";
        String name = firstName + " " + lastName;
        System.out.println(name);*/

        //Task 2

        /*// assigning variables
        int num1 = 10, num2 = 5;

        // printing out the sum
        System.out.println(num1 + num2);

        // assigning variables
        int result = num1 / num2;
        System.out.println(result);  // printing out the result of division

        // assigning variables
        int num3 = 8;

        // printing out the result of increments
        System.out.println(num3++);

        System.out.println(num3);
        System.out.println(++num3);*/

        //Task 3

        Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first name:");
        String firstName = scannerObj.nextLine();
        System.out.println("Enter last name:");
        String lastName = scannerObj.nextLine();
        System.out.println("Hey there, " + firstName + " " + lastName);

        System.out.println("Enter a number: ");
        double num1 = Double.parseDouble(scannerObj.nextLine());
        System.out.println("Enter a second number: ");
        double num2 = Double.parseDouble(scannerObj.nextLine());
        System.out.println(num1 + num2);
    }
}
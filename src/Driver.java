
// Author: Shaheer Malik
import java.util.Scanner;
public class Driver {

    public static void main(String [] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your desired numbers separated by a space");

        Calculator calculation = new Calculator();

        String input = keyboard.nextLine();

        String [] nums;

        nums = input.split( " ");

        double a = calculation.findSum(nums);

        double b = calculation.findAverage(nums);

        double c = calculation.findProduct(nums);

        double d = calculation.findFactorial(nums);

        System.out.println("The sum of the numbers is " + a);

        System.out.println("The average of the numbers is " + b);

        System.out.println("The product of the numbers is " + c);

        System.out.println("The factorials of the numbers is " + d);

    }
}
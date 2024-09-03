// 38.	Basic Exception Handling:
// Question: Write a Java program that attempts to perform a division operation inside a try block. Include a catch block to handle the ArithmeticException if the denominator is zero. Also, use a finally block to ensure that cleanup code (e.g., closing resources) is executed regardless of whether an exception occurred.
// 39.	Multiple Catch Blocks: 
// Question: Extend the previous scenario by introducing multiple catch blocks to handle different types of exceptions. For example, catch both ArithmeticException and InputMismatchException exceptions separately.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the number for dividend: ");
            int dividend = sc.nextInt();
            System.out.print("Enter the number for divisor: ");
            int divisor = sc.nextInt();
            int result = dividend / divisor;
            System.out.println("The result is: "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("The division by 0 is not possible");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Provided input not feasible for division process");
        }
        finally
        {
            System.out.println("The division process is completed resources cleaning up");
        }
        System.out.println("Finally outside of try catch finally block");
    }    
}

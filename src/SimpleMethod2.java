/**
 *
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int number){
        return number*number;
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want to square: ");
        int number = input.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        int result = square(number);
        // Put the result System.out code here.
        System.out.println("The square of " + number + " is " + result );
    }
}

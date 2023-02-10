/**
 *
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        // Pur your code here
        final double pi = 3.14159265359;
        return degrees * (pi/180.0);
    }

    public static double toDegrees(double radians) {
        // Put your code here
        final double pi = 3.14159265359;
        return radians * (180.0/pi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here
        System.out.println(toRadians(degrees));
        System.out.println(Math.toRadians(degrees));

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
        System.out.println(toDegrees(radians));
        System.out.println(Math.toDegrees(radians));
    }
}

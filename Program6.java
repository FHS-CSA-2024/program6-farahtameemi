import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        // Define the value of pi as a constant
        final double PI = 3.14159;

        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the radius
        System.out.println("Enter the radius:");
        double radius = scanner.nextDouble();

        // Calculate the diameter, area, and circumference
        double diameter = 2 * radius;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        radius = Math.round(radius * 1000.0) / 1000.0;
        diameter = Math.round(diameter * 1000.0) / 1000.0;
        area = Math.round(area * 1000.0) / 1000.0;
        circumference = Math.round(circumference * 1000.0) / 1000.0;

        System.out.println("The Radius of the circle = " + radius);
        System.out.println("The Diameter of the circle = " + diameter);
        System.out.println("The Area of the circle = " + area);
        System.out.println("The Circumference of the circle = " + circumference);
    }
}

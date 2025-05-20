import java.util.Scanner;

public class Circle {
    private static final double PI = 3.14159;
    private double r;

    // Method to initialize the radius
    public void getData(double radius) {
        r = radius;
    }

    // Method to calculate and return the area
    public double calculate() {
        return PI * r * r;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c = new Circle(); // Creating an instance of Circle

        System.out.print("Enter radius: ");
        c.getData(scanner.nextDouble()); // Getting radius input

        System.out.println("Area: " + c.calculate()); // Displaying the area
        scanner.close();
    }
}

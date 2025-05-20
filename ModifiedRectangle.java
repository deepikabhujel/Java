import java.util.Scanner;

 public class ModifiedRectangle {
    int length;
    int breadth;
    int area;

    // Parameterized constructor to initialize length and breadth
    ModifiedRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    void calculateArea() {
        area =length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading length and breadth from user
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        
        System.out.println("Enter breadth: ");
        int breadth = scanner.nextInt();
        
        // Creating an object of Rectangle class with user input values
        ModifiedRectangle r = new ModifiedRectangle(length, breadth);
        r.calculateArea();
        
        // Calculating and displaying the area
        System.out.println("Area of Rectangle: " +r.area);
        
        scanner.close();
    }
}

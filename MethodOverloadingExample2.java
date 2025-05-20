public class MethodOverloadingExample2 {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add two double values
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // Testing the methods
        System.out.println("Sum of 5 and 10: " + add(5, 10));
        System.out.println("Sum of 3.5 and 2.7: " + add(3.5, 2.7));
    }
}

    


public class MethodOverloadingExample {
    
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        // Testing the methods
        System.out.println("Sum of 5 and 10: " + add(5, 10));
        System.out.println("Sum of 3, 7 and 2: " + add(3, 7, 2));
    }
}

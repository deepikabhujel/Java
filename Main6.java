// Abstract class (can have abstract and concrete methods)
abstract class Vehicle {
    String brand = "Toyota"; // Instance variable

    // Abstract method (must be implemented in a subclass)
    abstract void start();

    // Concrete method (already implemented)
    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass of Vehicle (implements abstract method)
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

// Final class (cannot be extended further)
final class Bike {
    void ride() {
        System.out.println("Riding the bike...");
    }
}

// Main class to test abstraction
public class Main6 {
    public static void main(String[] args) {
        // Creating an object of Car (subclass of abstract class)
        Car myCar = new Car();
        myCar.start(); // Calls overridden method
        myCar.showBrand(); // Calls concrete method from abstract class

        // Creating an object of the final class Bike
        Bike myBike = new Bike();
        myBike.ride(); // Calls method from final class
    }
}

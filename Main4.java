// Base class
class Parent {
    // Method to be overridden
    void show() {
        System.out.println("This is the Parent class.");
    }
}

// Derived class
class Child extends Parent {
    // Overriding the show() method
    @Override
    void show() {
        System.out.println("This is the Child class.");
    }
}

public class Main4{
    public static void main(String[] args) {
        // Create an instance of Parent and call show()
        Parent parentObj = new Parent();
        parentObj.show();

        // Create an instance of Child (using Parent reference) and call show()
        Parent childObj = new Child();
        childObj.show();
    }
}

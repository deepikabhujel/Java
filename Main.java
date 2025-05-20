// Base class
class Person {
    // Data members
    String name;
    int age;

    // Method to read Person's data
    void readData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person's data
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Employee extends Person {
    // Additional data member for Employee
    double salary;

    // Method to read Employee's data
    void readEmployeeData(String name, int age, double salary) {
        // Set data for the base class
        readData(name, age);
        // Set data for the Employee class
        this.salary = salary;
    }

    // Method to display Employee's data
    void display() {
        super.display(); // Call the display method of the base class
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee();

        // Setting the Employee's data
        emp.readEmployeeData("John Doe", 30, 75000.00);

        // Displaying the Employee's data
        emp.display();
    }
}
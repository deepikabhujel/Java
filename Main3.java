// Base class
class Vehicle {
    protected String VNo;
    protected int no_of_wheel;
    protected int max_speed;
    
    public void setVehicleDetails(String VNo, int no_of_wheel, int max_speed) {
        this.VNo = VNo;
        this.no_of_wheel = no_of_wheel;
        this.max_speed = max_speed;
    }
}

// Intermediate class derived from Vehicle
class Passenger extends Vehicle {
    protected int no_of_passengers;
    
    public void setPassengerDetails(int no_of_passengers) {
        this.no_of_passengers = no_of_passengers;
    }
}

// Derived class: Bus (multilevel inheritance: Bus extends Passenger)
class Bus extends Passenger {
    private String route;
    private double fare_per_person;
    private String helper_name;
    
    public void setBusDetails(String route, double fare_per_person, String helper_name) {
        this.route = route;
        this.fare_per_person = fare_per_person;
        this.helper_name = helper_name;
    }
    
    public void displayBusInfo() {
        System.out.println("Bus Details:");
        System.out.println("Vehicle No: " + VNo);
        System.out.println("Number of Wheels: " + no_of_wheel);
        System.out.println("Max Speed: " + max_speed);
        System.out.println("No. of Passengers: " + no_of_passengers);
        System.out.println("Route: " + route);
        System.out.println("Fare per Person: " + fare_per_person);
        System.out.println("Helper Name: " + helper_name);
    }
}

// Derived class: Taxi (multilevel inheritance: Taxi extends Passenger)
class Taxi extends Passenger {
    private double fare_per_km;
    
    public void setTaxiDetails(double fare_per_km) {
        this.fare_per_km = fare_per_km;
    }
    
    public void displayTaxiInfo() {
        System.out.println("Taxi Details:");
        System.out.println("Vehicle No: " + VNo);
        System.out.println("Number of Wheels: " + no_of_wheel);
        System.out.println("Max Speed: " + max_speed);
        System.out.println("No. of Passengers: " + no_of_passengers);
        System.out.println("Fare per Km: " + fare_per_km);
    }
}

// Main class to demonstrate the use of the above classes
public class Main3 {
    public static void main(String[] args) {
        // Create and set details for a Bus object
        Bus bus = new Bus();
        bus.setVehicleDetails("BUS-001", 6, 80);
        bus.setPassengerDetails(40);
        bus.setBusDetails("City A to City B", 2.5, "John");
        bus.displayBusInfo();
        
        System.out.println(); // Line break
        
        // Create and set details for a Taxi object
        Taxi taxi = new Taxi();
        taxi.setVehicleDetails("TAXI-101", 4, 120);
        taxi.setPassengerDetails(4);
        taxi.setTaxiDetails(1.2);
        taxi.displayTaxiInfo();
    }
}

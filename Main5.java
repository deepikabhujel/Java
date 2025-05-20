class Polygon {
    protected double dimension1;
    protected double dimension2;
    
    public Polygon(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
}

class Rectangle extends Polygon {
    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }
    
    public double calculateArea() {
        return dimension1 * dimension2;
    }
}

class Triangle extends Polygon {
    public Triangle(double base, double height) {
        // Use base and height directly
        super(base, height);
    }
    
    public double calculateArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15.5, 10.5);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        
        Triangle triangle = new Triangle(15.5, 10.5);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}

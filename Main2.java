 class Polygon {
    protected double dimension1;
    protected double dimension2;
     
    void ReadDimension(){
        dimension1 = 10.5;
        dimension2 = 5.5;
    }
}

class Rectangle extends Polygon{
    public double calculateArea(){
        return dimension1 * dimension2;
    }
}

class Triangle extends Polygon{
    public double calculateArea(){
        return 0.5 * dimension1 * dimension2;
    }
}

public class Main2{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.ReadDimension(); // Initialize dimensions
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        
        Triangle triangle = new Triangle();
        triangle.ReadDimension(); // Initialize dimensions
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}

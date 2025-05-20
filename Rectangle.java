public class Rectangle {
    int length;
    int breadth;
    int area; 
    
    Rectangle() {
        length = 100;
        breadth = 200;
    }

    void calculateArea() {
        area = length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.calculateArea(); 

        System.out.println("Area of Rectangle: " + r.area);
    }
}

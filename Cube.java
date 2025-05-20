public class Cube {
    int side;
    int volume;  // Instance variable to store volume

    // Constructor using 'this' keyword
    Cube() {
        this.side = 5;
    }

    // Method to calculate volume
    void calculateVolume() {
        this.volume = this.side * this.side * this.side;
    }

    public static void main(String[] args) {
        Cube c = new Cube();
        c.calculateVolume();
        System.out.println("Volume of Cube: " + c.volume);
    }
}

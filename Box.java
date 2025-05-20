public class Box {
    int length;
    int breadth;
    int height;
    int volume; 

    void ReadData() {
        this.length = 2;
        this.breadth = 3;
        this.height = 4;
    }

    void Volume() {
        volume = length * breadth * height; 
    }

    public static void main(String[] args) {
        Box a = new Box();
        a.ReadData();
        a.Volume();
        
        System.out.println("Volume: " +a.volume);
    }
}

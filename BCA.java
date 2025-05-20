public class BCA {
    int roll;
    float marks;

    void details() {
        roll = 5;
    }

    void result() {
        marks = 85;
    }

    public static void main(String[] args) {
        BCA a = new BCA();
        a.details();
        a.result(); 
          

        System.out.println("Roll no: " + a.roll);
        System.out.println("Result: " + a.marks);
    }
}

import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenu Example");
        JMenuBar mb = new JMenuBar();
        
        JMenu menu1 = new JMenu("Courses");
        JMenu item1 = new JMenu("BCA");
        JMenu item2 = new JMenu("BBA");

        menu1.add(item1);
        menu1.add(item2);
        mb.add(menu1);

        frame.setJMenuBar(mb);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
    
}

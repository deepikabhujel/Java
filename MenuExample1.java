import javax.swing.*;

public class MenuExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenu Example1");
        JMenuBar mb = new JMenuBar();
        
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");
        JMenu menu3 = new JMenu("Help");
        JMenu item1 = new JMenu("New");
        JMenu item2 = new JMenu("Open");
        JMenu item3 = new JMenu("Save");
        JMenu item4 = new JMenu("Save As");
        JMenu item5 = new JMenu("Close");
        JMenu item6 = new JMenu("Exit");

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        menu1.add(item5);
        menu1.addSeparator();
        menu1.add(item6);
        mb.add(menu1);
        mb.add(menu2);
        mb.add(menu3);

        frame.setJMenuBar(mb);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
    
}

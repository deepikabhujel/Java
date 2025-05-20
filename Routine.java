 import javax.swing.*;
 
 public class Routine {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Third Semester Routine");
        JPanel panel = new JPanel();

        //table
        String [][] data = {
            {"DSA","DSA","DSA","DSA","WT","WT"},
            {"JAVA","JAVA","JAVA","JAVA","SAD","DSA"},
            {"SAD","SAD","SAD","WT","JAVA","JAVA"},
            {"WT","STAT","STAT","STAT","STAT","STAT"},
        };
        String[] columnNames = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday"};
        JTable table = new  JTable(data,columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);
        
        panel.add(tableScrollPane);
        frame.add(panel);

        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        frame.setVisible(true);
    }
    
}

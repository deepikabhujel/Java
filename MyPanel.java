import javax.swing.*;

public class MyPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame("Panel");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Testing");
        JButton button = new JButton("Click Me");
        JCheckBox checkBox = new JCheckBox("Check Me");
        JRadioButton radioButton = new JRadioButton("Select Me");
        panel.add(label);
        panel.add(button);
        panel.add(checkBox);
        panel.add(radioButton);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        f.add(panel);
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}

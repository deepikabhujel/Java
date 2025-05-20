import javax.swing.*;
import java.awt.*;

public class ColorSelecter {
    public static void main(String[] args) {
        // Create a basic JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Show the color chooser dialog
        Color selectedColor = JColorChooser.showDialog(frame, "Choose a Color", Color.RED);

        if (selectedColor != null) {
            System.out.println("Selected Color: " + selectedColor);
        } else {
            System.out.println("No color selected.");
        }
    }
}

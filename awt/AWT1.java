package awt;

import java.awt.*;
import java.awt.event.*;

public class AWT1 {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame frame = new Frame("My First AWT Program");

        // Set layout manager
        frame.setLayout(new FlowLayout());

        // Create components
        Label label = new Label("Hello, AWT!");
        Button button = new Button("Click Me");

        // Add components to frame
        frame.add(label);
        frame.add(button);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Handle window close event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

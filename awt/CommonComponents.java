package awt;

import java.awt.*;
import java.awt.event.*;

public class CommonComponents {
    public static void main(String[] args) {
        Frame frame = new Frame("Common Components");
        frame.setLayout(new FlowLayout());

        // Label
        Label label = new Label("Username:");

        // TextField
        TextField textField = new TextField(20);

        // Button
        Button button = new Button("Submit");

        // Checkbox
        Checkbox checkbox = new Checkbox("Remember me");

        // Choice (Dropdown)
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // TextArea
        TextArea textArea = new TextArea("Type here...", 5, 30);

        // List
        List list = new List(3, false);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        // Add all components
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(checkbox);
        frame.add(choice);
        frame.add(textArea);
        frame.add(list);

        frame.setSize(400, 400);
        frame.setVisible(true);

        // Close handling
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
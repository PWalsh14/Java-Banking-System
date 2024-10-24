import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWindow {
    private int clickCount =0;
    public void showwindow()
    {
        JFrame frame = new JFrame();
        //set up the size
        frame.setSize(300, 200);
        //terminate when user closes this window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Create a JLabel
        JLabel label = new JLabel("Button has not been clicked.");

        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Text Field
//        JTextField tField = new JTextField(20);
//        tField.setText("");


        frame.setLayout(new FlowLayout());

        frame.add(button);
        frame.add(label);
//        frame.add(tField);

        // explain the order of adding add(button) and frame.setLayout(new FlowLayout()); matters

        // to make the window visible
        frame.setVisible(true);


        button.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         clickCount++; // Increment click count
                                         label.setText("Button clicked " + clickCount + " times");
                                     }
                                 }
        );




    }


}

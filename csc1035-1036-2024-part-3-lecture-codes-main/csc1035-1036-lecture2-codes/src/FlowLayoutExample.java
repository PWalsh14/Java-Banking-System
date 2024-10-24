import javax.swing.*;
import java.awt.*;
public class FlowLayoutExample {

    public void showflowlayoutexample()
    {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Set layout manager
        frame.setLayout(new FlowLayout());

        // Add components
        frame.add(new JLabel("Name:"));
        frame.add(new JTextField(10));
        frame.add(new JButton("Submit"));

        // Display the frame
        frame.setVisible(true);
    }


}

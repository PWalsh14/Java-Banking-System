import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample {
    public void showboarderlayoutexample()
    {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Set layout manager
        frame.setLayout(new BorderLayout());

        // Add components
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("North Part of the country"), BorderLayout.NORTH);

        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }


}

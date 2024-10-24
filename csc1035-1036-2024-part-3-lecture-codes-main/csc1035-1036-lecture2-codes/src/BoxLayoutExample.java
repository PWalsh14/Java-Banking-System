import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {

    public void showboxlayoutexample() {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a container with BoxLayout
        // frame.getContentPane() retrieves the JFrame's content pane
        Container container = frame.getContentPane();
        // then vertical BoxLayout is applied to this container
//        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        // another way of horizontal box along X axis
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));

        // Add components vertically
//        container.add(new JButton("Button 1"));
//        container.add(Box.createRigidArea(new Dimension(0, 22)));
//        container.add(new JButton("Button 2"));
//        container.add(Box.createVerticalGlue());
//        container.add(new JButton("Button 3"));


        container.add(new JButton("Button 1"));
        container.add(Box.createRigidArea(new Dimension(22, 0))); // Horizontal space
        container.add(new JButton("Button 2"));
        container.add(Box.createHorizontalGlue()); // Adds flexible space between Button 2 and Button 3
        container.add(new JButton("Button 3"));


        // Display the frame
        frame.setVisible(true);
    }


}

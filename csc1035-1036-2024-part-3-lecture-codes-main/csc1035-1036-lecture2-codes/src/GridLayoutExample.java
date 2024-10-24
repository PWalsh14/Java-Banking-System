import javax.swing.*;
import java.awt.*;
public class GridLayoutExample {
    public void showgridlayoutexample(){
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Set layout manager
        frame.setLayout(new GridLayout(2, 2));

        // Add components

        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 1"));

        // Display the frame
        frame.setVisible(true);
    }
}

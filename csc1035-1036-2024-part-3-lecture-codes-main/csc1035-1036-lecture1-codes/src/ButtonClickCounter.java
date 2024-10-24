import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickCounter extends JFrame {
    private int clickCount =0;

    // i declared them as a field to increase the scope for them to be accessed
    private JLabel label;  // Declare label as a field
    private JButton button;  // Declare label as a field

    public ButtonClickCounter() {

        // Setting up the JFrame
        setTitle("Swing Event Example");

        // the following is equal
        //this.setTitle("Swing Event Example");

        setSize(300, 200);

        // what if i put  this.pack(); here


        // Center the window
        setLocationRelativeTo(null);

        // terminate when user closes this window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Create a JButton
        button = new JButton("Click Me!");

        // Create a JLabel
        label = new JLabel("Button has not been clicked.");



        add(button);
        add(label);

        setLayout(new FlowLayout());

        // smallest size necessary
        // explain where you put this is important
//        pack();
        // this.pack()

        // Adding an ActionListener to the button
        button.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         clickCount++; // Increment click count
                                         label.setText("Button clicked " + clickCount + " times");
                                     }
                                 }
        );

//        explain the difference the convenience of lambda expression for an anonymous listener
//        Adding an ActionListener to the button using a lambda expression
//                 button.addActionListener(e -> {
//                    clickCount++; // Increment click count
//                    label.setText("Button clicked " + clickCount + " times");
//                });

//
//        // explain on how to use seperate non-anonymous listener class
//        // Setting up the button click listener
//        button.addActionListener(new ButtonClickListener(label));  // Pass the label to the listener





    }

    public JLabel getLabel() {
        return label;
    }



}


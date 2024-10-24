import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Creating a JFrame to simulate an application window
        JFrame frame = new JFrame("JOptionPane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window

        // JPanel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);

        // Adding a label and a text field to the panel for input
        JLabel label = new JLabel("Enter your expense amount:");
        JTextField textField = new JTextField(10); // text field with 10 columns
        panel.add(label);
        panel.add(textField);

        // Button to process the input
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String input = textField.getText();
            try {
                double amount = Double.parseDouble(input);
                if (amount <= 0) {
                    JOptionPane.showMessageDialog(panel, "Amount must be greater than zero.", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Show confirm dialog to confirm the submission
                    int response = JOptionPane.showConfirmDialog(panel, "Do you want to submit this amount: $" + amount + "?", "Confirm Submission", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(panel, "Amount submitted: $" + amount, "Submission Confirmed", JOptionPane.INFORMATION_MESSAGE);
                    } else if (response == JOptionPane.NO_OPTION) {
                        // Optionally handle the 'No' case
                    } else {
                        // Optionally handle the 'Cancel' case
                    }
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(panel, "Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        panel.add(submitButton);

        // Button to change the entered amount
        JButton changeButton = new JButton("Change Amount");
        changeButton.addActionListener(e -> {
            String newAmount = JOptionPane.showInputDialog(panel, "Enter a new amount:", "Update Amount", JOptionPane.PLAIN_MESSAGE);
            if (newAmount != null && !newAmount.trim().isEmpty()) {
                textField.setText(newAmount);
            }
        });
        panel.add(changeButton);

        // Button to display options
        JButton optionsButton = new JButton("Options");
        optionsButton.addActionListener(e -> {
            Object[] options = {"Accept", "Reject", "Hold"};
            int choice = JOptionPane.showOptionDialog(panel, "Choose an option for this transaction:", "Transaction Options",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0:
                    JOptionPane.showMessageDialog(panel, "Transaction accepted.", "Accepted", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(panel, "Transaction rejected.", "Rejected", JOptionPane.WARNING_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(panel, "Transaction on hold.", "On Hold", JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    // Optionally handle other cases
                    break;
            }
        });
        panel.add(optionsButton);

        // Additional button using default YES_NO_CANCEL_OPTION
        JButton defaultOptionsButton = new JButton("Default Options");
        defaultOptionsButton.addActionListener(e -> {
            int choice = JOptionPane.showOptionDialog(panel, "Proceed with the default action?", "Default Options",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            switch (choice) {
                case JOptionPane.YES_OPTION:
                    JOptionPane.showMessageDialog(panel, "Default YES action taken.", "Default YES", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(panel, "Default NO action taken.", "Default NO", JOptionPane.WARNING_MESSAGE);
                    break;
                case JOptionPane.CANCEL_OPTION:
                    JOptionPane.showMessageDialog(panel, "Action canceled.", "Canceled", JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    // Optionally handle other cases
                    break;
            }
        });
        panel.add(defaultOptionsButton);

        // Display the frame
        frame.setVisible(true);
        // i did not specify the layout.
    }
}

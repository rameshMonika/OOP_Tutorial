import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField[] textFields = { new JTextField(), new JTextField() };
    private JLabel[] textFieldLabels = { new JLabel(), new JLabel() };
    private JComboBox<String> comboBox;
    private JButton button;

    public Calculator() {
        textFields[0] = new JTextField(5); // Create a new JTextField with a column width of 20
        textFields[1] = new JTextField(5);

        textFieldLabels[0] = new JLabel("a:");
        textFieldLabels[1] = new JLabel("b:");

        String[] items = { "+", "-", "x", "/" };
        comboBox = new JComboBox<>(items); // Create a new JComboBox with the given items

        button = new JButton("Calculate"); // Create a new JButton with the label "Button"
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String firstTextFieldData = textFields[0].getText(); // Get the data from the JTextField
                    String secondTextFieldData = textFields[1].getText();
                    String comboBoxData = (String) comboBox.getSelectedItem(); // Get the data from the JComboBox

                    int answer = 0;
                    int firstNum = Integer.parseInt(firstTextFieldData);
                    int secondNum = Integer.parseInt(secondTextFieldData);

                    switch (comboBoxData) {
                        case "x":
                            answer = firstNum *= secondNum;
                            JOptionPane.showMessageDialog(Calculator.this, "Answer: " + answer); // Show a message
                                                                                                 // dialog with the data
                            break;

                        case "/":
                            // if (secondNum == 0) throw new ArithmeticException("Cannot be divided by 0");
                            answer = firstNum /= secondNum;
                            JOptionPane.showMessageDialog(Calculator.this, "Answer: " + answer); // Show a message
                                                                                                 // dialog with the data
                            break;

                        case "+":
                            answer = firstNum += secondNum;
                            JOptionPane.showMessageDialog(Calculator.this, "Answer: " + answer); // Show a message
                                                                                                 // dialog with the data
                            break;

                        case "-":
                            answer = firstNum -= secondNum;
                            JOptionPane.showMessageDialog(Calculator.this, "Answer: " + answer); // Show a message
                                                                                                 // dialog with the data
                            break;

                        default:
                            answer = firstNum += secondNum;
                            JOptionPane.showMessageDialog(Calculator.this, "Answer: " + answer); // Show a message
                                                                                                 // dialog with the data
                            break;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Calculator.this, "Invalid Input, please enter a number"); // Show a
                                                                                                            // message
                                                                                                            // dialog
                                                                                                            // with the
                                                                                                            // data
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(Calculator.this, "Cannot be divided by 0"); // Show a message dialog
                                                                                              // with the data
                }
            }
        });

        JPanel panel = new JPanel(new GridBagLayout()); // Create a new JPanel with a GridBagLayout

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // Set the x position to 0
        constraints.gridy = 0; // Set the y position to 0
        constraints.gridwidth = 2; // Set the width of the component to span 2 columns
        constraints.insets = new Insets(5, 5, 5, 5); // Add some spacing around the component

        panel.add(textFieldLabels[0], constraints);

        constraints.gridx = 2; // Reset the x position to 0
        constraints.gridy = 0; // Set the y position to 1
        constraints.gridwidth = 1; // Set the width of the component to span 1 column

        panel.add(textFields[0], constraints); // Add the text field to the panel

        constraints.gridx = 0; // Reset the x position to 0
        constraints.gridy = 2; // Set the y position to 1
        constraints.gridwidth = 1; // Set the width of the component to span 1 column

        panel.add(textFieldLabels[1], constraints);

        constraints.gridx = 2; // Reset the x position to 0
        constraints.gridy = 2; // Set the y position to 1
        constraints.gridwidth = 1; // Set the width of the component to span 1 column

        panel.add(textFields[1], constraints); // Add the text field to the panel

        constraints.gridx = 1; // Reset the x position to 0
        constraints.gridy = 1; // Set the y position to 1
        constraints.gridwidth = 0; // Set the width of the component to span 1 column

        panel.add(comboBox, constraints); // Add the combo box to the panel

        constraints.gridx = 0; // Set the x position to 1
        constraints.gridy = 10; // Set the y position to 1
        // constraints.gridwidth = 1; // Set the width of the component to span 1 column

        panel.add(button, constraints); // Add the button to the panel

        add(panel); // Add the panel to the frame at the center

        // Set the frame size and make it visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
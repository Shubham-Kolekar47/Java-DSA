import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    String num1 = "", num2 = "", operator = "";

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Text field
        tf = new JTextField();
        tf.setFont(new Font("Arial", Font.BOLD, 20));
        tf.setHorizontalAlignment(JTextField.RIGHT);
        add(tf, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","C","=","+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            tf.setText(tf.getText() + command);
        }
        else if (command.equals("C")) {
            tf.setText("");
            num1 = num2 = operator = "";
        }
        else if (command.equals("=")) {
            num2 = tf.getText();
            double result = calculate();
            tf.setText(String.valueOf(result));
            num1 = String.valueOf(result);
        }
        else { // operators
            num1 = tf.getText();
            operator = command;
            tf.setText("");
        }
    }

    double calculate() {
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);

        switch (operator) {
            case "+": return n1 + n2;
            case "-": return n1 - n2;
            case "*": return n1 * n2;
            case "/": 
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                    return 0;
                }
                return n1 / n2;
        }
        return 0;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

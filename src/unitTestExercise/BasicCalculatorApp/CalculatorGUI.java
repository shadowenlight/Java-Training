package unitTestExercise.BasicCalculatorApp;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame implements ActionListener {

    private JTextField textField;
    private char operator;
    private double num1;
    private JPanel panel;

    public CalculatorGUI() {
        super("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(new Font("Arial", Font.PLAIN, 30));
        add(textField, BorderLayout.NORTH);

        panel = new JPanel(new GridLayout(5, 4, 10, 10));
        String[] buttons = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" ,"C"};

        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.addActionListener(this);
            btn.setFont(new Font("Arial", Font.PLAIN, 30));
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        char cmd = command.charAt(0);

        if (Character.isDigit(cmd) || cmd == '.') {
            textField.setText(textField.getText() + command);
        } else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/") || command.equals("C")) {
            num1 = Double.parseDouble(textField.getText());
            operator = cmd;
            textField.setText("");
        } else if (command.equals("=")) {
            double num2 = Double.parseDouble(textField.getText());
            double result=0.0;

            switch (operator) {
                case '-':
                    result = CalculatorFunctions.subtract(num1, num2);
                    break;
                case '+':
                    result = CalculatorFunctions.add(num1, num2);
                    break;
                case '*':
                    result = CalculatorFunctions.multiply(num1, num2);
                    break;
                case '/':
                    result = CalculatorFunctions.divide(num1, num2);
                    break;
                case 'C':
                	result = 0.0;
                	break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }

            textField.setText(String.valueOf(result));
        } else {
            throw new IllegalArgumentException("Invalid command: " + command);
        }
    }
}
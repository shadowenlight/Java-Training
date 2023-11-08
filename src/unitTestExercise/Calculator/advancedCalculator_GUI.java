package unitTestExercise.Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;

public class advancedCalculator_GUI extends JFrame implements ActionListener {
	advancedCalculator_Operations operation = new advancedCalculator_Operations();
	private JTextField textField;
	char operator;
	private double num1;
	private JPanel panel;
	
	public advancedCalculator_GUI() {
		super("Calculator");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setLocationRelativeTo(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createDashedBorder(Color.black),
				BorderFactory.createRaisedBevelBorder()));
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setFont(new Font("Arial", Font.PLAIN, 25));
		add(textField, BorderLayout.NORTH);
		
		panel = new JPanel(new GridLayout(5, 4, 10, 10));
		String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", 
				"1", "2", "3", "-", "0", ".", "=", "+", "C", "^", "r"};
		
		for(String button: buttons) {
			JButton btn = new JButton(button);
			btn.addActionListener(this);
			btn.setFont(new Font("Arial", Font.PLAIN, 25));
			panel.add(btn);
		}
		
		add(panel, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		char cmd=command.charAt(0);
		
		if(Character.isDigit(cmd) || cmd == '.')
			textField.setText(textField.getText() + command);
		else if(command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/") || command.equals("^") || command.equals("r") || command.equals("C")) {
			num1 = Double.parseDouble(textField.getText());
			operator = cmd;
			textField.setText("");
		}
		else if(command.equals("=")) {
			double num2 = Double.parseDouble(textField.getText());
			double result = 0.0;
			
			switch(operator) {
			case '+':
				result = operation.Add(num1, num2);
				break;
			case '-':
				result = operation.Sub(num1, num2);
				break;				
			case '*':
				result = operation.Mul(num1, num2);
				break;
			case '/':
				result = operation.Div(num1, num2);
				break;
			case '^':
				result = operation.Power(num1, num2);
				break;
			case 'r':
				result = operation.SquareRoot(num1);
				break;
			case 'C':
				result = 0.0;
			default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
			}
			textField.setText(String.valueOf(result));
		}
		else
			throw new IllegalArgumentException("Invaild command " + command);			
	}
}

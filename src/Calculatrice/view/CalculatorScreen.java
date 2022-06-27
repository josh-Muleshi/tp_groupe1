package Calculatrice.view;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorScreen extends JFrame implements ActionListener {
    private static JTextField inputBox;
    public CalculatorScreen(){}
    public static void createWindow() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    private static void createUI(JFrame frame) {
        JPanel panel = new JPanel();
        CalculatorScreen calculator = new CalculatorScreen();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);

        inputBox = new JTextField(10);
        inputBox.setEditable(false);

        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonDivide = new JButton("/");
        JButton buttonMultiply = new JButton("x");
        JButton buttonClear = new JButton("C");
        JButton buttonDot = new JButton(".");
        JButton buttonEquals = new JButton("=");

        button1.addActionListener(calculator);
        button2.addActionListener(calculator);
        button3.addActionListener(calculator);
        button4.addActionListener(calculator);
        button5.addActionListener(calculator);
        button6.addActionListener(calculator);
        button7.addActionListener(calculator);
        button8.addActionListener(calculator);
        button9.addActionListener(calculator);
        button0.addActionListener(calculator);

        buttonPlus.addActionListener(calculator);
        buttonMinus.addActionListener(calculator);
        buttonDivide.addActionListener(calculator);
        buttonMultiply.addActionListener(calculator);
        buttonClear.addActionListener(calculator);
        buttonDot.addActionListener(calculator);
        buttonEquals.addActionListener(calculator);

        inputBox.setBounds(20,20,260,30);
        button7.setBounds(20,70,50,40);
        button8.setBounds(90,70,50,40);
        button9.setBounds(160,70,50,40);
        buttonClear.setBounds(230,70,50,40);
        button4.setBounds(20,130,50,40);
        button5.setBounds(90,130,50,40);
        button6.setBounds(160,130,50,40);
        buttonDivide.setBounds(230,130,50,40);
        button1.setBounds(20,190,50,40);
        button2.setBounds(90,190,50,40);
        button3.setBounds(160,190,50,40);
        buttonMultiply.setBounds(230,190,50,40);
        buttonDot.setBounds(20,250,50,40);
        button0.setBounds(90,250,50,40);
        buttonPlus.setBounds(160,250,50,40);
        buttonMinus.setBounds(230,250,50,40);
        buttonEquals.setBounds(100,310,100,40);
        frame.add(inputBox);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonDivide);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(buttonMultiply);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(buttonMinus);
        frame.add(buttonDot);
        frame.add(button0);
        frame.add(buttonEquals);
        frame.add(buttonPlus);
        frame.add(buttonClear);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.charAt(0) == 'C') {
            inputBox.setText("");
        } else if (command.charAt(0) == '=') {
            inputBox.setText(evaluate(inputBox.getText()));
        } else {
            inputBox.setText(inputBox.getText() + command);
        }
    }

    public static String evaluate(String expression) {
        char[] arr = expression.toCharArray();
        StringBuilder operand1 = new StringBuilder();
        StringBuilder operand2 = new StringBuilder();
        StringBuilder operator = new StringBuilder();
        double result = 0;

        for (char c : arr) {
            if (c >= '0' && c <= '9' || c == '.') {
                if (operator.length() == 0) {
                    operand1.append(c);
                } else {
                    operand2.append(c);
                }
            }
            if (c == '+' || c == '-' || c == '/' || c == '*') {
                operator.append(c);
            }
        }

        result = switch (operator.toString()) {
            case "+" -> (Double.parseDouble(operand1.toString()) + Double.parseDouble(operand2.toString()));
            case "-" -> (Double.parseDouble(operand1.toString()) - Double.parseDouble(operand2.toString()));
            case "/" -> (Double.parseDouble(operand1.toString()) / Double.parseDouble(operand2.toString()));
            default -> (Double.parseDouble(operand1.toString()) * Double.parseDouble(operand2.toString()));
        };
        return operand1.toString() + operator + operand2 + "=" + result;
    }
}

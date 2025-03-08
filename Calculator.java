import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame  {
    private JTextField textField;

    public Calculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(10, 10, 280, 40);
        add(textField);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.setBounds(10, 60, 280, 300);
        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "C", "=", "+"};
        for (String text : buttons) {
            JButton button = new JButton(text);

            if (text.matches("[0-9]") || text.equals("0")) {
                button.setBackground(Color.YELLOW);
            } else if (text.equals("C")) {
                button.setBackground(Color.RED);
                button.setForeground(Color.WHITE);
            } else {
                button.setBackground(Color.ORANGE);
            }

            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

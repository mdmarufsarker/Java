import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // create a currency converter gui for every currency converter

        // create a frame
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 1));

        // create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // create a label
        JLabel label = new JLabel("Enter amount in ₹: ");

        // create a text field
        JTextField textField = new JTextField(10);

        // create a button
        JButton button = new JButton("Convert");

        // add label, text field and button to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // add panel to the frame
        frame.add(panel);

        // create a panel
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

        // create a label
        JLabel label2 = new JLabel("Enter amount in ৳: ");

        // create a text field
        JTextField textField2 = new JTextField(10);

        // create a button
        JButton button2 = new JButton("Convert");

        // add label, text field and button to the panel
        panel2.add(label2);
        panel2.add(textField2);
        panel2.add(button2);

        // add panel to the frame
        frame.add(panel2);

        // create a panel
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());

        // create a label
        JLabel label3 = new JLabel("Enter amount in $: ");

        // create a text field
        JTextField textField3 = new JTextField(10);

        // create a button
        JButton button3 = new JButton("Convert");

        // add label, text field and button to the panel
        panel3.add(label3);
        panel3.add(textField3);
        panel3.add(button3);

        // add panel to the frame
        frame.add(panel3);

        // add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // get the text from the text field
                String text = textField.getText();

                // convert the text to double
                double amount = Double.parseDouble(text);

                // create a currency converter
                CurrencyConverter converter = new RupeeToBDT();

                // convert the amount
                double convertedAmount = converter.convert(amount);

                // set the text of the text field
                textField2.setText(String.valueOf(convertedAmount));

                // create a currency converter
                converter = new RupeeToUSD();

                // convert the amount
                convertedAmount = converter.convert(amount);

                // set the text of the text field
                textField3.setText(String.valueOf(convertedAmount));
            }
        });
    
        // add action listener to the button 
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // get the text from the text field
                String text = textField2.getText();

                // convert the text to double
                double amount = Double.parseDouble(text);

                // create a currency converter
                CurrencyConverter converter = new BDTToRupee();

                // convert the amount
                double convertedAmount = converter.convert(amount);

                // set the text of the text field
                textField.setText(String.valueOf(convertedAmount));

                // create a currency converter
                converter = new BDTToUSD();

                // convert the amount
                convertedAmount = converter.convert(amount);

                // set the text of the text field
                textField3.setText(String.valueOf(convertedAmount));
            }
        });

        // add action listener to the button
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // get the text from the text field
                String text = textField3.getText();

                // convert the text to double
                double amount = Double.parseDouble(text);

                // create a currency converter
                CurrencyConverter converter = new USDToRupee();

                // convert the amount
                double convertedAmount = converter.convert(amount);

                // set the text of the text field
                textField.setText(String.valueOf(convertedAmount));

                // create a currency converter
                converter = new USDToBDT();

                // convert the amount
                convertedAmount = converter.convert(amount);

                // set the text of the text field
                textField2.setText(String.valueOf(convertedAmount));
            }
        });

        // make the frame visible
        frame.setVisible(true);
    }
}

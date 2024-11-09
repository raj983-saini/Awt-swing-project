import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;


public class MyGUI extends JFrame implements ActionListener {
    private Label amountLabel, resultLabel, sourceCurrencyLabel, targetCurrencyLabel;
    private TextField amountTextField, resultTextField;
    private Button convertButton;
    private Choice sourceCurrencyChoice, targetCurrencyChoice;

    public MyGUI() {
        this.setTitle("Currency Converter");
        this.setSize(500, 500);
        this.setLayout (new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        amountLabel = new Label("Amount:");
        amountLabel.setPreferredSize(new Dimension(200,100));
        this.add(amountLabel);

        amountTextField = new TextField();
        amountTextField.setPreferredSize(new Dimension(200,100));
        this.add(amountTextField);

        sourceCurrencyLabel = new Label("From:");
        sourceCurrencyLabel.setPreferredSize(new Dimension(200,100));
        this.add(sourceCurrencyLabel);

        sourceCurrencyChoice = new Choice();
       sourceCurrencyChoice .setPreferredSize(new Dimension(200,100));
        sourceCurrencyChoice.add("USD");
        sourceCurrencyChoice.add("EUR");
        sourceCurrencyChoice.add("INR");

        // Add more currencies as needed
        this.add(sourceCurrencyChoice);

        targetCurrencyLabel = new Label("To:");
        targetCurrencyLabel.setPreferredSize(new Dimension(200,100));
        this.add(targetCurrencyLabel);

        targetCurrencyChoice = new Choice();
        targetCurrencyChoice.setPreferredSize(new Dimension(200,100));
        targetCurrencyChoice.add("USD");
        targetCurrencyChoice.add("EUR");
        targetCurrencyChoice.add("INR");
        // Add more currencies as needed
        this.add(targetCurrencyChoice);

        resultLabel = new Label("Result:");
        resultLabel.setPreferredSize(new Dimension(200,100));
        this.add(resultLabel);

        resultTextField = new TextField();
        resultTextField.setPreferredSize(new Dimension(200,100));
        resultTextField.setEditable(false);
        this. add(resultTextField);

        convertButton = new Button("Convert");
        convertButton.addActionListener(this);
        this.add(convertButton);

        this.setVisible(true);
    }
    String amountStr;
    String sourceCurrency;
    String targetCurrency;
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            amountStr = amountTextField.getText();
             sourceCurrency = sourceCurrencyChoice.getSelectedItem();
             targetCurrency = targetCurrencyChoice.getSelectedItem();
        }
       String usd = "USD";
        String eur = "EUR";
        String inr = "INR";

    if (sourceCurrency.equals(usd)  && targetCurrency.equals(eur)  ){
        int a = Integer.parseInt(String.valueOf(amountStr));
        double result = a*  0.85;
       resultTextField.setText(String.valueOf(result));
    }
    if (sourceCurrency.equals(usd)  && targetCurrency.equals(inr)  ){
        int a = Integer.parseInt(String.valueOf(amountStr));
        double result = a* 83.31;
       resultTextField.setText(String.valueOf(result));
    }
    if (sourceCurrency.equals(eur)  && targetCurrency.equals(inr)  ){
        int a = Integer.parseInt(String.valueOf(amountStr));
        double result = a* 89.38;
       resultTextField.setText(String.valueOf(result));
    }
        if (sourceCurrency.equals(eur)  && targetCurrency.equals(usd)  ){
            int a = Integer.parseInt(String.valueOf(amountStr));
            double result = a* 1.18;
            resultTextField.setText(String.valueOf(result));
        }
        if (sourceCurrency.equals(usd)  && targetCurrency.equals(usd)  ||
                sourceCurrency.equals(eur)  && targetCurrency.equals(eur) )
        {

            resultTextField.setText("Same Currency");
        }

    }
    public static void main(String[] args) {
        new MyGUI();
    }
}

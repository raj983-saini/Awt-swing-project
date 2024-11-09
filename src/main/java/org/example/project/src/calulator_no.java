

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class calulator_no implements ActionListener {

            JFrame frame;
             Button b[] = new Button[10];
             Button add, subtract, multiply, divide,clr,equal, decimal;
              TextField textField;
             Label label;
             Panel panel;


         static GridLayout g;
         static  Font  myfont = new Font("MV Boli" , Font.ITALIC, 30);
       static   double num1 = 0, num2 = 0  ,result = 0;
       static char   op;

            public void Frame() {
                frame = new JFrame("first Frame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(450, 500);
                frame.setLayout(null );
                frame.setVisible(true);
                 frame.add(textField);
                frame.add(panel);

            }
    public void Buttons() {

              add =  new Button( " +");
              subtract =  new Button( " -");
              multiply=  new Button( " *");
              divide=  new Button( " /");
              clr =  new Button( " CLR");
              equal = new Button("=");
         //     decimal = new Button(".");

             // funbutton[6] = decimal  ;
          add.addActionListener(this);
          subtract.addActionListener(this);
          divide.addActionListener(this);
          multiply.addActionListener(this);
          clr.addActionListener(this);
          equal.addActionListener(this);

              add.setFont(myfont);
              subtract.setFont(myfont);
              multiply.setFont(myfont);
              divide .setFont(myfont);
              clr.setFont(myfont);
              equal.setFont(myfont);
           //   decimal.setFont(myfont);

              for (int i = 0; i<=9 ;i++){
                  b[i] = new Button(String.valueOf(i));
                  b[i].addActionListener(this);
                  b[i].setFont(myfont);
              }
            }
         // panel for arrange the button in grid layout
    public void panels() {
                panel = new Panel();
                panel.setBounds(50, 100, 300,300);
                panel.setLayout(new GridLayout(4,4));

                panel.add(b[1]);
                panel.add(b[2]);
                panel.add(b[3]);
                panel.add(add);

                panel.add(b[4]);
                panel.add(b[5]);
                panel.add(b[6]);
                panel.add(subtract);

                panel.add(b[7]);
                panel.add(b[8]);
                panel.add(b[9]);
                panel.add(multiply);

                 panel.add(clr);
                 panel.add(b[0]);
                panel.add(divide);
                panel.add(equal);



    }
    // for text field to show number
public void TextArea(){
textField = new TextField();
textField.setBounds(50,25, 300,50);
textField.setFont(myfont );

}

    public static void main(String[] args) {

        calulator_no a = new calulator_no();
               a.Buttons();
               a.panels();
               a.TextArea();
               a.Frame();
            }

            // for logic opertion
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i <= 9; i++) {
            if (e.getSource() == b[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
                System.out.println("Digit");
            }
        }
        if (e.getSource() == add) {
            System.out.println("add");
            num1 = Double.parseDouble(textField.getText());
            op = '+';

            textField.setText("");
        }
        if (e.getSource() == subtract) {
            System.out.println("subtract");
            num1 = Double.parseDouble(textField.getText());
            op = '-';
            textField.setText("");
        }
        if (e.getSource() == multiply) {
            System.out.println("Multipy");
            num1 = Double.parseDouble(textField.getText());
            op = '*';
            textField.setText("");
        }
        if (e.getSource() == divide) {
            System.out.println("divide");
            num1 = Double.parseDouble(textField.getText());
            op = '/';
            textField.setText("");
        }
        if (e.getSource() == equal) {
            num2 = Double.parseDouble(textField.getText());
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;

        }
        if (e.getSource() == clr)
        {
            textField.setText("");
        }
    }



}



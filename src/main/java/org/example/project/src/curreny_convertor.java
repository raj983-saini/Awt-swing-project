import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class curreny_convertor implements ActionListener {
  static   JFrame frame;
    static   JPanel panel;
    JButton [] bton = new JButton[10];
    JTextField txt;
    JButton INR , DOLLAR , POOND, EURO , CNVT , SA_RAND , PESO, JPN_YEN;
    double IST , SND , FNL;
    public  void  frame9(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(panel);
        frame.add(txt);
    }
public  void BUTON(){
        for (int i=0 ; i<= 9 ; i++ ){
            bton [i] = new JButton(String.valueOf(i));
            bton[i].addActionListener(this);
        }
        INR = new JButton(" INR");
    DOLLAR = new JButton(" DOLLAR");
    POOND = new JButton(" POOND");
    EURO = new JButton(" EURO");
    CNVT = new JButton(" CNVT");
    SA_RAND = new JButton(" SA_RAND");
    PESO = new JButton(" PESO");
    JPN_YEN = new JButton(" JPN_YEN");

    INR.addActionListener(this);
    DOLLAR.addActionListener(this );
}

public void Jpanel(){
        panel = new JPanel();
         panel.setBounds(50, 100, 300,300);
         panel.setLayout(new GridLayout(4,4));

        panel.add(bton[1]);
        panel.add(bton[2]);
        panel.add(bton[3]);
        panel.add(EURO);

        panel.add(bton[4]);
        panel.add(bton[5]);
        panel.add(bton[6]);
        panel.add(DOLLAR);

        panel.add(bton[7]);
        panel.add(bton[8]);
        panel.add(bton[9]);
        panel.add(PESO);

        panel.add(INR);
        panel.add(CNVT);
        panel.add(bton[0]);
        panel.add(JPN_YEN);
    }
    public  void txtfld(){
        txt = new JTextField();
        txt.setBounds(50,50, 300,50);
   txt.setFont(new Font(" Poppins" , Font.ITALIC , 34));
    }


    public static void main(String[] args) {
curreny_convertor c = new curreny_convertor();
c.txtfld();
c.BUTON();
c.Jpanel();
c.frame9();
    }

    @Override
    public void actionPerformed(ActionEvent e ) {

 if (e.getSource() == INR && e.getSource() == DOLLAR) {
     //    IST = Double.parseDouble(txt.getText());
     txt.setText(" ggg");}

//     for (int i = 0; i <= 9; i++) {
//         if (e.getSource() == bton[i])
//             txt.setText(txt.getText().concat(String.valueOf(i)));
//         System.out.println("ff");
//     }
//     if (e.getSource() == DOLLAR) {
//                    System.out.println("frl");
//         }

    }



}

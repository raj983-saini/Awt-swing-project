package swingpack;

import javax.swing.*;
import java.awt.*;

public class Jpanell {
      Jpanell(){
          JFrame frame = new JFrame();
          frame.setSize(800,800);
          frame.setLayout(null);
          frame.setVisible(true);

          JLabel label = new JLabel( " hlo" );
          label.setBounds( 0  , 0  , 50,50);
          label.setFont(  new Font(  " Ink free" , Font.ROMAN_BASELINE, 34));

          JPanel panel = new JPanel();
          panel.setBounds(10,10,200,200);
          panel.setBackground(Color.red);
          frame.add(panel);

          JPanel bluepanel = new JPanel();
          bluepanel.setBounds(10,210,200,200);
          bluepanel.setBackground(Color.blue);
          frame.add(bluepanel);
          bluepanel.add(label);

          JPanel greenpanel = new JPanel();
          greenpanel.setBounds(210,10,200,200);
          greenpanel.setBackground(Color.green);
          frame.add(greenpanel);

          JPanel blackpanel = new JPanel();
          blackpanel.setBounds(210,210,200,200);
          blackpanel.setBackground(Color.black);
          frame.add(blackpanel);



      }
    public static void main(String[] args) {

Jpanell j = new Jpanell();
    }
}

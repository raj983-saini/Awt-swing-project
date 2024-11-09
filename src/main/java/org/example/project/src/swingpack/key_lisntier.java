package swingpack;


import javax.swing.*;
import java.awt.*;

public class key_lisntier extends Frame      {

    JButton button = new JButton();

    key_lisntier()
{

    this.setLayout(new FlowLayout());
    this.setSize(500,500);

   button.setText("Rocket");
   button.setBackground(Color.red);
   button.setForeground(Color.white);



   this.add(button);
    this.setVisible(true);

}

    public static void main(String[] args) {
key_lisntier key = new key_lisntier();

    }
}

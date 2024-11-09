package swingpack;

import javax.swing.*;
import java.awt.*;

public class d_grapic  {

    d_grapic(){
        JPanel panel = new JPanel() {
            public  void    paint   (Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
//                g2d.drawLine(0, 0, 500, 500);
                g2d.fillRoundRect(0,0,100,110,20,20);
            }

        };
        JFrame frame = new JFrame();
        frame.setSize(500,500);
       panel .setPreferredSize(new Dimension(500,500));
        frame.add(panel);
        frame.setLocationRelativeTo(null);
         frame.pack();






        frame.setVisible(true);

    }




    public static void main(String[] args) {
d_grapic d = new d_grapic();
    }
}

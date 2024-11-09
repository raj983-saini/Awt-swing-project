package swingpack;

import javax.swing.*;
import java.awt.*;

public class bar {
    JProgressBar bar;
    JLabel label;
    bar(){
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);

        JPanel panel = new JPanel();
     label = new JLabel();


   bar = new JProgressBar();
   bar.setBackground(Color.white);
   bar.setForeground(Color.red);
   panel.add(bar);
   panel.add(label);

   frame.add(panel);
   frame.setVisible(true);
fill();

    }
public  void fill   (){
        int count = 0;
        while   ( count <= 100){
            bar.setValue(count);
            label.setText(String.valueOf(count));

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            count += 10;
        }
}
    public static void main(String[] args) {
bar b = new bar();
    }
}

import javax.swing.*;
import java.awt.*;

public class tws extends JFrame {
    tws(){
        this.setSize(450,450);
        this.setLayout(null);

        JTextField te = new JTextField();
        te.setBounds(0,0,100,100);

        te.setText("hello");
        te.setText("hello77");

        this.add(te);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        tws  tt =new tws();
    }
}

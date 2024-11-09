package swingpack;

import javax.swing.*;
import java.awt.*;

public class BODERLAYOUT {
    BODERLAYOUT(){
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        JPanel blackpanel = new JPanel();
        blackpanel.setBackground(Color.black);

        panel.setPreferredSize(new Dimension(100,100));
        bluepanel.setPreferredSize(new Dimension(100,100));
        blackpanel.setPreferredSize(new Dimension(100,100));
        greenpanel.setPreferredSize(new Dimension(100,100));

        frame.add(blackpanel, BorderLayout.NORTH );
        frame.add(panel , BorderLayout.WEST );
        frame.add(bluepanel, BorderLayout.SOUTH );
        frame.add(greenpanel, BorderLayout.EAST );
    }

    public static void main(String[] args) {
BODERLAYOUT lay = new BODERLAYOUT();
    }
}

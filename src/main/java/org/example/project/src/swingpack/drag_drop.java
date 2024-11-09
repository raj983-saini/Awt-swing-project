
package swingpack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class drag_drop extends  JPanel{
    ImageIcon icon = new ImageIcon("C:\\Users\\raj98\\Downloads\\png-2709031_640.png");
    final int width = icon.getIconWidth();
    final int  height = icon.getIconHeight();
    Point imagecorner;
    Point prepvt;
    drag_drop(){
     imagecorner = new Point(0,0);
     Clicklistner c = new Clicklistner();
     draglistner d = new draglistner();
        this.addMouseListener(c);
        this.addMouseMotionListener(d);

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        icon.paintIcon(this, g, (int) imagecorner.getX(), (int) imagecorner.getY());
    }

    private class Clicklistner extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            prepvt = e.getPoint();
        }
    }

    private class draglistner extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            Point current_p = e.getPoint();
            imagecorner.translate(
                    (int) (current_p.getX() - prepvt.getX()),
                    (int) (current_p.getY() - prepvt.getY())
            );
            prepvt = current_p;
            repaint();
        }

}

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new drag_drop());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}


package swingpack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DragDrop extends JPanel {
    JLabel label;
    int offsetX, offsetY;

    public DragDrop() {
        setLayout(new FlowLayout(FlowLayout.LEFT)); // Use FlowLayout with LEFT alignment

        label = new JLabel("Drag me");
        add(label);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                offsetX = e.getX();
                offsetY = e.getY();
            }
        });

        label.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();

                int newX = x - offsetX;
                int newY = y - offsetY;

                label.setLocation(newX, newY);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new DragDrop());
            frame.setSize(300, 300);
            frame.setVisible(true);
        });
    }
}

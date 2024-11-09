package swingpack;

import javax.swing.*;
import java.awt.*;

public class jframe {
    jframe() {
        JFrame frame = new JFrame("JFrame with Image");
        frame.setSize(900, 900);
        frame.setLayout(null);

        // Load the image
        ImageIcon image = new ImageIcon("C:\\Users\\raj98\\Downloads\\pinup-1729057_640.png");

        // Create and customize the label
        JLabel lab = new JLabel("Inner Label");
        lab.setBounds(10, 10, 700, 700); // Set the bounds of the label
        lab.setOpaque(true); // Make the label opaque
        lab.setBackground(Color.red); // Set the background color of the label
        lab.setForeground(Color.pink); // Set the foreground color of the label
        lab.setHorizontalTextPosition(JLabel.CENTER); // Set the horizontal text position to center
        lab.setVerticalTextPosition(JLabel.CENTER); // Set the vertical text position to center
        lab.setHorizontalAlignment(JLabel.LEFT); // Set the horizontal alignment of the label
        lab.setVerticalAlignment(JLabel.BOTTOM); // Set the vertical alignment of the label

        // Set the image icon to the label
        lab.setIcon(image);

        // Add the label to the frame
        frame.add(lab);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        jframe n = new jframe();
    }
}

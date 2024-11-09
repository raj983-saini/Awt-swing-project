package swingpack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistner_ implements KeyListener {
JLabel label = new JLabel();
    keylistner_ (){
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);


label.setBounds(0,0,100,100);
label.setOpaque(true);
label.setBackground(Color.black);
frame.addKeyListener(this);
frame.add(label);
frame.setVisible(true);
    }

    public static void main(String[] args) {
        keylistner_  k = new keylistner_();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'w':
                System.out.println("w");
                label.setLocation(label.getX() , label.getY()-1);
                break;
            case 'a':
                System.out.println("a");
                label.setLocation(label.getX()-1 , label.getY());
                break;
            case 's':
                System.out.println("s");
                label.setLocation(label.getX() , label.getY()+1);
                break;
            case 'd':

                label.setLocation(label.getX()+1 , label.getY());

                System.out.println("d");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

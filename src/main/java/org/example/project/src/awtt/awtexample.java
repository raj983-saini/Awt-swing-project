package org.example.project.src.awtt;//package awtt;
//import java.awt.*;
//import java.awt.event.*;
//
//
//public class awtexample implements WindowListener {
//    static Frame frame;
//    static Button b;
//    static  TextArea textArea;
//    static Label label;
//
//    public void Frame() {
//        frame = new Frame("first Frame");
//        frame.setSize(400, 300);
//        frame.setLayout(null);
//        frame.setVisible(true);
//        frame.add(b);
//        frame.add(label);
//        frame.addWindowListener(this);
//frame.add(textArea);
//    }
//
//
//
//
//    public static void buton() {
//        b = new Button(" click here");
//        b.setBounds(100, 50, 150, 70); // Adjusted position
//        b.setSize(150, 70);
//        b.setVisible(true);
//b.addActionListener(new ActionListener() {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        label.setText("second");
//    }
//}
//
//
//);
//    }
//
//    public static void Labels() {
//        label = new Label(" first");
//        label.setBounds(50, 50, 150, 70);
//        label.setSize(150, 70);
//        label.setVisible(true);
//
//
//    }
//    public static void testfield(){
//        textArea = new TextArea();
//        textArea.setBounds(50, 100, 150, 70);
//        textArea.setVisible(true);
//        textArea.setSize(500, 150);
//        textArea.setBackground( Color.red);
//        textArea.setForeground(Color.white);
//
//    }
//
//    public static void main(String[] args) {
//
//        awtexample a = new awtexample();
//        a.buton();
//        a.Labels();
//        a.testfield();
//        a.Frame();
//    }
//
//
//    @Override
//    public void windowOpened(WindowEvent e) {
//        System.out.println("opening");
//    }
//    @Override
//    public void windowClosing(WindowEvent e) {
//        Frame frame = (Frame) e.getSource();
//        frame.dispose();
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e) {
//        System.out.println("closed");
//    }
//
//    @Override
//    public void windowIconified(WindowEvent e) {
//        System.out.println("windowIconified");
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//        System.out.println("windowDeiconified");
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//        System.out.println("windowActivated");
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//        System.out.println("windowDeactivated");
//    }
//}

package swingpack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class task_bar {
    task_bar(){
        JFrame frame = new JFrame();
        frame.setSize( 500 ,500);
        frame.setLayout(null);
JMenuBar  mb = new JMenuBar();
mb.setBounds(0,0,1000,20);
JMenu files = new JMenu("File");
JMenu edit = new JMenu(" edit");
JMenu help = new JMenu(" help");

JMenuItem New = new JMenuItem("New"    );
JMenuItem sane = new JMenuItem("Save");
JMenuItem load = new JMenuItem("Load");

New.setMnemonic(KeyEvent.VK_N);
sane.setMnemonic(KeyEvent.VK_S);


files.add(New);
files.add(sane);
files.add(load);

mb.add(files);
mb .add(edit);
mb.add(help);

frame.add(mb);

frame.setVisible(true);

    }

    public static void main(String[] args) {
        task_bar t = new task_bar();
    }

}

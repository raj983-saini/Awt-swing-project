import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class skl_mag extends JFrame implements  ActionListener {
    ImageIcon btnim2 = new ImageIcon("C:\\Users\\raj98\\OneDrive\\Pictures\\reg.jpg");
    ImageIcon btnim3 = new ImageIcon("C:\\Users\\raj98\\Downloads\\school1.png");
    ImageIcon btnim = new ImageIcon("C:\\Users\\raj98\\Downloads\\document1.png");
    JButton button = new JButton();
    JButton button2 = new JButton();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel pane2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel label = new JLabel("SCHOOL MANAGMENT");
    JLabel label1 = new JLabel(" REGISTRATION");
    JLabel label2 = new JLabel(" STUDENT INFO");

    skl_mag() {
        this.setSize(1000, 700);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBounds(0, 0, 1000, 100);
        panel.setBackground(Color.magenta);
        label.setFont(new Font("NSimSun", Font.PLAIN, 50));
        label.setIcon(btnim3);
        panel.add(label);

        button.setBounds(200, 200, 300, 300);
        button.setIcon(btnim2);
        button.setBackground(Color.white);
        button.addActionListener(this);

        button2.setBounds(600, 200, 300, 300);
        button2.setIcon(btnim);
        button2.setBackground(Color.white);
        button2.addActionListener(this);

        panel1.setBounds(160, 500, 350, 100);
        label1.setFont(new Font("NSimSun", Font.PLAIN, 50));
        panel1.add(label1);

        pane2.setBounds(560, 500, 350, 100);
        label2.setFont(new Font("NSimSun", Font.PLAIN, 50));
        pane2.add(label2);


        this.add(panel);
        this.add(panel1);
        this.add(pane2);
        this.add(button);
        this.add(button2);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        skl_mag s = new skl_mag();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            NEW_REGISTRATION n = new NEW_REGISTRATION();

        }
        if (e.getSource() == button2){
            STUDENT_DETAIL s = new STUDENT_DETAIL();
        }
    }
}

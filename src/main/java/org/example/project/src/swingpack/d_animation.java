package swingpack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class d_animation  extends  JPanel implements ActionListener {
    final  int Panel_width = 900;
    final  int Panel_height = 700;
    int xVelocity =1;
    int yVelocity =1;
    int x =0;
    int y =0;
    Timer timer;
    Image bird ;
    Image bg;

    d_animation(){
        JFrame frame = new JFrame();
        frame.add(this);
        this.setPreferredSize(new Dimension(Panel_width,Panel_height));
        this.setBackground(Color.black);
        bird =new ImageIcon("C:\\Users\\raj98\\Downloads\\bird-1232416_640.png").getImage();
        bg  = new ImageIcon("C:\\Users\\raj98\\Downloads\\nature-8683570_1920.jpg "  ).getImage();

        timer = new Timer(10,this);
        timer.start();

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    public  void paint(Graphics g){
        super.paintComponent(g); // paint background   from parent paint object
        Graphics2D g3d = (Graphics2D) g;
        g3d.drawImage(bg , 0, 0 , null);
        g3d.drawImage(bird,x,y,null);


    }

 public static void main(String[] args) {
d_animation d = new d_animation();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x>= Panel_width- bird.getWidth(null) || x<0){
            xVelocity = xVelocity *-1;
        }
    x = x+ xVelocity;
        if (y>= Panel_height- bird.getHeight(null) || y<0){
            yVelocity = yVelocity *-1;
        }
        y = y+ yVelocity;
    repaint();
    }
}

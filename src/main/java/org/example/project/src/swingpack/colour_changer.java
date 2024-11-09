package swingpack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class colour_changer implements ActionListener {

    JButton butn;
    JFrame frame = new JFrame(  );
    JLabel label;
    colour_changer(){
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);

         butn = new JButton("Colour change"  );
        label = new JLabel("  this is not good");
        label.setFont(new Font("MV Boli " , Font.ITALIC , 35));
butn.addActionListener(this);

frame.add(butn);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        colour_changer c= new colour_changer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == butn){
            JColorChooser cl   = new JColorChooser();
            Color color = JColorChooser.showDialog(null, " pick a colour" , Color.red);
            label.setForeground(color);
        }
    }
}

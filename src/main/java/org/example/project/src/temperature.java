import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class temperature implements ChangeListener {

    JFrame frame;
    JLabel label,label2,label3;
    JSlider slider,slider2,slider3;
temperature(){
     frame = new JFrame();
    frame.setLayout(new FlowLayout());
    frame.setSize(500,500);

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    label = new JLabel();
    label2 = new JLabel();
    label3 = new JLabel();

 slider = new JSlider( 0);
 slider2 = new JSlider( 248,523,248);
 slider3= new JSlider( 0);

 slider.setPaintTicks(true);
 slider.setMinorTickSpacing(10);
 slider.setMaximum(250);
 slider.setMinimum(-25);
 slider.setPaintTrack(true);
 slider.setMajorTickSpacing(25);
 slider.setOrientation(SwingConstants.VERTICAL);
 slider.setPaintLabels(true);
 slider.setFont(new Font(" MV Boli" , Font.PLAIN , 15));
 slider.addChangeListener(this);

 slider2.setPaintTicks(true);
 slider2.setMinorTickSpacing(10);
 slider2.setMaximum(523);
 slider2.setMinimum(248);
 slider2.setPaintTrack(true);
 slider2.setMajorTickSpacing(25);
 slider2.setOrientation(SwingConstants.VERTICAL);
 slider2.setPaintLabels(true);
 slider2.setFont(new Font(" MV Boli" , Font.PLAIN , 15));
 slider2.addChangeListener(this);

 slider3.setPaintTicks(true);
 slider3.setMinorTickSpacing(10);
 slider3.setMaximum(250);
 slider3.setMinimum(-25);
 slider3.setPaintTrack(true);
 slider3.setMajorTickSpacing(25);
 slider3.setOrientation(SwingConstants.VERTICAL);
 slider3.setPaintLabels(true);
 slider3.setFont(new Font(" MV Boli" , Font.PLAIN , 15));
 slider3.addChangeListener(this);

   label.setText("C" + slider.getValue() );
panel.add(slider);
    label2.setText("K" + slider2.getValue() );
panel.add(slider2);
    label3.setText("F" + slider3.getValue() );
panel.add(slider3);

frame.add(label);
frame.add(label2);
frame.add(label3);
frame.add(panel);
frame.setVisible(true);


}



    public static void main(String[] args) {
temperature t = new temperature();

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C" + slider.getValue() );
int a = 273+ slider.getValue();
slider2.setValue(a);

        label2.setText("k" +   slider2.getValue());


}

}

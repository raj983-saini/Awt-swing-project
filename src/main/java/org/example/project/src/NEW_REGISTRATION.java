import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class NEW_REGISTRATION extends JFrame implements ActionListener {
//   STUDENT_DETAIL s = new STUDENT_DETAIL();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();

    JLabel label = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JTextField text = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JTextField text4 = new JTextField();
    JTextField text5 = new JTextField();
    JButton SAVE = new JButton("Submit");
Font f = new Font("NSimSun" , Font.PLAIN,40 );

    NEW_REGISTRATION(){
    this.setSize(900,700);
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel.setBounds(50,50,600,75);
    panel2.setBounds(50,150,600,75);
    panel3.setBounds(50,250,600,75);
    panel4.setBounds(50,350,600,75);
    panel5.setBounds(50,450,600,75);

    panel.setLayout(null);
    panel2.setLayout(null);
    panel3.setLayout(null);
    panel4.setLayout(null);
    panel5.setLayout(null);
    label.setBounds(50,0, 300,70);
    label2.setBounds(50,0, 300,70);
    label3.setBounds(50,0, 300,70);
    label4.setBounds(50,0, 300,70);
    label5.setBounds(50,0, 300,70);
    label2.setText("FIRST NAME  ");
    label3.setText("LAST NAME ");
    label4.setText("FATHER NAME ");
    label.setText("CONTACT ");
    label5.setText("ADDRESS ");

 label.setFont(f);
 label2.setFont(f);
 label3.setFont(f);
 label4.setFont(f);
 label5.setFont(f);


        text.setBounds(300,0, 300,50);
        text2.setBounds(300,0, 300,50);
        text3.setBounds(300,0, 300,50);
        text4.setBounds(300,0, 300,50);
        text5.setBounds(300,0, 300,50);


        text.setFont(f);
        text2.setFont(f);
        text3.setFont(f);
        text4.setFont(f);
        text5.setFont(f);

   panel.add(label);
   panel2.add(label2);
   panel3.add(label3);
   panel4.add(label4);
   panel5.add(label5);

   panel.add(text);
   panel2.add(text2);
   panel3.add(text3);
   panel4.add(text4);
   panel5.add(text5);

   SAVE.setBounds(550,550,100,50);
   SAVE.addActionListener(this);

   this.add(SAVE);
   this.add(panel);
   this.add(panel2);
   this.add(panel3);
   this.add(panel4);
   this.add(panel5);
   this.setVisible(true);

    }
    private void saveTextToFile() {
        try {
            FileWriter writer = new FileWriter("text.txt" , true); // true parameter appends to the file
            writer.write(       text.getText()+ "      ");
            writer.write(       text2.getText()+"         ");
            writer.write(       text3.getText()+"           ");
            writer.write(       text4.getText()+"           ");
            writer.write(text5.getText() +"\n");

            writer.close();
            JOptionPane.showMessageDialog(this, "Text saved successfully!");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving text!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SAVE){
            if (text.getText().equals("") ||text2.getText().equals("") ||text3.getText().equals("") ||text4.getText().equals("") ||text5.getText().equals("") ){
                JOptionPane.showMessageDialog(this, "Insert the value!");
        }
        else {
            saveTextToFile();
        }
    }
}

}

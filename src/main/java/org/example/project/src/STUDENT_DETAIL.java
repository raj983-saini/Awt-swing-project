import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class STUDENT_DETAIL extends JFrame {
    JLabel lab= new JLabel();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JButton  save = new JButton("SAVE");
    JButton  edit = new JButton("EDIT");
    public static  JTextArea  detail = new JTextArea();
    STUDENT_DETAIL (){
this.setSize(1100,900);
this .setLayout(null);
detail.setBounds(50,120,1000,600);
panel.setBounds(50,55,1000,60);
save.setBounds(0 , 0 , 50 , 30);
edit.setBounds(60 , 0 , 50 , 30);
panel.setLayout(null);
lab.setBounds(0,0,1000,60);
lab.setFont(new Font( "NSimSun" , Font.PLAIN, 25));
lab.setText(   "CONTACT     "   +"    NAME         "  +"LAST NAME        " + " FATHER NAME        "+ "ADDRESS  "  );
this.add(save);
this.add(edit);
 this .add(panel);
 panel.add(lab);
 loadTextFromFile();

this.add(detail);
this.setVisible(true);
    }

private void loadTextFromFile() {
    try {
        File file = new File("text.txt");
        if (file.exists()) {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            int lineNumber = 0;
            while ((line = bufferedReader.readLine()) != null) {
                JTextField textField = new JTextField(line);
                textField.setBounds(50, 120 + lineNumber * 50, 1000, 50); // Adjust position and size as needed
                textField.setFont(new Font( "NSimSun" , Font.PLAIN, 25));
                add(textField); // Assuming you are adding to a container like a JPanel
                textField.setEditable(false);
                edit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == edit){
                            textField.setEditable(true);
                        }
                    }
                }
                );
                save.addActionListener(new ActionListener() {
          @Override public void actionPerformed(ActionEvent e) {
         if (e.getSource() == save){textField.setEditable(false);}
          }}

          );
                lineNumber++;
            }
            reader.close();
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading text!", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

}

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class text_editor extends JFrame implements ActionListener {
    JTextArea area = new JTextArea();
    JScrollPane scrol;
    JSpinner fontsize ;
    JButton colourchange;
    JComboBox Fontbox;
    JMenuBar  menuBar = new JMenuBar();
    JMenu File = new JMenu("File");
    JMenuItem Load = new JMenuItem("Load");
    JMenuItem Save  = new JMenuItem("Save");
    JMenuItem Exit  = new JMenuItem("Exit");




text_editor (){
    this.setSize(1000,1000);
    this.setLayout(new FlowLayout());
    this.setLocationRelativeTo(null);

    area.setFont(new Font("Arial", Font.PLAIN, 20));
    area.setLineWrap(true);
    area.setWrapStyleWord(true);

     scrol = new JScrollPane(area);
     scrol.setPreferredSize(new Dimension(950,950));
     scrol.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

     fontsize = new JSpinner();
     fontsize.setPreferredSize(new Dimension(50,20));
     fontsize.setValue(20);
     fontsize.addChangeListener(new ChangeListener() {
         @Override
         public void stateChanged(ChangeEvent e) {
             area.setFont(new Font(area.getFont().getFamily(),Font.PLAIN,(int) fontsize.getValue()));
         }
     });

colourchange = new JButton("Colour");
colourchange.addActionListener(this);


    String font[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    Fontbox = new JComboBox(font);
    Fontbox.setSelectedItem("Arial");
    Fontbox.addActionListener(this);

    //-----------Menu---------

    menuBar.add(File);
    File.add(Load);
    File.add(Save);
    File.add(Exit);

    Load.addActionListener(this);
    Save.addActionListener(this);
    Exit.addActionListener(this);


    //-----------Menu---------

this.setJMenuBar(menuBar);
    this.add(Fontbox);
     this.add(colourchange);
     this.add(fontsize);
    this.add(scrol);
    this.setVisible(true);
    }

    public static void main(String[] args) {
text_editor t  = new text_editor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == colourchange)
        {
          JColorChooser chooser = new JColorChooser();
          Color color = JColorChooser.showDialog(null,"color", Color.black);
          area.setForeground(color);
    }

        if (e.getSource() == Fontbox){
            area.setFont(new Font((String) Fontbox.getSelectedItem(), Font.PLAIN , area.getFont().getSize()));
        }

        if (e.getSource() == Save){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));

            int response = fileChooser.showSaveDialog(null  ) ;
            if (response == JFileChooser.APPROVE_OPTION){
                File file;
                PrintWriter out = null;
                file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    out = new PrintWriter(file);
                    out.println(area.getText());
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                finally {
                    out.close();
                }
            }
        }
        if (e.getSource() == Load){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));

            int response = fileChooser.showSaveDialog(null  ) ;
            if (response == JFileChooser.APPROVE_OPTION) {
               File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                Scanner filein = null ;

                    try {
                        filein = new Scanner(file);
                        if (file.isFile()) {
                            while (filein.hasNext()) {
                                String line = filein.nextLine() + "\n";
                                area.append(line);
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    finally {filein.close();
                }
            }
        }
        if (e.getSource() == Exit){
            System.exit(0);
        }
}}

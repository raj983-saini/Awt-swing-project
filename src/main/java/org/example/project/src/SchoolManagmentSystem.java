import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SchoolManagmentSystem extends JFrame {
    private JTextField studentNameField;
    private JTextField studentAgeField;
    private JComboBox<String> classComboBox;
    private JTextArea displayArea;
    private Map<String, ArrayList<String>> classMap; // Map to store class-wise student details

    public SchoolManagmentSystem() {
        setTitle("School Management System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        initComponents();
        classMap = new HashMap<>();
    }

    private void initComponents() {
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Student Name:"));
        studentNameField = new JTextField();
        inputPanel.add(studentNameField);
        inputPanel.add(new JLabel("Student Age:"));
        studentAgeField = new JTextField();
        inputPanel.add(studentAgeField);
        inputPanel.add(new JLabel("Select Class:"));
        classComboBox = new JComboBox<>();
        classComboBox.addItem("Class A");
        classComboBox.addItem("Class B");
        inputPanel.add(classComboBox);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        JButton viewButton = new JButton("View Students");
        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewStudents();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);

        displayArea = new JTextArea(15, 30);
        displayArea.setEditable(false);

        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        getContentPane().add(new JScrollPane(displayArea), BorderLayout.SOUTH);
    }

    private void addStudent() {
        String name = studentNameField.getText();
        String age = studentAgeField.getText();
        String selectedClass = (String) classComboBox.getSelectedItem();
        if (!name.isEmpty() && !age.isEmpty()) {
            if (!classMap.containsKey(selectedClass)) {
                classMap.put(selectedClass, new ArrayList<>());
            }
            classMap.get(selectedClass).add("Name: " + name + ", Age: " + age);
            displayArea.append("Student added to " + selectedClass + ": " + name + ", Age: " + age + "\n");
            studentNameField.setText("");
            studentAgeField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter student name and age.");
        }
    }

    private void viewStudents() {
        String selectedClass = (String) classComboBox.getSelectedItem();
        if (classMap.containsKey(selectedClass)) {
            displayArea.append("\nStudents in " + selectedClass + ":\n");
            for (String student : classMap.get(selectedClass)) {
                displayArea.append(student + "\n");
            }
        } else {
            displayArea.append("\nNo students found in " + selectedClass + ".\n");
        }
    }

    public static void main(String[] args) {


                SchoolManagmentSystem system = new SchoolManagmentSystem();
                system.setVisible(true);


}}

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AddEmployee extends JFrame implements ActionListener { // Third Frame

    JTextField textField, textField_1, textField_3, textField_4, textField_5, textField_6, textField9;
    JComboBox c1, c2;
    JButton Next, back;

    public AddEmployee() {
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD EMPLOYEE DETAILS");

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1366, 800);
        getContentPane().setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Addemployee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(500, 0, 700, 650);
        add(Image);

        JLabel Passportno = new JLabel("NAME");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(60, 100, 150, 27);
        add(Passportno);

        textField = new JTextField();
        textField.setBounds(200, 100, 150, 27);
        add(textField);

        Next = new JButton("SAVE");
        Next.setBounds(100, 600, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);

        back = new JButton("BACK");
        back.setBounds(350, 600, 150, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        JLabel Pnrno = new JLabel("AGE");
        Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Pnrno.setBounds(60, 150, 150, 27);
        add(Pnrno);

        textField_1 = new JTextField();
        textField_1.setBounds(200, 150, 150, 27);
        add(textField_1);

        JLabel Pnrno1 = new JLabel("WING");
        Pnrno1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Pnrno1.setBounds(60, 200, 150, 27);
        add(Pnrno1);

        String wing[] = { "V-BLOCK", "N-BLOCK" };

        c1 = new JComboBox(wing);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200, 200, 150, 30);
        add(c1);

        JLabel Address = new JLabel("JOB");
        Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Address.setBounds(60, 250, 150, 27);
        add(Address);

        String course[] = { "PEON", "SWEEPER", "MESS MANAGER", "CLERK", "KITCHEN STAFF", "CIVIL MAINTAINANCE",
                "ELECTRICITY MAINTAINANCE", "MANAGER" };

        c2 = new JComboBox(course);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200, 250, 150, 30);
        add(c2);

        JLabel Nationality = new JLabel("SALARY");
        Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Nationality.setBounds(60, 300, 150, 27);
        add(Nationality);

        textField_3 = new JTextField();
        textField_3.setBounds(200, 300, 150, 27);
        add(textField_3);

        JLabel Name = new JLabel("PHONE");
        Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Name.setBounds(60, 350, 150, 27);
        add(Name);

        textField_4 = new JTextField();
        textField_4.setBounds(200, 350, 150, 27);
        add(textField_4);

        JLabel Phno = new JLabel("AADHAR");
        Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Phno.setBounds(60, 400, 150, 27);
        add(Phno);

        textField_5 = new JTextField();
        textField_5.setBounds(200, 400, 150, 27);
        add(textField_5);

        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma", Font.PLAIN, 17));
        email.setBounds(60, 450, 150, 27);
        add(email);

        textField_6 = new JTextField();
        textField_6.setBounds(200, 450, 150, 27);
        add(textField_6);

        setVisible(true);
        JLabel AddPassengers = new JLabel("ADD EMPLOYEE DETAILS");
        AddPassengers.setForeground(Color.RED);
        AddPassengers.setFont(new Font("Tahoma", Font.BOLD, 35));
        AddPassengers.setBounds(0, 24, 442, 35);
        Image.add(AddPassengers);

        JLabel Passportno2 = new JLabel("EMPLOYEE ID");
        Passportno2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno2.setBounds(60, 500, 150, 27);
        add(Passportno2);

        textField9 = new JTextField();
        textField9.setBounds(200, 500, 150, 27);
        add(textField9);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == Next) {

            String name = textField.getText();
            String age = textField_1.getText();
            String salary = textField_3.getText();
            String phone = textField_4.getText();
            String aadhar = textField_5.getText();
            String email = textField_6.getText();

            String wing = (String) c1.getSelectedItem();
            String job = (String) c2.getSelectedItem();

            try {
                conn c = new conn();
                String str = "INSERT INTO employee1 values( '" + name + "', '" + age + "' ,'"
                        + wing
                        + "','" + job
                        + "'             ,'" + salary + "', '" + phone + "','" + aadhar + "', '" + email + "')";

                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Employee Added");
                setVisible(false);
                new Home();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Home();
        }

    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}

//HOME 03
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

    JButton view, add, update, remove, view1, view5, add1, add5, update1, update5, remove1, remove2, remove3, remove4,
            remove5, remove6;

    Home() {

        setLayout(null);
        setResizable(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0, 0, 1170, 650);
        add(Image);

        JLabel heading = new JLabel("HOSTEL Management System");
        heading.setBounds(400, 20, 400, 40);
        heading.setForeground(Color.RED);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        Image.add(heading);

        add = new JButton("ADD STUDENT");
        add.setBounds(650, 80, 200, 40);
        add.setFont(new Font("Raleway", Font.BOLD, 15));
        add.setBackground(Color.ORANGE);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        Image.add(add);

        view = new JButton("VIEW   STUDENTS");
        view.setBounds(880, 80, 200, 40);
        view.setFont(new Font("Raleway", Font.BOLD, 15));
        view.setBackground(Color.ORANGE);
        view.setForeground(Color.BLACK);
        view.addActionListener(this);
        Image.add(view);

        update = new JButton("UPDATE  STUDENTS");
        update.setBounds(650, 140, 200, 40);
        update.setFont(new Font("Raleway", Font.BOLD, 15));
        update.setBackground(Color.ORANGE);
        update.setForeground(Color.BLACK);
        update.addActionListener(this);
        Image.add(update);

        remove = new JButton("REMOVE  STUDENTS");
        remove.setBounds(880, 140, 200, 40);
        remove.setFont(new Font("Raleway", Font.BOLD, 15));
        remove.setBackground(Color.ORANGE);
        remove.setForeground(Color.BLACK);
        remove.addActionListener(this);
        Image.add(remove);

        remove2 = new JButton("VIEW BOOKING REQ");
        remove2.setBounds(650, 200, 200, 40);
        remove2.setFont(new Font("Raleway", Font.BOLD, 15));
        remove2.setBackground(Color.ORANGE);
        remove2.setForeground(Color.BLACK);
        remove2.addActionListener(this);
        Image.add(remove2);

        remove3 = new JButton("CHANGE ROOM REQ");
        remove3.setBounds(880, 200, 200, 40);
        remove3.setFont(new Font("Raleway", Font.BOLD, 15));
        remove3.setBackground(Color.ORANGE);
        remove3.setForeground(Color.BLACK);
        remove3.addActionListener(this);
        Image.add(remove3);

        remove4 = new JButton("MARK ATTENDENCE");
        remove4.setBounds(650, 300, 200, 40);
        remove4.setFont(new Font("Raleway", Font.BOLD, 15));
        remove4.setBackground(Color.ORANGE);
        remove4.setForeground(Color.BLACK);
        remove4.addActionListener(this);
        Image.add(remove4);

        remove5 = new JButton("VIEW ATTENDENCE");
        remove5.setBounds(880, 300, 200, 40);
        remove5.setFont(new Font("Raleway", Font.BOLD, 15));
        remove5.setBackground(Color.ORANGE);
        remove5.setForeground(Color.BLACK);
        remove5.addActionListener(this);
        Image.add(remove5);

        add1 = new JButton("ADD ROOM");
        add1.setBounds(150, 80, 200, 40);
        add1.setFont(new Font("Raleway", Font.BOLD, 15));
        add1.setBackground(Color.ORANGE);
        add1.setForeground(Color.BLACK);
        add1.addActionListener(this);
        Image.add(add1);
        view1 = new JButton("REMOVE  ROOM");
        view1.setBounds(150, 200, 200, 40);
        view1.setFont(new Font("Raleway", Font.BOLD, 15));
        view1.setBackground(Color.ORANGE);
        view1.setForeground(Color.BLACK);
        view1.addActionListener(this);
        Image.add(view1);

        update1 = new JButton("VIEW  ROOM");
        update1.setBounds(150, 140, 200, 40);
        update1.setFont(new Font("Raleway", Font.BOLD, 15));
        update1.setBackground(Color.ORANGE);
        update1.setForeground(Color.BLACK);
        update1.addActionListener(this);
        Image.add(update1);

        add5 = new JButton("ADD EMPLOYEE");
        add5.setBounds(150, 300, 200, 40);
        add5.setFont(new Font("Raleway", Font.BOLD, 15));
        add5.setBackground(Color.ORANGE);
        add5.setForeground(Color.BLACK);
        add5.addActionListener(this);
        Image.add(add5);

        view5 = new JButton("REMOVE  EMPLOYEE");
        view5.setBounds(150, 420, 200, 40);
        view5.setFont(new Font("Raleway", Font.BOLD, 15));
        view5.setBackground(Color.ORANGE);
        view5.setForeground(Color.BLACK);
        view5.addActionListener(this);
        Image.add(view5);

        update5 = new JButton("VIEW  EMPLOYEE");
        update5.setBounds(150, 360, 200, 40);
        update5.setFont(new Font("Raleway", Font.BOLD, 15));
        update5.setBackground(Color.ORANGE);
        update5.setForeground(Color.BLACK);
        update5.addActionListener(this);
        Image.add(update5);

        remove6 = new JButton("Log Out");
        remove6.setBounds(780, 400, 200, 40);
        remove6.setFont(new Font("Raleway", Font.BOLD, 15));
        remove6.setBackground(Color.ORANGE);
        remove6.setForeground(Color.BLACK);
        remove6.addActionListener(this);
        Image.add(remove6);

        setSize(1170, 650);
        setLocation(200, 50);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        setVisible(false);
        if (ae.getSource() == add) {
            setVisible(false);
            new Addstudent();
        } else if (ae.getSource() == view) {

            new viewstudent();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new viewstudent();
        } else if (ae.getSource() == add1) {
            setVisible(true);
            new Addroom();
        } else if (ae.getSource() == remove) {
            new Removestud();
        } else if (ae.getSource() == add5) {
            new AddEmployee();
        } else if (ae.getSource() == remove2) {
            setVisible(true);
            new viewbookingroom();
        } else if (ae.getSource() == remove3) {
            setVisible(true);
            new viewchangeroom();
        } else if (ae.getSource() == update5) {
            setVisible(true);
            new viewemp();
        } else if (ae.getSource() == view5) {
            setVisible(true);
            new Removeemployee();
        } else if (ae.getSource() == remove6) {
            new Dashboard();
        } else if (ae.getSource() == view1) {
            new Removeroom();
        } else if (ae.getSource() == update1) {
            setVisible(true);
            new viewroom();
        } else if (ae.getSource() == remove4) {
            setVisible(true);
            new Att();
        } else if (ae.getSource() == remove5) {
            setVisible(true);
            new viewatt();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
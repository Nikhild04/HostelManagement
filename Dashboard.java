
//DASHBOARD
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    JLabel stud, mang;
    JButton studb, mangb;

    Dashboard() {
        setLayout(null);
        setSize(1170, 650);
        setLocation(200, 50);
        getContentPane().setBackground(Color.ORANGE);

        stud = new JLabel("Student");
        stud.setBounds(300, 100, 400, 100);
        stud.setFont(new Font("Raleway", Font.BOLD, 20));
        add(stud);

        studb = new JButton("Click");
        studb.setBounds(280, 400, 100, 30);
        studb.setFont(new Font("Raleway", Font.BOLD, 20));
        add(studb);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Dash1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(220, 180, 200, 200);
        studb.addActionListener(this);

        add(Image);

        mang = new JLabel("Manager");
        mang.setBounds(700, 100, 400, 100);
        mang.setFont(new Font("Raleway", Font.BOLD, 20));
        add(mang);

        mangb = new JButton("Login");
        mangb.setBounds(700, 400, 100, 30);
        mangb.setFont(new Font("Raleway", Font.BOLD, 20));
        mangb.addActionListener(this);

        add(mangb);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Dash2.png"));
        Image i5 = i4.getImage().getScaledInstance(200, 200,
                java.awt.Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel Image2 = new JLabel(i6);
        Image2.setBounds(650, 180, 200, 200);
        add(Image2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == mangb) {
            setVisible(false);
            new Login2();
        } else if (ae.getSource() == studb) {
            new Shome();
            setVisible(false);
        }
    }

    public static void main(String args[]) {
        new Dashboard();
    }
}
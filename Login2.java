
//Login2
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login2 extends JFrame implements ActionListener {

    JTextField tfusername, tfpassword;

    Login2() {

        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setLayout(null);
        setResizable(false);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0, 0, 600, 300);
        add(Image);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(300, 20, 100, 30);
        lblusername.setForeground(Color.WHITE);
        Image.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(400, 20, 150, 30);
        Image.add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(300, 70, 100, 30);
        lblpassword.setForeground(Color.WHITE);
        Image.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(400, 70, 150, 30);
        Image.add(tfpassword);

        JButton login = new JButton("LOGIN");
        login.setBounds(400, 140, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        Image.add(login);

        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        try {

            String user = tfusername.getText();
            String pass = tfpassword.getText();
            conn c = new conn();
            String query = "select * from login2 where name='" + user + "' and  password='" + pass + "'";
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                JOptionPane.showMessageDialog(null, "successfully logged in");
                new Home();
            } else {
                setVisible(false);
                JOptionPane.showMessageDialog(null, "invalid");
                new Login2();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login2();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JTextField tfusername, tfpassword;
    JPasswordField jpass;

    Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setResizable(false);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0, 0, 600, 300);
        add(Image);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 30);
        lblusername.setForeground(Color.WHITE);
        Image.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 30);
        Image.add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 30);
        lblpassword.setForeground(Color.WHITE);
        Image.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(150, 70, 150, 30);
        Image.add(tfpassword);

        // jpass = new JPasswordField();
        // jpass.setEchoChar('*');
        // add(jpass);

        JButton login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
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

            String username = tfusername.getText();
            String password = tfpassword.getText();
            conn c = new conn();
            String query = "select * from login where name='" + username + "' and  password='" + password + "'";
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Dashboard();

            } else {
                setVisible(false);
                JOptionPane.showMessageDialog(null, "UnAuthorized User");
                new Login();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
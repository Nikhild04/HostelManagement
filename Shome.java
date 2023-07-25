
//Shome
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Shome extends JFrame implements ActionListener {
    JButton room, room2, room3, room4, room5, room6, room7, room8;

    Shome() {
        setLayout(null);
        setResizable(false);
        setSize(1170, 650);
        setLocation(200, 50);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("shome.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(300, 0, 900, 650);
        add(Image);

        room = new JButton("View Room");
        room.setBounds(70, 50, 200, 30);
        room.setFont(new Font("Raleway", Font.BOLD, 20));
        room.setBackground(Color.BLACK);
        room.setForeground(Color.ORANGE);
        room.addActionListener(this);
        add(room);

        room2 = new JButton("Book Room");
        room2.setBounds(70, 120, 200, 30);
        room2.setFont(new Font("Raleway", Font.BOLD, 20));
        room2.setBackground(Color.BLACK);
        room2.setForeground(Color.ORANGE);
        room2.addActionListener(this);
        add(room2);

        room3 = new JButton("View Student");
        room3.setBounds(70, 190, 200, 30);
        room3.setFont(new Font("Raleway", Font.BOLD, 20));
        room3.setBackground(Color.BLACK);
        room3.setForeground(Color.ORANGE);
        room3.addActionListener(this);
        add(room3);

        room4 = new JButton("Room Change");
        room4.setBounds(70, 260, 200, 30);
        room4.setFont(new Font("Raleway", Font.BOLD, 20));
        room4.setBackground(Color.BLACK);
        room4.setForeground(Color.ORANGE);
        room4.addActionListener(this);
        add(room4);

        room6 = new JButton("View Employee");
        room6.setBounds(70, 330, 200, 30);
        room6.setFont(new Font("Raleway", Font.BOLD, 20));
        room6.setBackground(Color.BLACK);
        room6.setForeground(Color.ORANGE);
        room6.addActionListener(this);
        add(room6);

        room7 = new JButton("Events");
        room7.setBounds(70, 400, 200, 30);
        room7.setFont(new Font("Raleway", Font.BOLD, 20));
        room7.setBackground(Color.BLACK);
        room7.setForeground(Color.ORANGE);
        room7.addActionListener(this);
        add(room7);

        // room8 = new JButton("Search");
        // room8.setBounds(70, 470, 200, 30);
        // room8.setFont(new Font("Raleway", Font.BOLD, 20));
        // room8.setBackground(Color.BLACK);
        // room8.setForeground(Color.ORANGE);
        // room8.addActionListener(this);
        // add(room8);

        room5 = new JButton("Back");
        room5.setBounds(400, 500, 200, 30);
        room5.setFont(new Font("Raleway", Font.BOLD, 20));
        room5.setBackground(Color.BLACK);
        room5.setForeground(Color.ORANGE);
        room5.addActionListener(this);
        Image.add(room5);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == room) {
            setVisible(true);
            new viewroom();

        } else if (ae.getSource() == room2) {

            new Bookingroom();

        } else if (ae.getSource() == room3) {
            new viewstudent();

        } else if (ae.getSource() == room4) {
            new Changeroom();

        } else if (ae.getSource() == room5) {
            setVisible(false);
            new Dashboard();
        } else if (ae.getSource() == room6) {
            new viewemp();

        } else if (ae.getSource() == room8) {
            new searchstudent();
        } else {

        }

    }

    public static void main(String args[]) {
        new Shome();
    }
}
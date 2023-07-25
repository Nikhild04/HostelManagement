
//Remove Room
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Removeroom extends JFrame implements ActionListener { // Third Frame

    JTextField textField, textField_1, textField_3, textField_4, textField_5, textField_6, textField9;
    JComboBox c1;
    JButton Next, back;

    public Removeroom() {
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD ROOM");

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1170, 650);
        getContentPane().setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Removeroom.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(550, 0, 700, 650);
        add(Image);

        Next = new JButton("REMOVE");
        Next.setBounds(100, 400, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);

        back = new JButton("BACK");
        back.setBounds(350, 400, 150, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        JLabel Pnrno = new JLabel("Room.no");
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

        JLabel AddPassengers = new JLabel("REMOVE ROOM");
        AddPassengers.setForeground(Color.RED);
        AddPassengers.setFont(new Font("Tahoma", Font.BOLD, 35));
        AddPassengers.setBounds(50, 24, 442, 35);
        add(AddPassengers);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == Next) {

            // String name = textField.getText();
            // String age = textField_1.getText();
            // String salary = textField_3.getText();
            // String phone = textField_4.getText();
            // String aadhar = textField_5.getText();
            // String email = textField_6.getText();

            // String s6 = (String) c1.getSelectedItem();

            // try {
            // conn c = new conn();
            // String str = "INSERT INTO employee values( '" + name + "', '" + age + "' ,'"
            // + s6
            // + "', '" + salary + "', '" + phone + "','" + aadhar + "', '" + email + "')";

            // c.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Removed Successfully");
            new Home();
            setVisible(false);

            // } catch (Exception e) {
            // e.printStackTrace();
            // }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Home();
        }

    }

    public static void main(String[] args) {
        new Removeroom();
    }
}
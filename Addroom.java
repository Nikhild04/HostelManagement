import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;

public class Addroom extends JFrame implements ActionListener { // Third Frame

    JTextField textField, textField_1, textField_3, textField_4, textField_5, textField_6, textField9;
    JComboBox c1, c2, c3;
    JButton Next, back;

    public Addroom() {
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD ROOM");

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1366, 800);
        setLocation(200, 50);
        getContentPane().setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Addroom.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(550, 0, 700, 650);
        add(Image);

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

        JLabel Pnrno = new JLabel("ROOM.No");
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

        String wing[] = { "Ground R", "Ground L", "Top R", "Top L" };

        c1 = new JComboBox(wing);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200, 200, 150, 30);
        add(c1);

        JLabel Address = new JLabel("STATUS");
        Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Address.setBounds(60, 250, 150, 27);
        add(Address);

        String course[] = { "Occupied", "Unoccupied" };

        c2 = new JComboBox(course);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200, 250, 150, 30);
        add(c2);

        JLabel Address1 = new JLabel("CONDITION");
        Address1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Address1.setBounds(60, 300, 150, 27);
        add(Address1);

        String course1[] = { "A/c", "Non A/c" };

        c3 = new JComboBox(course1);
        c3.setBackground(Color.WHITE);
        c3.setBounds(200, 300, 150, 30);
        add(c3);

        JLabel Name = new JLabel("PRICE");
        Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Name.setBounds(60, 350, 150, 27);
        add(Name);

        textField_4 = new JTextField();
        textField_4.setBounds(200, 350, 150, 27);
        add(textField_4);

        JLabel AddPassengers = new JLabel("ADD ROOM");
        AddPassengers.setForeground(Color.RED);
        AddPassengers.setFont(new Font("Tahoma", Font.BOLD, 35));
        AddPassengers.setBounds(50, 24, 442, 35);
        Image.add(AddPassengers);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == Next) {
            setVisible(false);
            String roomno = textField_1.getText();
            String wing = (String) c1.getSelectedItem();
            String status = (String) c2.getSelectedItem();
            String condition = (String) c3.getSelectedItem();
            String price = textField_4.getText();
            // String email = textField_6.getText();

            // String s6 = (String) c1.getSelectedItem();

            try {
                conn c = new conn();
                String str = "insert into rom4 values( '" + roomno + "', '" + wing + "','" + status + "','" + condition
                        + "','" + price + "')";

                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "ROOM ADDED SUCCESSFULLY");
                setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Home();
        }

    }

    public static void main(String[] args) {
        new Addroom();
    }
}
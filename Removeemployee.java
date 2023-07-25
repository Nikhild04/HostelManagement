
//Removeemployee
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Removeemployee extends JFrame implements ActionListener {
    JLabel Passportno, Passportno3, Passportno2, AddPassengers;
    JTextField textField, textField2, textField3;
    JButton Next, back;

    Removeemployee() {
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD EMPLOYEE DETAILS");
        setLayout(null);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(1170, 750);
        setLocation(200, 50);
        getContentPane().setBackground(Color.PINK);
        ;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Removeemployee.png"));
        Image i2 = i1.getImage().getScaledInstance(800, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(400, 0, 800, 650);
        add(Image);

        Passportno = new JLabel("NAME");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(30, 100, 150, 27);
        add(Passportno);

        textField = new JTextField();
        textField.setBounds(150, 100, 150, 27);
        add(textField);

        Passportno2 = new JLabel("EMP ID");
        Passportno2.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno2.setBounds(30, 150, 150, 27);
        add(Passportno2);

        textField2 = new JTextField();
        textField2.setBounds(150, 150, 150, 27);
        add(textField2);

        Passportno3 = new JLabel("Email");
        Passportno3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno3.setBounds(30, 200, 150, 27);
        add(Passportno3);

        textField3 = new JTextField();
        textField3.setBounds(150, 200, 150, 27);
        add(textField3);

        Next = new JButton("REMOVE");
        Next.setBounds(100, 500, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        Image.add(Next);

        back = new JButton("BACK");
        back.setBounds(350, 500, 150, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        Image.add(back);

        AddPassengers = new JLabel("REMOVE EMPLOYEE ");
        AddPassengers.setForeground(Color.RED);
        AddPassengers.setFont(new Font("Tahoma", Font.BOLD, 35));
        AddPassengers.setBounds(50, 24, 442, 35);
        Image.add(AddPassengers);

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
            JOptionPane.showMessageDialog(null, "Employee Removed Successfully");
            setVisible(false);
            // setVisible(false);

            // } catch (Exception e) {
            // e.printStackTrace();
            // }
        } else if (ae.getSource() == back) {
            setVisible(false);
        }

    }

    public static void main(String args[]) {
        new Removeemployee();
    }
}
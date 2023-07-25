import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;

public class viewroom extends JFrame implements ActionListener {

    JTable table;
    JButton Next, room5;
    JLabel Pnrno;

    JTextField textField_1;

    viewroom() {

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setSize(1170, 650);
        setLayout(null);
        setLocation(200, 50);
        table = new JTable();

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from rom4");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ae) {

        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 0, 1170, 500);
        add(jsp);

        room5 = new JButton("Back");
        room5.setBounds(320, 70, 80, 20);
        room5.setFont(new Font("Raleway", Font.BOLD, 20));
        room5.setBackground(Color.BLACK);
        room5.setForeground(Color.ORANGE);
        room5.addActionListener(this);
        add(room5);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == room5) {
            setVisible(false);
            new Home();

        } else {

        }

    }

    public static void main(String args[]) {
        new viewroom();
    }
}
import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class searchstudent extends JFrame implements ActionListener {

    JTable table;
    JTextField tfname;

    JButton search;

    searchstudent() {

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        labelname.setForeground(Color.RED);
        add(labelname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        search = new JButton("Search");
        search.setBounds(250, 300, 150, 40);
        search.addActionListener(this);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        add(search);

        setSize(1366, 600);
        setLocation(100, 100);
        setLayout(null);

        table = new JTable();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == search) {

            String name = tfname.getText();

            try {

                conn c = new conn();
                ResultSet rs = c.s.executeQuery("select * from student3 where name = '" + name + "'");
                table.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {

            }

            JScrollPane jsp = new JScrollPane(table);
            jsp.setBounds(0, 100, 900, 600);
            add(jsp);

        }
    }

    public static void main(String args[]) {
        new searchstudent();
    }
}

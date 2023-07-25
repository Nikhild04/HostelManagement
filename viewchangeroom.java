
// view change room
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;

public class viewchangeroom extends JFrame {

    JTable table;

    viewchangeroom() {

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setSize(1170, 600);
        setLayout(null);
        setLocation(200, 50);
        table = new JTable();

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from changeroom");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ae) {

        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 1170, 650);
        add(jsp);
    }

    public static void main(String args[]) {
        new viewchangeroom();
    }
}
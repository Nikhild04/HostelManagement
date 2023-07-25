import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;

public class viewatt extends JFrame {
    JTable table;

    viewatt() {

        table = new JTable();

        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from att");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1170, 650);
        setLocation(250, 60);
        setVisible(true);

    }

    public static void main(String args[]) {
        new viewatt();
        // new Home();

    }

}
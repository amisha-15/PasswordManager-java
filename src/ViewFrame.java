import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ViewFrame extends JFrame {

    public ViewFrame() {

        setTitle("View");
        setSize(500,300);
        setLocationRelativeTo(null);

        String[] cols = {"ID","Website","Username","Password"};
        DefaultTableModel model = new DefaultTableModel(cols,0);

        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);

        try {
            ResultSet rs = PasswordManager.view();

            while(rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("website"),
                        rs.getString("username"),
                        rs.getString("password")
                });
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }
}

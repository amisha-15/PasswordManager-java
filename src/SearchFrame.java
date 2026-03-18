import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class SearchFrame extends JFrame {

    public SearchFrame() {

        setTitle("Search");
        setSize(500,300);
        setLayout(null);
        setLocationRelativeTo(null);

        JTextField web = new JTextField();
        web.setBounds(100,20,150,25);
        add(web);

        JButton btn = new JButton("Search");
        btn.setBounds(270,20,100,25);
        add(btn);

        String[] cols = {"ID","Website","Username","Password"};
        DefaultTableModel model = new DefaultTableModel(cols,0);

        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(20,60,450,200);
        add(scroll);

        btn.addActionListener(e -> {
            try {
                model.setRowCount(0);
                ResultSet rs = PasswordManager.search(web.getText());

                while(rs.next()) {
                    model.addRow(new Object[]{
                            rs.getInt("id"),
                            rs.getString("website"),
                            rs.getString("username"),
                            rs.getString("password")
                    });
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });

        setVisible(true);
    }
}

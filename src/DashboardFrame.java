import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {

        setTitle("Dashboard");
        setSize(700,400);
        setLayout(null);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(40,40,40));

        JPanel sidebar = new JPanel();
        sidebar.setBounds(0,0,180,400);
        sidebar.setBackground(new Color(25,25,25));
        sidebar.setLayout(null);
        add(sidebar);

        JButton add = new JButton("Add");
        JButton view = new JButton("View");
        JButton update = new JButton("Update");
        JButton delete = new JButton("Delete");
        JButton search = new JButton("Search");

        JButton[] buttons = {add, view, update, delete, search};

        int y = 60;
        for (JButton b : buttons) {
            b.setBounds(20,y,140,35);
            b.setBackground(new Color(70,130,180));
            b.setForeground(Color.WHITE);
            sidebar.add(b);
            y += 50;
        }

        add.addActionListener(e -> new AddFrame());
        view.addActionListener(e -> new ViewFrame());
        update.addActionListener(e -> new UpdateFrame());
        delete.addActionListener(e -> new DeleteFrame());
        search.addActionListener(e -> new SearchFrame());

        setVisible(true);
    }
}
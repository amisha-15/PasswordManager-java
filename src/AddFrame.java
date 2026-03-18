import javax.swing.*;
import java.awt.*;

public class AddFrame extends JFrame {

    public AddFrame() {

        setTitle("Add");
        setSize(300,250);
        setLayout(null);
        setLocationRelativeTo(null);

        JTextField web = new JTextField();
        web.setBounds(80,30,150,25);
        add(web);

        JTextField user = new JTextField();
        user.setBounds(80,70,150,25);
        add(user);

        JTextField pass = new JTextField();
        pass.setBounds(80,110,150,25);
        add(pass);

        JButton btn = new JButton("Save");
        btn.setBounds(100,160,100,30);
        add(btn);

        btn.addActionListener(e -> {
            PasswordManager.add(web.getText(), user.getText(), pass.getText());
            JOptionPane.showMessageDialog(this,"Saved");
        });

        setVisible(true);
    }
}

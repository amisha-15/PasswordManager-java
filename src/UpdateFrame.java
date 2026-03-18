import javax.swing.*;

public class UpdateFrame extends JFrame {

    public UpdateFrame() {

        setTitle("Update");
        setSize(300,250);
        setLayout(null);
        setLocationRelativeTo(null);

        JTextField id = new JTextField();
        id.setBounds(80,30,150,25);
        add(id);

        JTextField user = new JTextField();
        user.setBounds(80,70,150,25);
        add(user);

        JTextField pass = new JTextField();
        pass.setBounds(80,110,150,25);
        add(pass);

        JButton btn = new JButton("Update");
        btn.setBounds(100,160,100,30);
        add(btn);

        btn.addActionListener(e -> {
            PasswordManager.update(
                    Integer.parseInt(id.getText()),
                    user.getText(),
                    pass.getText()
            );
            JOptionPane.showMessageDialog(this,"Updated");
        });

        setVisible(true);
    }
}

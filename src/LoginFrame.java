import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    JTextField userField;
    JPasswordField passField;

    public LoginFrame() {

        setTitle("Login");
        setSize(350,250);
        setLayout(null);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(40,40,40));

        JLabel title = new JLabel("Password Manager");
        title.setBounds(70,10,250,30);
        title.setForeground(Color.WHITE);
        add(title);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30,60,100,25);
        userLabel.setForeground(Color.WHITE);
        add(userLabel);

        userField = new JTextField();
        userField.setBounds(130,60,150,25);
        add(userField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30,100,100,25);
        passLabel.setForeground(Color.WHITE);
        add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(130,100,150,25);
        add(passField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(120,150,100,30);
        loginBtn.setBackground(new Color(70,130,180));
        loginBtn.setForeground(Color.WHITE);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            if (PasswordManager.login(
                    userField.getText(),
                    new String(passField.getPassword()))) {

                new DashboardFrame();
                dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Login");
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
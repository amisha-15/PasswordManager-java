import javax.swing.*;

public class DeleteFrame extends JFrame {

    public DeleteFrame() {

        setTitle("Delete");
        setSize(250,150);
        setLayout(null);
        setLocationRelativeTo(null);

        JTextField id = new JTextField();
        id.setBounds(50,30,150,25);
        add(id);

        JButton btn = new JButton("Delete");
        btn.setBounds(70,70,100,30);
        add(btn);

        btn.addActionListener(e -> {
            PasswordManager.delete(Integer.parseInt(id.getText()));
            JOptionPane.showMessageDialog(this,"Deleted");
        });

        setVisible(true);
    }
}

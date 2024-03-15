package Work;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(344, 244);
        setLocationRelativeTo(null); // Centre la fenêtre sur l'écran

        JPanel panel = new JPanel();
        panel.setBackground(new Color(19, 60, 51));

        JLabel labelUsername = new JLabel("Username:");
        labelUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        labelUsername.setForeground(new Color(255, 255, 255));
        labelUsername.setBounds(41, 42, 87, 50);
        JTextField textFieldUsername = new JTextField();
        textFieldUsername.setBounds(144, 55, 172, 28);

        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        labelPassword.setForeground(new Color(255, 255, 255));
        labelPassword.setBounds(47, 96, 80, 50);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(144, 106, 172, 28);

        JButton buttonLogin = new JButton("Login");
        buttonLogin.setForeground(new Color(255, 255, 255));
        buttonLogin.setBackground(new Color(183, 142, 84));
        buttonLogin.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        buttonLogin.setBounds(91, 159, 139, 33);

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                // Vérification des informations de connexion (ici, simple exemple de vérification)
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Login successful");
                    SecondMenu secondMenu = new SecondMenu();
                    secondMenu.setVisible(true);
                    
                    // Fermer la fenêtre actuelle (LoginFrame)
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
            }
        });
        panel.setLayout(null);

        panel.add(labelUsername);
        panel.add(textFieldUsername);
        panel.add(labelPassword);
        panel.add(passwordField);
        panel.add(buttonLogin);

        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblNewLabel.setForeground(new Color(183, 142, 84));
        lblNewLabel.setBounds(124, 14, 71, 28);
        panel.add(lblNewLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}

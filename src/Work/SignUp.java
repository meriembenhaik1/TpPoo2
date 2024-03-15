package Work;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class SignUp extends JFrame {
    private ArrayList<Client> listeClients;

    public SignUp() {
        this.listeClients = new ArrayList<>();
        initComponents();
    }

    private void initComponents() {
        setTitle("Gestion des clients");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centre la fenêtre sur l'écran

        JPanel panel = new JPanel();
        panel.setBackground(new Color(19, 60, 51));

        JLabel labelNom = new JLabel("Nom :");
        labelNom.setBounds(33, 62, 188, 19);
        labelNom.setForeground(new Color(255, 255, 255));
        labelNom.setBackground(new Color(255, 255, 255));
        JTextField textFieldNom = new JTextField();
        textFieldNom.setBounds(166, 61, 188, 19);

        JLabel labelPrenom = new JLabel("Prénom :");
        labelPrenom.setBounds(33, 88, 188, 19);
        labelPrenom.setForeground(new Color(255, 255, 255));
        JTextField textFieldPrenom = new JTextField();
        textFieldPrenom.setBounds(166, 87, 188, 19);

        JLabel labelEmail = new JLabel("Email :");
        labelEmail.setBounds(33, 114, 188, 19);
        labelEmail.setForeground(new Color(255, 255, 255));
        JTextField textFieldEmail = new JTextField();
        textFieldEmail.setBounds(166, 113, 188, 19);

        JLabel labelTelephone = new JLabel("Téléphone :");
        labelTelephone.setBounds(33, 141, 188, 19);
        labelTelephone.setForeground(new Color(255, 255, 255));
        JTextField textFieldTelephone = new JTextField();
        textFieldTelephone.setBounds(166, 140, 188, 19);

        JLabel labelPassword = new JLabel("Mot de passe:");
        labelPassword.setBounds(33, 169, 96, 19);
        labelPassword.setForeground(new Color(255, 255, 255));
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(166, 168, 188, 19);
        
        
        JButton boutonAjouter = new JButton("Sign Up");
        boutonAjouter.setBounds(91, 201, 188, 33);
        boutonAjouter.setBackground(new Color(183, 142, 84));
        boutonAjouter.setForeground(new Color(255, 255, 255));

        boutonAjouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = textFieldNom.getText();
                String prenom = textFieldPrenom.getText();
                String email = textFieldEmail.getText();
                String telephone = textFieldTelephone.getText();
                String password = passwordField.getText();
                
                // Vérification que tous les champs sont remplis
                if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || telephone.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs.");
                    return;
                }
                
                // Vérification que le nom et le prénom contiennent uniquement des lettres
                if (!nom.matches("[a-zA-Z]+") || !prenom.matches("[a-zA-Z]+")) {
                    JOptionPane.showMessageDialog(null, "Le nom et le prénom doivent contenir uniquement des lettres.");
                    return;
                }
                
                // Vérification que le champ téléphone ne contient que des chiffres
                if (!telephone.matches("\\d+")) {
                    JOptionPane.showMessageDialog(null, "Le numéro de téléphone doit contenir uniquement des chiffres.");
                    return;
                }

                // Vérification que l'email est valide (exemple simple)
                if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                    JOptionPane.showMessageDialog(null, "Veuillez entrer une adresse email valide.");
                    return;
                }


                // Création du client avec les informations saisies
                Client nouveauClient = new Client(Client.id, nom, prenom, email, telephone,password);

                // Ajout du client à la liste
                listeClients.add(nouveauClient);

                // Affichage d'un message pour indiquer que le client a été ajouté
                JOptionPane.showMessageDialog(null, "Inscription réussie");
                SecondMenu secondMenu = new SecondMenu();
                secondMenu.setVisible(true);
                // Fermer la fenêtre SignUp
                dispose();

                // Effacement des champs de saisie
                textFieldNom.setText("");
                textFieldPrenom.setText("");
                textFieldEmail.setText("");
                textFieldTelephone.setText("");
                passwordField.setText("");

                
            }
        });
        panel.setLayout(null);

        panel.add(labelNom);
        panel.add(textFieldNom);
        panel.add(labelPrenom);
        panel.add(textFieldPrenom);
        panel.add(labelEmail);
        panel.add(textFieldEmail);
        panel.add(labelTelephone);
        panel.add(textFieldTelephone);
        panel.add(labelPassword);
        panel.add(passwordField);
        panel.add(boutonAjouter);

        getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Sign Up");
        lblNewLabel.setForeground(new Color(183, 142, 84));
        lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblNewLabel.setBounds(141, 13, 80, 24);
        panel.add(lblNewLabel);
    }

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SignUp gestionClients = new SignUp();
                gestionClients.setVisible(true);      
            }
        });
    }
}
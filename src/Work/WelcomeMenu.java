package Work;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeMenu frame = new WelcomeMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public WelcomeMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 392);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(19, 60, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("W  E  L  C  O  M  E  !");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(84, 27, 268, 35);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(183, 142, 84));
		panel.setBounds(364, -19, 102, 410);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setForeground(new Color(19, 60, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFrame loginFrame = new LoginFrame();
                loginFrame.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(183, 142, 84));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(94, 144, 211, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sing up");
		btnNewButton_1.setForeground(new Color(19, 60, 51));
		btnNewButton_1.setBounds(93, 224, 212, 31);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp sign = new SignUp();
                sign.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(new Color(183, 142, 84));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel(">>If you have account ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(133, 117, 156, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(">>else");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(173, 197, 46, 14);
		contentPane.add(lblNewLabel_2);      
	}
}
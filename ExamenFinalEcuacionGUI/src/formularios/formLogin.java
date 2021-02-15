package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passF1;
	private JTextField txtUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formLogin frame = new formLogin();
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
	public formLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(193, 10, 50, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSalir.setBounds(251, 204, 115, 38);
		contentPane.add(btnSalir);
		
		passF1 = new JPasswordField();
		passF1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passF1.setBounds(10, 152, 416, 35);
		contentPane.add(passF1);
		
		JButton btnLogin = new JButton("Ingresar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user,password;
				user = txtUser.getText();
				password = String.valueOf(passF1.getPassword());
				//System.out.println("user "+user+" password "+password);
				if(user.equals("root") && password.equals("admin")) {
					//llamar formulario2
					formPrincipal f2 = new formPrincipal();
					f2.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "User/Password incorrecto");
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(68, 204, 115, 38);
		contentPane.add(btnLogin);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUser.setColumns(10);
		txtUser.setBounds(10, 75, 416, 35);
		contentPane.add(txtUser);
		
		JLabel lblNewLabel_1_1 = new JLabel("User (root)");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 43, 105, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Password (admin)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 120, 138, 22);
		contentPane.add(lblNewLabel_1);
	}

}

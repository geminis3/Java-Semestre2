package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtDeterminante;
	private JTextField txtX1;
	private JTextField txtX2;
	//Variables creadas
	double a,b,c,x1,x2,determinante;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formPrincipal frame = new formPrincipal();
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
	public formPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resolver Ecuaciones Segundo Grado");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(74, 26, 438, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblIngreseA = new JLabel("Ingrese a:");
		lblIngreseA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIngreseA.setBounds(10, 94, 93, 22);
		contentPane.add(lblIngreseA);
		
		JLabel lblIngreseB = new JLabel("Ingrese b:");
		lblIngreseB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIngreseB.setBounds(10, 136, 93, 22);
		contentPane.add(lblIngreseB);
		
		JLabel lblIngreseC = new JLabel("Ingrese c:");
		lblIngreseC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIngreseC.setBounds(10, 182, 93, 22);
		contentPane.add(lblIngreseC);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtA.setBounds(200, 94, 185, 22);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtB.setColumns(10);
		txtB.setBounds(200, 136, 185, 22);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtC.setColumns(10);
		txtC.setBounds(200, 182, 185, 22);
		contentPane.add(txtC);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				a=Double.parseDouble(txtA.getText());
				b=Double.parseDouble(txtB.getText());
				c=Double.parseDouble(txtC.getText());
				determinante=Math.pow(b, 2)-4*a*c;
				x1=((-b+Math.sqrt(determinante))/(2*a));
				x2=((-b-Math.sqrt(determinante))/(2*a));
				if(determinante>0) {
					txtDeterminante.setText("Hay dos soluciones");
					txtX1.setText(Double.toString(x1));
					txtX2.setText(Double.toString(x2));
				}
				else if (determinante==0) {
					txtDeterminante.setText("Hay una unica solucion");
					txtX1.setText(Double.toString(x1));
					txtX2.setText(Double.toString(x2));
				}
				else {
					txtDeterminante.setText("No hay solucion");
					txtX1.setText("");
					txtX2.setText("");
				}
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCalcular.setBounds(10, 231, 127, 21);
		contentPane.add(btnCalcular);
		
		JLabel lblDiscriminante = new JLabel("Discriminante:");
		lblDiscriminante.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDiscriminante.setBounds(10, 268, 127, 22);
		contentPane.add(lblDiscriminante);
		
		txtDeterminante = new JTextField();
		txtDeterminante.setEditable(false);
		txtDeterminante.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDeterminante.setColumns(10);
		txtDeterminante.setBounds(200, 268, 376, 22);
		contentPane.add(txtDeterminante);
		
		JLabel lblX = new JLabel("X1:");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX.setBounds(10, 322, 32, 22);
		contentPane.add(lblX);
		
		JLabel lblX_2 = new JLabel("X2:");
		lblX_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX_2.setBounds(200, 322, 32, 22);
		contentPane.add(lblX_2);
		
		txtX1 = new JTextField();
		txtX1.setEditable(false);
		txtX1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtX1.setColumns(10);
		txtX1.setBounds(52, 322, 138, 22);
		contentPane.add(txtX1);
		
		txtX2 = new JTextField();
		txtX2.setEditable(false);
		txtX2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtX2.setColumns(10);
		txtX2.setBounds(242, 322, 138, 22);
		contentPane.add(txtX2);
		
		JButton btnSalir = new JButton("Cerrar Sesion");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formLogin f1 = new formLogin();
				f1.setVisible(true);
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSalir.setBounds(409, 322, 167, 25);
		contentPane.add(btnSalir);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				txtDeterminante.setText("");
				txtX1.setText("");
				txtX2.setText("");
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLimpiar.setBounds(449, 94, 127, 21);
		contentPane.add(btnLimpiar);
	}
}

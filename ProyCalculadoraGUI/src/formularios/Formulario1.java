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

public class Formulario1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResultado;
	
	//variables
	double num1,num2,res;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario1 frame = new Formulario1();
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
	public Formulario1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 27, 136, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("N\u00FAmero 1");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNmero.setBounds(10, 69, 74, 14);
		contentPane.add(lblNmero);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00FAmero 2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 109, 74, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Resultado");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 153, 84, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(101, 68, 230, 19);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(101, 108, 230, 19);
		contentPane.add(txtNum2);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(101, 153, 230, 19);
		contentPane.add(txtResultado);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNum1.setText("");
				txtNum2.setText("");
				txtResultado.setText("");
			}
		});
		btnLimpiar.setBounds(341, 67, 85, 21);
		contentPane.add(btnLimpiar);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtNum1.getText());
				num2=Double.parseDouble(txtNum2.getText());
				res=num1+num2;
				txtResultado.setText(Double.toString(res));
			}
		});
		btnSumar.setBounds(10, 205, 85, 21);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtNum1.getText());
				num2=Double.parseDouble(txtNum2.getText());
				res=num1-num2;
				txtResultado.setText(Double.toString(res));
			}
		});
		btnRestar.setBounds(105, 205, 85, 21);
		contentPane.add(btnRestar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtNum1.getText());
				num2=Double.parseDouble(txtNum2.getText());
				res=num1/num2;
				txtResultado.setText(Double.toString(res));
			}
		});
		btnDividir.setBounds(341, 205, 85, 21);
		contentPane.add(btnDividir);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(txtNum1.getText());
				num2=Double.parseDouble(txtNum2.getText());
				res=num1*num2;
				txtResultado.setText(Double.toString(res));
			}
		});
		btnMultiplicar.setBounds(207, 205, 124, 21);
		contentPane.add(btnMultiplicar);
		
		JButton btnLimpiar_1 = new JButton("Limpiar");
		btnLimpiar_1.setBounds(341, 67, 85, 21);
		contentPane.add(btnLimpiar_1);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(341, 107, 85, 21);
		contentPane.add(btnSalir);
	}
}

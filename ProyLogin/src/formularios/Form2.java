package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDado;
	private JTextField txtNumero;
	private JTextField txtResul;

	/**
	 * Launch the application.
	 */
	int numD=0,numC=0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form2 frame = new Form2();
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
	public Form2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(184, 10, 115, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Instrucciones");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 39, 101, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Su n\u00FAmero es: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 112, 101, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Resultado");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 217, 101, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnLanzar = new JButton("1. Lanzar Dado");
		btnLanzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numD=(int)(Math.random()*6+1);
				//System.out.println(num);
				txtDado.setText(String.valueOf(numD));
			}
		});
		btnLanzar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLanzar.setBounds(10, 62, 196, 21);
		contentPane.add(btnLanzar);
		
		JButton btnTurno = new JButton("2. Turno del Computador");
		btnTurno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numC=(int)(Math.random()*6+1);
				txtNumero.setText(String.valueOf(numC));
				if(numD>numC) {
					txtResul.setText("Gana el jugador");
				}
				else if (numD<numC) {
					txtResul.setText("Pierde");
				}
				else {
					txtResul.setText("Empate");
				}
			}
		});
		btnTurno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTurno.setBounds(10, 153, 196, 21);
		contentPane.add(btnTurno);
		
		txtDado = new JTextField();
		txtDado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDado.setBounds(255, 94, 171, 35);
		contentPane.add(txtDado);
		txtDado.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNumero.setColumns(10);
		txtNumero.setBounds(255, 146, 171, 35);
		contentPane.add(txtNumero);
		
		txtResul = new JTextField();
		txtResul.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtResul.setColumns(10);
		txtResul.setBounds(255, 195, 171, 35);
		contentPane.add(txtResul);
	}

}

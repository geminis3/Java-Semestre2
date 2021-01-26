package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Convertir;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDato;
	private JTextField txtResul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 frame = new Form1();
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
	public Form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(277, 38, 71, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCantidad.setBounds(10, 96, 103, 13);
		contentPane.add(lblCantidad);
		
		JLabel lblDe = new JLabel("De");
		lblDe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDe.setBounds(10, 163, 103, 13);
		contentPane.add(lblDe);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblA.setBounds(322, 163, 103, 13);
		contentPane.add(lblA);
		
		JLabel lblSolucion = new JLabel("Solucion");
		lblSolucion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSolucion.setBounds(10, 265, 103, 13);
		contentPane.add(lblSolucion);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Centigrados", "Farenheit"}));
		comboBox1.setBounds(56, 147, 258, 40);
		contentPane.add(comboBox1);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Farenheit", "Centigrados"}));
		comboBox2.setBounds(360, 147, 258, 40);
		contentPane.add(comboBox2);
		
		txtDato = new JTextField();
		txtDato.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDato.setBounds(99, 86, 213, 36);
		contentPane.add(txtDato);
		txtDato.setColumns(10);
		
		txtResul = new JTextField();
		txtResul.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResul.setColumns(10);
		txtResul.setBounds(99, 252, 213, 36);
		contentPane.add(txtResul);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double aux1=0;
				double dato = Double.parseDouble(txtDato.getText());
				
				String de = comboBox1.getSelectedItem().toString();
				String a = comboBox2.getSelectedItem().toString();
				
				Convertir Conver1 = new Convertir();
				//System.out.println(de+" "+a);
				if(de.equalsIgnoreCase("Farenheit") && a.equalsIgnoreCase("Centigrados")){
					aux1=Conver1.ConvertirF2C(dato);
				}else if(de.equalsIgnoreCase("Centigrados") && a.equalsIgnoreCase("Farenheit")){
					aux1=Conver1.ConvertirC2F(dato);
				}
				txtResul.setText(Double.toString(aux1));
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalcular.setBounds(56, 330, 133, 36);
		contentPane.add(btnCalcular);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimpiar.setBounds(245, 330, 133, 36);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSalir.setBounds(434, 330, 133, 36);
		contentPane.add(btnSalir);
	}
}

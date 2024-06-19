package desin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaRepaso {

	private JFrame frame;
	private JTextField tf_cambiaColor;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tf_opcion;
	private JTextField tf_checkBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRepaso window = new VentanaRepaso();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaRepaso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Desin");
		
		tf_cambiaColor = new JTextField();
		tf_cambiaColor.setText("Elige un color y pulsa el botón.");
		tf_cambiaColor.setHorizontalAlignment(SwingConstants.CENTER);
		tf_cambiaColor.setBounds(46, 34, 345, 20);
		frame.getContentPane().add(tf_cambiaColor);
		tf_cambiaColor.setColumns(10);
		
		JComboBox combox_cambiaColor = new JComboBox();
		combox_cambiaColor.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Rojo", "Verde"}));
		combox_cambiaColor.setBounds(46, 89, 105, 22);
		frame.getContentPane().add(combox_cambiaColor);
		
		JButton btn_cambiarColor = new JButton("Cambiar Color");
		btn_cambiarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Color colorTexto = new Color(0);
				String colorSelec = (String) combox_cambiaColor.getSelectedItem();
				
				switch (colorSelec) {
				case "Azul":
					colorTexto = Color.blue;
					break;
					
				case "Rojo":
					colorTexto = Color.red;
					break;
					
				case "Verde":
					colorTexto = Color.green;
					break;
					
				}
				
				tf_cambiaColor.setForeground(colorTexto);
				tf_cambiaColor.setText("Ahora soy de color " + colorSelec);
				
			}
		});
		
		btn_cambiarColor.setBounds(250, 89, 141, 23);
		frame.getContentPane().add(btn_cambiarColor);
		
		JCheckBox checkBox = new JCheckBox("Checked?");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (checkBox.isSelected()) {
					tf_checkBox.setText("Checked");
				}
				else {
					tf_checkBox.setText("Not checked");
				}
				
				
			}
		});
		checkBox.setBounds(46, 131, 97, 23);
		frame.getContentPane().add(checkBox);
		
		JRadioButton rdbtn_1 = new JRadioButton("opción 1");
		rdbtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_opcion.setText("Opción 1");
			}
		});
		
		buttonGroup.add(rdbtn_1);
		rdbtn_1.setBounds(247, 131, 109, 23);
		frame.getContentPane().add(rdbtn_1);
		
		JRadioButton rdbtn_2 = new JRadioButton("opción 2");
		rdbtn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_opcion.setText("Opción 2");
			}
		});
		
		buttonGroup.add(rdbtn_2);
		rdbtn_2.setBounds(247, 157, 109, 23);
		frame.getContentPane().add(rdbtn_2);
		
		JRadioButton rdbtn_3 = new JRadioButton("opción 3");
		rdbtn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_opcion.setText("Opción 3");
			}
		});
		buttonGroup.add(rdbtn_3);
		rdbtn_3.setBounds(247, 183, 109, 23);
		frame.getContentPane().add(rdbtn_3);
		
		tf_opcion = new JTextField();
		tf_opcion.setText("Ninguna");
		tf_opcion.setBounds(250, 230, 125, 20);
		frame.getContentPane().add(tf_opcion);
		tf_opcion.setColumns(10);
		
		JLabel lb_opcion = new JLabel("Opción Elegida");
		lb_opcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb_opcion.setBounds(250, 207, 125, 20);
		frame.getContentPane().add(lb_opcion);
		
		tf_checkBox = new JTextField();
		tf_checkBox.setText("Not Checked");
		tf_checkBox.setBounds(46, 158, 105, 20);
		frame.getContentPane().add(tf_checkBox);
		tf_checkBox.setColumns(10);
		
	}
}

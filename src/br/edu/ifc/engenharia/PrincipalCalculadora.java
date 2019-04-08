package br.edu.ifc.engenharia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class PrincipalCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	
	Calculadora ca = new Calculadora();
	double num1;
	double num2;
	private JTextField tfResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalCalculadora frame = new PrincipalCalculadora();
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
	public PrincipalCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 418);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
		lblCalculadora.setBounds(49, 11, 83, 30);
		contentPane.add(lblCalculadora);
		
		JLabel lblNumero = new JLabel("Numero 1:");
		lblNumero.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
		lblNumero.setBounds(10, 60, 74, 30);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero 2:");
		lblNumero_1.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
		lblNumero_1.setBounds(10, 101, 74, 30);
		contentPane.add(lblNumero_1);
		
		tfNum1 = new JTextField();
		tfNum1.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		tfNum1.setBounds(94, 67, 86, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setFont(new Font("Source Sans Pro", Font.PLAIN, 16));
		tfNum2.setColumns(10);
		tfNum2.setBounds(94, 108, 86, 20);
		contentPane.add(tfNum2);
		
		
		
		
		JButton btSoma = new JButton("+");
		btSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());

				ca.setNum1(num1);
				ca.setNum2(num2);
				
				tfResult.setText(""+ca.soma());
				
				
				
				
				
				
				
			}
		});
		btSoma.setBounds(10, 157, 56, 23);
		contentPane.add(btSoma);
		
		JButton btMenos = new JButton("-");
		btMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());

				ca.setNum1(num1);
				ca.setNum2(num2);
				
				tfResult.setText(""+ca.subtracao());
				
				
				
			}
		});
		btMenos.setBounds(76, 157, 56, 23);
		contentPane.add(btMenos);
		
		JButton btMulti = new JButton("X");
		btMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());

				ca.setNum1(num1);
				ca.setNum2(num2);
				
				tfResult.setText(""+ca.multiplicacao());
				
				
			}
		});
		btMulti.setBounds(142, 157, 56, 23);
		contentPane.add(btMulti);
		
		JButton btDivi = new JButton("/");
		btDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());

				ca.setNum1(num1);
				ca.setNum2(num2);
				
				tfResult.setText(""+ca.divisao());
				
				
				
			}
		});
		btDivi.setBounds(208, 157, 56, 23);
		contentPane.add(btDivi);
		
		tfResult = new JTextField();
		tfResult.setEditable(false);
		tfResult.setBounds(94, 346, 86, 20);
		contentPane.add(tfResult);
		tfResult.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent arg0) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());

				ca.setNum1(num1);
				ca.setNum2(num2);
				
				if (comboBox.getSelectedIndex()==0) {
					tfResult.setText(""+ca.soma());
					
				}else if (comboBox.getSelectedIndex()==1) {
					tfResult.setText(""+ca.subtracao());
					
				}else if (comboBox.getSelectedIndex()==2) {
					tfResult.setText(""+ca.multiplicacao());
					
				}else {
					tfResult.setText(""+ca.divisao());

				}
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) {
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Soma", "Subtra\u00E7\u00E3o", "Multiplica\u00E7\u00E3o", "Divis\u00E3o"}));
		comboBox.setBounds(171, 188, 93, 20);
		contentPane.add(comboBox);
		
		JRadioButton rbSoma = new JRadioButton("Soma");
		rbSoma.setSelected(true);
		buttonGroup.add(rbSoma);
		rbSoma.setBounds(10, 187, 109, 23);
		contentPane.add(rbSoma);
		
		JRadioButton rbSub = new JRadioButton("Subtra\u00E7\u00E3o");
		buttonGroup.add(rbSub);
		rbSub.setBounds(10, 213, 109, 23);
		contentPane.add(rbSub);
		
		JRadioButton rbMulti = new JRadioButton("Multiplica\u00E7\u00E3o");
		buttonGroup.add(rbMulti);
		rbMulti.setBounds(10, 239, 109, 23);
		contentPane.add(rbMulti);
		
		JRadioButton rbdivi = new JRadioButton("Divis\u00E3o");
		buttonGroup.add(rbdivi);
		rbdivi.setBounds(10, 265, 109, 23);
		contentPane.add(rbdivi);
		
		JButton btCalcular = new JButton("Calcular");
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());

				ca.setNum1(num1);
				ca.setNum2(num2);
				
				if (rbSoma.isSelected()) {
					
					tfResult.setText(""+ca.soma());
				
				}else if (rbSub.isSelected()) {
					
					tfResult.setText(""+ca.subtracao());
				
				}else if (rbdivi.isSelected()) {
					
					tfResult.setText(""+ca.divisao());
				
				}else if (rbMulti.isSelected()) {
			
					tfResult.setText(""+ca.multiplicacao());
				}
			}
	
		});
		btCalcular.setBounds(94, 295, 89, 23);
		contentPane.add(btCalcular);
	}
}

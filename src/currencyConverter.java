import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class currencyConverter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	
	String[] currencyConverter = {
			"SelectACountry",
			"USDollar",
			"EuropeanEuro",
			"BangladeshiTk",
			"IndianRupie",
			"ChinessYean",
			"EgyptianPound"
			
	};
	
	double unitedStateDollar = 89.0;
	double europeanEuro = 94.0;
	double bangladeshiTk = 43.0;
	double indianRupie = 53.0;
	double chinessYan = 85.0;
	double egyptianPound = 76.0;
	double staticCurrency = 20.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyConverter window = new currencyConverter();
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
	
	public currencyConverter() {
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
		
		JLabel lblNewLabel = new JLabel("Convert Currency");
		lblNewLabel.setBounds(10, 101, 108, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(127, 43, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int position = comboBox.getSelectedIndex();
				
			}
		});
		comboBox.addItem("Select A Country");
		comboBox.addItem("United State Dolar");
		comboBox.addItem("European Euro");
		comboBox.addItem("Bangladeshi Tk");
		comboBox.addItem("Indian Ropie");
		comboBox.addItem("Chiness Yean");
		comboBox.addItem("Egyptian Pound");
		
		comboBox.setBounds(238, 42, 130, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int position = comboBox_1.getSelectedIndex();
			}
		});
		comboBox_1.addItem("Select A Country");
		comboBox_1.addItem("United State Dolar");
		comboBox_1.addItem("European Euro");
		comboBox_1.addItem("Bangladeshi Tk");
		comboBox_1.addItem("Indian Ropie");
		comboBox_1.addItem("Chiness Yean");
		comboBox_1.addItem("Egyptian Pound");
		
		comboBox_1.setBounds(238, 165, 130, 22);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedIndex()==0  || comboBox.getSelectedIndex()==0 || textField.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null,"Select Country and Input Currency","Warning",
					JOptionPane.INFORMATION_MESSAGE);
					return;
					
				}
			
				double amountChange = Double.parseDouble(textField.getText());
				
				double staticAmount = 0.0;
				
				
				switch(comboBox.getSelectedItem().toString()) {
				
				case "United State Dolar": staticAmount = amountChange/ unitedStateDollar;break;
				case "European Euro": staticAmount = amountChange/ europeanEuro;break;
				case "Bangladeshi Tk": staticAmount = amountChange/ bangladeshiTk;break;
				case "Indian Ropie": staticAmount = amountChange/ indianRupie;break;
				case "Chiness Yean": staticAmount = amountChange/ chinessYan;break;
				case "Egyptian Pound": staticAmount = amountChange/ egyptianPound;break;
				
				
				
				
				}
				
				double amountChanged = 0.0;
				
				switch(comboBox_1.getSelectedItem().toString()) {
				
				case "United State Dolar": amountChanged = staticAmount * unitedStateDollar;break;
				case "European Euro": amountChanged = staticAmount * europeanEuro;break;
				case "Bangladeshi Tk": amountChanged = staticAmount * bangladeshiTk;break;
				case "Indian Ropie": amountChanged = staticAmount * indianRupie;break;
				case "Chiness Yean": amountChanged = staticAmount * chinessYan;break;
				case "Egyptian Pound": amountChanged = staticAmount * egyptianPound;break;
				
				
				
				
				}
				
				String finalValue = String.format("%.2f", amountChanged);
				
				textField_2.setText(finalValue);
				return;
				
				
			}
		});
		btnNewButton.setBounds(335, 105, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 166, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(223, 218, 201, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(160, 109, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Result");
		lblNewLabel_3.setBounds(30, 169, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				textField.setText(null);
				textField_2.setText(null);
				
			}
		});
		btnNewButton_1.setBounds(171, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}

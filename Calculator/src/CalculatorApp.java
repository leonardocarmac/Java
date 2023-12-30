import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Color;

public class CalculatorApp {

	private JFrame frmCalculator;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JButton btnNewButton1;
	JButton btnNewButton2;
	JButton btnNewButton3;
	JButton btnNewButton4;
	JButton btnNewButton5;
	JButton btnNewButton6;
	JButton btnNewButton7;
	JButton btnNewButton8;
	JButton btnNewButton9;
	JButton btnNewButton10;
	JButton btnNewButton11;
	JButton btnNewButton12;
	JButton btnNewButton13;
	JButton btnNewButton14;
	JButton btnNewButton15;
	JButton btnNewButton16;
	JButton btnNewButton17;
	JButton btnNewButton18;
	JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
	JRadioButton rdbtnNewRadioButton1 = new JRadioButton("OFF");
	double num,ans;
	int calc;
	JLabel label;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorApp() {
		initialize();
		
	
	}
	
	public void arithmetic_operation() {
		switch(calc) {
		case 1:
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 2:
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 3:
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 4:
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		}
	}
	

	public void enable() {
		textField.setEnabled(true);
		
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton1.setEnabled(true);
		
		btnNewButton1.setEnabled(true);
		btnNewButton2.setEnabled(true);
		btnNewButton3.setEnabled(true);
		btnNewButton4.setEnabled(true);
		btnNewButton5.setEnabled(true);
		btnNewButton6.setEnabled(true);
		btnNewButton7.setEnabled(true);
		btnNewButton8.setEnabled(true);
		btnNewButton9.setEnabled(true);
		btnNewButton10.setEnabled(true);
		btnNewButton11.setEnabled(true);
		btnNewButton12.setEnabled(true);
		btnNewButton13.setEnabled(true);
		btnNewButton14.setEnabled(true);
		btnNewButton15.setEnabled(true);
		btnNewButton16.setEnabled(true);
		btnNewButton17.setEnabled(true);
		btnNewButton18.setEnabled(true);
		
		
	}	
	
	public void disable() {
		textField.setEnabled(false);
		
		rdbtnNewRadioButton.setEnabled(true);
		rdbtnNewRadioButton1.setEnabled(false);
		
		btnNewButton1.setEnabled(false);
		btnNewButton2.setEnabled(false);
		btnNewButton3.setEnabled(false);
		btnNewButton4.setEnabled(false);
		btnNewButton5.setEnabled(false);
		btnNewButton6.setEnabled(false);
		btnNewButton7.setEnabled(false);
		btnNewButton8.setEnabled(false);
		btnNewButton9.setEnabled(false);
		btnNewButton10.setEnabled(false);
		btnNewButton11.setEnabled(false);
		btnNewButton12.setEnabled(false);
		btnNewButton13.setEnabled(false);
		btnNewButton14.setEnabled(false);
		btnNewButton15.setEnabled(false);
		btnNewButton16.setEnabled(false);
		btnNewButton17.setEnabled(false);
		btnNewButton18.setEnabled(false);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setAutoRequestFocus(false);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 330, 456);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(10, 23, 293, 37);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		//ON button
		rdbtnNewRadioButton.setEnabled(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 66, 49, 21);
		frmCalculator.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enable();
			}
		});
		
		//OFF button
		buttonGroup.add(rdbtnNewRadioButton1);
		rdbtnNewRadioButton1.setBounds(6, 99, 49, 21);
		frmCalculator.getContentPane().add(rdbtnNewRadioButton1);
		rdbtnNewRadioButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				disable();
			}
		});
		
		btnNewButton1 = new JButton("<--");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String store;
				
				if(length > 0) {
					StringBuilder back = new StringBuilder(textField.getText());
					back = back.deleteCharAt(number);
					store = back.toString();
					textField.setText(store);
				}
			}
		});
		
		btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton1.setBounds(91, 65, 64, 67);
		frmCalculator.getContentPane().add(btnNewButton1);
		
		btnNewButton2 = new JButton("C");
		btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton2.setBounds(165, 65, 64, 67);
		frmCalculator.getContentPane().add(btnNewButton2);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		btnNewButton3 = new JButton("+");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calc = 1;
				textField.setText("");
				label.setText(num + "+");
				
			}
		});
		btnNewButton3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton3.setBounds(239, 65, 64, 67);
		frmCalculator.getContentPane().add(btnNewButton3);
		
		btnNewButton4 = new JButton("7");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"7");
			}
		});
		btnNewButton4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton4.setBounds(17, 142, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton4);
		
		btnNewButton5 = new JButton("8");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"8");
			}
		});
		btnNewButton5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton5.setBounds(91, 142, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton5);
		
		btnNewButton6 = new JButton("9");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"9");
			}
		});
		btnNewButton6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton6.setBounds(165, 142, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton6);
		
		btnNewButton7 = new JButton("-");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calc = 2;
				textField.setText("");
				label.setText(num + "-");
			}
		});
		btnNewButton7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton7.setBounds(239, 142, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton7);
		
		btnNewButton8 = new JButton("4");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"4");
			}
		});
		btnNewButton8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton8.setBounds(17, 207, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton8);
		
		btnNewButton9 = new JButton("5");
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"5");
			}
		});
		btnNewButton9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton9.setBounds(91, 207, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton9);
		
		btnNewButton10 = new JButton("6");
		btnNewButton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"6");
			}
		});
		btnNewButton10.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton10.setBounds(165, 207, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton10);
		
		btnNewButton11 = new JButton("*");
		btnNewButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calc = 3;
				textField.setText("");
				label.setText(num + "*");
			}
		});
		btnNewButton11.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton11.setBounds(239, 207, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton11);
		
		btnNewButton12 = new JButton("1");
		btnNewButton12.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton12.setBounds(17, 272, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton12);
		btnNewButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"1");
			}
		});
		
		
		btnNewButton13 = new JButton("2");
		btnNewButton13.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton13.setBounds(91, 272, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton13);
		btnNewButton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"2");
			}
		});
		
		btnNewButton14 = new JButton("3");
		btnNewButton14.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton14.setBounds(165, 272, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton14);
		btnNewButton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"3");
			}
		});
		
		btnNewButton15 = new JButton("/");
		btnNewButton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calc = 4;
				textField.setText("");
				label.setText(num + "/");
			}
		});
		btnNewButton15.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton15.setBounds(239, 272, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton15);
		
		btnNewButton16 = new JButton("0");
		btnNewButton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton16.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton16.setBounds(17, 337, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton16);
		
		btnNewButton17 = new JButton(".");
		btnNewButton17.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton17.setBounds(91, 337, 64, 55);
		frmCalculator.getContentPane().add(btnNewButton17);
		
		btnNewButton18 = new JButton("=");
		btnNewButton18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
				label.setText("");
			}
		});
		btnNewButton18.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton18.setBounds(165, 337, 138, 55);
		frmCalculator.getContentPane().add(btnNewButton18);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.RED);
		label.setBounds(258, 10, 45, 13);
		frmCalculator.getContentPane().add(label);
		
		
	}
}

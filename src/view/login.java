package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private All_Func all_Func;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public login() {
		setResizable(false);
		this.setTitle("CNPM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Name:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(268, 175, 127, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(268, 231, 127, 30);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(392, 175, 127, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		passwordField.setBounds(392, 231, 127, 30);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(430, 302, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JLabel lblNewLabel_3 = new JLabel("LOGIN");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tekton Pro Ext", Font.BOLD, 35));
		lblNewLabel_3.setBounds(326, 52, 157, 46);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = 	new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HieuNGUYXN\\Downloads\\abc.jpg"));
		lblNewLabel.setBounds(0, 0, 784, 461);
		contentPane.add(lblNewLabel);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String c = e.getActionCommand();
		if (c == "Login") {
			all_Func = new All_Func();
		}
		this.setVisible(false);
	}

	public All_Func getAll_Func() {
		return all_Func;
	}

	public void setAll_Func(All_Func all_Func) {
		this.all_Func = all_Func;
	}
	
	
}

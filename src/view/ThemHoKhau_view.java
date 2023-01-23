package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.loginRun;
import model.hokhau_model;
import model.quanly_model;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ThemHoKhau_view extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField_maHK;
	private JTextField textField_ThanhVie;
	private JTextField textField_ChuHo;
	private JTextField textField_DiaChi;
	
	private hokhau_model hoKhau;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ThemHoKhau_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 768);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1184, 112);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblThmHKhu = new JLabel("Thêm hộ khẩu");
		lblThmHKhu.setBounds(445, 11, 410, 90);
		lblThmHKhu.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel.add(lblThmHKhu);
		
		JLabel lbl_mahokhau = new JLabel("Mã hộ:");
		lbl_mahokhau.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_mahokhau.setBounds(183, 248, 88, 41);
		contentPane.add(lbl_mahokhau);
		
		JLabel lblSThanhV = new JLabel("Số thành viên:");
		lblSThanhV.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSThanhV.setBounds(183, 381, 173, 41);
		contentPane.add(lblSThanhV);
		
		JLabel lblChH = new JLabel("Chủ hộ:");
		lblChH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblChH.setBounds(681, 248, 88, 41);
		contentPane.add(lblChH);
		
		JLabel lblaCh = new JLabel("Địa chỉ:");
		lblaCh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblaCh.setBounds(681, 381, 88, 41);
		contentPane.add(lblaCh);
		
		textField_maHK = new JTextField();
		textField_maHK.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_maHK.setBounds(259, 248, 231, 41);
		contentPane.add(textField_maHK);
		textField_maHK.setColumns(10);
		
		textField_ThanhVie = new JTextField();
		textField_ThanhVie.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_ThanhVie.setColumns(10);
		textField_ThanhVie.setBounds(349, 381, 231, 41);
		contentPane.add(textField_ThanhVie);
		
		textField_ChuHo = new JTextField();
		textField_ChuHo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_ChuHo.setColumns(10);
		textField_ChuHo.setBounds(779, 248, 231, 41);
		contentPane.add(textField_ChuHo);
		
		textField_DiaChi = new JTextField();
		textField_DiaChi.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_DiaChi.setColumns(10);
		textField_DiaChi.setBounds(772, 381, 238, 41);
		contentPane.add(textField_DiaChi);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(183, 600, 151, 40);
		btnBack.addActionListener(this);
		contentPane.add(btnBack);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSave.setBounds(859, 600, 151, 40);
		btnSave.addActionListener(this);
		contentPane.add(btnSave);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cString = e.getActionCommand();
		if (cString.equals("BACK")) {
			this.setVisible(false);
			loginRun.lg.getAll_Func().setVisible(true);
		}
		else if (cString.equals("SAVE")) {
			this.setVisible(false);
			loginRun.lg.getAll_Func().setVisible(true);
			
			try {
				hoKhau = new hokhau_model();
				hoKhau.maho = textField_maHK.getText();
				hoKhau.chuho = textField_ChuHo.getText();
				hoKhau.Sothanhvien = Integer.parseInt(textField_ThanhVie.getText());
				hoKhau.diachi = textField_DiaChi.getText();
				JOptionPane.showInternalMessageDialog(null, "Insert success!");
				quanly_model.dsHoKhau.add(hoKhau);
				All_Func.themHoKhau(hoKhau);
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showInternalMessageDialog(null, "Insert not success!, please again!");
			}
		}
		
	}

	
	
	

}

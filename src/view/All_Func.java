package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.hokhau_model;
import model.nhankhau_model;

import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JEditorPane;

public class All_Func extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	JPanel panel_thongtin;
	JScrollPane scrollPane_dsNhankhau;
	JScrollPane scrollPane_dsHoKhau;
	JScrollPane scrollPane_dsDongphi;
	JScrollPane scrollPane_dsKhoanThu;
	public static JTable table_nhankhau;
	public static JTable table_hokhau;
	public static JTable table_dongphi;
	public static JTable table_khoanthu;
	
	
	public All_Func() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 768);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JPanel panel_chucnang = new JPanel();
		panel_chucnang.setBackground(new Color(173, 255, 47));
		panel_chucnang.setBounds(0, 20, 198, 712);
		contentPane.add(panel_chucnang);
		panel_chucnang.setLayout(null);
		
		JPanel panel_trangchu = new JPanel();
		panel_trangchu.setBackground(new Color(0, 255, 0));
		panel_trangchu.setBounds(0, 0, 198, 71);
		panel_chucnang.add(panel_trangchu);
		panel_trangchu.setLayout(null);
		
		JLabel label_trangchu = new JLabel("Trang Chủ");
		label_trangchu.setForeground(new Color(255, 69, 0));
		label_trangchu.setFont(new Font("Arial", Font.BOLD, 28));
		label_trangchu.setBounds(27, 10, 139, 51);
		panel_trangchu.add(label_trangchu);
		
		JLabel lblHKhu = new JLabel("1. Hộ Khẩu");
		lblHKhu.setFont(new Font("Arial", Font.BOLD, 18));
		lblHKhu.setBounds(10, 81, 166, 29);
		panel_chucnang.add(lblHKhu);
		
		JButton btn_themnhankhau = new JButton("Thêm Hộ Khẩu");
		btn_themnhankhau.addActionListener(this);
		btn_themnhankhau.setForeground(new Color(0, 0, 128));
		btn_themnhankhau.setBackground(new Color(255, 255, 255));
		btn_themnhankhau.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_themnhankhau.setBounds(20, 109, 156, 29);
		btn_themnhankhau.setFocusable(false);
		panel_chucnang.add(btn_themnhankhau);
		
		JButton btn_suanhankhau = new JButton("Sửa Hộ Khẩu");
		btn_suanhankhau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_suanhankhau.setForeground(new Color(0, 0, 128));
		btn_suanhankhau.setBackground(new Color(255, 255, 255));
		btn_suanhankhau.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_suanhankhau.setBounds(20, 148, 156, 29);
		btn_suanhankhau.setFocusable(false);
//		btn_suanhankhau.addActionListener(this);
		panel_chucnang.add(btn_suanhankhau);
		
		JLabel lblNhnKhu = new JLabel("2. Nhân Khẩu");
		lblNhnKhu.setFont(new Font("Arial", Font.BOLD, 18));
		lblNhnKhu.setBounds(10, 187, 166, 29);
		panel_chucnang.add(lblNhnKhu);
		
		JButton btn_themhokhau = new JButton("Thêm Nhân Khẩu");
		btn_themhokhau.addActionListener(this);
		btn_themhokhau.setForeground(new Color(0, 0, 128));
		btn_themhokhau.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_themhokhau.setFocusable(false);
		btn_themhokhau.setBackground(Color.WHITE);
		btn_themhokhau.setBounds(20, 215, 156, 29);
		panel_chucnang.add(btn_themhokhau);
		
		JButton btn_suahokhau = new JButton("Sửa Nhân Khẩu");
		btn_suahokhau.setForeground(new Color(0, 0, 128));
		btn_suahokhau.setBackground(new Color(255, 255, 255));
		btn_suahokhau.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_suahokhau.setFocusable(false);
		btn_suahokhau.setBounds(20, 255, 156, 29);
//		btn_suahokhau.addActionListener(this);
		panel_chucnang.add(btn_suahokhau);
		
		JLabel label_nhankhau_1 = new JLabel("3. Khoản Thu");
		label_nhankhau_1.setFont(new Font("Arial", Font.BOLD, 18));
		label_nhankhau_1.setBounds(10, 292, 166, 29);
		panel_chucnang.add(label_nhankhau_1);
		
		JButton btn_themkhoanthu = new JButton("Thêm Khoản Thu");
		btn_themkhoanthu.setForeground(new Color(0, 0, 128));
		btn_themkhoanthu.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_themkhoanthu.setFocusable(false);
		btn_themkhoanthu.setBackground(Color.WHITE);
		btn_themkhoanthu.setBounds(20, 319, 156, 29);
//		btn_themkhoanthu.addActionListener(this);
		panel_chucnang.add(btn_themkhoanthu);
		
		JButton btn_suakhoanthu = new JButton("Sửa Khoản Thu");
		btn_suakhoanthu.setForeground(new Color(0, 0, 128));
		btn_suakhoanthu.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_suakhoanthu.setFocusable(false);
		btn_suakhoanthu.setBackground(Color.WHITE);
		btn_suakhoanthu.setBounds(20, 359, 156, 29);
//		btn_suakhoanthu.addActionListener(this);
		panel_chucnang.add(btn_suakhoanthu);
		
		JLabel label_nhankhau_2 = new JLabel("4. Đóng Phí");
		label_nhankhau_2.setFont(new Font("Arial", Font.BOLD, 18));
		label_nhankhau_2.setBounds(10, 397, 166, 29);
		panel_chucnang.add(label_nhankhau_2);
		
		JButton btn_themnoptien = new JButton("Thêm Nộp Tiền");
		btn_themnoptien.setForeground(new Color(0, 0, 128));
		btn_themnoptien.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_themnoptien.setFocusable(false);
		btn_themnoptien.setBackground(Color.WHITE);
		btn_themnoptien.setBounds(20, 425, 156, 29);
//		btn_themnoptien.addActionListener(this);
		panel_chucnang.add(btn_themnoptien);
		
		JButton btn_xoanoptien = new JButton("Xóa Nộp Tiền");
		btn_xoanoptien.setForeground(new Color(0, 0, 128));
		btn_xoanoptien.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_xoanoptien.setFocusable(false);
		btn_xoanoptien.setBackground(Color.WHITE);
		btn_xoanoptien.setBounds(20, 464, 156, 29);
//		btn_xoanoptien.addActionListener(this);
		panel_chucnang.add(btn_xoanoptien);
		
		JPanel panel_timkiem = new JPanel();
		panel_timkiem.setBounds(208, 569, 951, 163);
		contentPane.add(panel_timkiem);
		panel_timkiem.setLayout(null);
		
		panel_thongtin = new JPanel();
		panel_thongtin.setLayout(null);
		panel_thongtin.setBounds(208, 44, 951, 515);
		contentPane.add(panel_thongtin);
		
		//********************table danh sách nhân khẩu***********************//
		
		table_nhankhau = new JTable();
		table_nhankhau.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_nhankhau.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"Họ và Tên", "Bí Danh", "Ngày Sinh", "Giới Tính", "CMND", "Mã Hộ","Tuổi", "Địa Chỉ","Giới Tính", "SĐT", "Quan hệ với chủ hộ"
			}
		));
		
		
		scrollPane_dsNhankhau = new JScrollPane(table_nhankhau);
		scrollPane_dsNhankhau.setBounds(0, 0, 951, 508);
		scrollPane_dsNhankhau.setVisible(false);
		panel_thongtin.add(scrollPane_dsNhankhau);
		
		//*******************table danh sách hộ khẩu**********************//
		
		table_hokhau = new JTable();
		table_hokhau.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_hokhau.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"Mã hộ", "Chủ hộ", "Số thành viên", "Địa chỉ"
			}
		));
		
		
		scrollPane_dsHoKhau = new JScrollPane(table_hokhau);
		scrollPane_dsHoKhau.setBounds(0, 0, 951, 508);
		
		scrollPane_dsHoKhau.setVisible(false);
		panel_thongtin.add(scrollPane_dsHoKhau);
		
		//*****************table danh sách đóng phí*************************//
		
		table_dongphi = new JTable();
		table_dongphi.getTableHeader().setFont(new Font("Tahoma",Font.PLAIN,14));
		table_dongphi.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
					"Mã hộ nộp","Tên người nôp", "Tên khoản thu","Số Tiền", "Ngày thu"
				}
			));		
		scrollPane_dsDongphi = new JScrollPane(table_dongphi);
		scrollPane_dsDongphi.setBounds(0, 0, 951, 508);
		
		scrollPane_dsDongphi.setVisible(false);
		panel_thongtin.add(scrollPane_dsDongphi);
		
		//*****************table danh sách khoản thu***********************//
		
		table_khoanthu = new JTable();
		table_khoanthu.getTableHeader().setFont(new Font("Tahoma",Font.PLAIN,14));
		table_khoanthu.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
						"Mã khoản thu","Loại khoản thu","Tên khoản thu", "số tiên"
				}
			));
		scrollPane_dsKhoanThu = new JScrollPane(table_khoanthu);
		scrollPane_dsKhoanThu.setBounds(0, 0, 951, 508);
		
		scrollPane_dsKhoanThu.setVisible(false);
		panel_thongtin.add(scrollPane_dsKhoanThu);
		
//		btn_dskhoanthu.addActionListener(this);
//		btn_dsHoKhau.addActionListener(this);
//		btn_dsNhanKhau.addActionListener(this);
//		btn_dsDongPhi.addActionListener(this);	
		JLabel lblNewLabel = new JLabel("Trang chủ");
		contentPane.add(lblNewLabel);
		lblNewLabel.setBounds(0, 20, 198, 71);
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		
		JButton btn_dsNhanKhau = new JButton("Danh sách nhân khẩu");
		btn_dsNhanKhau.setBounds(208, 20, 135, 23);
		contentPane.add(btn_dsNhanKhau);
		btn_dsNhanKhau.setBackground(new Color(255, 255, 255));
		btn_dsNhanKhau.addActionListener((this));
		
		JButton btn_dsHoKhau = new JButton("Danh sách hộ khẩu");
		btn_dsHoKhau.setBackground(new Color(255, 255, 255));
		btn_dsHoKhau.setBounds(347, 20, 135, 23);
		contentPane.add(btn_dsHoKhau);
		btn_dsHoKhau.addActionListener(this);
		
		JButton btn_DongPhi = new JButton("Danh sách khoản thu");
		btn_DongPhi.setBackground(new Color(255, 255, 255));
		btn_DongPhi.setBounds(486, 20, 135, 23);
		contentPane.add(btn_DongPhi);
		btn_DongPhi.addActionListener(this);
		
		JButton btn_KhoanThu = new JButton("Danh sách đóng phí");
		btn_KhoanThu.setBackground(new Color(255, 255, 255));
		btn_KhoanThu.setBounds(625, 20, 135, 23);
		contentPane.add(btn_KhoanThu);
		btn_KhoanThu.addActionListener(this);
		
		this.setTitle("Phần mềm quản lý hộ khẩu, nhân khẩu");		
		this.setVisible(true);

	}

	public static void themHoKhau(hokhau_model hokhau) {
		DefaultTableModel model = (DefaultTableModel) table_hokhau.getModel();
		model.addRow(new Object[] {hokhau.maho, hokhau.chuho, hokhau.Sothanhvien, hokhau.diachi});	
	}
	
	public static void themNhanKhau(nhankhau_model nhankhau) {
		DefaultTableModel model = (DefaultTableModel) table_nhankhau.getModel();
//		model.addRow(new Object[] {nhankhau.});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cString = e.getActionCommand();
//		switch (cString) {
//		case "Thêm Nhân Khẩu": {
//			ThemNhanKhau_view themNhanKhau_view = new ThemNhanKhau_view();
//			this.setVisible(false);
//			break;
//		}
//		case "Thêm Hộ Khẩu": {
//			ThemHoKhau_view themHoKhau_view = new ThemHoKhau_view();
//			this.setVisible(false);
//			break;
//		}
//			
//		default:
//			break;
//		}
		if (cString =="Danh sách nhân khẩu") {
			scrollPane_dsHoKhau.setVisible(false);
			scrollPane_dsDongphi.setVisible(false);
			scrollPane_dsKhoanThu.setVisible(false);
			scrollPane_dsNhankhau.setVisible(true);
		}
		else if (cString == "Danh sách hộ khẩu") {
			scrollPane_dsDongphi.setVisible(false);
			scrollPane_dsKhoanThu.setVisible(false);
			scrollPane_dsNhankhau.setVisible(false);
			scrollPane_dsHoKhau.setVisible(true);
		}
		else if (cString == "Danh sách đóng phí") {
			scrollPane_dsKhoanThu.setVisible(false);
			scrollPane_dsNhankhau.setVisible(false);
			scrollPane_dsHoKhau.setVisible(false);
			scrollPane_dsDongphi.setVisible(true);
		}
		else if (cString == "Danh sách khoản thu") {
			scrollPane_dsKhoanThu.setVisible(true);
			scrollPane_dsNhankhau.setVisible(false);
			scrollPane_dsHoKhau.setVisible(false);
			scrollPane_dsDongphi.setVisible(false);
		}
		else if (cString == "Thêm Hộ Khẩu") {
			ThemHoKhau_view themHoKhau_view = new ThemHoKhau_view();
			this.setVisible(false);
		}
		else if (cString == "Thêm Nhân Khẩu") {
			ThemNhanKhau_view themNhanKhau_view = new ThemNhanKhau_view();
			this.setVisible(false);
		}
		
	}
}


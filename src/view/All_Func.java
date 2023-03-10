package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.hokhau_model;
import model.khoanthu_model;
import model.nhankhau_model;
import model.quanly_model;

public class All_Func extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	JPanel panel_thongtin;
	JScrollPane scrollPane_dsNhankhau;
	JScrollPane scrollPane_dsHoKhau;
	JScrollPane scrollPane_dsDongphi;
	JScrollPane scrollPane_dsKhoanThu;
	JScrollPane scrollPane_dsttKhoanThu;
	public static JTable table_nhankhau;
	public static JTable table_hokhau;
	public static JTable table_dongphi;
	public static JTable table_khoanthu;
	public static JTable table_ttkhoanthu;
	
	private JCheckBox jCheckBox = new JCheckBox();
	
	
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
		
		JLabel label_trangchu = new JLabel("Trang Ch???");
		label_trangchu.setForeground(new Color(255, 69, 0));
		label_trangchu.setFont(new Font("Arial", Font.BOLD, 28));
		label_trangchu.setBounds(27, 10, 139, 51);
		panel_trangchu.add(label_trangchu);
		
		JLabel lblHKhu = new JLabel("1. H??? Kh???u");
		lblHKhu.setFont(new Font("Arial", Font.BOLD, 18));
		lblHKhu.setBounds(10, 81, 166, 29);
		panel_chucnang.add(lblHKhu);
		
		JButton btn_themnhankhau = new JButton("Th??m H??? Kh???u");
		btn_themnhankhau.addActionListener(this);
		btn_themnhankhau.setForeground(new Color(0, 0, 128));
		btn_themnhankhau.setBackground(new Color(255, 255, 255));
		btn_themnhankhau.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_themnhankhau.setBounds(20, 109, 156, 29);
		btn_themnhankhau.setFocusable(false);
		panel_chucnang.add(btn_themnhankhau);
		
		JButton btn_suanhankhau = new JButton("S???a H??? Kh???u");
		btn_suanhankhau.setForeground(new Color(0, 0, 128));
		btn_suanhankhau.setBackground(new Color(255, 255, 255));
		btn_suanhankhau.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_suanhankhau.setBounds(20, 148, 156, 29);
		btn_suanhankhau.setFocusable(false);
		btn_suanhankhau.addActionListener(this);
		panel_chucnang.add(btn_suanhankhau);
		
		JLabel lblNhnKhu = new JLabel("2. Nh??n Kh???u");
		lblNhnKhu.setFont(new Font("Arial", Font.BOLD, 18));
		lblNhnKhu.setBounds(10, 187, 166, 29);
		panel_chucnang.add(lblNhnKhu);
		
		JButton btn_themhokhau = new JButton("Th??m Nh??n Kh???u");
		btn_themhokhau.addActionListener(this);
		btn_themhokhau.setForeground(new Color(0, 0, 128));
		btn_themhokhau.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_themhokhau.setFocusable(false);
		btn_themhokhau.setBackground(Color.WHITE);
		btn_themhokhau.setBounds(20, 215, 156, 29);
		panel_chucnang.add(btn_themhokhau);
		
		JButton btn_suahokhau = new JButton("S???a Nh??n Kh???u");
		btn_suahokhau.setForeground(new Color(0, 0, 128));
		btn_suahokhau.setBackground(new Color(255, 255, 255));
		btn_suahokhau.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_suahokhau.setFocusable(false);
		btn_suahokhau.setBounds(20, 255, 156, 29);
		btn_suahokhau.addActionListener(this);
		panel_chucnang.add(btn_suahokhau);
		
		JLabel label_nhankhau_1 = new JLabel("3. Kho???n Thu");
		label_nhankhau_1.setFont(new Font("Arial", Font.BOLD, 18));
		label_nhankhau_1.setBounds(10, 292, 166, 29);
		panel_chucnang.add(label_nhankhau_1);
		
		JButton btn_themkhoanthu = new JButton("Th??m Kho???n Thu");
		btn_themkhoanthu.setForeground(new Color(0, 0, 128));
		btn_themkhoanthu.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_themkhoanthu.setFocusable(false);
		btn_themkhoanthu.setBackground(Color.WHITE);
		btn_themkhoanthu.setBounds(20, 319, 156, 29);
		btn_themkhoanthu.addActionListener(this);
		panel_chucnang.add(btn_themkhoanthu);
		
		JButton btn_suakhoanthu = new JButton("S???a Kho???n Thu");
		btn_suakhoanthu.setForeground(new Color(0, 0, 128));
		btn_suakhoanthu.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_suakhoanthu.setFocusable(false);
		btn_suakhoanthu.setBackground(Color.WHITE);
		btn_suakhoanthu.setBounds(20, 359, 156, 29);
//		btn_suakhoanthu.addActionListener(this);
		panel_chucnang.add(btn_suakhoanthu);
		
		JLabel label_nhankhau_2 = new JLabel("4. ????ng Ph??");
		label_nhankhau_2.setFont(new Font("Arial", Font.BOLD, 18));
		label_nhankhau_2.setBounds(10, 397, 166, 29);
		panel_chucnang.add(label_nhankhau_2);
		
		JButton btn_themnoptien = new JButton("Th??m N???p Ti???n");
		btn_themnoptien.setForeground(new Color(0, 0, 128));
		btn_themnoptien.setFont(new Font("Arial", Font.PLAIN, 16));
		btn_themnoptien.setFocusable(false);
		btn_themnoptien.setBackground(Color.WHITE);
		btn_themnoptien.setBounds(20, 425, 156, 29);
//		btn_themnoptien.addActionListener(this);
		panel_chucnang.add(btn_themnoptien);
		
		JButton btn_xoanoptien = new JButton("X??a N???p Ti???n");
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
		
		//********************table danh s??ch nh??n kh???u***********************//
		
		table_nhankhau = new JTable();
		table_nhankhau.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_nhankhau.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"Quan h??? v???i ch??? h???", "H??? v?? T??n", "B?? Danh", "Ng??y Sinh", "Gi???i T??nh", "N??i Sinh", "Nguy??n Qu??n", "D??n t???c", "T??n Gi??o", "Ngh??? Nghi???p", "N??i l??m vi???c", "CMND", "Ng??y c???p", "N??i c???p", "Chuy???n ?????n ng??y", "N??i ??? tr?????c"
			}
		));
		
		
		scrollPane_dsNhankhau = new JScrollPane(table_nhankhau);
		scrollPane_dsNhankhau.setBounds(0, 0, 951, 508);
		scrollPane_dsNhankhau.setVisible(false);
		panel_thongtin.add(scrollPane_dsNhankhau);
		
		//*******************table danh s??ch h??? kh???u**********************//
		
		table_hokhau = new JTable();
		table_hokhau.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 14));
		table_hokhau.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"M?? h???", "Ch??? h???", "S??? th??nh vi??n", "?????a ch???", "Ng??y l???p", "Ng??y chuy???n ??i", "L?? do chuy???n", "Ng?????i th???c hi???n"
			}
		));
		
		table_hokhau.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row=table_hokhau.getSelectedRow();
				String indexInteger = (String) table_hokhau.getValueAt(row, 0);
				showNhanKhau(indexInteger);
			}
		});
		scrollPane_dsHoKhau = new JScrollPane(table_hokhau);
		scrollPane_dsHoKhau.setBounds(0, 0, 951, 508);
		
		scrollPane_dsHoKhau.setVisible(false);
		panel_thongtin.add(scrollPane_dsHoKhau);
		
		//*****************table danh s??ch ????ng ph??*************************//
		
		table_dongphi = new JTable();
		table_dongphi.getTableHeader().setFont(new Font("Tahoma",Font.PLAIN,14));
		table_dongphi.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
					"M?? h??? n???p","T??n ng?????i n??p", "T??n kho???n thu","S??? Ti???n", "Ng??y thu"
				}
			));		
		scrollPane_dsDongphi = new JScrollPane(table_dongphi);
		scrollPane_dsDongphi.setBounds(0, 0, 951, 508);
		
		scrollPane_dsDongphi.setVisible(false);
		panel_thongtin.add(scrollPane_dsDongphi);
		
		//*****************table danh s??ch kho???n thu***********************//
		
		

		table_khoanthu = new JTable();
		table_khoanthu.getTableHeader().setFont(new Font("Tahoma",Font.PLAIN,14));
		table_khoanthu.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
						"Lo???i kho???n thu","T??n kho???n thu", "s??? ti??n"
				}
			));
		table_khoanthu.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row=table_khoanthu.getSelectedRow();
//				String khoanthu = (String) table_hokhau.getValueAt(0, 0);
				System.out.println(row);
				showTTKhoanThu("abc");
			}
		});

		scrollPane_dsKhoanThu = new JScrollPane(table_khoanthu);
		scrollPane_dsKhoanThu.setBounds(0, 0, 951, 508);
		
		scrollPane_dsKhoanThu.setVisible(false);
		panel_thongtin.add(scrollPane_dsKhoanThu);
		
		DefaultCellEditor de=new DefaultCellEditor(jCheckBox);
		table_ttkhoanthu = new JTable();
		table_ttkhoanthu.getTableHeader().setFont(new Font("Tahoma",Font.PLAIN,14));
		table_ttkhoanthu.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
						"S??? h??? kh???u", "Ch??? h???", "S??? th??nh vi??n", "?????a ch???", "???? n???p"
				}
			));
		table_ttkhoanthu.getColumnModel().getColumn(3).setCellEditor(de);
		scrollPane_dsttKhoanThu = new JScrollPane(table_ttkhoanthu);
		scrollPane_dsttKhoanThu.setBounds(0, 0, 951, 508);
		scrollPane_dsttKhoanThu.setVisible(false);
		panel_thongtin.add(scrollPane_dsttKhoanThu);
		
//		btn_dskhoanthu.addActionListener(this);
//		btn_dsHoKhau.addActionListener(this);
//		btn_dsNhanKhau.addActionListener(this);
//		btn_dsDongPhi.addActionListener(this);	
		JLabel lblNewLabel = new JLabel("Trang ch???");
		contentPane.add(lblNewLabel);
		lblNewLabel.setBounds(0, 20, 198, 71);
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		
		JButton btn_dsHoKhau = new JButton("Danh s??ch h??? kh???u");
		btn_dsHoKhau.setBackground(new Color(255, 255, 255));
		btn_dsHoKhau.setBounds(208, 20, 135, 23);
		contentPane.add(btn_dsHoKhau);
		btn_dsHoKhau.addActionListener(this);
		
		JButton btn_DongPhi = new JButton("Danh s??ch kho???n thu");
		btn_DongPhi.setBackground(new Color(255, 255, 255));
		btn_DongPhi.setBounds(345, 20, 135, 23);
		contentPane.add(btn_DongPhi);
		btn_DongPhi.addActionListener(this);
		
		JButton btn_KhoanThu = new JButton("Danh s??ch ????ng ph??");
		btn_KhoanThu.setBackground(new Color(255, 255, 255));
		btn_KhoanThu.setBounds(482, 20, 135, 23);
		contentPane.add(btn_KhoanThu);
		btn_KhoanThu.addActionListener(this);
		
		this.setTitle("Ph???n m???m qu???n l?? h??? kh???u, nh??n kh???u");		
		this.setVisible(true);

	}

	public static void themHoKhau(hokhau_model hokhau) {
		DefaultTableModel model = (DefaultTableModel) table_hokhau.getModel();
		model.addRow(new Object[] {hokhau.maho, hokhau.chuho, hokhau.soThanhvien, hokhau.diachi, hokhau.ngayLap, hokhau.ngayChuyen, hokhau.lyDoChuyen, hokhau.nguoiTHucHien});	
	}
	
	public void showNhanKhau(String soHK) {
		scrollPane_dsHoKhau.setVisible(false);
		scrollPane_dsDongphi.setVisible(false);
		scrollPane_dsKhoanThu.setVisible(false);
		scrollPane_dsNhankhau.setVisible(true);
		scrollPane_dsttKhoanThu.setVisible(false);
		DefaultTableModel model = (DefaultTableModel) table_nhankhau.getModel();
		model.setRowCount(0);
		for (nhankhau_model nk : quanly_model.dsNhankhau) {
			if (nk.sohokhau.equals(soHK)) {
				model.addRow(new Object[] {nk.quanheChuho, nk.name_nhankhau, nk.biDanhString, nk.birth_nhankhau, nk.gioitinh, nk.noiSinhString, nk.diachi, nk.dantoc, nk.tongiaoString, nk.ngheNghiepString, nk.noilamViecString, nk.cmnd, nk.ngayCap_CCCD, nk.noiCap_CCCD, nk.ngayChuyenDenString, nk.noiOTruocString});
			}
		}
	}
	
	public void showTTKhoanThu(String khoanthu) {
		scrollPane_dsHoKhau.setVisible(false);
		scrollPane_dsDongphi.setVisible(false);
		scrollPane_dsKhoanThu.setVisible(false);
		scrollPane_dsNhankhau.setVisible(false);
		scrollPane_dsttKhoanThu.setVisible(true);
		DefaultTableModel model = (DefaultTableModel) table_ttkhoanthu.getModel();
		model.setRowCount(0);
		for (hokhau_model hk : quanly_model.dsHoKhau) {
			model.addRow(new Object[] {hk.maho, hk.chuho, hk.soThanhvien, hk.diachi, false});
		}
	}
	
	public void ThemKhoanThu(khoanthu_model kt) {
		DefaultTableModel model = (DefaultTableModel) table_khoanthu.getModel();
		model.addRow(new Object[] {kt.tenkhoanthu, kt.loaikhoanthu, kt.Sotien});
	}
	
	public static void refessHoKhau() {
		DefaultTableModel model = (DefaultTableModel) table_hokhau.getModel();
		model.setRowCount(0);
		for (hokhau_model hk : quanly_model.dsHoKhau) {
			model.addRow(new Object[] {hk.maho, hk.chuho, hk.soThanhvien, hk.diachi, hk.ngayLap, hk.ngayChuyen, hk.lyDoChuyen, hk.nguoiTHucHien});	
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cString = e.getActionCommand();
//		switch (cString) {
//		case "Th??m Nh??n Kh???u": {
//			ThemNhanKhau_view themNhanKhau_view = new ThemNhanKhau_view();
//			this.setVisible(false);
//			break;
//		}
//		case "Th??m H??? Kh???u": {
//			ThemHoKhau_view themHoKhau_view = new ThemHoKhau_view();
//			this.setVisible(false);
//			break;
//		}
//			
//		default:
//			break;
//		}
//		if (cString =="Danh s??ch nh??n kh???u") {
//			scrollPane_dsHoKhau.setVisible(false);
//			scrollPane_dsDongphi.setVisible(false);
//			scrollPane_dsKhoanThu.setVisible(false);
//			scrollPane_dsNhankhau.setVisible(true);
//		}
//		else 
		if (cString == "Danh s??ch h??? kh???u") {
			scrollPane_dsDongphi.setVisible(false);
			scrollPane_dsKhoanThu.setVisible(false);
			scrollPane_dsNhankhau.setVisible(false);
			scrollPane_dsttKhoanThu.setVisible(false);
			scrollPane_dsHoKhau.setVisible(true);
		}
		else if (cString == "Danh s??ch ????ng ph??") {
			scrollPane_dsKhoanThu.setVisible(false);
			scrollPane_dsNhankhau.setVisible(false);
			scrollPane_dsHoKhau.setVisible(false);
			scrollPane_dsttKhoanThu.setVisible(false);
			scrollPane_dsDongphi.setVisible(true);
		}
		else if (cString == "Danh s??ch kho???n thu") {
			scrollPane_dsKhoanThu.setVisible(true);
			scrollPane_dsNhankhau.setVisible(false);
			scrollPane_dsHoKhau.setVisible(false);
			scrollPane_dsttKhoanThu.setVisible(false);
			scrollPane_dsDongphi.setVisible(false);
		}
		else if (cString == "Th??m H??? Kh???u") {
			ThemHoKhau_view themHoKhau_view = new ThemHoKhau_view();
			this.setVisible(false);
		}
		else if (cString == "Th??m Nh??n Kh???u") {
			ThemNhanKhau_view themNhanKhau_view = new ThemNhanKhau_view();
			this.setVisible(false);
		}
		else if (cString == "S???a Nh??n Kh???u") {
			SuaNhanKhau_view suaNhanKhau_view = new SuaNhanKhau_view();
			this.setVisible(false);
		}
		else if (cString == "S???a H??? Kh???u") {
			SuaHoKhau_view suaHoKhau_view = new SuaHoKhau_view();
			this.setVisible(false);
		}
		else if (cString == "Th??m Kho???n Thu") {
			ThemKhoanThu_view themKhoanThu_view = new ThemKhoanThu_view();
			this.setVisible(false);
		}
		
	}
}


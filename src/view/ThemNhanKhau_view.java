package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.loginRun;
import model.hokhau_model;
import model.nhankhau_model;
import model.quanly_model;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class ThemNhanKhau_view extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField_SoHk;
	private JTextField textField_HoVaTen;
	private JTextField textField_NS;
	private JTextField textField_NoiSinh;
	private JTextField textField_DanToc;
	private JTextField textField_NoiLamviec;
	private JTextField textField_ngaycap;
	private JTextField textField_ngayCD;
	private JTextField textField_NguyenQuan;
	private JTextField textField_Nghe;
	private JTextField textField_CCD;
	private JTextField textField_noicap;
	private JTextField textField_noioprev;
	private JTextField textField_QH;
	private ButtonGroup btn_nam_nuButtonGroup;
	
	private JRadioButton rdbtnNam;
	private JRadioButton rdbtnNu;
	
	private nhankhau_model nNhankhau;
	private JTextField textField_BiDanh;
	private JTextField textField_tongiao;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ThemNhanKhau_view() {
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
		
		JLabel lblNewLabel = new JLabel("Thêm nhân khẩu");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(413, 11, 410, 90);
		panel.add(lblNewLabel);
		
		JLabel lbl_SoHk = new JLabel("Số Hộ Khẩu:");
		lbl_SoHk.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_SoHk.setBounds(117, 153, 151, 40);
		contentPane.add(lbl_SoHk);
		
		textField_SoHk = new JTextField();
		textField_SoHk.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_SoHk.setBounds(267, 155, 258, 36);
		contentPane.add(textField_SoHk);
		textField_SoHk.setColumns(10);
		
		JLabel lbl_HoVaTen = new JLabel("Họ và tên:");
		lbl_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_HoVaTen.setBounds(117, 226, 125, 40);
		contentPane.add(lbl_HoVaTen);
		
		textField_HoVaTen = new JTextField();
		textField_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_HoVaTen.setBounds(238, 228, 287, 36);
		contentPane.add(textField_HoVaTen);
		textField_HoVaTen.setColumns(10);
		
		JLabel lbl_NoiSinh = new JLabel("Nơi sinh:");
		lbl_NoiSinh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_NoiSinh.setBounds(117, 289, 171, 40);
		contentPane.add(lbl_NoiSinh);
		
		JLabel lbl_Dantoc = new JLabel("Dân tộc:");
		lbl_Dantoc.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_Dantoc.setBounds(117, 351, 171, 40);
		contentPane.add(lbl_Dantoc);
		
		JLabel lbl_NoiLamViec = new JLabel("Nơi làm việc:");
		lbl_NoiLamViec.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_NoiLamViec.setBounds(117, 416, 171, 40);
		contentPane.add(lbl_NoiLamViec);
		
		JLabel lbl_Ngaycap = new JLabel("Ngày cấp:");
		lbl_Ngaycap.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_Ngaycap.setBounds(117, 481, 112, 40);
		contentPane.add(lbl_Ngaycap);
		
		JLabel lblNewLabel_ngayCD = new JLabel("Chuyển đến ngày:");
		lblNewLabel_ngayCD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_ngayCD.setBounds(117, 543, 227, 40);
		contentPane.add(lblNewLabel_ngayCD);
		
		JLabel lblNewLabel_NgaySinh = new JLabel("Ngày sinh:");
		lblNewLabel_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_NgaySinh.setBounds(639, 226, 125, 40);
		contentPane.add(lblNewLabel_NgaySinh);
		
		textField_NS = new JTextField();
		textField_NS.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_NS.setColumns(10);
		textField_NS.setBounds(764, 228, 312, 36);
		contentPane.add(textField_NS);
		
		JLabel lblNewLabel_NguyenQuan = new JLabel("Nguyên quán:");
		lblNewLabel_NguyenQuan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_NguyenQuan.setBounds(639, 289, 161, 40);
		contentPane.add(lblNewLabel_NguyenQuan);
		
		JLabel lblNewLabel_Nghe = new JLabel("Nghề nghiệp:");
		lblNewLabel_Nghe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_Nghe.setBounds(639, 351, 161, 40);
		contentPane.add(lblNewLabel_Nghe);
		
		JLabel lblNewLabel_CCD = new JLabel("CCCD/CMND số:");
		lblNewLabel_CCD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_CCD.setBounds(639, 416, 192, 40);
		contentPane.add(lblNewLabel_CCD);
		
		JLabel lblNewLabel_Noicap = new JLabel("Nơi cấp:");
		lblNewLabel_Noicap.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_Noicap.setBounds(639, 481, 98, 40);
		contentPane.add(lblNewLabel_Noicap);
		
		JLabel lblNewLabel_noioprev = new JLabel("Nơi thường trú trước khi chuyển đến:");
		lblNewLabel_noioprev.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_noioprev.setBounds(639, 543, 437, 40);
		contentPane.add(lblNewLabel_noioprev);
		
		textField_NoiSinh = new JTextField();
		textField_NoiSinh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_NoiSinh.setColumns(10);
		textField_NoiSinh.setBounds(228, 291, 297, 36);
		contentPane.add(textField_NoiSinh);
		
		textField_DanToc = new JTextField();
		textField_DanToc.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_DanToc.setColumns(10);
		textField_DanToc.setBounds(228, 353, 297, 36);
		contentPane.add(textField_DanToc);
		
		textField_NoiLamviec = new JTextField();
		textField_NoiLamviec.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_NoiLamviec.setColumns(10);
		textField_NoiLamviec.setBounds(278, 418, 247, 36);
		contentPane.add(textField_NoiLamviec);
		
		textField_ngaycap = new JTextField();
		textField_ngaycap.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_ngaycap.setColumns(10);
		textField_ngaycap.setBounds(238, 483, 287, 36);
		contentPane.add(textField_ngaycap);
		
		textField_ngayCD = new JTextField();
		textField_ngayCD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_ngayCD.setColumns(10);
		textField_ngayCD.setBounds(325, 545, 200, 36);
		contentPane.add(textField_ngayCD);
		
		textField_NguyenQuan = new JTextField();
		textField_NguyenQuan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_NguyenQuan.setColumns(10);
		textField_NguyenQuan.setBounds(801, 291, 275, 36);
		contentPane.add(textField_NguyenQuan);
		
		textField_Nghe = new JTextField();
		textField_Nghe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_Nghe.setColumns(10);
		textField_Nghe.setBounds(796, 353, 280, 36);
		contentPane.add(textField_Nghe);
		
		textField_CCD = new JTextField();
		textField_CCD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_CCD.setColumns(10);
		textField_CCD.setBounds(829, 418, 247, 36);
		contentPane.add(textField_CCD);
		
		textField_noicap = new JTextField();
		textField_noicap.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_noicap.setColumns(10);
		textField_noicap.setBounds(739, 483, 337, 36);
		contentPane.add(textField_noicap);
		
		textField_noioprev = new JTextField();
		textField_noioprev.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_noioprev.setColumns(10);
		textField_noioprev.setBounds(639, 580, 437, 36);
		contentPane.add(textField_noioprev);
		
		JLabel lblNewLabel_QH = new JLabel("Quan hệ với chủ hộ:");
		lblNewLabel_QH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_QH.setBounds(639, 153, 227, 40);
		contentPane.add(lblNewLabel_QH);
		
		textField_QH = new JTextField();
		textField_QH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_QH.setColumns(10);
		textField_QH.setBounds(876, 155, 200, 36);
		contentPane.add(textField_QH);
		
		JButton btn_save = new JButton("SAVE");
		btn_save.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn_save.setBounds(925, 666, 151, 40);
		btn_save.addActionListener(this);
		contentPane.add(btn_save);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack.setBounds(117, 666, 151, 40);
		btnBack.addActionListener(this);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_Gioitinh = new JLabel("Giới tính:");
		lblNewLabel_Gioitinh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_Gioitinh.setBounds(117, 594, 112, 40);
		contentPane.add(lblNewLabel_Gioitinh);
		
		btn_nam_nuButtonGroup = new ButtonGroup();
		
		rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNam.setBounds(263, 590, 109, 40);
		contentPane.add(rdbtnNam);
		
		rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setBackground(new Color(240, 240, 240));
		rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNu.setBounds(416, 588, 109, 38);
		contentPane.add(rdbtnNu);
		
		btn_nam_nuButtonGroup.add(rdbtnNu);
		btn_nam_nuButtonGroup.add(rdbtnNam);
		
		JLabel lbl_BiDanh = new JLabel("Bí Danh:");
		lbl_BiDanh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_BiDanh.setBounds(416, 644, 112, 40);
		contentPane.add(lbl_BiDanh);
		
		textField_BiDanh = new JTextField();
		textField_BiDanh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_BiDanh.setColumns(10);
		textField_BiDanh.setBounds(538, 648, 258, 36);
		contentPane.add(textField_BiDanh);
		
		JLabel lbl_TonGiao = new JLabel("Tôn Giáo:");
		lbl_TonGiao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_TonGiao.setBounds(416, 685, 112, 40);
		contentPane.add(lbl_TonGiao);
		
		textField_tongiao = new JTextField();
		textField_tongiao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_tongiao.setColumns(10);
		textField_tongiao.setBounds(542, 682, 258, 36);
		contentPane.add(textField_tongiao);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cString = e.getActionCommand();
		switch (cString) {
		case "SAVE": {
			this.setVisible(false);
			loginRun.lg.getAll_Func().setVisible(true);
			nNhankhau = new nhankhau_model();
			
			boolean check = false;
			for (hokhau_model hokhau : quanly_model.dsHoKhau) {
				if (Integer.parseInt(textField_SoHk.getText()) == Integer.parseInt(hokhau.maho)) {
					check = true;
					
					break;
				}
			}
			
			if (check == true) {
				try {
					nNhankhau.sohokhau = Integer.parseInt(textField_SoHk.getText());
					nNhankhau.quanheChuho = textField_QH.getText();
					nNhankhau.name_nhankhau = textField_HoVaTen.getText();
					nNhankhau.birth_nhankhau = textField_NS.getText();
					nNhankhau.noiSinhString = textField_NoiSinh.getText();
					nNhankhau.diachi = textField_NguyenQuan.getText();
					nNhankhau.dantoc= textField_DanToc.getText();
					nNhankhau.ngheNghiepString = textField_Nghe.getText();
					nNhankhau.noilamViecString = textField_NoiLamviec.getText();
					nNhankhau.cmnd = textField_CCD.getText();
					nNhankhau.ngayCap_CCCD = textField_ngaycap.getText();
					nNhankhau.noiCap_CCCD = textField_noicap.getText();
					nNhankhau.ngayChuyenDenString = textField_ngayCD.getText();
					nNhankhau.noiOTruocString = textField_noioprev.getText();
					nNhankhau.biDanhString = textField_BiDanh.getText();
					nNhankhau.tongiaoString = textField_tongiao.getText();
					
					if(rdbtnNam.isSelected()) {
						nNhankhau.gioitinh = "Nam";
					}
					else {
						nNhankhau.gioitinh = "Nu";
					}
					JOptionPane.showInternalMessageDialog(null, "Insert success!");
					quanly_model.dsNhankhau.add(nNhankhau);
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showInternalMessageDialog(null, "Insert not success!");
				}
			}
			
		
			break;
		}
		case "BACK": {
			this.setVisible(false);
			loginRun.lg.getAll_Func().setVisible(true);
			break;
		}	
			

		default:
			break;
		}
	}
}

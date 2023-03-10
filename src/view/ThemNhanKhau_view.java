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
	private JTextField textField_NoiThuongTru;
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
	private JTextField textField_quocTich;
	

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
		
		JLabel lblNewLabel = new JLabel("Th??m nh??n kh???u");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(413, 11, 410, 90);
		panel.add(lblNewLabel);
		
		JLabel lbl_SoHk = new JLabel("S??? H??? Kh???u:");
		lbl_SoHk.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_SoHk.setBounds(117, 144, 151, 40);
		contentPane.add(lbl_SoHk);
		
		textField_SoHk = new JTextField();
		textField_SoHk.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_SoHk.setBounds(261, 146, 293, 36);
		contentPane.add(textField_SoHk);
		textField_SoHk.setColumns(10);
		
		JLabel lbl_HoVaTen = new JLabel("H??? v?? t??n:");
		lbl_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_HoVaTen.setBounds(117, 205, 125, 40);
		contentPane.add(lbl_HoVaTen);
		
		textField_HoVaTen = new JTextField();
		textField_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_HoVaTen.setBounds(234, 207, 320, 36);
		contentPane.add(textField_HoVaTen);
		textField_HoVaTen.setColumns(10);
		
		JLabel lbl_NoiThuongTru = new JLabel("N??i th?????ng tr??:");
		lbl_NoiThuongTru.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_NoiThuongTru.setBounds(117, 307, 178, 40);
		contentPane.add(lbl_NoiThuongTru);
		
		JLabel lbl_Dantoc = new JLabel("D??n t???c:");
		lbl_Dantoc.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_Dantoc.setBounds(117, 365, 112, 40);
		contentPane.add(lbl_Dantoc);
		
		JLabel lbl_NoiLamViec = new JLabel("N??i l??m vi???c:");
		lbl_NoiLamViec.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_NoiLamViec.setBounds(639, 416, 171, 40);
		contentPane.add(lbl_NoiLamViec);
		
		JLabel lbl_Ngaycap = new JLabel("Ng??y c???p:");
		lbl_Ngaycap.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_Ngaycap.setBounds(639, 481, 112, 40);
		contentPane.add(lbl_Ngaycap);
		
		JLabel lblNewLabel_ngayCD = new JLabel("Chuy???n ?????n ng??y:");
		lblNewLabel_ngayCD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_ngayCD.setBounds(639, 543, 210, 40);
		contentPane.add(lblNewLabel_ngayCD);
		
		JLabel lblNewLabel_NgaySinh = new JLabel("Ng??y sinh:");
		lblNewLabel_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_NgaySinh.setBounds(639, 256, 125, 40);
		contentPane.add(lblNewLabel_NgaySinh);
		
		textField_NS = new JTextField();
		textField_NS.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_NS.setColumns(10);
		textField_NS.setBounds(771, 258, 305, 36);
		contentPane.add(textField_NS);
		
		JLabel lblNewLabel_NguyenQuan = new JLabel("Nguy??n qu??n:");
		lblNewLabel_NguyenQuan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_NguyenQuan.setBounds(639, 307, 161, 40);
		contentPane.add(lblNewLabel_NguyenQuan);
		
		JLabel lblNewLabel_Nghe = new JLabel("Ngh??? nghi???p:");
		lblNewLabel_Nghe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_Nghe.setBounds(121, 416, 161, 40);
		contentPane.add(lblNewLabel_Nghe);
		
		JLabel lblNewLabel_CCD = new JLabel("CCCD/CMND s???:");
		lblNewLabel_CCD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_CCD.setBounds(117, 481, 192, 40);
		contentPane.add(lblNewLabel_CCD);
		
		JLabel lblNewLabel_Noicap = new JLabel("N??i c???p:");
		lblNewLabel_Noicap.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_Noicap.setBounds(119, 543, 98, 40);
		contentPane.add(lblNewLabel_Noicap);
		
		JLabel lblNewLabel_noioprev = new JLabel("N??i th?????ng tr?? tr?????c khi chuy???n ?????n:");
		lblNewLabel_noioprev.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_noioprev.setBounds(117, 594, 437, 40);
		contentPane.add(lblNewLabel_noioprev);
		
		textField_NoiThuongTru = new JTextField();
		textField_NoiThuongTru.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_NoiThuongTru.setColumns(10);
		textField_NoiThuongTru.setBounds(291, 309, 263, 36);
		contentPane.add(textField_NoiThuongTru);
		
		textField_DanToc = new JTextField();
		textField_DanToc.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_DanToc.setColumns(10);
		textField_DanToc.setBounds(224, 367, 330, 36);
		contentPane.add(textField_DanToc);
		
		textField_NoiLamviec = new JTextField();
		textField_NoiLamviec.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_NoiLamviec.setColumns(10);
		textField_NoiLamviec.setBounds(789, 418, 287, 36);
		contentPane.add(textField_NoiLamviec);
		
		textField_ngaycap = new JTextField();
		textField_ngaycap.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_ngaycap.setColumns(10);
		textField_ngaycap.setBounds(761, 483, 315, 36);
		contentPane.add(textField_ngaycap);
		
		textField_ngayCD = new JTextField();
		textField_ngayCD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_ngayCD.setColumns(10);
		textField_ngayCD.setBounds(847, 545, 229, 36);
		contentPane.add(textField_ngayCD);
		
		textField_NguyenQuan = new JTextField();
		textField_NguyenQuan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_NguyenQuan.setColumns(10);
		textField_NguyenQuan.setBounds(805, 309, 271, 36);
		contentPane.add(textField_NguyenQuan);
		
		textField_Nghe = new JTextField();
		textField_Nghe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_Nghe.setColumns(10);
		textField_Nghe.setBounds(274, 418, 280, 36);
		contentPane.add(textField_Nghe);
		
		textField_CCD = new JTextField();
		textField_CCD.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_CCD.setColumns(10);
		textField_CCD.setBounds(307, 483, 247, 36);
		contentPane.add(textField_CCD);
		
		textField_noicap = new JTextField();
		textField_noicap.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_noicap.setColumns(10);
		textField_noicap.setBounds(217, 545, 337, 36);
		contentPane.add(textField_noicap);
		
		textField_noioprev = new JTextField();
		textField_noioprev.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_noioprev.setColumns(10);
		textField_noioprev.setBounds(538, 596, 538, 36);
		contentPane.add(textField_noioprev);
		
		JLabel lblNewLabel_QH = new JLabel("Quan h??? v???i ch??? h???:");
		lblNewLabel_QH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_QH.setBounds(639, 144, 227, 40);
		contentPane.add(lblNewLabel_QH);
		
		textField_QH = new JTextField();
		textField_QH.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_QH.setColumns(10);
		textField_QH.setBounds(876, 146, 200, 36);
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
		
		JLabel lblNewLabel_Gioitinh = new JLabel("Gi???i t??nh:");
		lblNewLabel_Gioitinh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_Gioitinh.setBounds(639, 205, 112, 40);
		contentPane.add(lblNewLabel_Gioitinh);
		
		btn_nam_nuButtonGroup = new ButtonGroup();
		
		rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNam.setBounds(771, 205, 109, 40);
		contentPane.add(rdbtnNam);
		
		rdbtnNu = new JRadioButton("N???");
		rdbtnNu.setBackground(new Color(240, 240, 240));
		rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNu.setBounds(898, 208, 109, 38);
		contentPane.add(rdbtnNu);
		
		btn_nam_nuButtonGroup.add(rdbtnNu);
		btn_nam_nuButtonGroup.add(rdbtnNam);
		
		JLabel lbl_BiDanh = new JLabel("B?? Danh:");
		lbl_BiDanh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_BiDanh.setBounds(117, 256, 112, 40);
		contentPane.add(lbl_BiDanh);
		
		textField_BiDanh = new JTextField();
		textField_BiDanh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_BiDanh.setColumns(10);
		textField_BiDanh.setBounds(224, 258, 330, 36);
		contentPane.add(textField_BiDanh);
		
		JLabel lbl_TonGiao = new JLabel("T??n Gi??o:");
		lbl_TonGiao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_TonGiao.setBounds(639, 365, 112, 40);
		contentPane.add(lbl_TonGiao);
		
		textField_tongiao = new JTextField();
		textField_tongiao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_tongiao.setColumns(10);
		textField_tongiao.setBounds(749, 367, 327, 36);
		contentPane.add(textField_tongiao);
		
		JLabel lbl_QuocTich = new JLabel("Qu???c t???ch:");
		lbl_QuocTich.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_QuocTich.setBounds(355, 637, 125, 40);
		contentPane.add(lbl_QuocTich);
		
		textField_quocTich = new JTextField();
		textField_quocTich.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_quocTich.setColumns(10);
		textField_quocTich.setBounds(475, 637, 229, 36);
		contentPane.add(textField_quocTich);
		
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
				if (textField_SoHk.getText().equals(hokhau.maho)) {
					check = true;
					
					break;
				}
			}
			
			if (check == true) {
				try {
					nNhankhau.sohokhau = textField_SoHk.getText();
					nNhankhau.quanheChuho = textField_QH.getText();
					nNhankhau.name_nhankhau = textField_HoVaTen.getText();
					nNhankhau.birth_nhankhau = textField_NS.getText();
					nNhankhau.noiSinhString = textField_NguyenQuan.getText();
					nNhankhau.diachi = textField_NoiThuongTru.getText();
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
					nNhankhau.quocTich = textField_quocTich.getText();
					
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

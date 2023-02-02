package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.interceptors.ResultSetScannerInterceptor;
import com.mysql.cj.xdevapi.Statement;

import database.ConnectionMySQL;
import model.hokhau_model;
import model.nhankhau_model;
import model.quanly_model;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class login extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField Text_userName;
	private JPasswordField TExt_password;
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
		
		Text_userName = new JTextField();
		Text_userName.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Text_userName.setBackground(new Color(255, 255, 255));
		Text_userName.setBounds(392, 175, 127, 30);
		contentPane.add(Text_userName);
		Text_userName.setColumns(10);
		
		TExt_password = new JPasswordField();
		TExt_password.setFont(new Font("Tahoma", Font.PLAIN, 22));
		TExt_password.setBounds(392, 231, 127, 30);
		contentPane.add(TExt_password);
		
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
			String userName = Text_userName.getText();
			String passWork = passString(TExt_password.getPassword());
			
			try {
				Connection con = ConnectionMySQL.getConnection();
				java.sql.Statement st = con.createStatement();
				String querry = "Select * from users";
				ResultSet rs = st.executeQuery(querry);
				while (rs.next()) {
					String urseNameString = rs.getString(2);
					String passworkString = rs.getString(3);
					int ID = rs.getInt(1);
					System.out.println("----------------");
					System.out.println(userName+ ":" + urseNameString);
					System.out.println(passWork + ":" + passworkString);
					if (userName.equals(urseNameString)  && passWork.equals(passworkString)) {
						System.out.println("login with userName: "+ userName + " and passWork: " + passWork);
						JOptionPane.showInternalMessageDialog(null, "Login success!");
						all_Func = new All_Func();
						this.setVisible(false);
						break;
					}
				}
				
				querry = "select maHoKhau from ho_khau";
				rs= st.executeQuery(querry);
				Map<String, Integer> map_hk = new HashMap<String, Integer>();
				while (rs.next()) {
					String mahoString = rs.getString("maHoKhau");
					map_hk.put(mahoString, 0);
				}
				
				querry = "Select * from nhan_khau";
				rs = st.executeQuery(querry);
				while (rs.next()) {
					nhankhau_model nk = new nhankhau_model();
					nk.ID_nhankhau = rs.getInt("maNhanKhau");
					nk.sohokhau = rs.getString("maHoKhau");
					nk.quanheChuho = rs.getString("quanHeVoiChuHo");
					nk.name_nhankhau = rs.getString("hoTen");
					nk.birth_nhankhau = rs.getString("ngaySinh");
					nk.quocTich = rs.getString("quocTich");
					nk.gioitinh = rs.getString("gioiTinh");
					nk.diachi = rs.getString("diaChi");
					nk.noiSinhString = rs.getString("noiSinh");
					nk.biDanhString = rs.getString("biDanh");
					nk.dantoc = rs.getString("danToc");
					nk.tongiaoString = rs.getString("tonGiao");
					nk.ngheNghiepString = rs.getString("ngheNghiep");
					nk.noilamViecString = rs.getString("noiLamViec");
					nk.ngayChuyenDenString = rs.getString("chuyenDenNgay");
					nk.noiOTruocString = rs.getString("noiOTruoc");
					quanly_model.dsNhankhau.add(nk);
//					map_hk.replace(nk.sohokhau, map_hk.get(nk.sohokhau) +1);
					map_hk.put(nk.sohokhau, map_hk.get(nk.sohokhau) +1);
				}
				
				querry = "Select * from cccd";
				rs = st.executeQuery(querry);
			
				while (rs.next()) {
					int id = rs.getInt("ID_nhankhau");
					String cccd = rs.getString("soCCCD");
					String nc = rs.getString("ngayCap");
					String noiC = rs.getString("noiCap");
					for (nhankhau_model nk : quanly_model.dsNhankhau) {
						if (nk.ID_nhankhau == id) {
							nk.cmnd = cccd;
							nk.ngayCap_CCCD = nc;
							nk.noiCap_CCCD = noiC;
							break;
						}
					}
				}
				
				querry = "Select * from ho_khau";
				rs = st.executeQuery(querry);
				while (rs.next()) {
					hokhau_model hk = new hokhau_model();
					hk.maho = rs.getString("maHoKhau");
					hk.idChuHo = rs.getInt("idChuHo");
					hk.diachi = rs.getString("diaChi");
					hk.ngayLap = rs.getString("ngayLap");
					hk.ngayChuyen = rs.getString("ngayChuyenDi");
					hk.lyDoChuyen = rs.getString("lyDoChuyen");
					hk.nguoiTHucHien = rs.getString("nguoiThucHien");
					for (nhankhau_model nk : quanly_model.dsNhankhau) {
						if (nk.ID_nhankhau == hk.idChuHo) {
							hk.chuho = nk.name_nhankhau;
							break;
						}
					}
					
					Set<String> set = map_hk.keySet();
			        for (String key : set) {
			            if (hk.maho.equals(key)) {
			            	hk.soThanhvien = map_hk.get(key);
			            	System.out.println(map_hk.get(key));
			            	break;
			            }
			        }
					quanly_model.dsHoKhau.add(hk);
				}
				
				All_Func.refessHoKhau();
				con.close();
				return;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showInternalMessageDialog(null, "Login not success!");
		}
		
	}

	public All_Func getAll_Func() {
		return all_Func;
	}

	public void setAll_Func(All_Func all_Func) {
		this.all_Func = all_Func;
	}
	
	public String passString(char[] pass) {
		String q = "";
		for (int i= 0; i< pass.length; i++) {
			q += pass[i];
		}
		return q;
	}
	
}

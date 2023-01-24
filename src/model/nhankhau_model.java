package model;

public class nhankhau_model {
	public int sohokhau;
	public String quanheChuho;
	public String name_nhankhau;
	public String birth_nhankhau;
	public String noiSinhString;
	public String diachi;
	public String dantoc;
	public String ngheNghiepString;
	public String noilamViecString;
	public String cmnd;
	public String noiCap_CCCD;
	public String ngayCap_CCCD;
	public String gioitinh;
	public String ngayChuyenDenString;
	public String noiOTruocString;
	public String biDanhString;
	public String tongiaoString;
	
	
	public nhankhau_model(String cmnd, String name_nhankhau, String birth_nhankhau, String gioitinh,
			int hokhau, String quanheChuho, String dantoc,String diachi, String noiCap_CCCD, String ngayCap_CCCD, String ngayChuyenDenString, String noiOTruocString, String noiSinhString) {
		super();
		this.cmnd = cmnd;
		this.name_nhankhau = name_nhankhau;
		this.birth_nhankhau = birth_nhankhau;
		this.gioitinh = gioitinh;
		this.sohokhau = hokhau;
		this.quanheChuho = quanheChuho;
		this.dantoc = dantoc;
		this.diachi = diachi;
		this.noiCap_CCCD = noiCap_CCCD;
		this.ngayCap_CCCD = ngayCap_CCCD;
		this.ngayChuyenDenString = ngayChuyenDenString;
		this.noiOTruocString = noiOTruocString;
		this.noiSinhString = noiSinhString;
	}
	public nhankhau_model() {
		
	}
}

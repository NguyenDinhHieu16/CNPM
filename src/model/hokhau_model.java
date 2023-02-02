package model;

public class hokhau_model {
	public String maho;
	public String chuho;
	public String diachi;
	public String ngayChuyen;
	public String lyDoChuyen;
	public String nguoiTHucHien;
	public String ngayLap;
	public int soThanhvien;
	public int idChuHo;
	
	public hokhau_model() {
		
	}
	
	public hokhau_model(String maho, String chuho, String diachi, String ngayChuyen, 
			String lyDoChuyen, String nguoiTHucHien, String ngayLap) {
		this.maho = maho;
		this.chuho = chuho;
		this.diachi = diachi;
		this.ngayChuyen = ngayChuyen;
		this.lyDoChuyen = lyDoChuyen;
		this.nguoiTHucHien = nguoiTHucHien;
		this.ngayLap = ngayLap;
	}
}

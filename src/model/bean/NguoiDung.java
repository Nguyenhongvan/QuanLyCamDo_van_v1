package model.bean;

/**
 * 
 * @author keeps
 *
 */
public class NguoiDung {
	private String taiKhoan;
	private String matKhau;
	
	// hàm tạo mặc định
	public NguoiDung() {
		super();
	}
	
	// hàm tạo có đối số
	public NguoiDung(String taiKhoan, String matKhau) {
		super();
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String getTaiKhoan() {
		return taiKhoan;
	}
	
	/**
	 * 
	 * @param taiKhoan
	 */
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String getMatKhau() {
		return matKhau;
	}
	
	/**
	 * 
	 * @param matKhau
	 */
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
}

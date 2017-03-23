/**
 * 
 */
package form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.StringProcess;

/**
 * @author keeps
 *
 */
public class TrangDangNhapVaBanHangForm extends ActionForm {
	// dang nhap vao he thong
	private String taiKhoan;
	private String matKhau;
	private String thongBao;
	private String submit;
	
	// ham tao mac dinh
	public TrangDangNhapVaBanHangForm() {
		super();
	}
	
	// ham tao co doi so
	public TrangDangNhapVaBanHangForm(String taiKhoan, String matKhau, String thongBao) {
		super();
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.thongBao = thongBao;
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
	
	/**
	 * 
	 * @return String
	 */
	public String getSubmit() {
		return submit;
	}

	/**
	 * 
	 * @param submit
	 */
	public void setSubmit(String submit) {
		this.submit = submit;
	}

	/**
	 * 
	 * @return String
	 */
	public String getThongBao() {
		return thongBao;
	}
	
	/**
	 * 
	 * @param thongBao
	 */
	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}
	
	/* (non-Javadoc)
	 * @see org.apache.struts.action.ActionForm#validate(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		if(StringProcess.notValid(taiKhoan)) {
			actionErrors.add("taiKhoanError", new ActionMessage("error.taiKhoan"));
		}
		if(StringProcess.notValid(matKhau)) {
			actionErrors.add("matKhauError", new ActionMessage("error.matKhau"));
		}
		return actionErrors;
	}
}

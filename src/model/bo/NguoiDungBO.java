/**
 * 
 */
package model.bo;

import model.dao.NguoiDungDAO;

/**
 * @author keeps
 *
 */
public class NguoiDungBO {
	NguoiDungDAO nguoiDungDAO = new NguoiDungDAO();
	
	// ham kiem tra dang nhap
	public boolean checkLogin(String taiKhoan, String matKhau) {
		return nguoiDungDAO.checkLogin(taiKhoan, matKhau);
	}
}

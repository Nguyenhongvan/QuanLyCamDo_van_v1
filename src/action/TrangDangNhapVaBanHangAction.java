/**
 * 
 */
package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.TrangDangNhapVaBanHangForm;
import model.bo.NguoiDungBO;

/**
 * @author keeps
 *
 */
public class TrangDangNhapVaBanHangAction extends Action {
	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// phan dang nhap vao he thong
		TrangDangNhapVaBanHangForm trangDangNhapVaBanHangForm = (TrangDangNhapVaBanHangForm) form;
		String taiKhoan = trangDangNhapVaBanHangForm.getTaiKhoan();
		String matKhau = trangDangNhapVaBanHangForm.getMatKhau();
		NguoiDungBO nguoiDungBO = new NguoiDungBO();
		if("submit".equals(trangDangNhapVaBanHangForm.getSubmit())) {
			if(nguoiDungBO.checkLogin(taiKhoan, matKhau)) {
				return mapping.findForward("trangadmin");
			} else {
				return mapping.findForward("trangchu");
			}
		} 
		return mapping.getInputForward();
	}
}

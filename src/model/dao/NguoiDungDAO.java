/**
 * 
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author keeps
 *
 */
public class NguoiDungDAO {
	String url = "jdbc:sqlserver://localhost:1433;databaseName=quanlycamdo_van";
	String userName = "sa";
	String password = "vannguyen";
	Connection connection;
	 
	// hàm kết nối vào cơ sở du liệu
	void connect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ket noi loi");
		}
	}
	
	// ham kiem tra dang nhap vao he thong
	public boolean checkLogin(String taiKhoan, String matKhau) {
		String sql = String.format("SELECT TaiKhoan, MatKhau FROM NguoiDung WHERE TaiKhoan = '%s',"
				+ "MatKhau = '%s'", taiKhoan, matKhau);
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Dang nhap that bai");
		}
		return false;
	}
}

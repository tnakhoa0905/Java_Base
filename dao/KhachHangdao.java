package org.o7planning.hellospringmvc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.o7planning.hellospringmvc.bean.KhachHangbean;

public class KhachHangdao {
	public KhachHangbean ktdn(String un, String pass) throws Exception{
		Connect dc = new Connect();
		dc.KetNoi();
		//b2: lay du lieu ve
		String sql = "Select * from KhachHang where tendn=? and pass=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, un);
		cmd.setString(2, pass);
		ResultSet rs = cmd.executeQuery();
		if (rs.next()==false) return null;
		else {
			
			String makh=rs.getString("makh");
    		String hoten=rs.getString("hoten");
    		String diachi=rs.getString("diachi");
    		String tendn=rs.getString("tendn");
    		String matkhau=rs.getString("pass");
    		KhachHangbean kh=new KhachHangbean(makh, hoten, diachi,tendn, matkhau);
    		rs.close();
	    	dc.cn.close();
    		return kh;
			}
}
}

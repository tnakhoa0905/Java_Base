package org.o7planning.hellospringmvc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.LoaiSachbean;

public class LoaiSachdao {
	Connect cn = new Connect();
	public ArrayList<LoaiSachbean> getloai() throws Exception{
		ArrayList<LoaiSachbean> ds= new ArrayList<LoaiSachbean>();
		cn.KetNoi();
		String sql = "select *\r\n"
					+ "from loai";
		PreparedStatement cmd = Connect.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			LoaiSachbean new_loai = new LoaiSachbean(rs.getString(1),rs.getString(2));
			ds.add(new_loai);
		}
		rs.close();
    	Connect.cn.close();
		return ds;

    }
}

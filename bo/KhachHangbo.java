package org.o7planning.hellospringmvc.bo;

import org.o7planning.hellospringmvc.bean.KhachHangbean;
import org.o7planning.hellospringmvc.dao.KhachHangdao;

public class KhachHangbo {
	KhachHangdao khdao= new KhachHangdao();
	public KhachHangbean ktdn(String un, String pass) throws Exception{
		return khdao.ktdn(un, pass);
	}
}

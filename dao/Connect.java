package org.o7planning.hellospringmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public static Connection cn;
    public void KetNoi() throws Exception{
    	//B1: Xac dinh HQTCSDL
    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	System.out.println("Da xac dinh HQTCSDL");
    	//B2: Ket noi vao csdl
    	String url="jdbc:sqlserver://DESKTOP-D3KKHSJ\\SQLEXPRESS:1433;databaseName=QlSach;user=sa; password=123456";
    	cn=DriverManager.getConnection(url);
    	System.out.println("Da ket noi");
    }
}

package com.java.Dao;
import java.sql.*;
/**
 * 连接数据库
 * @author 86184
 *
 */
public class GetConnection {
	private static Connection conn;  	  //数据库连接对象
	private static PreparedStatement pstm;//预编译指令集
	private static Statement stmt; 		  //命令集
	private static ResultSet rs;  		  //结果集
	
	private static final String className="com.microsoft.sqlserver.jdbc.SQLServerDriver";//数据库驱动
	private static final String url="jdbc:sqlserver://localhost:1433;DatabaseName=db_supermarket";//连接数据库的URL
	
	private static final String user="sa";
	private static final String passWord="123456";
	
	public GetConnection() {   								
		super();
	}
	
	public static Connection getCon() throws ClassNotFoundException {  						//2.定义获取数据库连接方法getCon(),返回值为Connection对象
		try {
			Class.forName(className);	//1.加载数据库驱动
			conn=DriverManager.getConnection(url,user,passWord);//2.获取数据库连接
		} catch (SQLException e) {
			System.out.println("数据库连接失败！！！");
			conn=null;
			e.printStackTrace();
		}
		return conn;//返回数据库连接对象
	}
	
	public static void closeAll() {
		 
			try {
				if(rs!=null) {
					rs.close();
					rs=null;
				}
				if(pstm!=null) {
					pstm.close();
					pstm=null;
				}
				if(stmt!=null) {
					stmt.close();
					stmt=null;
				}
				if(conn!=null) {
					conn.close();
					conn=null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
}
	


	


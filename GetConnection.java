package com.java.Dao;
import java.sql.*;
/**
 * �������ݿ�
 * @author 86184
 *
 */
public class GetConnection {
	private static Connection conn;  	  //���ݿ����Ӷ���
	private static PreparedStatement pstm;//Ԥ����ָ�
	private static Statement stmt; 		  //���
	private static ResultSet rs;  		  //�����
	
	private static final String className="com.microsoft.sqlserver.jdbc.SQLServerDriver";//���ݿ�����
	private static final String url="jdbc:sqlserver://localhost:1433;DatabaseName=db_supermarket";//�������ݿ��URL
	
	private static final String user="sa";
	private static final String passWord="123456";
	
	public GetConnection() {   								
		super();
	}
	
	public static Connection getCon() throws ClassNotFoundException {  						//2.�����ȡ���ݿ����ӷ���getCon(),����ֵΪConnection����
		try {
			Class.forName(className);	//1.�������ݿ�����
			conn=DriverManager.getConnection(url,user,passWord);//2.��ȡ���ݿ�����
		} catch (SQLException e) {
			System.out.println("���ݿ�����ʧ�ܣ�����");
			conn=null;
			e.printStackTrace();
		}
		return conn;//�������ݿ����Ӷ���
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
	


	


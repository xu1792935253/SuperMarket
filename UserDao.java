package com.java.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java.model.User1;

/**
 * @author 86184
 *
 */
public class UserDao {
	/**
	 * µÇÂ¼ÑéÖ¤
	 * @param conn
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User1 login(Connection conn,User1 user)throws Exception {
		User1 resultUser=null;
		String sql="select * from User1  where userName=? and passWord=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassWord());
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			resultUser=new User1();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassWord(rs.getString("passWord"));
		}
		return resultUser;
	}
	
	/**
	 * ×¢²á
	 * 
	 */
	public int regist(Connection conn,User1 user)throws Exception{
		String sql="insert into User1 values(?,?,?,?,?)";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		pstmt.setInt(1,user.getId() );;
		pstmt.setInt(2,user.getAge() );;
		pstmt.setString(3,user.getSex() );;
		pstmt.setString(4,user.getUserName() );;
		pstmt.setString(5, user.getPassWord());;
		
		return pstmt.executeUpdate();
		
	}
}

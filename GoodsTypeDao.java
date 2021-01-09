package com.java.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.model.GoodsType;
import com.java.util.StringIsEmpty;

/**
 * ��Ʒ���Dao��
 * @author 86184
 *
 */
public class GoodsTypeDao {
	/**
	 * ��Ʒ������
	 */
	public int addGoodsType(Connection con,GoodsType goodsType) throws SQLException {
		String sql="insert into goods_type(goodsType,goodsDesc)  values(?,?)";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1,goodsType.getGoodsType() );
		pstmt.setString(2, goodsType.getGoodsDesc());
		
		return pstmt.executeUpdate();
		
	}
	
	/**
	 * ��Ʒ����ѯ
	 */
	public ResultSet list(Connection con,GoodsType goodsType) throws SQLException{
		String sql="select *  from goods_type where goodsType=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1,goodsType.getGoodsType());
		return pstmt.executeQuery();

	}
	
	public ResultSet listAll(Connection con,GoodsType goodsType) throws SQLException{
		String sql="select *  from goods_type ";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1,goodsType.getGoodsType());
		return pstmt.executeQuery();

	}
	/**
	 * ��Ʒ���ɾ��
	 */
	
	public int delete(Connection con,int id)throws Exception{
		String sql="delete from goods_type where id=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setInt(1,id );
		return pstmt.executeUpdate();
		
		
	}
	
	/**
	 * ��Ʒ����޸�
	 */
	public int update(Connection con,GoodsType goodsType)throws Exception{
		String sql="update  goods_type set goodsType=?,goodsDesc=? where id=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1,goodsType.getGoodsType() );
		pstmt.setString(2, goodsType.getGoodsDesc());
		pstmt.setInt(3,goodsType.getId());
		return pstmt.executeUpdate();
			
	}

}

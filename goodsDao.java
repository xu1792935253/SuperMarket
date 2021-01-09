package com.java.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.model.Goods;
import com.java.model.GoodsType;

public class goodsDao {
	/*
	 * 1.商品添加
	 */
	public int add(Connection con,Goods goods)throws Exception{
		String sql="insert into goods(goodsName,price,goodsType,number)  values(?,?,?,?)";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1,goods.getGoodsName() );
		pstmt.setFloat(2, goods.getPrice());
		pstmt.setString(3, goods.getGoodsType());
		pstmt.setInt(4, goods.getNumber());
		
		return pstmt.executeUpdate();
	}
	/*
	 * 2.商品查询
	 */
	public ResultSet listGoods(Connection con,Goods goods) throws Exception{
		String sql="select *  from goods where goodsName=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1, goods.getGoodsName());
		return pstmt.executeQuery();

	}
	/**
	 * 3.商品修改
	 */
	public int Goodsupdate(Connection con,Goods goods)throws Exception{
		String sql="update  goods set goodsName=?,price=?,goodsType=?,number=?  where id=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1,goods.getGoodsName() );
		pstmt.setFloat(2, goods.getPrice());
		pstmt.setString(3,goods.getGoodsType());
		pstmt.setInt(4, goods.getNumber());
		return pstmt.executeUpdate();
	}
	
	/**
	 * 4.商品删除
	 * 
	 */
	public int Goodsdelete(Connection con,int id)throws Exception{
		String sql="delete from goods where id=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setInt(1,id );
		return pstmt.executeUpdate();
		
		
	}
}

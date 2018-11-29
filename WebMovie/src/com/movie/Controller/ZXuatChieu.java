package com.movie.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.movie.Connect.ConnectionUtils;
import com.movie.beans.PhongChieu;
import com.movie.beans.XuatChieu;


public class ZXuatChieu {
	/*static Connection conn;
	public ZXuatChieu() throws ClassNotFoundException, SQLException {
		conn = ConnectionUtils.getMyConnection();
	}
	public List<XuatChieu> getXuatChieu()
	{
		List<XuatChieu> ZXuatChieu = new ArrayList<>();
		 String sql = "select * from SelectXuatChieu()";
		 XuatChieu xuatChieu;
		try {

			java.sql.Statement statement = conn.createStatement();
			 ResultSet rs = statement.executeQuery(sql);
				
			 // Duyá»‡t trÃªn káº¿t quáº£ tráº£ vá»?.
			 while (rs.next()) {// Di chuyá»ƒn con trá»? xuá»‘ng báº£n ghi káº¿ tiáº¿p.
				 xuatChieu = new XuatChieu();
				 xuatChieu.setId_XuatChieu(rs.getInt(1));	
				
				 xuatChieu.setTieuDe(rs.getString(2));	   

				xuatChieu.setGioChieu(rs.getString(3));
				
				 xuatChieu.setTenPhongChieu(rs.getString("_name"));	 
		
			 }
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return ZXuatChieu;
	}*/
	Connection conn;

	public  ArrayList<XuatChieu> getXuatChieu() throws SQLException, ClassNotFoundException
	{
		conn = ConnectionUtils.getMyConnection();
	 
	 	String sql = "select * from SelectXuatChieu()";
		  	PreparedStatement pstm = conn.prepareStatement(sql);
	        ResultSet rs = pstm.executeQuery();
	        ArrayList<XuatChieu> list = new ArrayList<>();
		
			 while (rs.next()) {// Di chuyá»ƒn con trá»? xuá»‘ng báº£n ghi káº¿ tiáº¿p.
				 XuatChieu tk=new XuatChieu();
				
				 tk.setId_XuatChieu(rs.getInt(1));	
					
				 tk.setTieuDe(rs.getString(2));	   

				tk.setGioChieu(rs.getString(3));
				
				 tk.setTenPhongChieu(rs.getString("_name"));	 
				 list.add(tk);
		
			 }
			 
		
		
		return list;
	}
	public  ArrayList<XuatChieu> loadPhongChieu(String tenRap) throws SQLException, ClassNotFoundException
	{
		conn = ConnectionUtils.getMyConnection();
	 
	 	String sql = "select _name from Rapchieu,PhongChieu where PhongChieu.id_RapChieu=Rapchieu.id_RapChieu and Rapchieu.tenRap=N'"+tenRap+"'";
		  	PreparedStatement pstm = conn.prepareStatement(sql);
	        ResultSet rs = pstm.executeQuery();
	        ArrayList<XuatChieu> list = new ArrayList<>();
		
			 while (rs.next()) {// Di chuyá»ƒn con trá»? xuá»‘ng báº£n ghi káº¿ tiáº¿p.
				 XuatChieu tk=new XuatChieu();
				
				
				
				 tk.setTenPhongChieu(rs.getString("_name"));
				
				 list.add(tk);
		
			 }
			 
		
		
		return list;
	}
	public boolean deleteXuatChieu(int id)
	{
		try {
			conn = ConnectionUtils.getMyConnection();
			String sql="Exec dbo.DeleteXuatChieu ?";
			try {
				PreparedStatement ps=conn.prepareCall(sql);
				ps.setInt(1,id );
				return ps.executeUpdate()==1;
				
			}
			catch(SQLException ex) {
				
				Logger.getLogger(ZPhim.class.getName()).log(Level.SEVERE, null, ex);
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public boolean InsertXuatChieu(XuatChieu c)  {
		
		 try {
			conn = ConnectionUtils.getMyConnection();
			String sql="exec dbo.InsertXuatChieu  ?,?,? ";
			
			try
			{
				PreparedStatement ps=conn.prepareCall(sql);
				
				ps.setString(1, c.getTieuDe());
				ps.setString(2, c.getGioChieu());
				ps.setString(3, c.getTenPhongChieu());
				
				return ps.executeUpdate()==1;
				
			}
			catch (SQLException ex){
				Logger.getLogger(ZPhim.class.getName()).log(Level.SEVERE, null, ex);
			};
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	
		return false;
			

	}
	public boolean UpdateXuatChieu(XuatChieu c)
	{
		try {
			conn = ConnectionUtils.getMyConnection();
			String sql="Exec dbo.UpdateXuatChieu ?,?";
			try
			{
				PreparedStatement ps=conn.prepareCall(sql);
				ps.setInt(1,c.getId_XuatChieu() );
				ps.setString(2, c.getGioChieu());
				
			
				return ps.executeUpdate()==1;
			}
			catch (SQLException ex){
				Logger.getLogger(ZPhim.class.getName()).log(Level.SEVERE, null, ex);
			};
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//Xoá dữ liệu
	public static void main(String[] args) throws ClassNotFoundException,
    SQLException {
		ZXuatChieu z=new ZXuatChieu();
		z.loadPhongChieu("Rap Chieu 2");
		
	 }

}

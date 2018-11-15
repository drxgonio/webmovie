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
import com.movie.beans.DanhMucPhim;
import com.movie.beans.Phim;


public class ZDanhMucPhim {
	
	 Connection conn;

	public  ArrayList<DanhMucPhim> getDanhMucPhim() throws SQLException, ClassNotFoundException
	{
	 conn = ConnectionUtils.getMyConnection();
		
		 String sql = "select * from SelectDanhMuc()";
		  PreparedStatement pstm = conn.prepareStatement(sql);
	        ResultSet rs = pstm.executeQuery();
	        ArrayList<DanhMucPhim> list = new ArrayList<>();
		
			 while (rs.next()) {// Di chuyá»ƒn con trá»? xuá»‘ng báº£n ghi káº¿ tiáº¿p.
				 DanhMucPhim danhmucphim=new DanhMucPhim();
				
				 danhmucphim.setId(rs.getInt(1));		
				 danhmucphim.setTenDanhMuc(rs.getString(2)); 		   
				 danhmucphim.setMoTa(rs.getString("moTa"));
				 list.add(danhmucphim);
		
			 }
		
		
		return list;
	}
	public boolean InsertDanhMucPhim(DanhMucPhim c)  {
		
		 try {
			conn = ConnectionUtils.getMyConnection();
			String sql="Exec dbo.InsertMenuFilm ?,? ";
			
			try
			{
				PreparedStatement ps=conn.prepareCall(sql);
				//ps.setInt(1,c.getId() );
				ps.setString(1, c.getTenDanhMuc());
				ps.setString(2, c.getMoTa());
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
	public boolean UpdateDanhMucPhim(DanhMucPhim c)
	{
		try {
			conn = ConnectionUtils.getMyConnection();
			String sql="Exec dbo.UpdateMenuFilm ?,?,?";
			try
			{
				PreparedStatement ps=conn.prepareCall(sql);
				ps.setInt(1,c.getId() );
				ps.setString(2, c.getTenDanhMuc());
				ps.setString(3, c.getMoTa());
			
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
		public boolean deleteDanhMucPhim(int id)
		{
			try {
				conn = ConnectionUtils.getMyConnection();
				String sql="Exec dbo.DeleteMenuFilm ?";
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
	 public static void main(String[] args) throws ClassNotFoundException,
     SQLException {
		ZDanhMucPhim z=new ZDanhMucPhim();
		z.UpdateDanhMucPhim(new DanhMucPhim(11,"a1","b1"));
		// phim.InsertPhim(new Phim("Bi Dien" ,1 ,"daodien1",1,"mota" ,"trailer" ,20 ,"quocgia" ,20 ,"linkanh")) ;
		//phim.updatePhim(new Phim(6,"Bi Dien" ,1 ,"daodien1",1,"mota" ,"trailer" ,20 ,"quocgia" ,20 ,"linkanh")) ;
		// phim.deletePhim(6);
	 }

}

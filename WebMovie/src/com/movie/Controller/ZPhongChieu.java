package com.movie.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.movie.Connect.ConnectionUtils;
import com.movie.beans.PhongChieu;
import com.movie.beans.RapChieu;


public class ZPhongChieu {

	 Connection conn;

		public  ArrayList<PhongChieu> getPhongChieu() throws SQLException, ClassNotFoundException
		{
		 conn = ConnectionUtils.getMyConnection();
			
			 String sql = "select * from SelectPhongChieu()";
			  PreparedStatement pstm = conn.prepareStatement(sql);
		        ResultSet rs = pstm.executeQuery();
		        ArrayList<PhongChieu> list = new ArrayList<>();
			
				 while (rs.next()) {// Di chuyá»ƒn con trá»? xuá»‘ng báº£n ghi káº¿ tiáº¿p.
					 PhongChieu tk=new PhongChieu();
					
					 tk.setId_PhongChieu(rs.getInt(1));	
					 tk.set_name(rs.getString(2));		   
					 tk.setSoGheNgoi(rs.getInt(3));
					 
					 tk.setTenRap(rs.getString("tenRap"));
					 list.add(tk);
			
				 }
				 
			
			
			return list;
		}
		public boolean InsertPhongChieu(PhongChieu c)  {
			
			 try {
				conn = ConnectionUtils.getMyConnection();
				String sql="exec dbo.InsertPhongChieu  ?,?,? ";
				
				try
				{
					PreparedStatement ps=conn.prepareCall(sql);
					
					ps.setString(1, c.get_name());
					ps.setInt(2, c.getSoGheNgoi());
					ps.setString(3, c.getTenRap());
					
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
		public boolean UpdatePhongChieu(PhongChieu c)
		{
			try {
				conn = ConnectionUtils.getMyConnection();
				String sql="Exec dbo.UpdatePhongChieu ?,?,?,?";
				try
				{
					PreparedStatement ps=conn.prepareCall(sql);
					ps.setInt(1,c.getId_PhongChieu() );
					ps.setString(2, c.get_name());
					ps.setInt(3, c.getSoGheNgoi());
					ps.setString(4, c.getTenRap());
				
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
		public boolean deletePhongChieu(int id)
		{
			try {
				conn = ConnectionUtils.getMyConnection();
				String sql="Exec dbo.DeletePhongChieu ?";
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
		//Xoá dữ li
	public static void main(String[] args) {
		ZPhongChieu tt=new ZPhongChieu();
	//	tt.InsertPhongChieu(new PhongChieu("a",22,"CGVa"));
		// TODO Auto-generated method stub

	}

}

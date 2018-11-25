package com.movie.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.movie.Connect.ConnectionUtils;
import com.movie.beans.RapChieu;

public class ZRapChieu {
	 Connection conn;

		public  ArrayList<RapChieu> getRapChieu() throws SQLException, ClassNotFoundException
		{
		 conn = ConnectionUtils.getMyConnection();
			
			 String sql = "select * from SelectRapChieu()";
			  PreparedStatement pstm = conn.prepareStatement(sql);
		        ResultSet rs = pstm.executeQuery();
		        ArrayList<RapChieu> list = new ArrayList<>();
			
				 while (rs.next()) {// Di chuyá»ƒn con trá»? xuá»‘ng báº£n ghi káº¿ tiáº¿p.
					 RapChieu rapChieu=new RapChieu();
					
					 rapChieu.setId_RapChieu(rs.getInt(1));		
					 rapChieu.setDiaDiem(rs.getString(2)); 		   
					 rapChieu.setTenRap(rs.getString(3));
					 rapChieu.setSoLuongRap(rs.getInt("soLuongRap"));
					 list.add(rapChieu);
			
				 }
				 
			
			
			return list;
		}
		public boolean InsertRapChieu(RapChieu c)  {
			
			 try {
				conn = ConnectionUtils.getMyConnection();
				String sql="exec dbo.InsertRapChieu  ?,?,?,? ";
				
				try
				{
					PreparedStatement ps=conn.prepareCall(sql);
					ps.setInt(1,c.getId_RapChieu() );
					ps.setString(2, c.getDiaDiem());
					ps.setString(3, c.getTenRap());
					ps.setInt(4, c.getSoLuongRap());
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
		public boolean UpdateRapChieu(RapChieu c)
		{
			try {
				conn = ConnectionUtils.getMyConnection();
				String sql="Exec dbo.UpdateRapChieu ?,?,?,?";
				try
				{
					PreparedStatement ps=conn.prepareCall(sql);
					ps.setInt(1,c.getId_RapChieu() );
					ps.setString(2, c.getDiaDiem());
					ps.setString(3, c.getTenRap());
					ps.setInt(4, c.getSoLuongRap());
				
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
			public boolean deleteRapChieu(int id)
			{
				try {
					conn = ConnectionUtils.getMyConnection();
					String sql="Exec dbo.DeleteRapChieu ?";
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
			/*ZRapChieu z=new ZRapChieu();
			for(RapChieu c:z.getRapChieu())
			{
				System.out.println(c.getId_RapChieu());
				System.out.println(c.getSoLuongRap());
				System.out.println(c.getDiaDiem());
			}*/
			 

		 }

}

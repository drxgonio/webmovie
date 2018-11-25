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
import com.movie.beans.TaiKhoan;
public class ZTaiKhoan {
	 Connection conn;

		public  ArrayList<TaiKhoan> getTaiKhoan() throws SQLException, ClassNotFoundException
		{
		 conn = ConnectionUtils.getMyConnection();
			
			 String sql = "select * from SelectTaiKhoan()";
			  PreparedStatement pstm = conn.prepareStatement(sql);
		        ResultSet rs = pstm.executeQuery();
		        ArrayList<TaiKhoan> list = new ArrayList<>();
			
				 while (rs.next()) {// Di chuyá»ƒn con trá»? xuá»‘ng báº£n ghi káº¿ tiáº¿p.
					 TaiKhoan tk=new TaiKhoan();
					
					 tk.setId(rs.getInt(1));		
					 tk.setTenDangNhap(rs.getString(2));		   
					 tk.setMatKhau(rs.getString(3));
					 tk.setRole(rs.getString("roleTK"));
					 list.add(tk);
			
				 }
				 
			
			
			return list;
		}
		//Xoá dữ liệu
		public boolean deleteTaiKhoan(int id)
		{
			try {
				conn = ConnectionUtils.getMyConnection();
				String sql="Exec dbo.DeleteTaiKhoan ?";
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
			/*ZTaiKhoan z=new ZTaiKhoan();
			z.deleteTaiKhoan(6);*/
			
		 }

}

package com.movie.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.movie.Connect.ConnectionUtils;
import com.movie.beans.Phim;
import com.movie.beans.TrangThai;

public class ZTrangThai {
	//Get dử liệu
	 Connection conn;
		public  ArrayList<TrangThai> getTT() throws SQLException, ClassNotFoundException{
			 conn = ConnectionUtils.getMyConnection();
	     	      
	        String sql = "select * from SelectTrangThai()";
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        ResultSet rs = pstm.executeQuery();
	        ArrayList<TrangThai> list = new ArrayList<>();
			
	       
	        
	        while (rs.next()) {
	        	TrangThai tt=new TrangThai();
				tt = new TrangThai();
				tt.setId(rs.getInt(1));

				tt.setTenTrangThai(rs.getString("tenTrangThai")); 
				
				
		     	list.add(tt);
	        }
	        

	        return list;
	    }
}

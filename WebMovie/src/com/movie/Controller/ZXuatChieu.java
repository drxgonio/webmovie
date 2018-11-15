package com.movie.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.movie.Connect.ConnectionUtils;
import com.movie.beans.XuatChieu;


public class ZXuatChieu {
	static Connection conn;
	public ZXuatChieu() throws ClassNotFoundException, SQLException {
		conn = ConnectionUtils.getMyConnection();
	}
	public List<XuatChieu> getDanhMucPhim()
	{
		List<XuatChieu> ZXuatChieu = new ArrayList<>();
		 String sql = "select * from SelectXuatChieu()";
		 XuatChieu xuatChieu;
		try {

			java.sql.Statement statement = conn.createStatement();
			 ResultSet rs = statement.executeQuery(sql);
				
			 // Duyệt trên kết quả trả v�?.
			 while (rs.next()) {// Di chuyển con tr�? xuống bản ghi kế tiếp.
				 xuatChieu = new XuatChieu();
				 xuatChieu.setId(rs.getInt(1));		
				 xuatChieu.setId_Phim(rs.getInt(2));	   
				 xuatChieu.setThoiGianChieu(rs.getTime(3));
				 xuatChieu.setId_RapChieu(rs.getInt("id_PhongChieu"));	 
		
			 }
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return ZXuatChieu;
	}

}

package com.movie.Controller;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.movie.Connect.ConnectionUtils;
import com.movie.beans.Phim;
public class Test {
	public static List<Phim> queryProduct(Connection conn) throws SQLException {
        String sql = "select * from SelectFilms()";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        ResultSet rs = pstm.executeQuery();
        List<Phim> list = new ArrayList<Phim>();
        while (rs.next()) {
        	Phim film=new Phim();
			film = new Phim();
			film.setId(rs.getInt(1));

	     film.setTieuDe(rs.getString(2)); 
	     film.setId_DanhMuc(rs.getInt(3));
	    film.setDaoDien(rs.getString(4));
	   
	     film.setId_TrangThai(rs.getInt(5));
	    film.setMoTa(rs.getString(6));
	     film.setUrl_Trailer(rs.getString(7));
	     film.setDoDai(rs.getInt(8));
	     film.setQuocGia(rs.getString(9));
	    film.setGiaVe(rs.getInt(10));
	     film.setLinkAnh(rs.getString("linkanh"));
	     list.add(film);
        }
        return list;
    }
	public static void main(String[] args) throws ClassNotFoundException,
    SQLException {
		Connection connection = ConnectionUtils.getMyConnection();		 
	      // Tạo đối tượng Statement.
	      Statement statement = connection.createStatement();	 
	      String sql = "select * from SelectFilms()"; 
	      // Thực thi câu lệnh SQL trả về đối tượng ResultSet.
	      ResultSet rs = statement.executeQuery(sql);
		 Connection conn = ConnectionUtils.getMyConnection();
					      
	        List<Phim> list = new ArrayList<Phim>();
	        while (rs.next()) {
	        	Phim film=new Phim();
				//int a=rs.getInt(1);
				film.setId(rs.getInt(1));

		     film.setTieuDe(rs.getString(2)); 
		     film.setId_DanhMuc(rs.getInt(3));
		    film.setDaoDien(rs.getString(4));
		   
		     film.setId_TrangThai(rs.getInt(5));
		    film.setMoTa(rs.getString(6));
		     film.setUrl_Trailer(rs.getString(7));
		     film.setDoDai(rs.getInt(8));
		     film.setQuocGia(rs.getString(9));
		    film.setGiaVe(rs.getInt(10));
		     film.setLinkAnh(rs.getString("linkanh"));
		     list.add(film);
		    // System.out.println(a);
		     
	        }
	        for(Phim mh:list)
	        {
	        	System.out.println(mh.getGiaVe());
	        }
	       	
	 }
}

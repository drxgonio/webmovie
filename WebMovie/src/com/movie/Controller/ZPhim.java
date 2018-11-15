	package com.movie.Controller;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.movie.Connect.ConnectionUtils;
import com.movie.beans.Phim;;
public class ZPhim {
 Connection conn;
	
	//Get dử liệu
	public  ArrayList<Phim> getPhim() throws SQLException, ClassNotFoundException{
		 conn = ConnectionUtils.getMyConnection();
     	      
        String sql = "select * from SelectFilms()";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        ArrayList<Phim> list = new ArrayList<>();
		
       
        
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
	//Thêm mới dử liệu
	public boolean InsertPhim(Phim c) 
	{
		 try {
			conn = ConnectionUtils.getMyConnection();
			String sql="Exec dbo.InsertFilm ?,?,?,?,?,?,?,?,?,? ";
			//Exec dbo.InsertFilm 'tieude'  ,1 ,'daodien1',1,'mota' ,'trailer' ,20 ,'quocgia' ,20 ,'linkanh' 
			try
			{
				PreparedStatement ps=conn.prepareCall(sql);
				//ps.setInt(1,c.getId() );
				ps.setString(1, c.getTieuDe());
				ps.setInt(2, c.getId_DanhMuc());
				ps.setString(3, c.getDaoDien());
				ps.setInt(4, c.getId_TrangThai());
				ps.setString(5, c.getMoTa());
				ps.setString(6, c.getUrl_Trailer());
				ps.setInt(7, c.getDoDai());
				ps.setString(8, c.getQuocGia());
				ps.setInt(9, c.getGiaVe());
				ps.setString(10,c.getLinkAnh());
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
	//Cập nhật dữ liêu
	public boolean updatePhim(Phim c)
	{		
		try {
			conn = ConnectionUtils.getMyConnection();
			String sql="Exec dbo.UpdateFilm ?,?,?,?,?,?,?,?,?,?,?";
			try
			{
				PreparedStatement ps=conn.prepareCall(sql);
				ps.setInt(1,c.getId() );
				ps.setString(2, c.getTieuDe());
				ps.setInt(3, c.getId_DanhMuc());
				ps.setString(4, c.getDaoDien());
				ps.setInt(5, c.getId_TrangThai());
				ps.setString(6, c.getMoTa());
				ps.setString(7, c.getUrl_Trailer());
				ps.setInt(8, c.getDoDai());
				ps.setString(9, c.getQuocGia());
				ps.setInt(10, c.getGiaVe());
				ps.setString(11,c.getLinkAnh());
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
		//Exec dbo.UpdateFilm 2,'tieude2222'  ,1 ,'daodien1',1,'mota' ,'trailer' ,20 ,'quocgia' ,20 ,'linkanh' 
		
		return false;

		
	}
	//Xoá dữ liệu
	public boolean deletePhim(int id)
	{
		try {
			conn = ConnectionUtils.getMyConnection();
			String sql="Exec dbo.DeleteFilm ?";
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
		 ZPhim phim=new ZPhim();
		 phim.InsertPhim(new Phim("aâ" ,1 ,"daodien1",1,"mota" ,"trailer" ,20 ,"quocgia" ,20 ,"linkanh")) ;
		//phim.updatePhim(new Phim(6,"Bi Dien" ,1 ,"daodien1",1,"mota" ,"trailer" ,20 ,"quocgia" ,20 ,"linkanh")) ;
		// phim.deletePhim(6);
	 }
}

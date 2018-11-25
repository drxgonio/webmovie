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
     	      
        String sql = "select * from getPhim()";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        ArrayList<Phim> list = new ArrayList<>();
		
       
        
        while (rs.next()) {
        	Phim film=new Phim();
			film = new Phim();
			film.setId(rs.getInt(1));

			film.setTieuDe(rs.getString(2)); 
			film.setDanhMuc(rs.getString(3));
			film.setDaoDien(rs.getString(4));
	   
			film.setTrangThai(rs.getString(5));
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
			String sql="Exec dbo.InsertFilm ?,?,?,?,?,?,?,?,?,?,? ";
			//Exec dbo.InsertFilm 'tieude'  ,1 ,'daodien1',1,'mota' ,'trailer' ,20 ,'quocgia' ,20 ,'linkanh' 
			

		//	Exec dbo.InsertFilm 'tieude' ,'daodien1','mota' ,'trailer' ,20 ,'quocgia' ,20 ,'linkanh' ,19,'Phim Cam Tu','Phim 16+'
			try
			{
				PreparedStatement ps=conn.prepareCall(sql);
				//ps.setInt(1,c.getId() );
				ps.setString(1, c.getTieuDe());
			
				ps.setString(2, c.getDaoDien());
			
				ps.setString(3, c.getMoTa());
				ps.setString(4, c.getUrl_Trailer());
				ps.setInt(5, c.getDoDai());
				ps.setString(6, c.getQuocGia());
				ps.setInt(7, c.getGiaVe());
				ps.setString(8,c.getLinkAnh());
				ps.setInt(9, c.getDoTuoi());
				ps.setString(10,c.getDanhMuc());
				ps.setString(11,c.getTrangThai());
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
			String sql="Exec dbo.UpdateFilm ?,?,?,?,?,?,?,?,?,?,?,?";
			try
			{
				PreparedStatement ps=conn.prepareCall(sql);
				ps.setInt(1,c.getId() );
				ps.setString(2, c.getTieuDe());
				
				ps.setString(3, c.getDaoDien());
				
				ps.setString(4, c.getMoTa());
				ps.setString(5, c.getUrl_Trailer());
				ps.setInt(6, c.getDoDai());
				ps.setString(7, c.getQuocGia());
				ps.setInt(8, c.getGiaVe());
				ps.setString(9,c.getLinkAnh());
				ps.setInt(10, c.getDoTuoi());
				ps.setString(11,c.getDanhMuc());
				ps.setString(12,c.getTrangThai());
				
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
			String sql="Exec dbo.detelePhim ?";
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
		// phim.InsertPhim(new Phim("tieude" ,"daodien1","mota" ,"trailer" ,2 ,"quocgia" ,2 ,"linkanh" ,19,"Phim Cam Tu","Phim 16+")) ;
		 phim.updatePhim (new Phim(11,"cc" ,"daodien" ,"mota" ,"trailer" ,20,"quocgia" ,20 ,"linkanh" ,1888,"Phim Cam Tu","Phim 18+"));
	 }
}

package com.movie.beans;

public class Phim {
	private int id;
	private String tieuDe;

	
	private String daoDien;
	private int id_DanhMuc;
	
	private int id_TrangThai;
	private String moTa;
	private String url_Trailer;
	private int doDai;
	private String quocGia;
	private int giaVe;
	private String linkAnh;
	public String getDaoDien() {
		return daoDien;
	}
	public void setDaoDien(String daoDien) {
		this.daoDien = daoDien;
	}


	public int getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(int giaVe) {
		this.giaVe = giaVe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public int getId_TrangThai() {
		return id_TrangThai;
	}
	public void setId_TrangThai(int id_TrangThai) {
		this.id_TrangThai = id_TrangThai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getUrl_Trailer() {
		return url_Trailer;
	}
	public void setUrl_Trailer(String url_Trailer) {
		this.url_Trailer = url_Trailer;
	}
	public int getDoDai() {
		return doDai;
	}
	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	
	public String getLinkAnh() {
		return linkAnh;
	}
	public void setLinkAnh(String linkAnh) {
		this.linkAnh = linkAnh;
	}
	public int getId_DanhMuc() {
		return id_DanhMuc;
	}
	public void setId_DanhMuc(int id_DanhMuc) {
		this.id_DanhMuc = id_DanhMuc;
	}
	  public Phim() {
		  
	   }
	 
	  public Phim(String tieuDe,int id_DanhMuc,String daoDien,int id_TrangThai,String moTa,String url_Trailer,
			  int doDai,String quocGia,int giaVe,String linkanh) {
	    
	       this.tieuDe = tieuDe;
	       this.daoDien = daoDien;
	       this.id_DanhMuc=id_DanhMuc;
	       this.id_TrangThai=id_TrangThai;
	       this.moTa=moTa;
	       this.url_Trailer=url_Trailer;
	       this.doDai=doDai;
	       this.quocGia=quocGia;
	       this.giaVe=giaVe;
	       this.linkAnh=linkanh;
	   }
	  public Phim(int id,String tieuDe,int id_DanhMuc,String daoDien,int id_TrangThai,String moTa,String url_Trailer,
			  int doDai,String quocGia,int giaVe,String linkanh) {
		  this.id=id;
	       this.tieuDe = tieuDe;
	       this.daoDien = daoDien;
	       this.id_DanhMuc=id_DanhMuc;
	       this.id_TrangThai=id_TrangThai;
	       this.moTa=moTa;
	       this.url_Trailer=url_Trailer;
	       this.doDai=doDai;
	       this.quocGia=quocGia;
	       this.giaVe=giaVe;
	       this.linkAnh=linkanh;
	   }



}

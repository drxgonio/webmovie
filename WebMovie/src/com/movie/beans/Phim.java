package com.movie.beans;

public class Phim {
	private int id;
	private String tieuDe;

	
	private String daoDien;
	private String danhMuc;
	
	private String trangThai;
	private String moTa;
	private String url_Trailer;
	private int doDai;
	private String quocGia;
	private int giaVe;
	private String linkAnh;
	private int doTuoi;
	public int getDoTuoi() {
		return doTuoi;
	}
	public void setDoTuoi(int doTuoi) {
		this.doTuoi = doTuoi;
	}
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

	  public String getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(String danhMuc) {
		this.danhMuc = danhMuc;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public Phim() {
		  
	   }
	 
	  public Phim(String tieuDe,String danhMuc,String daoDien,String trangThai,String moTa,String url_Trailer,
			  int doDai,String quocGia,int giaVe,String linkanh) {
	    
	       this.tieuDe = tieuDe;
	       this.daoDien = daoDien;
	       this.danhMuc=danhMuc;
	       this.trangThai=trangThai;
	       this.moTa=moTa;
	       this.url_Trailer=url_Trailer;
	       this.doDai=doDai;
	       this.quocGia=quocGia;
	       this.giaVe=giaVe;
	       this.linkAnh=linkanh;
	   }
	  public Phim(String tieuDe,String daoDien,String moTa,String url_Trailer,
			  int doDai,String quocGia,int giaVe,String linkanh,int doTuoi,String danhMuc,String trangThai) {
	    
	       this.tieuDe = tieuDe;
	       this.daoDien = daoDien;
	       this.danhMuc=danhMuc;
	       this.trangThai=trangThai;
	       this.moTa=moTa;
	       this.url_Trailer=url_Trailer;
	       this.doDai=doDai;
	       this.quocGia=quocGia;
	       this.giaVe=giaVe;
	       this.linkAnh=linkanh;
	       this.doTuoi=doTuoi;
	   }
	  public Phim(int id,String tieuDe,String daoDien,String moTa,String url_Trailer,
			  int doDai,String quocGia,int giaVe,String linkanh,int doTuoi,String danhMuc,String trangThai) {
		  this.id=id;
	       this.tieuDe = tieuDe;
	       this.daoDien = daoDien;
	       this.danhMuc=danhMuc;
	       this.trangThai=trangThai;
	       this.moTa=moTa;
	       this.url_Trailer=url_Trailer;
	       this.doDai=doDai;
	       this.quocGia=quocGia;
	       this.giaVe=giaVe;
	       this.linkAnh=linkanh;
	       this.doTuoi=doTuoi;
	   }



}

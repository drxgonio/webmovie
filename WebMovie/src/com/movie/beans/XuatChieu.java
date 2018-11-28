package com.movie.beans;


import java.sql.Time;

public class XuatChieu {

	private int id_XuatChieu;
	private int id_Phim;
	private String gioChieu;
	private int id_PhongChieu;
	private String tieuDe;
	private String tenPhongChieu;
	
	public int getId_XuatChieu() {
		return id_XuatChieu;
	}

	public void setId_XuatChieu(int id_XuatChieu) {
		this.id_XuatChieu = id_XuatChieu;
	}

	public int getId_Phim() {
		return id_Phim;
	}

	public void setId_Phim(int id_Phim) {
		this.id_Phim = id_Phim;
	}



	public String getGioChieu() {
		return gioChieu;
	}

	public void setGioChieu(String gioChieu) {
		this.gioChieu = gioChieu;
	}

	public int getId_PhongChieu() {
		return id_PhongChieu;
	}

	public void setId_PhongChieu(int id_PhongChieu) {
		this.id_PhongChieu = id_PhongChieu;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getTenPhongChieu() {
		return tenPhongChieu;
	}

	public void setTenPhongChieu(String tenPhongChieu) {
		this.tenPhongChieu = tenPhongChieu;
	}

	public XuatChieu() {
		// TODO Auto-generated constructor stub
	}
	public XuatChieu(int idPhim,String gio,int id_pc) {
		// TODO Auto-generated constructor stub
		this.id_Phim=idPhim;
		this.gioChieu=gio;
		this.id_PhongChieu=id_pc;
	}public XuatChieu(int id,String gio) {
		// TODO Auto-generated constructor stub
		this.id_XuatChieu=id;
		this.gioChieu=gio;
	}
}

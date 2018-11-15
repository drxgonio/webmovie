package com.movie.beans;

public class DanhMucPhim {
	private int id;
	private String tenDanhMuc;
	private String moTa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public DanhMucPhim()
	{}
	
	public DanhMucPhim(String tenDanhMuc,String moTa)
	{
		this.tenDanhMuc=tenDanhMuc;
		this.moTa=moTa;
	}
	public DanhMucPhim(int id,String tenDanhMuc,String moTa)
	{
		
		this.id=id;
		this.tenDanhMuc=tenDanhMuc;
		this.moTa=moTa;
	}
	
	

}

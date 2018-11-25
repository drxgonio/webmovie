package com.movie.beans;

public class RapChieu {
	private int id_RapChieu;
	private  String diaDiem;
	private String tenRap;
	private int soLuongRap;
	public int getSoLuongRap() {
		return soLuongRap;
	}
	public void setSoLuongRap(int soLuongRap) {
		this.soLuongRap = soLuongRap;
	}
	public int getId_RapChieu() {
		return id_RapChieu;
	}
	public void setId_RapChieu(int id_RapChieu) {
		this.id_RapChieu = id_RapChieu;
	}
	public String getDiaDiem() {
		return diaDiem;
	}
	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}
	public String getTenRap() {
		return tenRap;
	}
	public void setTenRap(String tenRap) {
		this.tenRap = tenRap;
	}
	public RapChieu(String diaDiem,String tenRap)
	{
		this.tenRap=tenRap;
		this.diaDiem=diaDiem;
	}
	public RapChieu(int id,String diaDiem,String tenRap,int soLuongRap)
	{
		this.id_RapChieu=id;
		this.tenRap=tenRap;
		this.diaDiem=diaDiem;
		this.soLuongRap=soLuongRap;
	}
	public RapChieu()
	{
		
	}

}

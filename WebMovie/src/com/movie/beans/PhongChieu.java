package com.movie.beans;

public class PhongChieu {

	private int id_PhongChieu;
	private String _name;
	private int id_RapChieu;
	private int soGheNgoi;
	private String tenRap;
	public int getId_PhongChieu() {
		return id_PhongChieu;
	}
	public void setId_PhongChieu(int id_PhongChieu) {
		this.id_PhongChieu = id_PhongChieu;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public int getId_RapChieu() {
		return id_RapChieu;
	}
	public void setId_RapChieu(int id_RapChieu) {
		this.id_RapChieu = id_RapChieu;
	}
	public int getSoGheNgoi() {
		return soGheNgoi;
	}
	public void setSoGheNgoi(int soGheNgoi) {
		this.soGheNgoi = soGheNgoi;
	}
	public String getTenRap() {
		return tenRap;
	}
	public void setTenRap(String tenRap) {
		this.tenRap = tenRap;
	}
	public PhongChieu() {
		
	}
public PhongChieu(String name,int soGhe,String tenRap) {
	this._name=name;
	this.soGheNgoi=soGhe;
	this.tenRap=tenRap;
		
	}
public PhongChieu(int id,String name,int soGhe,String tenRap) {
	this.id_PhongChieu=id;
	this._name=name;
	this.soGheNgoi=soGhe;
	this.tenRap=tenRap;
		
	}

}

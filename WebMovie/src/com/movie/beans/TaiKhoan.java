package com.movie.beans;

public class TaiKhoan {
	private int id;
	private String tenDangNhap;
	private int id_role;
	private String matKhau;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public TaiKhoan(int id, String ten,String pass) {
		this.id=id;
		this.tenDangNhap=ten;
		this.matKhau=pass;
	}
	public TaiKhoan()
	{}
	
}
	



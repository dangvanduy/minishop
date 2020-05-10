package com.dangvanduy.entity;

public class GiamDoc extends NhanVien {
	String chucvu;

	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}

	public GiamDoc(String name, int tuoi, String diachi, String chucvu) {
		super(name, tuoi, diachi);
		this.chucvu = chucvu;
	}

	public GiamDoc() {
		
	}
	
	
	
}

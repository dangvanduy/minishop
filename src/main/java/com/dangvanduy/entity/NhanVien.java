package com.dangvanduy.entity;

import java.util.*;

public class NhanVien {
	
	String name;
	int tuoi;
	String diachi;
	GiamDoc doc;
	List<GiamDoc> list;
	Map<String, Object> map;
	Properties properties;
	
	
	
	public Properties getProperties() {
		return properties;
	}


	public void setProperties(Properties properties) {
		this.properties = properties;
	}


	public Map<String, Object> getMap() {
		return map;
	}


	public void setMap(Map<String, Object> map) {
		this.map = map;
	}


	public List<GiamDoc> getList() {
		return list;
	}


	public void setList(List<GiamDoc> list) {
		this.list = list;
	}


	public GiamDoc getDoc() {
		return doc;
	}


	public void setDoc(GiamDoc doc) {
		this.doc = doc;
	}


	public String getDiachi() {
		return diachi;
	}


	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}


	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}
	
	public NhanVien(String name, int tuoi, String diachi) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		this.diachi = diachi;
	}
	
	
	public NhanVien() {
		super();
	}


	public NhanVien(GiamDoc doc) {
		super();
		this.doc = doc;
	}
	


	//ham init 
	public void start() {
		System.out.println("strart !.....");
	}
	//ham destroy 
	public void destroy() {
		System.out.println("end !.....");
	}
	//method factory yeu cau phai la ham static neu dung factory bean thi k can static
	public NhanVien createNhanvien() {
		NhanVien nv = new NhanVien();
		nv.setName("dangvanduy");
		return nv;
	}
}

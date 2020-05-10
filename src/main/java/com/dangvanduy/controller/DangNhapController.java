package com.dangvanduy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DangNhapController {
	@RequestMapping("/dangnhap")
	public String DangNhap() {
		return "dangnhap";
	}
}

package com.dangvanduy.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dangvanduy.entity.GiamDoc;
import com.dangvanduy.entity.NhanVien;

@Controller
public class TrangChuController {
	
	@RequestMapping("/")
	//@ResponseBody
	//co 2 cach gui du lieu ve client la ModelAndView va modelMap
	public ModelAndView TrangChu() {
		//ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		//NhanVien nv = (NhanVien) context.getBean("nhanvien");
		//System.out.println(nv.getDoc().getName()+"---" + nv.getDoc().getChucvu());
		
		//for(GiamDoc value : nv.getList()) {
			//System.out.println(value);
		//}
		//duyet map
		
		//for(Entry<String, Object> entry : nv.getMap().entrySet()) {
			//System.out.println(entry.getKey() + entry.getValue());
		//}
		
		//duyet properties
		/*
		CustomResource custemResource = (CustomResource) context.getBean("custemResource");
		// duyet du lieu bang file o resource thong qua classpath
		Resource resourse = custemResource.getResource("classpath:data.txt");
		try {
			InputStream inputstream = resourse.getInputStream();
			InputStreamReader reader = new InputStreamReader(inputstream);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = "";
			StringBuffer dulieu = new StringBuffer();
			while((line = bufferedReader.readLine())!=null) {
				dulieu.append(line);
			}
			bufferedReader.close();
			reader.close();
			inputstream.close();
			System.out.println(dulieu);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		((ClassPathXmlApplicationContext)context).close();
		return "abc";*/
		
		ModelAndView viewTrangChu = new ModelAndView();
		viewTrangChu.setViewName("trangchu");
		viewTrangChu.addObject("tendangnhap","dang van duy");
		return viewTrangChu;
	}
	/*@RequestMapping("/chitiet")
	public String chitiet(@RequestParam(name = "id",required = true) int id,@RequestParam(name = "tensp",required = true) String tensp,ModelMap modelMap) {
		
		modelMap.addAttribute("id",id);
		modelMap.addAttribute("tensp",tensp);
		return "chitiet";
	}*/
	@RequestMapping("/chitiet/{id}")
	public String chitiet(@PathVariable int id,@MatrixVariable String tensp,ModelMap modelMap) {
		
		modelMap.addAttribute("id",id);
		modelMap.addAttribute("tensp",tensp);
		return "chitiet";
	}
	//truyen nhan du lieu Post
	@RequestMapping(path = "/chitiet",method = RequestMethod.POST)
	public String chitiet(@RequestParam String name,ModelMap modelMap) {
		
		modelMap.addAttribute("name",name);
		return "chitiet";
	}
	
	
	
	
	
}

package com.eunocompany.home2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping(value = "/idinput")
	public String idinput() {
		return "idinput";
	}
	
	@RequestMapping(value = "/idOk")
	public String idOk(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		
		if(id.equals("admin")) {
			return "redirect:idYes";
		} else {
			return "redirect:idNo";
		}
	}
	
	@RequestMapping(value = "/idYes")
	public String idYes() {
		return "idYes";
	}
	
	@RequestMapping(value = "/idNo")
	public String idNO() {
		return "idNo";
	}
	
	@RequestMapping(value = "/naver")
	public String naver() {
		return "redirect:https://www.naver.com";
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		
		return "redirect:http://localhost:8888/home/test.jsp";
	}
}
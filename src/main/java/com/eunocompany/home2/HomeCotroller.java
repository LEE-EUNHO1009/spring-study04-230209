package com.eunocompany.home2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeCotroller {

	@RequestMapping(value = "/")  //페이지만 띄워주는 용도
	public String index() {
		
		return "index";
	}
	@RequestMapping(value = "/member", method=RequestMethod.GET)
	public String member(HttpServletRequest request, Model model) {
		
		String memberName = request.getParameter("mname");
		
		
		model.addAttribute("memName", memberName);
		
		
		return "memberView";
	}
	@RequestMapping(value = "/member", method=RequestMethod.POST)
	public String memberPost(HttpServletRequest request, Model model) {
		
		String memberId = request.getParameter("mid");
		String memberPw = request.getParameter("mpw");
		
		model.addAttribute("memId", memberId);
		model.addAttribute("memPw", memberPw);
		
		return "memberView";
	}
}

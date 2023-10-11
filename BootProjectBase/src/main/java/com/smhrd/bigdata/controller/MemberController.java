package com.smhrd.bigdata.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.smhrd.bigdata.entity.Member;
import com.smhrd.bigdata.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@PostMapping("/member/login")
	public String login(Member member, HttpSession session) {
		Member loginMember = service.login(member.getEmail(), member.getPw());
		session.setAttribute("member", loginMember);
		
		return "redirect:/";
	}
}

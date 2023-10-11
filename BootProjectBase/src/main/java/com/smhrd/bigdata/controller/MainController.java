package com.smhrd.bigdata.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smhrd.bigdata.entity.Board;
import com.smhrd.bigdata.entity.Member;
import com.smhrd.bigdata.service.BoardService;

@Controller
public class MainController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/")
	public String index(Model model, HttpSession session) {
		
		Member loginMember = (Member)session.getAttribute("member");
		
		if(loginMember!=null) {
			List<Board> list = service.boardList();
			model.addAttribute("list", list );
		}
		return "index";
	}
	
	@GetMapping("/writeform")
	public String writeForm() {
		return "boardform";
	}
}

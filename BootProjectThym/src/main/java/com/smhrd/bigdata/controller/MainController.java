package com.smhrd.bigdata.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smhrd.bigdata.entity.Board;
import com.smhrd.bigdata.entity.BoardResponseDto;
import com.smhrd.bigdata.entity.Member;
import com.smhrd.bigdata.service.BoardService;

@Controller
public class MainController {

	@Autowired
	private BoardService service;
	
	// @PageableDefault(page = 1) : page는 기본으로 1페이지를 보여준다.
	@GetMapping("/")
	public String index(Model model, HttpSession session, @PageableDefault(page = 1) Pageable pageable) {
		
	        Page<BoardResponseDto> postsPages = service.paging(pageable);
	        /**
	         * blockLimit : page 개수 설정
	         * 현재 사용자가 선택한 페이지 앞 뒤로 3페이지씩만 보여준다.
	         * ex : 현재 사용자가 4페이지라면 2, 3, (4), 5, 6
	         */
	        int blockLimit = 3;
	        int startPage = (((int) Math.ceil(((double) pageable.getPageNumber() / blockLimit))) - 1) * blockLimit + 1;
	        int endPage = Math.min((startPage + blockLimit - 1), postsPages.getTotalPages());

	        
	        System.out.println(startPage);
	        System.out.println(postsPages);
	        System.out.println(endPage);
	        model.addAttribute("postsPages", postsPages);
	        model.addAttribute("startPage", startPage);
	        model.addAttribute("endPage", endPage);
	
		
		
		
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

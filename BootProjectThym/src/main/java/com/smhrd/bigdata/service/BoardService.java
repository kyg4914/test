package com.smhrd.bigdata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.bigdata.entity.Board;
import com.smhrd.bigdata.entity.BoardResponseDto;
import com.smhrd.bigdata.repository.BoardRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

@Service
public class BoardService {

	@Autowired
	private BoardRepository repo;
	
	public void write(Board b) {
		
		Board result = repo.save(b);
		
		System.out.println(b.toString());
	}
	
	public List<Board> boardList(){
		List<Board> list = repo.findAll();
		return list;
	}
	
	public Board content(int idx) {
		Board b = repo.findByIdx(idx);
		
		return b;
	}

	
	 public Page<BoardResponseDto> paging(Pageable pageable) {
	        int page = pageable.getPageNumber() - 1; // page 위치에 있는 값은 0부터 시작한다.
	        int pageLimit = 2; // 한페이지에 보여줄 글 개수

	        // 한 페이지당 10개식 글을 보여주고 정렬 기준은 ID기준으로 내림차순
	        Page<Board> postsPages = repo.findAll(PageRequest.of(page, pageLimit, Sort.by(Direction.DESC, "idx")));

	        // 목록 : id, title, content, author
	        Page<BoardResponseDto> boardResponseDtos = postsPages.map(
	                postPage -> new BoardResponseDto(postPage));

	        return boardResponseDtos;
	    }
}

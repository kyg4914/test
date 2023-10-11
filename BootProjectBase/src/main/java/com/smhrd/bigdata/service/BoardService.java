package com.smhrd.bigdata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.bigdata.entity.Board;
import com.smhrd.bigdata.repository.BoardRepository;

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
	
	public Optional<Board> content(long idx) {
		Optional<Board> b = repo.findById(idx);
		
		return b;
	}

}

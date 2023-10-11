package com.smhrd.bigdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smhrd.bigdata.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{
	
}

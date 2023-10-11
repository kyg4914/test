package com.smhrd.bigdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smhrd.bigdata.entity.Board;
import com.smhrd.bigdata.entity.Member;

public interface BoardRepository extends JpaRepository<Board, Long>{
	public Board findByIdx(int idx);
}

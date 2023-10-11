package com.smhrd.bigdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.bigdata.entity.Member;

@Repository
public interface MemberRepository extends  JpaRepository<Member, Long> {
	 public Member findByEmailAndPw(String email, String pw);
}

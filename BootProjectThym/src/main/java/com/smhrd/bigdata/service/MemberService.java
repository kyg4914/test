package com.smhrd.bigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.bigdata.entity.Member;
import com.smhrd.bigdata.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository repo;
	
	public Member login(String email, String pw) {
		return repo.findByEmailAndPw(email, pw);
	}
}

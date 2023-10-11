package com.smhrd.bigdata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //엔티티 정의
@Table(name="membernew") 
@NoArgsConstructor // 기본생성자
@Data
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idx;
	@Column(name="email", length=100)
	private String email;
	@Column(name="pw", length=100)
	private String pw;
	@Column(name="tel", length=100)
	private String tel;
	@Column(name="address", length=100)
	private String address;
	
	
}

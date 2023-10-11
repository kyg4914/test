package com.smhrd.bigdata.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity //엔티티 정의
@Table(name="boardnew") //사용하지 않으면 클래스 이름이 테이블 이름이 됨
@NoArgsConstructor // 기본생성자 생성
@AllArgsConstructor
@Data // 기본 메소드(getter/setter/toString) 자동으로 완성 시켜줌
public class Board {
	//기본키 지정
	@Id
	//1~ 부터 시작되는 값을 자동으로 넣기 위함
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idx;
	//테이블 자동생성 및 객체-테이블 매칭을 위해 컬럼 이름 지정 (+추가 속성)
    @Column(name="title", length=100) //최대 길이가 100.
	private String title;
	@Column(name="writer", length=100)
	private String writer;
	@Column(name="content", length=1000)
	private String content;
	//자동 시스템 시간 넣기 위함)
	@Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
	@Column(name="indate")
	private Date indate;
	@Column(name="count")
	@ColumnDefault("0") //default 0
	private int count;
	@Column(name="img", length=200)
	private String img;

}

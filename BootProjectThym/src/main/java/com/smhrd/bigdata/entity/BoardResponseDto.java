package com.smhrd.bigdata.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;

@Getter
public class BoardResponseDto {

	private int idx;
	private String title;
	private String writer;
	private String content;
	private Date indate;
	private int count;
	private String img;
	
	public BoardResponseDto(Board entity) {
		this.idx = entity.getIdx();
		this.title = entity.getTitle();
		this.writer = entity.getWriter();
		this.content = entity.getContent();
		this.indate = entity.getIndate();
		this.count = entity.getCount();
		this.img = entity.getImg();
	}
}

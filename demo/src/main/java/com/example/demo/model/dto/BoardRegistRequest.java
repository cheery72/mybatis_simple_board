package com.example.demo.model.dto;

public class BoardRegistRequest {

	private Long userId;
	
	private String content;

	
	public BoardRegistRequest(Long userId, String content) {
		this.userId = userId;
		this.content = content;
	}
	
	
	public Long getUserId() {
		return userId;
	}
	
	public String getContent() {
		return content;
	}

}

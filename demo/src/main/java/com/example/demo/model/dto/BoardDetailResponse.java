package com.example.demo.model.dto;

public class BoardDetailResponse {

	
	private Long boardId;
	
	private Long userId;
	
	private String content;
	
	public Long getBoardId() {
		return boardId;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public String getContent() {
		return content;
	}
	
	public BoardDetailResponse(Long boardId, Long userId, String content) {
		this.boardId = boardId;
		this.userId = userId;
		this.content = content;
	}
	
}

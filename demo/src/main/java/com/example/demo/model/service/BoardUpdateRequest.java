package com.example.demo.model.service;

public class BoardUpdateRequest {

	private Long boardId;
	
	private String content;
	
	
	public Long getBoardId() {
		return boardId;
	}
	
	public String getContent() {
		return content;
	}
	
	public BoardUpdateRequest(Long boardId, String content) {
		this.boardId = boardId;
		this.content = content;
	}
	
}

package com.example.demo.model.service;

import com.example.demo.model.dto.BoardDetailResponse;
import com.example.demo.model.dto.BoardRegistRequest;

public interface BoardService {

	void regBoard(BoardRegistRequest boardRegistRequest);

	BoardDetailResponse getBoard(Long boardId);
	
	void updateBoard(BoardUpdateRequest boardUpdateRequest);

	void delBoard(Long userId, Long boardId);
}

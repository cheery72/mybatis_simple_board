package com.example.demo.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.dto.BoardDetailResponse;
import com.example.demo.model.dto.BoardRegistRequest;
import com.example.demo.model.service.BoardUpdateRequest;

@Mapper
public interface BoardMapper {

	void regBoard(BoardRegistRequest boardRegistRequest);
	
	BoardDetailResponse getBoard(Long boardId);
	
	void updateBoard(BoardUpdateRequest boardUpdateRequest);

	void delBoard(Long userId, Long boardId);
}

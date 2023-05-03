package com.example.demo.model.service;

import java.beans.Transient;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.dto.BoardDetailResponse;
import com.example.demo.model.dto.BoardRegistRequest;
import com.example.demo.model.mapper.BoardMapper;


@Service
@Transactional(readOnly = true)
public class BoardServiceImpl implements BoardService{

	
	@Autowired
	private SqlSession sqlSession;

	@Transactional
	@Override
	public void regBoard(BoardRegistRequest boardRegistRequest) {
		
		sqlSession.getMapper(BoardMapper.class).regBoard(boardRegistRequest);
	}

	@Override
	public BoardDetailResponse getBoard(Long boardId) {
		return sqlSession.getMapper(BoardMapper.class).getBoard(boardId);
		
	}

	@Transactional
	@Override
	public void updateBoard(BoardUpdateRequest boardUpdateRequest) {
		sqlSession.getMapper(BoardMapper.class).updateBoard(boardUpdateRequest);		
	}

	@Transactional
	@Override
	public void delBoard(Long userId, Long boardId) {
		sqlSession.getMapper(BoardMapper.class).delBoard(userId, boardId);
		
	}
	
	
	
}

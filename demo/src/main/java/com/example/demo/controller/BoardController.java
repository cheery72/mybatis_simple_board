package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.dto.BoardDetailResponse;
import com.example.demo.model.dto.BoardRegistRequest;
import com.example.demo.model.service.BoardService;
import com.example.demo.model.service.BoardUpdateRequest;

@RestController
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	
	@PostMapping("/register")
	public ResponseEntity<Object> boardRegist(@RequestBody BoardRegistRequest boardRegistRequest){
		
		boardService.regBoard(boardRegistRequest);
		
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.build();
	}
	
	@GetMapping("/detail/{boardId}")
	public ResponseEntity<BoardDetailResponse> findBoardDetail(@PathVariable("boardId") Long boardId){
		
		return ResponseEntity
				.ok(boardService.getBoard(boardId));
	}
	
	
	@PutMapping("/modify")
	public ResponseEntity<Object> modifyBoardContent(@RequestBody BoardUpdateRequest boardUpdateRequest){
		
		boardService.updateBoard(boardUpdateRequest);
		
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.build();
	}
	
	@DeleteMapping("{userId}/{boardId}")
	public ResponseEntity<Object> deleteBoard(@PathVariable Long userId, @PathVariable Long boardId){
		boardService.delBoard(userId, boardId);
		return ResponseEntity
				.status(HttpStatus.NO_CONTENT)
				.build();
	}
	
}

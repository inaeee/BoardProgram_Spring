package com.example.board.boardsub.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.board.boardsub.domain.CommentVO;
import com.example.board.boardsub.mapper.CommentMapper;

@Service("com.example.board.boardsub.service.CommentService")
public class CommentService {
	
	@Resource(name="com.example.board.boardsub.mapper.CommentMapper")
	CommentMapper mCommentMapper;
	
	public List<CommentVO> commentListService() throws Exception{
		
		return mCommentMapper.commentList();
		
	}
	
	public int commentInsertService(CommentVO comment) throws Exception{
		
		return mCommentMapper.commentInsert(comment);
		
	}
	
	public int commentUpdateService(CommentVO comment) throws Exception{
		
		return mCommentMapper.commentUpdate(comment);
		
	}
	
	public int commentDeleteService(int cno) throws Exception{
		
		return mCommentMapper.commentDelete(cno);
		
	}

}

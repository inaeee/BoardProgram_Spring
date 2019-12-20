package com.example.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.boardsub.mapper.BoardMapper;

@Controller
public class JspTest {
	
	@Resource(name="com.example.board.boardsub.mapper.BoardMapper")
	BoardMapper mBoardMapper;
	
	@RequestMapping("/test")
	private String jspTest() throws Exception{
		System.out.println(mBoardMapper.boardCount());
		//Jsp를 테스트했던 클래스에 db연동이 잘 되었는지 테스트
		return "test"; //생성한  jsp명 (test.jsp)
	}

}

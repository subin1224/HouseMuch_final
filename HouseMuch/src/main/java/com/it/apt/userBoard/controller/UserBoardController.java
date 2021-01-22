package com.it.apt.userBoard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/userBoard")
public class UserBoardController {
	private static final Logger logger
		=LoggerFactory.getLogger(UserBoardController.class);

	@RequestMapping(value="/userBoardWrite.do",method = RequestMethod.GET)
	public void boardWrite() {
		logger.info("���ֹ� �Խ��� �۾��� ȭ�� �����ֱ� - userBoardWrite");
	}
	
	@RequestMapping("/userBoardList.do")
	public void boardList() {
		logger.info("���ֹ� �Խ��� ��� �����ֱ� - userBoardList");
	}
	
	@RequestMapping(value="/userBoardEdit.do",method = RequestMethod.GET)
	public void boardEdit() {
		logger.info("���ֹ� �Խ��� �ۼ��� ȭ�� �����ֱ� - userBoardEdit");
	}
	
	@RequestMapping("/userBoardDetail.do")
	public void boardDetail() {
		logger.info("���ֹ� �Խ��� �� �󼼺��� - userBoardDetail");
	}
	
	@RequestMapping("/test.do")
	public void test() {
		logger.info("���ֹ� �Խ��� �۾��� ȭ�� �����ֱ� - test");
	}
}

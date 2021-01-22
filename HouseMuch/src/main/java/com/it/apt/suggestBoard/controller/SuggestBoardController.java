package com.it.apt.suggestBoard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.it.apt.userBoard.controller.UserBoardController;

@Controller
@RequestMapping("/suggestBoard")
public class SuggestBoardController {
	private static final Logger logger
	=LoggerFactory.getLogger(UserBoardController.class);

	@RequestMapping(value="/suggestBoardWrite.do",method = RequestMethod.GET)
	public void boardWrite() {
		logger.info("���� �Խ��� �۾��� ȭ�� �����ֱ� - suggestBoardWrite");
	}

	@RequestMapping("/suggestBoardList.do")
	public void boardList() {
		logger.info("���� �Խ��� ��� �����ֱ� - suggestBoardList");
	}

	@RequestMapping(value="/suggestBoardEdit.do",method = RequestMethod.GET)
	public void boardEdit() {
		logger.info("���� �Խ��� �ۼ��� ȭ�� �����ֱ� - suggestBoardEdit");
	}

	@RequestMapping("/suggestBoardDetail.do")
	public void boardDetail() {
		logger.info("���� �Խ��� �� �󼼺��� - suggestBoardDetail");
	}


}

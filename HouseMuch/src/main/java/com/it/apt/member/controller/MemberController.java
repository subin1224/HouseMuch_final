package com.it.apt.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@RequestMapping(value="/register/registerApt.do", method = RequestMethod.GET)
	public void adminRegister_get() {
		logger.info("APT신청하기 View!!");
	}	
	
	@RequestMapping(value="/register/registerChkKey.do", method=RequestMethod.GET)
	public void registerKey_get() {
		logger.info("세대코드 입력 View!!");
	}

	@RequestMapping(value="/register/registerMember.do", method=RequestMethod.GET)
	public void register_get() {
		logger.info("회원가입 View!!");
	}

	@RequestMapping("/register/registerAgree.do")
	public void registerAgree_get() {
		logger.info("회원약관 View!!");
	}
}

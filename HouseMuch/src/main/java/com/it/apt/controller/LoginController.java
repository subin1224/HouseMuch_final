package com.it.apt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
   private static final Logger logger=LoggerFactory.getLogger(LoginController.class);
   
   @RequestMapping(value="/login.do", method=RequestMethod.GET)
   public void login_get() {
      logger.info("�α��� ȭ�� �����ֱ�");
   }
   
   @RequestMapping(value="/findId.do", method = RequestMethod.GET)
   public void findId_get() {
      logger.info("���̵� ã�� ȭ�� �����ֱ�");
   }
   
   @RequestMapping(value="/findPwd.do", method = RequestMethod.GET)
   public void findPwd_get() {
      logger.info("��й�ȣ ã�� ȭ�� �����ֱ�");
   }

   @RequestMapping("/findIdAll.do")
   public void findIdAll() {
      logger.info("��ü ���̵� ���");
   }
   
   @RequestMapping(value="/findResetPwd.do", method = RequestMethod.GET)
   public void findRestPwd_get() {
      logger.info("��й�ȣ �缳�� ȭ�� �����ֱ�");
   }
      
   
}
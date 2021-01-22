package com.it.apt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
   
   private static final Logger logger = LoggerFactory.getLogger(IndexController.class);


   @RequestMapping(value = "/user/mydash/userDash.do", method = RequestMethod.GET)
   public void index() {
      logger.info("������ �ȳ��� ��!!");
   }   
   
   @RequestMapping("/main/index.do")
   public void index_main() {
      logger.info("���� ȭ�� ��ü �����ֱ�");
   }   
   
   @RequestMapping("/main/main.do")
   public void main() {
      logger.info("���� ȭ�� �����ֱ�");
   }
   
}


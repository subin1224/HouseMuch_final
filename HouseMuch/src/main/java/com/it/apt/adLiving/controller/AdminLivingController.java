package com.it.apt.adLiving.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/adminLiving")
public class AdminLivingController {

   private static final Logger logger = LoggerFactory.getLogger(AdminLivingController.class);
   
   @RequestMapping("/adLiving.do")
   public void adLiving_get() {
      logger.info("adLiving - ���������� ����ȭ�� �����ֱ�");
      //return "admin/adminLiving/adLiving";
   }
   
   @RequestMapping(value = "/adNotice.do",method = RequestMethod.GET)
   public String adNotice_get() {
      logger.info("adNotice - ������� ȭ�麸���ֱ�");
      return "admin/adminLiving/adNotice";
   }
   
   
   
   
}
package com.it.apt.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
   
   private Logger logger = LoggerFactory.getLogger(SampleController.class);
   
   @RequestMapping("/Analytics.do")
   public void analytics() {
      logger.info("Analytics ȭ�� �����ֱ�!");
   }

   @RequestMapping("/eCommerce.do")
   public void eCommerce() {
      logger.info("eCommerce ȭ�� �����ֱ�!");
   }

   @RequestMapping("/email.do")
   public void email() {
      logger.info("email ȭ�� �����ֱ�!");
   }

   @RequestMapping("/chat.do")
   public void chat() {
      logger.info("chat ȭ�� �����ֱ�!");
   }

   @RequestMapping("/calendar.do")
   public void calendar() {
      logger.info("calendar ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/app-invoice-list.do")
   public void app_invoice_list() {
      logger.info("app-invoice-list.jsp ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/app-invoice-add.do")
   public void app_invoice_add() {
      logger.info("app-invoice-add.jsp ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/app-invoice-edit.do")
   public void app_invoice_edit() {
      logger.info("app-invoice-edit.jsp ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/app-invoice-preview.do")
   public void app_invoice_preview() {
      logger.info("app-invoice-preview.jsp ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/app-ecommerce-shop.do")
   public void app_ecommerce_shop() {
      logger.info("app-ecommerce-shop.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/app-ecommerce-checkout.do")
   public void app_ecommerce_checkout() {
      logger.info("app-ecommerce-checkout.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/app-ecommerce-wishlist.do")
   public void app_ecommerce_wishlist() {
      logger.info("app-ecommerce-wishlist.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/app-ecommerce-details.do")
   public void app_ecommerce_details() {
      logger.info("app-ecommerce-details.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/app-user-list.do")
   public void app_ecommerce_list() {
      logger.info("app-user-list.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/app-user-edit.do")
   public void app_ecommerce_edit() {
      logger.info("app-user-edit.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/app-user-view.do")
   public void app_ecommerce_view() {
      logger.info("app-user-view.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-auth-login-v1.do")
   public void page_auth_login_v1() {
      logger.info("page-auth-login-v1 ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-auth-register-v1.do")
   public void page_auth_register_v1() {
      logger.info("page-auth-register-v1 ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-auth-forgot-password-v1.do")
   public void page_auth_forgot_password_v1() {
      logger.info("page-auth-forgot-password-v1 ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-auth-reset-password-v1.do")
   public void page_auth_reset_password_v1() {
      logger.info("page-auth-reset-password-v1 ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-account-settings.do")
   public void page_account_settings() {
      logger.info("page-account-settings.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-profile.do")
   public void page_profile() {
      logger.info("page-profile.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-faq.do")
   public void page_faq() {
      logger.info("page-faq.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-pricing.do")
   public void page_pricing() {
      logger.info("page-pricing.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-blog-list.do")
   public void page_blog_list() {
      logger.info("page-blog-list.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/page-blog-detail.do")
   public void page_blog_detail() {
      logger.info("page-blog-detail.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-blog-edit.do")
   public void page_blog_edit() {
      logger.info("page-blog-edit.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/page-misc-error.do")
   public void page_blog_misc_error() {
      logger.info("page-misc-error.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/ui-typography.do")
   public void ui_typography() {
      logger.info("ui-typography.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/ui-colors.do")
   public void ui_colors() {
      logger.info("ui-colors.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/ui-feather.do")
   public void ui_feather() {
      logger.info("ui-feather.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/card-basic.do")
   public void card_basic() {
      logger.info("card-basic.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/card-advance.do")
   public void card_advance() {
      logger.info("card-advance.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/card-statistics.do")
   public void card_statistics() {
      logger.info("card-statistics.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/card-analytics.do")
   public void card_analytics() {
      logger.info("card-analytics.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/card-actions.do")
   public void card_actions() {
      logger.info("card-actions.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/form-input-mask.do")
   public void form_input_mask() {
      logger.info("form-input-mask.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/form-date-time-picker.do")
   public void form_date_time_picker() {
      logger.info("form-date-time-picker.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/form-layout.do")
   public void form_layout() {
      logger.info("form-layout.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/form-wizard.do")
   public void form_wizard() {
      logger.info("form-wizard.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/form-validation.do")
   public void form_validation() {
      logger.info("form-validation.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/form-repeater.do")
   public void form_repeater() {
      logger.info("form-repeater.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/table-datatable-basic.do")
   public void form_basic() {
      logger.info("table-datatable-basic.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/table-datatable-advanced.do")
   public void form_advanced() {
      logger.info("table-datatable-advanced.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/chart-apex.do")
   public void chart_apex() {
      logger.info("chart-apex.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/chart-chartjs.do")
   public void chart_chartjs() {
      logger.info("chart-chartjs.do ȭ�� �����ֱ�!");
   }

   @RequestMapping("/maps-leaflet.do")
   public void maps_leaflet() {
      logger.info("maps-leaflet.do ȭ�� �����ֱ�!");
   }
   
   @RequestMapping("/table-bootstrap.do")
   public void table_bootstrap() {
	   logger.info("table-bootstrap.do ȭ�� �����ֱ�!");
   }
   
}
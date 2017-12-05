package jp.co.asia.archive.ums.domain.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

public interface UmsCmd {
  void service(HttpServletRequest request, Model model);
}

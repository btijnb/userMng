package jp.co.asia.archive.ums.domain.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import jp.co.asia.archive.ums.domain.model.UVO;
import jp.co.asia.archive.ums.domain.repository.UmsDAO;

public class ListCmd implements UmsCmd {

  @Override
  public void service(HttpServletRequest request, Model model) {
    UmsDAO dao = new UmsDAO();
    
    ArrayList<UVO> UVOs = dao.list(request);
    model.addAttribute("list", UVOs);
//    mav.addObject("list", UVOs);
//    mav.setViewName("user/searchList");

  }
}

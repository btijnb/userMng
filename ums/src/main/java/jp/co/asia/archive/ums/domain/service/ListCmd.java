package jp.co.asia.archive.ums.domain.service;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import jp.co.asia.archive.ums.domain.model.UVO;
import jp.co.asia.archive.ums.domain.repository.UmsDAO;

public class ListCmd implements UmsCmd {

  @Override
  public void service(ModelAndView mv2) {
    UmsDAO dao = new UmsDAO();
    ArrayList<UVO> UVOs = dao.list();
    mv2.addObject("list", UVOs);
    mv2.setViewName("user/searchList");
  }
}

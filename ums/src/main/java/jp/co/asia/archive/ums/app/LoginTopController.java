package jp.co.asia.archive.ums.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.asia.archive.ums.domain.service.ListCmd;
import jp.co.asia.archive.ums.domain.service.UmsCmd;

//TODO Javadoc

@Controller
public class LoginTopController {

	UmsCmd cmd = null;
	
     @RequestMapping(value = "/login", params="form", method = RequestMethod.GET)
      public ModelAndView loginForm() { 
	    	  ModelAndView mav=new ModelAndView();
	    	  mav.setViewName("login/loginForm");
	    	  return mav;
    }


      @RequestMapping(value = "/top", method = RequestMethod.GET) //MEMO RequestMethod.GET: URL requestがgetならこのメソッドが処理　QUESTION それでは直前のページはloginFormではないってこと？パスワードをgetに送るはずないから
      public String menu() {

        return "top/menu";
      }      
      
}

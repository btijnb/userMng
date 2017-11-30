package jp.co.asia.archive.ums.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.asia.archive.ums.domain.service.ListCmd;
import jp.co.asia.archive.ums.domain.service.UmsCmd;

@Controller
@RequestMapping("/user")
public class SearchController {

  UmsCmd cmd = null;

    /**
     * 検索フォームへ遷移
     *
     * @return 検索フォーム画面名
     */
      @RequestMapping(value = "/search", params="form", method = RequestMethod.GET)
      public ModelAndView searchForm() {
    	  		
    	  ModelAndView mav=new ModelAndView();
    	  mav.setViewName("user/searchForm");
    	  return mav;
      //return "user/searchForm";
    }

//  /**
//   * 条件無しユーザデータリスト出力処理.
//   *
//   * @return View名 //MEMO 使用者(プログラマー)がソース見て分かるような部分は、このくらいで書いていい
//   */
//  @RequestMapping(value = "/search", method = RequestMethod.GET) //TODO 後でPOSTに変更予定
//  public String searchList(Model model) {
//
//    System.out.println("-----List呼ぶ-----");
//
//    cmd = new ListCmd();
//    cmd.service(model);
//
//    return "user/searchList";
//  }
      
      /**
       * 条件あるデータリスト出力に変更
       *
       * @return View名
       */
      @RequestMapping(value = "/search", method = RequestMethod.GET) //TODO 後でPOSTに変更予定
      public String searchList(HttpServletRequest request, Model model) { //TODO Parameter無しにする

        System.out.println("-----条件適用List呼ぶ-----");

//        String user_id=request.getParameter("user_id");
//        String name=request.getParameter("name");
//        String birth=request.getParameter("birth");
//        String address=request.getParameter("address");
//        String pn=request.getParameter("pn");
//        String pw=request.getParameter("pw");        
//        String status=request.getParameter("status");
//        String updated=request.getParameter("updated");
        
//        model.addAttribute("user_id", user_id);
//        model.addAttribute("name", name);
//        model.addAttribute("birth", birth);
//        model.addAttribute("address", address);
//        model.addAttribute("pn", pn);
//        model.addAttribute("pw", pw);        
//        model.addAttribute("status", status);
//        model.addAttribute("updated", updated);
        
        cmd = new ListCmd();
        cmd.service(request, model);

        return "user/searchList";
      }      
}

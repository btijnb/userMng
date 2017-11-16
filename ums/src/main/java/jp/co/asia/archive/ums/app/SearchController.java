package jp.co.asia.archive.ums.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("search")
public class SearchController {

  /**
   * 検索フォームへ遷移
   *
   * @return 検索フォーム画面名
   */
  @RequestMapping(value = "form", method = RequestMethod.GET)
  public String form(Model model1) {

    //TODO form model関連実装

    String checkform = "これ出たらform成功";
    model1.addAttribute("checkform", checkform);

    return "user/searchForm";
  }

  //    /**
  //     * 条件に合うユーザデータリスト出力処理.
  //     * @return ModelAndViewオブジェクト（checklistオブジェクト、ユーザリスト画面名）
  //     */
  //    @RequestMapping(value="list", method = RequestMethod.GET)
  //    public ModelAndView modelAndView(){
  //
  //    		//TODO list model関連実装
  //
  //    		ModelAndView mv = new ModelAndView();
  //    		mv.addObject("checklist", "これ出たらlist成功");
  //    		mv.setViewName("user/searchList");
  //    		return mv;
  //
  //    }

  /**
   * 条件に合うユーザデータリスト出力処理.
   *
   * @return ModelAndViewオブジェクト（searchFormオブジェクト、ユーザ検索結果画面名）
   */
  //データ渡し実験用URL: http://localhost:8080/ums/search/list?userId=a&userName=a&birthDay=a&address=a&telNum=a&roles=a&state=a
  @RequestMapping(value = "list", method = RequestMethod.GET)
  public ModelAndView modelAndView(SearchForm searchForm) {

    //TODO list model関連実装

    ModelAndView mv = new ModelAndView();
    mv.addObject("searchForm", searchForm);
    mv.setViewName("user/searchList");
    return mv;
  }
}

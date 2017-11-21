package jp.co.asia.archive.ums.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class SearchController {

  /**
   * 検索フォームへ遷移
   *
   * @return 検索フォーム画面名
   */
  @RequestMapping(value = "search", method = RequestMethod.GET, params = "form")
  public ModelAndView searchForm(SearchForm searchForm) { //MEMO 画面のformタグ中の要素をControllerで受け取ります。
	// FIXME 画面遷移実験用(top画面の検索ボタン作製後削除)  http://localhost:8080/ums/user/search?form
    //TODO form model関連実装

    String checkForm = "これ出たらform成功";

    ModelAndView mav = new ModelAndView();
    mav.addObject("form", searchForm);
    mav.addObject("checkForm", checkForm);
    mav.setViewName("user/searchForm");
    return mav;
  }

  /**
   * 条件に合うユーザデータリスト出力処理.
   *
   * @return ModelAndView //MEMO 使用者(プログラマー)がソース見て分かるような部分は、このくらいで書いていい
   */
  @RequestMapping(value = "search", method = RequestMethod.GET) //TODO 後でPOSTに変更予定
  public ModelAndView searchList() {
    // FIXME データ渡し実験用(searchForm.jsp作成後削除) URL: http://localhost:8080/ums/user/search?userId=a&userName=a&birthDay=a&address=a&telNum=a&roles=a&state=a
    // TODO list model関連実装

    String checkList = "これ出たらlist成功";

    ModelAndView mav2 = new ModelAndView();
    mav2.addObject("checkList", checkList);
    mav2.setViewName("user/searchList");
    return mav2;
  }
}

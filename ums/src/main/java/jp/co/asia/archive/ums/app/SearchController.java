package jp.co.asia.archive.ums.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.asia.archive.ums.domain.service.ListCmd;
import jp.co.asia.archive.ums.domain.service.UmsCmd;

@Controller
@RequestMapping("user")
public class SearchController {

  UmsCmd cmd = null;

  // TODO 条件なしでリスト出力してから、着手
  //  /**
  //   * 検索フォームへ遷移
  //   *
  //   * @return 検索フォーム画面名
  //   */
  //  @RequestMapping(value = "search", method = RequestMethod.GET)
  //  public ModelAndView searchForm(Form form) { //MEMO 画面のformタグ中の要素をControllerで受け取ります。
  //
  //    //TODO form model関連実装
  //
  //    String checkForm = "これ出たらform成功";
  //
  //    ModelAndView mav = new ModelAndView();
  //    mav.addObject("form", form);
  //    mav.addObject("checkForm", checkForm);
  //    mav.setViewName("user/searchForm");
  //    return mav;
  //  }

  /**
   * 条件に合うユーザデータリスト出力処理.
   *
   * @return ModelAndView //MEMO 使用者(プログラマー)がソース見て分かるような部分は、このくらいで書いていい
   */
  @RequestMapping(value = "search", method = RequestMethod.GET) //TODO 後でPOSTに変更予定
  public UmsCmd searchList() {

    System.out.println("-----List呼ぶ-----");

    ModelAndView mav2 = new ModelAndView();

    cmd = new ListCmd();
    cmd.service(mav2);

    return cmd;
  }
}

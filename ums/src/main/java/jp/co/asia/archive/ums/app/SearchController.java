package jp.co.asia.archive.ums.app;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
		
        return "user/search_form";
    }
	
	
    /**
     * 条件に合うユーザデータリスト出力処理.
     *
     * @return ユーザリスト画面名
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model2) {

    		//TODO list model関連実装
    	
    		String checklist = "これ出たらlist成功";
		model2.addAttribute("checklist", checklist);
		
        return "user/search_list";
    }

}
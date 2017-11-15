/*
 *
 */
package jp.co.asia.archive.ums.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("top")
public class TopController {

    /**
     * メニュー画面の遷移処理を行う.
     *
     * @return メニュー画面名
     */
    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    public String home() {
        return "top/menu";
    }
}

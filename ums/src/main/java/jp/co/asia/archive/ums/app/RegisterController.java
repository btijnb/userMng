/*
 *
 */
package jp.co.asia.archive.ums.app;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.asia.archive.ums.app.helper.RegisterHelper;

@Controller
@RequestMapping("user")
public class RegisterController {

    @Inject
    RegisterHelper helper;

    /**
     * ユーザ登録フォームの初期化を行う.
     *
     * @return ユーザ登録フォーム
     */
    @ModelAttribute
    public RegisterForm setUpForm() {
        return new RegisterForm();
    }

    /**
     * ユーザ登録画面に遷移処理を行う.
     *
     * @return ユーザ登録画面名
     */
    @RequestMapping(value = "register", params = "form")
    public String form(RegisterForm registerForm, Model model) {

        model.addAttribute("registerForm", registerForm);
        model.addAttribute("checkRoles", helper.getCheckRoles());

        return "/user/registerForm";
    }

    /**
     * ユーザ登録画面に遷移処理を行う.
     *
     * @return ユーザ登録画面名
     */
    @RequestMapping(value = "register", params = "confirm")
    public String confirm(RegisterForm registerForm, Model model) {

        return "/user/registerConfirm";
    }
}

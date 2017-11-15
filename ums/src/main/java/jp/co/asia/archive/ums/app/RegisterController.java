/*
 *
 */
package jp.co.asia.archive.ums.app;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.asia.archive.ums.app.helper.RegisterHelper;

@Controller
@RequestMapping("user")
public class RegisterController {

    @Inject
    RegisterHelper helper;

    /**
     * ユーザ登録フォームの初期化.
     *
     * @return ユーザ登録フォーム
     */
    @ModelAttribute
    public RegisterForm setUpForm() {
        return new RegisterForm();
    }

    /**
     * ユーザ登録画面に遷移処理.
     *
     * @return ユーザ登録画面名
     */
    @RequestMapping(value = "register", params = "form")
    public String form(RegisterForm registerForm, Model model) {

        model.addAttribute("registerForm", registerForm);
        model.addAttribute("checkRoles", helper.getCheckRoles());

        return "user/registerForm";
    }

    /**
     * ユーザ登録確認画面に遷移処理.
     *
     * @return ユーザ登録確認画面名
     */
    @RequestMapping(value = "register", params = "confirm")
    public String confirm(RegisterForm registerForm, Model model) {

        return "user/registerConfirm";
    }

    /**
     * ユーザ登録画面に遷移.
     *
     * @return ユーザ登録確認画面名
     */
    @RequestMapping(value = "register", params = "redo")
    public String redo(RegisterForm registerForm, Model model) {

        model.addAttribute("registerForm", registerForm);
        model.addAttribute("checkRoles", helper.getCheckRoles());

        return "user/registerForm";
    }

    /**
     * ユーザ登録.
     *
     * @return ユーザ登録完了画面にリダイレクト
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(RegisterForm registerForm, Model model, RedirectAttributes redirectAttributes) {
        return "redirect:/user/register?finish";
    }

    /**
     * ユーザ登録完了.
     *
     * @return ユーザ登録完了画面名
     */
    @RequestMapping(value = "register", params = "finish")
    public String finish(Model model) {
        return "user/registerFinish";
    }
}

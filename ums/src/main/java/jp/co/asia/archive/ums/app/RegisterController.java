/*
 *
 */
package jp.co.asia.archive.ums.app;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.asia.archive.ums.app.helper.RegisterHelper;

@Controller
@RequestMapping("user")
@SessionAttributes(value = "registerForm")
public class RegisterController {

    @Inject
    RegisterHelper helper;

    /**
     * ユーザ登録フォームの初期化.
     *
     * @return ユーザ登録フォーム
     */
    @ModelAttribute(value="registerForm")
    public RegisterForm setUpForm() {
        return new RegisterForm();
    }

    @RequestMapping(value = "register", params = "form", method = RequestMethod.GET)
    public String initializeRegisterForm(SessionStatus sessionStatus) {
        sessionStatus.setComplete();

        return "redirect:/user/register";
    }

    /**
     * ユーザ登録画面に遷移処理.
     *
     * @return ユーザ登録画面名
     */
    @RequestMapping(value = "register", method = RequestMethod.GET)
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
    public String confirm(@Validated RegisterForm registerForm, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "user/registerForm";
        }

        return "user/registerConfirm";
    }

    /**
     * ユーザ登録画面に遷移.
     *
     * @return ユーザ登録確認画面名
     */
    @RequestMapping(value = "register", params = "redo")
    public String redo(SessionStatus sessionStatus) {

        return initializeRegisterForm(sessionStatus);
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

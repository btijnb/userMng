/*
 *
 */
package jp.co.asia.archive.ums.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class RegisterController {

	  @ModelAttribute
	  public RegisterForm setUpForm() {
	    return new RegisterForm();
	  }

	  @RequestMapping(value="register", params="form")
	  public String form() {
	      return "/user/registerForm";
	  }
}

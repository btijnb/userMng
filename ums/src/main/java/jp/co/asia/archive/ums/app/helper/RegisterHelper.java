package jp.co.asia.archive.ums.app.helper;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RegisterHelper {

    public List<String> getCheckRoles() {

        List<String> checkBox = new LinkedList<>();
        checkBox.add("ADMIN");
        checkBox.add("USER");

        return checkBox;
    }

}

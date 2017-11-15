package jp.co.asia.archive.ums.app;

public class RegisterForm {

    private static final long serialVersionUID = 1L;

    /**
     * ユーザーID.
     */
    private String userId;

    /**
     * 名前.
     */
    private String userName;

    /**
     * 生年月日.
     */
    private String birthDay;

    /**
     * 住所.
     */
    private String address;

    /**
     * 電話番号.
     */
    private String telNum;

    /**
     * 権限.
     */
    private String[] roles;

    /**
     * パスワード.
     */
    private String password;

    /**
     * パスワード確認.
     */
    private String confirmPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}

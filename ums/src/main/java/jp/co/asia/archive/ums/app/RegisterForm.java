package jp.co.asia.archive.ums.app;

public class RegisterForm {

  private static final long serialVersionUID = 1L;

  /**
   * ユーザーID
   */
  private String userId;

  /**
   * 誕生日
   */
  private String birthDay;

  /**
   * 住所
   */
  private String address;

  /**
   * 電話番号
   */
  private String telNum;

  /**
   * 権限
   */
  private String roles;

  /**
   * パスワード
   */
  private String password;

  /**
   * パスワード確認
   */
  private String confirmPassword;

  /**
   *
   * @return
   */
  public String getUserId() {
    return userId;
  }

  /**
   *
   * @param userId
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   *
   * @return
   */
  public String getBirthDay() {
    return birthDay;
  }

  /**
   *
   * @param birthDay
   */
  public void setBirthDay(String birthDay) {
    this.birthDay = birthDay;
  }

  /**
   *
   * @return
   */
  public String getAddress() {
    return address;
  }

  /**
   *
   * @param address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   *
   * @return
   */
  public String getTelNum() {
    return telNum;
  }

  /**
   *
   * @param telNum
   */
  public void setTelNum(String telNum) {
    this.telNum = telNum;
  }

  /**
   *
   * @return
   */
  public String getRoles() {
    return roles;
  }

  /**
   *
   * @param roles
   */
  public void setRoles(String roles) {
    this.roles = roles;
  }

  /**
   *
   * @return
   */
  public String getPassword() {
    return password;
  }

  /**
   *
   * @param password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   *
   * @return
   */
  public String getConfirmPassword() {
    return confirmPassword;
  }

  /**
   *
   * @param confirmPassword
   */
  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }
}

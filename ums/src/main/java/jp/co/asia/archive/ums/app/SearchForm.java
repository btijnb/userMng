package jp.co.asia.archive.ums.app;

public class SearchForm { //MEMO RegisterForm.javaとは別途のファイル
  //QUESTION これは何に使われるんだろう　private static final long serialVersionUID = 1L;

  /** ユーザーID. */
  private String userId;

  /** 名前. */
  private String userName;

  /** 生年月日. */
  private String birthDay;

  /** 住所. */
  private String address;

  /** 電話番号. */
  private String telNum;

  /** 権限. */
  private String[] roles; //MEMO 検索処理では文字列でいいです。登録画面では管理者、ユーザーのチェック項目があるので文字列の配列にしています。

  /** 状態 */
  private String state;

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

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;

    System.out.println("test"); //実際に使われるメソッドの中にこれを書く
  }
}

package jp.co.asia.archive.ums.domain.model;

public class UVO {
  String user_id2;
  String name2;
  String birth2;
  String address2;
  String pn2;
  String pw2;
  String status2;
  String updated2;

  public UVO() {}

  public UVO(
      String user_id2,
      String name2,
      String birth2,
      String address2,
      String pn2,
      //String pw2,
      String status2,
      String updated2) {
    super();
    this.user_id2 = user_id2;
    this.name2 = name2;
    this.birth2 = birth2;
    this.address2 = address2;
    this.pn2 = pn2;
    this.pw2 = pw2;
    this.status2 = status2;
    this.updated2 = updated2;
  }

  public String getUser_id2() {
    return user_id2;
  }

  public void setUser_id2(String user_id2) {
    this.user_id2 = user_id2;
  }

  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  public String getBirth2() {
    return birth2;
  }

  public void setBirth2(String birth2) {
    this.birth2 = birth2;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getPn2() {
    return pn2;
  }

  public void setPn2(String pn2) {
    this.pn2 = pn2;
  }

  public String getPw2() {
	    return pw2;
	  }

	  public void setPw2(String pw2) {
	    this.pw2 = pw2;
	  }  
  
  public String getStatus2() {
    return status2;
  }

  public void setStatus(String status2) {
    this.status2 = status2;
  }

  public String getUpdated2() {
    return updated2;
  }

  public void setUpdated2(String updated2) {
    this.updated2 = updated2;
  }
}

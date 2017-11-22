package jp.co.asia.archive.ums.domain.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jp.co.asia.archive.ums.domain.model.UVO;

public class UmsDAO {

  DataSource dataSource;

  public UmsDAO() {
    try {
      Context ctx = new InitialContext();
      dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/ums");
    } catch (NamingException e) {
      e.printStackTrace();
    }
  }

  public ArrayList<UVO> list() {
    ArrayList<UVO> UVOs = new ArrayList<UVO>();
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
      connection = dataSource.getConnection();
      System.out.println("-----connection確保-----");
      String sql = "select user_id, name, birth, address, pn, pw, status, updated from t_user";

      preparedStatement = connection.prepareStatement(sql);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        String user_id = resultSet.getString("user_id");
        String name = resultSet.getString("name");
        String birth = resultSet.getString("birth");
        String address = resultSet.getString("address");
        String pn = resultSet.getString("pn");
        String pw = resultSet.getString("pw");
        String status = resultSet.getString("status");
        String updated = resultSet.getString("updated");

        UVO uVO = new UVO(user_id, name, birth, address, pn, pw, status, updated);
        UVOs.add(uVO);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if (resultSet != null) resultSet.close();
        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    return UVOs;
  }
}

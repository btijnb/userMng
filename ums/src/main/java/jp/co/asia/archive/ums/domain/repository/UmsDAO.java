package jp.co.asia.archive.ums.domain.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;


import jp.co.asia.archive.ums.domain.model.UVO;

public class UmsDAO {

  DataSource dataSource;
//private String user_id;
//private String name;
//private String birth;
//private String address;
//private String pn;
//private String status;
//private String updated;

  public UmsDAO() {
    try {
      Context ctx = new InitialContext();
      dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/ums");
    } catch (NamingException e) {
      e.printStackTrace();
    }
  }

//  public ArrayList<UVO> list() {
//	    ArrayList<UVO> UVOs = new ArrayList<UVO>();
//	    Connection connection = null;
//	    PreparedStatement preparedStatement = null;
//	    ResultSet resultSet = null;
//
//	    try {
//	      connection = dataSource.getConnection();
//	      System.out.println("-----connection確保-----");
//	      String sql = "select user_id, name, birth, address, pn, status, updated from t_user";
//
//	      preparedStatement = connection.prepareStatement(sql);	      
//	      resultSet = preparedStatement.executeQuery();
//
//	      while (resultSet.next()) {
//	        String user_id = resultSet.getString("user_id");
//	        String name = resultSet.getString("name");
//	        String birth = resultSet.getString("birth");
//	        String address = resultSet.getString("address");
//	        String pn = resultSet.getString("pn");
//	        String status = resultSet.getString("status");
//	        String updated = resultSet.getString("updated");
//
//	        UVO uVO = new UVO(user_id, name, birth, address, pn, status, updated);
//	        UVOs.add(uVO);
//	      }
//	    } catch (SQLException e) {
//	      e.printStackTrace();
//	    } finally {
//	      try {
//	        if (resultSet != null) resultSet.close();
//	        if (preparedStatement != null) preparedStatement.close();
//	        if (connection != null) connection.close();
//	      } catch (Exception e2) {
//	        e2.printStackTrace();
//	      }
//	    }
//	    return UVOs;
//	  }  

  public ArrayList<UVO> list(HttpServletRequest request) {
    ArrayList<UVO> UVOs = new ArrayList<UVO>();
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    String user_id=request.getParameter("user_id");
    String name=request.getParameter("name");
    String birth=request.getParameter("birth");
    String address=request.getParameter("address");
    String pn=request.getParameter("pn");
    String status=request.getParameter("status");
    String updated=request.getParameter("updated");

    
    try {
      connection = dataSource.getConnection();
      System.out.println("-----connection確保-----");
    String sql = "select user_id, name, birth, address, pn, status, updated from t_user where user_id=? and name=? and birth=? and address=? and pn=? and status=? and updated=?";
      
      System.out.println("-----SQL文問題無し-----");

      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1, user_id);
      preparedStatement.setString(2, name);
      preparedStatement.setString(3, birth);
      preparedStatement.setString(4, address);
      preparedStatement.setString(5, pn);
      preparedStatement.setString(6, status);
      preparedStatement.setString(7, updated);

      
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        String user_id2 = resultSet.getString("user_id");
        String name2 = resultSet.getString("name");
        String birth2 = resultSet.getString("birth");
        String address2 = resultSet.getString("address");
        String pn2 = resultSet.getString("pn");
        String status2 = resultSet.getString("status");
        String updated2 = resultSet.getString("updated");

        UVO uVO = new UVO(user_id2, name2, birth2, address2, pn2, status2, updated2);
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

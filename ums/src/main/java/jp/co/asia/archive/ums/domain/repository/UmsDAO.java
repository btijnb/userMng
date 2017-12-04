package jp.co.asia.archive.ums.domain.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import jp.co.asia.archive.ums.domain.model.UVO;
import jp.co.asia.archive.ums.template.StaticTemplate;

public class UmsDAO {

  JdbcTemplate template;

  public UmsDAO() {
    this.template = StaticTemplate.template;
  }

  public ArrayList<UVO> list(HttpServletRequest request) {
    ArrayList<UVO> UVOs = null;

    String sql =
        "select user_id, name, birth, address, pn, status, updated from t_user where user_id=? and name=? and birth=? and address=? and pn=? and status=? and updated=?";

    PreparedStatementSetter pss =
        new PreparedStatementSetter() {

          String user_id = request.getParameter("user_id");
          String name = request.getParameter("name");
          String birth = request.getParameter("birth");
          String address = request.getParameter("address");
          String pn = request.getParameter("pn");
          String status = request.getParameter("status");
          String updated = request.getParameter("updated");

          @Override
          public void setValues(PreparedStatement ps) throws SQLException {
            ps.setString(1, user_id);
            ps.setString(2, name);
            ps.setString(3, birth);
            ps.setString(4, address);
            ps.setString(5, pn);
            ps.setString(6, status);
            ps.setString(7, updated);
          }
        };

    RowMapper<UVO> rowMapper =
        new RowMapper<UVO>() {

          @Override
          public UVO mapRow(ResultSet rs, int rowNum) throws SQLException {
            UVO uvo = new UVO();
            uvo.setUser_id2(rs.getString("user_id"));
            uvo.setName2(rs.getString("name"));
            uvo.setBirth2(rs.getString("birth"));
            uvo.setAddress2(rs.getString("address"));
            uvo.setPn2(rs.getString("pn"));
            uvo.setStatus(rs.getString("status"));
            uvo.setUpdated2(rs.getString("updated"));

            return uvo;
          }
        };
        
    UVOs = (ArrayList<UVO>) template.query(sql, pss, rowMapper);
    
    return UVOs;
  }
}

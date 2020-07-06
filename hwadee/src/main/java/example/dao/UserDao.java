package example.dao;

import example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private JdbcTemplate jdbcTemplate;
    private final static String sql = " Select count(*) from user where UserName=? and UserPwd=? ";
    private final static String sqlInsert = "insert into user(UserName,UserPwd) values (?,?)";

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int FindUser(String UserName, String UserPwd) {
        return jdbcTemplate.queryForObject(sql, new Object[]{UserName, UserPwd}, Integer.class);
    }

    //
    public void InsertUser(String UserName, String UserPwd) {
        jdbcTemplate.update(sqlInsert, UserName, UserPwd);
    }
}


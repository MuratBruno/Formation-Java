/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjava.dao.impl;

import com.aplose.formationspringjava.dao.IUserDAO;
import com.aplose.formationspringjava.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class UserDAO implements IUserDAO {

    JdbcTemplate jt;
    DataSource ds;
    InsertUser iu;

    public void setDs(DataSource ds) {
        this.ds = ds;
        jt = new JdbcTemplate(ds);
        iu = new InsertUser(ds);
    }

    public User findByLoginAndPassword(String login, String pwd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void create(User user) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("email", user.getLogin());
        paramMap.put("password", user.getPwd());
        paramMap.put("firstname", user.getFirstname());
        paramMap.put("lastname", user.getLastname());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        iu.updateByNamedParam(paramMap, keyHolder);
        user.setId(keyHolder.getKey().intValue());
        System.out.println("New user inserted with id: " + user.getId());
    }

    public void delete(User obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void update(User obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public User find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<User> findAll() {
        String sql = "select id, email, password, firstname, lastname from user";
        return jt.query(sql, new UserMapper());
    }

    private static final class UserMapper implements RowMapper<User> {

        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setLogin(rs.getString("email"));
            user.setPwd(rs.getString("password"));
            user.setFirstname(rs.getString("firstname"));
            user.setLastname(rs.getString("lastname"));
            return user;
        }
    }
}

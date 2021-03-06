package com.ryszardp.repository.jdbc.impl;

import com.ryszardp.domain.vo.User;
import com.ryszardp.repository.jdbc.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    public static final String USER_ID = "user_id";
    public static final String USER_NAME = "user_name";
    public static final String USER_SURNAME = "user_surname";
    public static final String LOGIN = "login";
    public static final String PASSWORD = "password";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private User getUserRowMapper(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getLong(USER_ID));
        user.setUserName(resultSet.getString(USER_NAME));
        user.setUserSurname(resultSet.getString(USER_SURNAME));
        user.setLogin(resultSet.getString(LOGIN));
        user.setPassword(resultSet.getString(PASSWORD));
        return user;
    }

    @Override
    public List<User> findAll() {
        final String findAllQuery = "select * from user";
        return namedParameterJdbcTemplate.query(findAllQuery, this::getUserRowMapper);
    }

    @Override
    public User findById(Long id) {
        final String findById = "select * from user where user_id = :userId";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("userId", id);
        return namedParameterJdbcTemplate.queryForObject(findById, params, this::getUserRowMapper);
    }

    @Override
    public void delete(Long id) {
        final String delete = "delete from user where user_id = :userId";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("userId", id);
        namedParameterJdbcTemplate.update(delete, params);
    }

    @Override
    public User save(User entity) {
        final String createQuery = "INSERT INTO user (user_name, user_surname, login, password) " +
                "VALUES (:userName, :userSurname, :login, :pass);";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("userName", entity.getUserName());
        params.addValue("userSurname", entity.getUserSurname());
        params.addValue("login", entity.getLogin());
        params.addValue("pass", entity.getPassword());
        namedParameterJdbcTemplate.update(createQuery, params, keyHolder);
        long createdUserId = Objects.requireNonNull(keyHolder.getKey()).longValue();
        return findById(createdUserId);
    }

    @Override
    public User update(User entity) {
        final String createQuery = "UPDATE user set user_name = :userName, user_surname = :userSurname, " +
                "login = :login, password = :pass where user_id = :userId";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("userName", entity.getUserName());
        params.addValue("userSurname", entity.getUserSurname());
        params.addValue("login", entity.getLogin());
        params.addValue("pass", entity.getPassword());
        params.addValue("userId", entity.getUserId());
        namedParameterJdbcTemplate.update(createQuery, params);
        return findById(entity.getUserId());
    }
}

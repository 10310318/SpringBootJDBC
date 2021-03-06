package com.chtti.springboot.demo.Demo6JDBC;

import com.chtti.springboot.demo.Demo6JDBC.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class JDBCRunner5 implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(JDBCRunner5.class);
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
    private static final String QUERY_SQL = "SELECT ID, USERNAME, HASHPASSWORD FROM USERS2 WHERE ID = :id";
    @Override
    public void run(String... args) throws Exception {
        SqlParameterSource parameterSource = new MapSqlParameterSource().addValue("id",2);
        User user = jdbcTemplate.queryForObject(QUERY_SQL,
                parameterSource,(rs, rowNum)->new User(rs.getString("USERNAME"),
                        rs.getString("HASHPASSWORD")));
        LOGGER.info("user name={}, hash password={}", user.getUsername(), user.getHashPassword());

    }
}

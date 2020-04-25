package io.pivotal.corespring.dbdemo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.JDBCType;

@Repository
public class DBRepository {
    JdbcTemplate jdbcTemplate;

    public DBRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String getExamCode(int id) {
        String examCode = jdbcTemplate.queryForObject
                ("select exam_code from CERT_EXAM_RESULT where id=?",new Object[] {id}, String.class);
        return examCode;
    }

}

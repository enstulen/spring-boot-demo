package com.example.demo.demo.rowMappers

import com.example.demo.demo.entities.User
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Component
import java.sql.ResultSet

@Component
class UserRowMapper : RowMapper<User> {
    override fun mapRow(rs: ResultSet, rowNum: Int): User? {
        return User(
                rs.getInt("id"),
                rs.getString("first_name") ?: "",
                rs.getString("last_name") ?: ""
        )
    }
}
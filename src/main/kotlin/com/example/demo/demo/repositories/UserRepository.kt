package com.example.demo.demo.repositories

import com.example.demo.demo.entities.User
import com.example.demo.demo.rowMappers.UserRowMapper
import com.example.demo.shared.exceptions.NotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository


@Repository
class UserRepository {
    private val getUser = "SELECT * FROM users WHERE id = ?"

    @Autowired
    private lateinit var jdbcTemplate: JdbcTemplate

    @Autowired
    private lateinit var userRowMapper: UserRowMapper

    fun getUser(id: Int): User {
        val user = jdbcTemplate.query(getUser, userRowMapper, id)
        return user.getOrNull(0) ?: throw NotFoundException()
    }
}



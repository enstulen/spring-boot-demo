package com.example.demo.demo.services

import com.example.demo.demo.entities.User
import com.example.demo.demo.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {
    @Autowired
    private lateinit var userRepository: UserRepository

    override fun getUser(id: Int) : User {
        return userRepository.getUser(id)
    }

    override fun addUser(user: User) =
            println(("${user.name},added!!!"))

    override fun updateUser(name: String, user: User) =
            println("$name,updated!!!")

    override fun deleteUser(name: String) =
            println("$name,deleted!!!")
}
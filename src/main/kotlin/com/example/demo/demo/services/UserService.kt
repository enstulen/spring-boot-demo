package com.example.demo.demo.services

import com.example.demo.demo.entities.User

interface UserService {
    fun getUser(id: Int): User
    fun addUser(user: User)
    fun updateUser(name: String, user: User)
    fun deleteUser(name: String)
}
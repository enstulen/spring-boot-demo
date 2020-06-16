package com.example.demo.demo.controller

import com.example.demo.demo.entities.User
import com.example.demo.demo.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController {
    //TODO: Add auth/permissions

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/users")
    fun getUser(@RequestParam(value = "id") id: Int): User {
        return userService.getUser(id)
    }

    @PostMapping("/users")
    fun addUser(@RequestBody user: User) {
        return userService.addUser(user)
    }


    @PutMapping("/users")
    fun updateUser(@RequestParam(value = "name") name: String, @RequestBody user: User) {
        return userService.updateUser(name, user)
    }

    @DeleteMapping("/users")
    fun deleteUser(@RequestParam(value = "name") name: String) {
        return userService.deleteUser(name)
    }
}
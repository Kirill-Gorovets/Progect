package com.example.progect.Base

import com.example.progect.Domain.UserName

interface UserStorage {
    fun save(user: UserName): Boolean
    fun get(): User
}
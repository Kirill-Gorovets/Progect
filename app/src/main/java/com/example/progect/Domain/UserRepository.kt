package com.example.progect.Domain

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean
    fun getName(): UserName
}
package com.example.progect.Repository

import com.example.progect.Base.User
import com.example.progect.Base.UserStorage
import com.example.progect.Domain.SaveUserNameParam
import com.example.progect.Domain.UserName
import com.example.progect.Domain.UserRepository

class UserRepositoryImpl( private val userStorage: UserStorage) : UserRepository {

    override fun saveName(saveparam: SaveUserNameParam): Boolean {


        val user =mapToStorage(saveparam)
val result = userStorage.save(user)
    return result
    }

    override fun getName(): UserName {
val user = userStorage.get()
        val userName=UserName(firstName = user.name)
return mapToDomain(user)
    }
    private fun mapToStorage (saveparam:SaveUserNameParam): UserName {
        return  UserName(firstName = saveparam.name)
    }
    private fun mapToDomain(user:User):UserName{
        return UserName(firstName = user.name)
    }

}
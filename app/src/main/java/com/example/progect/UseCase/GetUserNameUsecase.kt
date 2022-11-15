package com.example.progect.UseCase

import com.example.progect.Domain.UserName
import com.example.progect.Domain.UserRepository

class GetUserNameUsecase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()

    }
}
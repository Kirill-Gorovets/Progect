package com.example.progect.UseCase

import com.example.progect.Domain.SaveUserNameParam
import com.example.progect.Domain.UserRepository
import com.example.progect.Repository.UserRepositoryImpl

class SaveUserNameUsecase(val userRepository: UserRepository) {

        fun execute(param: SaveUserNameParam):Boolean{

            val resault :Boolean= userRepository.saveName(saveParam = param)
            return resault
        }


    }

package com.example.progect.di


import com.example.progect.UseCase.GetUserNameUsecase
import com.example.progect.UseCase.SaveUserNameUsecase
import org.koin.dsl.module

val domainModule = module{

    factory<GetUserNameUsecase> {
        GetUserNameUsecase(userRepository = get())
    }
    factory <SaveUserNameUsecase>{

        SaveUserNameUsecase(userRepository = get())
    }

}
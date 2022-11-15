package com.example.progect.di

import com.example.progect.Base.SharedPrefUserStorage
import com.example.progect.Base.UserStorage
import com.example.progect.Domain.UserRepository
import com.example.progect.Repository.UserRepositoryImpl
import org.koin.dsl.module


val dataModul = module {
    single<UserStorage> {
        SharedPrefUserStorage(context = get())

    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }

}
package com.example.progect.di

import com.example.progect.ViewModels.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel> {
        MainViewModel(
            getUserNameUsecase = get(),
            saveUserNameUsecase = get()
        )
    }
}
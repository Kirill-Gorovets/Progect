package com.example.progect.ViewModels


import androidx.lifecycle.ViewModel
import com.example.progect.Domain.SaveUserNameParam
import com.example.progect.Domain.UserName
import com.example.progect.UseCase.GetUserNameUsecase
import com.example.progect.UseCase.SaveUserNameUsecase

class MainViewModel(
    private val getUserNameUsecase: GetUserNameUsecase,
    private val saveUserNameUsecase: SaveUserNameUsecase

) : ViewModel() {
    //        private val userRepository by lazy (LazyThreadSafetyMode.NONE){
//        UserRepositoryImpl(userStorage = SharedPrefUserStorage(context=requireContext()))
//    }
//    private val getUserNameUsecase by lazy (LazyThreadSafetyMode.NONE){
//        GetUserNameUsecase(userRepository= userRepository)
//    }
//    private val saveUserNameUsecase by lazy ( LazyThreadSafetyMode.NONE ){
//        SaveUserNameUsecase(userRepository=userRepository)
//    }
    fun saveName(name: String): String {
        val params = SaveUserNameParam(name = name)
        val result: Boolean = saveUserNameUsecase.execute(param = params)
        return "Save resault=$result"
    }
    fun load (): String {
        val userName: UserName = getUserNameUsecase.execute()
        val result:String = "${userName.firstName}"
        return result
    }


}
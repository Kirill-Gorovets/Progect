package com.example.progect.UseCase
import com.example.progect.Base.UseCase
import com.example.progect.ItemTypes.UserCredo

class LoginUseCase : UseCase<UserCredo, Boolean> {
    override fun execute(param: UserCredo?): Boolean {
        return param!!.login.isNotEmpty() && param.password.isNotEmpty()
    }


}
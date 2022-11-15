package com.example.progect.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.example.progect.Base.BaseFragment
import com.example.progect.Base.SharedPrefUserStorage
import com.example.progect.Domain.SaveUserNameParam
import com.example.progect.Domain.UserName
import com.example.progect.ItemTypes.UserCredo
import com.example.progect.Repository.UserRepositoryImpl
import com.example.progect.UseCase.GetUserNameUsecase
import com.example.progect.UseCase.LoginUseCase
import com.example.progect.UseCase.SaveUserNameUsecase
import com.example.progect.ViewModels.MainViewModel
import com.example.progect.databinding.FragmentLoginBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FragmentLogin : BaseFragment<FragmentLoginBinding>() {

    val loginUseCase = LoginUseCase()

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLoginBinding = FragmentLoginBinding.inflate(inflater, container, false)

    private val vm by viewModel<MainViewModel>()
    private val userRepository by lazy(LazyThreadSafetyMode.NONE) {
        UserRepositoryImpl(userStorage = SharedPrefUserStorage(context = requireContext()))
    }
    private val getUserNameUsecase by lazy(LazyThreadSafetyMode.NONE) {
        GetUserNameUsecase(userRepository = userRepository)
    }
    private val saveUserNameUsecase by lazy(LazyThreadSafetyMode.NONE) {
        SaveUserNameUsecase(userRepository = userRepository)
    }


    override fun FragmentLoginBinding.onBindView(saveInstanceState: Bundle?) {


        getName.setOnClickListener {
            val userName: UserName = getUserNameUsecase.execute()
            textName.text = vm.load()
        }
        btLogin.setOnClickListener {
            val name = editLogin.text.toString()

            val params = SaveUserNameParam(name = name)

            val result: Boolean = saveUserNameUsecase.execute(param = params)
            textName.text = vm.saveName(name)


            val userCredo = UserCredo(
                login = editLogin.text.toString(),
                password = editPassword.text.toString()
            )
            val resault = loginUseCase.execute(userCredo)
            if (resault) {
                navController.navigate(FragmentLoginDirections.navigationToFragmentFaculties())
            } else {
                Toast.makeText(requireContext(), "Enter login or password ", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
package com.example.progect.Base

import android.content.Context
import com.example.progect.Domain.SaveUserNameParam
import com.example.progect.Domain.UserName
private const val SHARED_PREFS_NAME = "shared_prefs_name"
private const val KEY_NAME="name"
class SharedPrefUserStorage(context: Context):UserStorage {
    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)
    override fun save(user: UserName): Boolean {
        sharedPreferences.edit().putString(KEY_NAME,user.firstName).apply()
        return true
    }

    override fun get(): User {
        val name=sharedPreferences.getString(KEY_NAME,"")
        return User(name = "${name}")
    }
}
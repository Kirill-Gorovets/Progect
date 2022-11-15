package com.example.progect.Base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<VIEV_BINDING : ViewBinding, VALUE_TYPE>(val binding: VIEV_BINDING) :
    RecyclerView.ViewHolder(binding.root) {

    fun handleItem(value: VALUE_TYPE) = binding.bind(value)
    protected open fun VIEV_BINDING.bind(value: VALUE_TYPE) {}
}
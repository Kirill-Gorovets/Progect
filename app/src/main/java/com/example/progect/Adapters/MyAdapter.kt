package com.example.progect.Base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.viewbinding.ViewBinding
import com.example.progect.ItemTypes.FacultyItemType
import com.example.progect.databinding.FacultyItemTypeBinding


class MyAdapter : ListAdapter<Any, BaseViewHolder<ViewBinding, Any>>(
    object : DiffUtil.ItemCallback<Any>() {

        override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean = when {
            oldItem is FacultyItemType && newItem is FacultyItemType -> oldItem.NameOfFaculty == newItem.NameOfFaculty
            else -> false
        }

        override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean = when {
            oldItem is FacultyItemType && newItem is FacultyItemType -> oldItem.NameOfFaculty == newItem.NameOfFaculty
            else -> false
        }


    }

) {


    override fun getItemViewType(position: Int): Int = when (getItem(position)) {
        is FacultyItemType -> FACULTY_ITEM_TYPE
        else -> throw IllegalArgumentException(
            "My adapter cant handle the iten with this type +${
                getItem(
                    position
                )
            }"
        )

    }


    companion object {
        private const val FACULTY_ITEM_TYPE = 999


    }

    override fun onBindViewHolder(holder: BaseViewHolder<ViewBinding, Any>, position: Int) =
        holder.handleItem(getItem(position))

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ViewBinding, Any> = when (viewType) {
        FACULTY_ITEM_TYPE -> FacultyItemViewHolder(parent) as BaseViewHolder<ViewBinding, Any>
        else -> throw IllegalArgumentException("MyAdapter cant handle ite mwith type ${viewType}")

    }
}

private class FacultyItemViewHolder(parent: ViewGroup) :
    BaseViewHolder<FacultyItemTypeBinding, FacultyItemType>(
        FacultyItemTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    ) {
    override fun FacultyItemTypeBinding.bind(value: FacultyItemType) {
        imageOfFaculty.setImageResource(value.Image)
        nameOfFaculty.text = value.NameOfFaculty
        itemView.setOnClickListener {
            value.action()
        }


    }
}






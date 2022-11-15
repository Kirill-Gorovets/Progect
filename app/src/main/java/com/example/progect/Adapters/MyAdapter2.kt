package com.example.progect.Base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.viewbinding.ViewBinding
import com.example.progect.ItemTypes.TimeTableItemType
import com.example.progect.databinding.TimetableItemTypeBinding


class MyAdapter2 : ListAdapter<Any, BaseViewHolder<ViewBinding, Any>>(
    object : DiffUtil.ItemCallback<Any>() {

        override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean = when {
            oldItem is TimeTableItemType && newItem is TimeTableItemType -> oldItem.group == newItem.group
            else -> false
        }

        override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean = when {
            oldItem is TimeTableItemType && newItem is TimeTableItemType -> oldItem.group == newItem.group
            else -> false
        }


    }

) {


    override fun getItemViewType(position: Int): Int = when (getItem(position)) {
        is TimeTableItemType -> TIME_TABLE_ITEM_TYPE
        else -> throw IllegalArgumentException(
            "My adapter cant handle the iten with this type +${
                getItem(
                    position
                )
            }"
        )

    }


    companion object {
        private const val TIME_TABLE_ITEM_TYPE = 999


    }

    override fun onBindViewHolder(holder: BaseViewHolder<ViewBinding, Any>, position: Int) =
        holder.handleItem(getItem(position))

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ViewBinding, Any> = when (viewType) {
        TIME_TABLE_ITEM_TYPE -> TimeTableItemViewHolder(parent) as BaseViewHolder<ViewBinding, Any>
        else -> throw IllegalArgumentException("MyAdapter cant handle ite mwith type ${viewType}")

    }
}

private class TimeTableItemViewHolder(parent: ViewGroup) :
    BaseViewHolder<TimetableItemTypeBinding, TimeTableItemType>(
        TimetableItemTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    ) {
    override fun TimetableItemTypeBinding.bind(value: TimeTableItemType) {
        dayOfWeek.text = value.day
        FacultyGroup.text = value.group
        para1.text = value.class1
        para2.text = value.class2
        para3.text = value.class3
    }
}






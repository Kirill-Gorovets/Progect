package com.example.progect.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.progect.Base.BaseFragment
import com.example.progect.Base.MyAdapter2
import com.example.progect.ItemTypes.TimeTableItemType
import com.example.progect.R
import com.example.progect.databinding.ActivityFknListBinding

class FKNFragment : BaseFragment<ActivityFknListBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ActivityFknListBinding = ActivityFknListBinding.inflate(inflater, container, false)

    override fun ActivityFknListBinding.onBindView(saveInstanceState: Bundle?) {
        strelochkaFKN.setOnClickListener {
            navController.popBackStack()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myAdapter = MyAdapter2()
        myAdapter.submitList(
            listOf(
                TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 A212",
                ),
                TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 A213C",
                ),
                TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 213AC",
                ),
                TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 231AC",
                ),
                TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 A321C",
                ),
            )
        )
        view.findViewById<RecyclerView>(R.id.FKNList).apply {
            adapter = myAdapter

        }
    }
}


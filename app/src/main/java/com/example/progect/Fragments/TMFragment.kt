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
import com.example.progect.databinding.ActivityTmListBinding

class TMFragment : BaseFragment<ActivityTmListBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ActivityTmListBinding = ActivityTmListBinding.inflate(inflater, container, false)

    override fun ActivityTmListBinding.onBindView(saveInstanceState: Bundle?) {
        strelochkaTM.setOnClickListener {
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
                    "22 AC",
                ),
                TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 das",
                ), TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 asd",
                ), TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 kgkg",
                )
            )
        )

        view.findViewById<RecyclerView>(R.id.MTFList).apply {
            adapter = myAdapter
        }
    }
}
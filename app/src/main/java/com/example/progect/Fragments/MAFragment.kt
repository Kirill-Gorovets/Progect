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
import com.example.progect.databinding.ActivityMaListBinding

class MAFragment : BaseFragment<ActivityMaListBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ActivityMaListBinding = ActivityMaListBinding.inflate(inflater, container, false)

    override fun ActivityMaListBinding.onBindView(saveInstanceState: Bundle?) {
        strelochkaMA.setOnClickListener {
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

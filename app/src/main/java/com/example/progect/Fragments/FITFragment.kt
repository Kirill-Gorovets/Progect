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
import com.example.progect.databinding.ActivityFitListBinding

class FITFragment : BaseFragment<ActivityFitListBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ActivityFitListBinding = ActivityFitListBinding.inflate(inflater, container, false)

    override fun ActivityFitListBinding.onBindView(saveInstanceState: Bundle?) {
        strelochka.setOnClickListener {
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
                    "22 fgfg",
                ), TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 Ajhhg",
                ), TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 Akhh",
                ), TimeTableItemType(
                    "Понедельник",
                    "Физика(лекция) Окунев Д.О. ауд. 36н",
                    "Математика Завистовская Т.И. ауд. 335н",
                    "Математика(лекция) Папкович М.В. ауд. 327н",
                    "22 lkhkj",
                )
            )
        )
        view.findViewById<RecyclerView>(R.id.FIlist).apply {
            adapter = myAdapter
        }


    }
}
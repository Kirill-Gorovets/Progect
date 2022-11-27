package com.example.progect.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.progect.Base.BaseFragment
import com.example.progect.Base.MyAdapter
import com.example.progect.ItemTypes.FacultyItemType
import com.example.progect.R
import com.example.progect.databinding.FragmentFacultiesBinding

class FragmentFaculties : BaseFragment<FragmentFacultiesBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFacultiesBinding = FragmentFacultiesBinding.inflate(inflater, container, false)

    override fun FragmentFacultiesBinding.onBindView(saveInstanceState: Bundle?) {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myAdapter = MyAdapter()
        myAdapter.submitList(
            listOf(
                FacultyItemType(
                    "ФИТ",
                    R.drawable.fit

                ) { navController.navigate(FragmentFacultiesDirections.navigationToFITFragment()) },
                FacultyItemType(
                    "МТФ",
                    R.drawable.mtf

                ) {
                    navController.navigate(FragmentFacultiesDirections.navigationToMTFGroupsFragment())
                },
                FacultyItemType(
                    "ФКНЭ",
                    R.drawable.fkn
                ) {
                    navController.navigate(FragmentFacultiesDirections.actionFragmentFacultiesToFKNFragment())
                },
                FacultyItemType(
                    "ЮР ФАК",
                    R.drawable.urfack
                ) { navController.navigate(FragmentFacultiesDirections.navigationToURFAKFragment()) },
            )
        )

        view.findViewById<RecyclerView>(R.id.listFacultiItem).apply {
            adapter = myAdapter
        }
    }
}



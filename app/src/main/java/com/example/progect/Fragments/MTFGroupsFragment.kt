package com.example.progect.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.progect.Base.BaseFragment
import com.example.progect.databinding.ActiviryMtfGroupsBinding


class MTFGroupsFragment : BaseFragment<ActiviryMtfGroupsBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): ActiviryMtfGroupsBinding = ActiviryMtfGroupsBinding.inflate(inflater, container, false)

    override fun ActiviryMtfGroupsBinding.onBindView(saveInstanceState: Bundle?) {
        ACGroup.setOnClickListener {
            navController.navigate(MTFGroupsFragmentDirections.navigateToACFragment())

        }
        strelochkaMTFGroups.setOnClickListener {
            navController.popBackStack()
        }
        MAGroup.setOnClickListener {
            navController.navigate(MTFGroupsFragmentDirections.navigateToMAFragment())
        }
        TNGGroup.setOnClickListener {
            navController.navigate(MTFGroupsFragmentDirections.navigateToTNGFragment())
        }

        TmGroup.setOnClickListener {
            navController.navigate(MTFGroupsFragmentDirections.navigateToTMFragment())
        }
        XTGroup.setOnClickListener {
            navController.navigate(MTFGroupsFragmentDirections.navigateToXTFragment())
        }
    }

}
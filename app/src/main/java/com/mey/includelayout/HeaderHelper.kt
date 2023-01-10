package com.mey.includelayout

import android.view.View
import com.mey.includelayout.databinding.CustomHeaderBinding


/**
 * Created by Mehmet Emin Yıldız on 10.11.2023
 **/

object HeaderHelper {

    fun customHeader(
        binding: CustomHeaderBinding,
        title: String,
        startIconVisibility: Boolean = true,
        endIconVisibility: Boolean = false,
        startIcon: Int,
        endIcon: Int,
        startIconClick: (() -> Unit)? = null,
        endIconClick: (() -> Unit)? = null,
    ) {
        binding.apply {
            tvPageTitle.text = title
            imgStart.setImageResource(startIcon)
            imgEnd.setImageResource(endIcon)
            imgStart.visibility = if (startIconVisibility) View.VISIBLE else View.GONE
            imgEnd.visibility = if (endIconVisibility) View.VISIBLE else View.GONE

            imgStart.setOnClickListener {
                startIconClick?.let {
                    it()
                }
            }
            imgEnd.setOnClickListener {
                endIconClick?.let {
                    it()
                }
            }
        }
    }
}
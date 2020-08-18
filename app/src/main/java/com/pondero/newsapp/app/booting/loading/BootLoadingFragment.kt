package com.pondero.newsapp.app.booting.loading

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pondero.newsapp.R


class BootLoadingFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_boot_loading, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() = BootLoadingFragment().apply {
                arguments = Bundle()
            }
    }
}
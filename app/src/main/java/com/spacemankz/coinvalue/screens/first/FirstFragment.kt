package com.spacemankz.coinvalue.screens.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.spacemankz.coinvalue.R
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {

    lateinit var  recyclerView: RecyclerView
    lateinit var adapter: FirstAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)

        val v = inflater.inflate(R.layout.fragment_first, container, false)

        recyclerView = v.rv_first
        adapter = FirstAdapter()
        recyclerView.adapter = adapter
        viewModel.getCashMoney()
        viewModel.cashList.observe(viewLifecycleOwner,{list->
            list.body()?.let { adapter.setList(it) }
        })


        return v
    }


}
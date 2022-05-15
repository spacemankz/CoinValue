package com.spacemankz.coinvalue.screens.first

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.spacemankz.coinvalue.R
import com.spacemankz.coinvalue.model.cash.CashItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class FirstAdapter:RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    var listFirst = emptyList<CashItem>()

    class FirstViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return FirstViewHolder(view)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.itemView.item_name.text = listFirst[position].ccy
        holder.itemView.buy.text = listFirst[position].buy
        holder.itemView.sell.text = listFirst[position].sale
    }

    override fun getItemCount(): Int {
    return listFirst.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CashItem>){
        listFirst = list
        notifyDataSetChanged()
    }

}
package com.example.kds2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kds2.databinding.RowBinding


class MyAdapter(val items:ArrayList<dataItem>, val context: Context)
    : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    interface OnItemClickListener{
        fun OnItemClick(position: Int)
    }
    var itemClickListener: OnItemClickListener?=null

    inner class ViewHolder(val binding: RowBinding): RecyclerView.ViewHolder(binding.root){
        init{
            binding.root.setOnClickListener{
                itemClickListener?.OnItemClick(adapterPosition)
            }
        }
    }

//    class ViewHolder (itemView: View?) : RecyclerView.ViewHolder(itemView!!){
//        val serviceType = itemView?.findViewById<TextView>(R.id.textView)
//
//        //fun bind(item)
//    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = RowBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textView.text = items[position].serviceType
        // holder.binding.info.text = items[position].address3
        // holder.binding.info.text = items[position].title + "\n" + items[position].count
    }

    override fun getItemCount(): Int {
        return items.size
    }



}
package com.example.databinding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.R
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.model.Contact

class ContactAdapter(val list: List<Contact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>(){

    inner class ViewHolder(val itemContactBinding: ItemContactBinding) : RecyclerView.ViewHolder(itemContactBinding.root){
        fun onBind(contact: Contact){
            itemContactBinding.contact = contact
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemContactBinding = DataBindingUtil.inflate<ItemContactBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_contact,
            parent,
            false
        )
        return ViewHolder(itemContactBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
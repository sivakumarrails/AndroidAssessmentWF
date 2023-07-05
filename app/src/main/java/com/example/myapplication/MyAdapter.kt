package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var con: Context, var data: MyResults) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var familyName = v.findViewById<TextView>(R.id.familyName)
        var givenName = v.findViewById<TextView>(R.id.givenName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(con).inflate(R.layout.list_items, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.MRData.RaceTable.Races[0].Results.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = data.MRData.RaceTable.Races[0].Results[position]

        // sets the image to the imageview from our itemHolder class
//        holder.imageView.setImageResource(ItemsViewModel.image)
        holder.givenName.text = ItemsViewModel.Driver.givenName
        holder.familyName.text = ItemsViewModel.Driver.familyName
        // sets the text to the textview from our itemHolder class
//        holder.textView.text = ItemsViewModel.text
//        for (i in data.MRData.RaceTable.Races[0].Results) {
//            holder.givenName.text = i.Driver.givenName
//            holder.familyName.text = i.Driver.familyName
//        }
    }
}
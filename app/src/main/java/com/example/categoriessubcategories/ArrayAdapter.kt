package com.example.categoriessubcategories

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_array.view.*
import java.util.*

class ArrayAdapter(private val list: Array<Array<IntArray>>) : RecyclerView.Adapter<ArrayAdapter.ArrayViewHolder>() {

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(p0: ArrayViewHolder, p1: Int) {

        p0.array.text = Arrays.deepToString(list[p1])
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ArrayViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_array, p0, false)

        return ArrayViewHolder(view)
    }



    inner class ArrayViewHolder(view: View
    ): RecyclerView.ViewHolder(view) {

        val array = view.array
    }

}
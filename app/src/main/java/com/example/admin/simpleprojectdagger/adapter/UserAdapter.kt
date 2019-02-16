package com.example.admin.simpleprojectdagger.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.admin.daggervskoin.R
import com.example.admin.simpleprojectdagger.MainActivity
import com.example.admin.simpleprojectdagger.model.Result
import com.squareup.picasso.Picasso


class UserAdapter(private val mainActivity: MainActivity,
                  private val picasso: Picasso) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private val mResult = mutableListOf<Result>()
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(
            R.layout.item_random_user,
            p0, false
        )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mResult.size
    }

    fun setItems(results: List<Result>) {
        mResult.addAll(results)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val result = mResult[p1]
        p0.tv.text = String.format(
            "%s %s", result.name?.first,
            result.name?.last
        )
        Picasso.with(mainActivity)
            .load(result.picture?.large)
            .into(p0.iv)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tv = view.findViewById(R.id.name) as TextView
        val iv = view.findViewById(R.id.image) as ImageView
    }
}
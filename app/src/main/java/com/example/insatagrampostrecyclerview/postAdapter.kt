package com.example.insatagrampostrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class postAdapter(private val post: ArrayList<post>):
    RecyclerView.Adapter<postAdapter.postViewHolder>() {


    inner class postViewHolder(view: View):RecyclerView.ViewHolder(view){
        val txtid : TextView
        val imgpost:ImageView
        val txtcaption:TextView

        init {
            txtid= view.findViewById(R.id.txtid)
            imgpost =view.findViewById(R.id.imgview)
            txtcaption = view.findViewById(R.id.txtcaption)

            //best way to setup listener to view inside a RV

            itemView.setOnClickListener {
                Toast.makeText(
                    it.context,
                    "this is _AMG: ${post[adapterPosition].TextCaption}",
                    Toast.LENGTH_SHORT
                ).show()
            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.post_main,null)
        return postViewHolder(view)

    }

    override fun getItemCount()= post.size


    override fun onBindViewHolder(holder: postViewHolder, position: Int) {
        holder.txtid.text = post[position].Text
        holder.imgpost.setImageResource(post[position].Image)
        holder.txtcaption.text = post[position].TextCaption

    }
}


package com.example.insatagrampostrecyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerpost: RecyclerView
    private lateinit var postAdapter: postAdapter
    private val post=ArrayList<post>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerpost = findViewById(R.id.recyclerpost)

        initPost()

        postAdapter = postAdapter(post)
        recyclerpost.adapter=postAdapter

        recyclerpost.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }

    private fun initPost() {

        post.add(post("_Mercedes",R.drawable.img2,"GLA"))
        post.add(post("_Mercedes ",R.drawable.img1," GTR_AMG"))
        post.add(post("_mercedes",R.drawable.img3,"GT_63"))
        post.add(post("_Mercedes",R.drawable.img2,"GLA"))
        post.add(post("_Mercedes ",R.drawable.img1," GTR_AMG"))
        post.add(post("_mercedes",R.drawable.img3,"GT_63"))
        post.add(post("_Mercedes",R.drawable.img2,"GLA"))
        post.add(post("_Mercedes ",R.drawable.img1," GTR_AMG"))
        post.add(post("_mercedes",R.drawable.img3,"GT_63"))
        post.add(post("_Mercedes",R.drawable.img2,"GLA"))
        post.add(post("_Mercedes ",R.drawable.img1," GTR_AMG"))
        post.add(post("_mercedes",R.drawable.img3,"GT_63"))
    }
      /* for (i in 0..10){
           post.add(post("$i GTR_ AMG_ ",R.drawable.img1,"$i Toxic___abhi"))
       }*/

}
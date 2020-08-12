package com.example.kotlinjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Adapter
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia
import com.example.ciromine.ciclobike.SetupCiclovias

class MainActivity : AppCompatActivity() {

//variables

    lateinit var recycler:RecyclerView
    lateinit var adapter:CycloAdapter
    //le indica si es un grid un hotizontal un vertical
    lateinit var layoutManager: RecyclerView.LayoutManager

    lateinit var buton : Button
    lateinit var buton2 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filtra:Button=findViewById(R.id.button)
        val noFiltra:Button=findViewById(R.id.button2)



        layoutManager = LinearLayoutManager(this)
        adapter= CycloAdapter(SetupCiclovias().init() as MutableList<Ciclovia>)
        recycler=findViewById(R.id.recyclerView)
        recycler.adapter

    Log.d("LOG",SetupCiclovias().init().toString())


        filtra.setOnClickListener(View.OnClickListener {
         //  when()
        })

    }




}


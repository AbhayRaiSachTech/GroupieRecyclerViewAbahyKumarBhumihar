package com.example.groopierecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var arraylist=ArrayList<Pojo>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arraylist.add(Pojo("ABHAY"))
        arraylist.add(Pojo("KUMAR"))
        arraylist.add(Pojo("BHUMIHAR"))
        arraylist.add(Pojo("SdfgdfgDFSDF"))
        arraylist.add(Pojo("SDFSdfgdfgdfgfDF"))

        val groupAdapter = GroupAdapter<GroupieViewHolder>().apply {
            addAll(arraylist.toSuperHeroITem())
        }
        peopleRV.adapter=groupAdapter
    }

    fun List<Pojo>.toSuperHeroITem() : List<SuperHeroItem>{
        return this.map {
            SuperHeroItem(it)
        }
    }
}

data class Home(val name:String)
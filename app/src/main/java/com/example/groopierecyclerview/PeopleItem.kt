package com.example.groopierecyclerview
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import kotlinx.android.synthetic.main.people_layout.view.*


class SuperHeroItem(var list: Pojo) : Item() {

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {

        viewHolder.itemView.apply {
            peopleTxt.text=list.name

        }

    }

    override fun getLayout() = R.layout.people_layout
}

data class Pojo(val name:String)
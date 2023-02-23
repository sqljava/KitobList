package com.example.kitoblist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.kitoblist.databinding.KitobItemBinding

class KitobAdapter(context : Context, var kitoblar: MutableList<Kitob>) :
    ArrayAdapter<Kitob>(context, R.layout.kitob_item, kitoblar) {

    override fun getCount(): Int {
        return kitoblar.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemKitob : KitobItemBinding
        itemKitob = KitobItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        var kitob = kitoblar.get(position)

        itemKitob.img.setImageResource(kitob.rasm)
        itemKitob.name.text = kitob.nomi
        itemKitob.avtor.text = kitob.avtor


        return itemKitob.root
    }
}
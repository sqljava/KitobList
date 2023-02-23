package com.example.kitoblist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kitoblist.databinding.ActivityKitobInfoBinding

class KitobInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding  = ActivityKitobInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var kitob = intent.getSerializableExtra("kitob") as Kitob

        binding.qoshimchaNomi.text = kitob.nomi

        binding.qoshimchaImg.setImageResource(kitob.rasm)

        binding.qoshimchaInfo.text = kitob.info
    }
}
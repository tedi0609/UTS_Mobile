package com.example.tedyapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tedyapps.databinding.ActivityHitungLuasBinding

class HitungLuasActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHitungLuasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHitungLuasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.hitungButton.setOnClickListener {
            val lebar = binding.lebarEditText.text.toString()
            val panjang = binding.panjangEditText.text.toString()
            val tinggi = binding.tinggiEditText.text.toString()
            val hasil = panjang.toInt() * lebar.toInt() * tinggi.toInt()
            binding.hasilTextView.text = hasil.toString() + "m2"

        }
        binding.kembali.setOnClickListener {
            val Kembali = Intent(this@HitungLuasActivity, HalamanLoginActivity::class.java)
            startActivity(Kembali)
        }

    }
}
package com.example.tedyapps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tedyapps.databinding.ActivityHalamanLoginBinding

class HalamanLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHalamanLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val (username, password) = binding.usernameEditText.text.toString() to binding.passwordEditText.text.toString()
            val gagal = "gagal login"
            val targetActivity = if (username == "tedi" && password == "admin") HitungLuasActivity::class.java else this::class.java
            startActivity(Intent(this, targetActivity))
        }
    }
}

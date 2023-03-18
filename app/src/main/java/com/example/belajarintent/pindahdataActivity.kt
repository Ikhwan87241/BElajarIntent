package com.example.belajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pindahdataActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TEXT = "extra_text"
    }

    private lateinit var tvPenerima : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindahdata)

        tvPenerima = findViewById(R.id.tv_terima_data)

        val tvReceived = intent.getStringExtra(EXTRA_TEXT)
        val text = "Text Yang Dikirim : $tvReceived"

        tvPenerima.text = text


    }
}


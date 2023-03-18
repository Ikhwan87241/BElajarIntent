package com.example.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        private lateinit var btnIntent : Button

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            btnIntent = findViewById(R.id.btn_intent)
            val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
            val btnIntentObjek = findViewById<Button>(R.id.btn_pindah_objek)

            btnIntent.setOnClickListener(this)
            btnIntentData.setOnClickListener(this)
            btnIntentObjek.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            when(v.id){
                R.id.btn_intent -> run {
                    val intentBiasa = Intent(this@MainActivity, pindahActivity::class.java)
                    startActivity(intentBiasa)
                }
                R.id.btn_pindah_data -> run {
                    val intentData = Intent(this@MainActivity, pindahdataActivity::class.java)
                    intentData.putExtra(pindahdataActivity.EXTRA_TEXT, "Halo, Ayo Belajar Kotlin")
                    startActivity(intentData)
                }
                R.id.btn_pindah_objek -> run {
                    val cars = Cars(
                        "Toyota Yaris",
                        2020,
                        "BM 2020 SAR"
                    )

                    val intentObjek = Intent(this@MainActivity, pindahobjectActivity::class.java)
                    intentObjek.putExtra(pindahobjectActivity.EXTRA_CARS, cars)
                    startActivity(intentObjek)
                }
            }
        }
    }


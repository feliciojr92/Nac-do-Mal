package com.example.nacapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagem1.setOnClickListener {
            var intent = Intent(this,MainMercadoLivreActivity::class.java)
            startActivity(intent)
        }
        imagem2.setOnClickListener {
            var intent = Intent(this,MainBuscapeActivity::class.java)
            startActivity(intent)
        }
        imagem3.setOnClickListener {
            var intent = Intent(this,MainEBayActivity::class.java)
            startActivity(intent)
        }
        imagem4.setOnClickListener {
            var intent = Intent(this,MainWebMotorsActivity::class.java)
            startActivity(intent)
        }
        imagem5.setOnClickListener {
            var intent = Intent(this,MainMagaluActivity::class.java)
            startActivity(intent)
        }
        imagem6.setOnClickListener {
            var intent = Intent(this,MainNetShoesActivity::class.java)
            startActivity(intent)
        }
        imagem7.setOnClickListener {
            var intent = Intent(this,MainAmericanasActivity::class.java)
            startActivity(intent)
        }
        imagem8.setOnClickListener {
            var intent = Intent(this,MainSubmarinoActivity::class.java)
            startActivity(intent)
        }
        botaoSobre.setOnClickListener {
            var intent = Intent(this,MainSobreActivity::class.java)
            startActivity(intent)
        }
    }
}
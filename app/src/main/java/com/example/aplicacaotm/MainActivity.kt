package com.example.aplicacaotm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao (view: View){
        var sortear = Random.nextInt(0,5)
        Log.i("Sorteio", "Número sorteado $sortear")

        var frase = when(sortear){
            1-> "“O que nos parece uma provação amarga pode ser uma bênção disfarçada.”"
            2-> "“A mente é tudo. Você se torna aquilo que você pensa.”"
            3-> "“O homem que não tem imaginação, não tem asas.”"
            4-> "“Se você não está disposto a arriscar, esteja disposto a uma vida comum.”"
            else->"“Você é muito mais do que percebe ser.”"
        }
        textView.text = frase
    }
}

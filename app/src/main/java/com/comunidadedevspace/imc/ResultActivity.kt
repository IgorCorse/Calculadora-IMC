package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC= "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result= intent.getFloatExtra(KEY_RESULT_IMC,0f)

        val tvresult= findViewById<TextView>(R.id.tv_result)
        val tvclassificaçao= findViewById<TextView>(R.id.tv_classificaçao)

        tvresult.text= result.toString()

        val classificaçao: String?

        if (result <= 18.5f) {
            classificaçao = "Magreza"
        } else if (result > 18.5f && result <= 24.9f){
            classificaçao = "Normal"
        } else if (result > 25.0f && result <= 29.9f){
            classificaçao = "Sobrepeso"
        } else if (result > 30.0f && result <= 39.9f){
            classificaçao = "Obesidade"
        } else {
            classificaçao = "Obesidade Grave"
        }
        tvclassificaçao.text= classificaçao


    }
}
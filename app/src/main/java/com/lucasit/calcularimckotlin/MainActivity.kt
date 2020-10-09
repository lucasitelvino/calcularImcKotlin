package com.lucasit.calcularimckotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View) {
        if (peso.text.toString() == "" || altura.text.toString() == "") {
            val imc = peso.text.toString().toDouble() / (altura.text.toString().toDouble() * altura.text.toString().toDouble())
            resultado.text = String.format("%.2f", imc)
        } else {
            Toast.makeText(this, "Forneça os dados nos campos acima!", Toast.LENGTH_SHORT).show();
        }
    }
}
package com.example.calculadoraimc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoActivity : AppCompatActivity() {

    private lateinit var textoPeso: TextView
    private lateinit var textoAltura: TextView
    private lateinit var textoResultado: TextView
    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textoPeso = findViewById(R.id.text_peso)
        textoAltura = findViewById(R.id.text_altura)
        textoResultado = findViewById(R.id.text_resultado)
        btnVoltar = findViewById(R.id.bt_voltar)

        val bundle = intent.extras
        if(bundle != null){
            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")
            textoPeso.text = "Peso informado $peso kg"
            textoAltura.text = "Altura informada $altura m"

            val imc = peso / (altura * altura)
            val resultado = if(imc < 18.5){
                "Baixo peso"
            }else if(imc in 18.5..24.9){
                "Peso normal"
            }else if(imc in 25.0..29.9){
                "Sobrepeso"
            }else{
                "Obesidade"
            }
            textoResultado.text = resultado
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
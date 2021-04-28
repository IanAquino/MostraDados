package com.example.caixatexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostraDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_dados)


    val nome = intent.getStringExtra((MainActivity.INFO_EXTRA_NOME))
    val email = intent.getStringExtra((MainActivity.INFO_EXTRA_EMAIL))
    val idade = intent.getStringExtra((MainActivity.INFO_EXTRA_IDADE))
    val telefone = intent.getStringExtra((MainActivity.INFO_EXTRA_TELEFONE))







    val textViewNome = findViewById<TextView>(R.id.textViewNome2)
    val textViewEmail = findViewById<TextView>(R.id.textViewEmail2)
    val textViewIdade = findViewById<TextView>(R.id.textViewIdade2)
    val textViewTelefone = findViewById<TextView>(R.id.textViewTelefone2)

        textViewNome.setText(nome)
        textViewEmail.setText(email)
        textViewIdade.setText(idade)
        textViewTelefone.setText(telefone)

    }
}
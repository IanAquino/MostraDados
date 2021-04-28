package com.example.caixatexto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaDados(view: View){

        val editTextNome = findViewById<EditText>(R.id.editTextNome)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextIdade = findViewById<EditText>(R.id.editTextIdade)
        val editTextTelefone = findViewById<EditText>(R.id.editTextTelefone)

        val nome = editTextNome.text.toString()
        val email = editTextEmail.text.toString()
        val idade = editTextIdade.text.toString()
        val telefone = editTextTelefone.text.toString()

        if(nome.isBlank()){
            editTextNome.error = "Falta um Nome"
            return

        }else if(email.isBlank()) {
            editTextEmail.error = "Falta um Email"
            return
        }else if(idade.isBlank()) {
            editTextIdade.error = "Falta um Idade"
            return
        }else if(telefone.isBlank()) {
            editTextTelefone.error = "Falta um Telefone"
            return
        }

        val intent = Intent (this, MostraDados::class.java).apply {
            putExtra("NOME",nome)
            putExtra("EMAIL",email)
            putExtra("IDADE",idade)
            putExtra("TELEFONE",telefone)

        }
    startActivity(intent)
    }
        companion object{
            const val INFO_EXTRA_NOME = "NOME"
            const val INFO_EXTRA_EMAIL = "EMAIL"
            const val INFO_EXTRA_IDADE = "IDADE"
            const val INFO_EXTRA_TELEFONE = "TELEFONE"

    }
}
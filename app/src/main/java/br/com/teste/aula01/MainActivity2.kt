package br.com.teste.aula01

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Ativa o modo Edge-to-Edge
        setContentView(R.layout.activity_main2)

        // Configuração da compatibilidade com as barras de sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referência para a TextView "Voltar"
        val voltarTextView = findViewById<TextView>(R.id.textVoltar)

        // Ação de clique na TextView "Voltar"
        voltarTextView.setOnClickListener {
            // Finaliza a MainActivity2 e volta para a MainActivity
            finish()
        }
    }
}

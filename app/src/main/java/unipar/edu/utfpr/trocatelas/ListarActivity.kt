package unipar.edu.utfpr.trocatelas

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class ListarActivity : AppCompatActivity() {

    private lateinit var lvProdutos : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listar)

        lvProdutos = findViewById(R.id.lvProdutos)

        lvProdutos.setOnItemClickListener{ parent, view, position, id ->
            val codigoSelecionado = position + 1
            intent.putExtra("codRetorno", codigoSelecionado)
            setResult(RESULT_OK, intent )
            finish()
        }
    }
}

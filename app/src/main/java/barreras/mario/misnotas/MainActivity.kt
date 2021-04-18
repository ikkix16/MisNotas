package barreras.mario.misnotas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class MainActivity : AppCompatActivity() {


    var notas =ArrayList<Nota>()
    lateinit var adaptador:AdaptadorNotas
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener{
            var intent = Intent(this, AgregarNota::class.java)
            startActivity(intent,123)

        }

        notasDePrueba()
        adaptador= AdaptadorNotas(this,notas)
        list_view.adapter= adaptador;


    }

     fun notasDePrueba() {
        notas.add(Nota("prueba1","contenido1"))
         notas.add(Nota("prueba2","contenido2"))
         notas.add(Nota("prueba3","contenido3"))
    }


}
package barreras.mario.misnotas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter


data class Nota(var titulo:String, var contenido:String)




class AdaptadorNotas: BaseAdapter {
    var context: Context;
    var notas = ArrayList<Nota>()

    constructor(context: Context, notas: ArrayList<Nota>){
        this.context = context
        this.notas=notas
    }

    override fun getCount(): Int {
        return notas.size
    }

    override fun getItem(position: Int): Any {
        return notas[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var inflador= LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.nota,null)
        var nota= notas[position]

        vista.tv_titulo_det.text=nota.titulo;
        vista.tv_contenido_det.text=nota.contenido;

        return vista;

    }


}

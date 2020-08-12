package com.example.kotlinjava

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.ciromine.ciclobike.Ciclovia
import org.w3c.dom.Text

class CycloAdapter(private val cicloList:MutableList<Ciclovia> ):
    RecyclerView.Adapter<CycloAdapter.CycloViewHolder>() {


    class CycloViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var cycloTv : TextView = itemView.findViewById(R.id.cyclo_tv)
        var comunaTv : TextView = itemView.findViewById(R.id.comuna_tv)
    }
//Crea view holder y le pasa el objeto view para que se muestre
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycloViewHolder {
        //con este metodo se devuelve el objeto vista a la variable view
    val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ciclovia,parent,false)
    //retorna al View Holder la vista view
    return CycloViewHolder(view)

    }
//Cantidad de elementos
    override fun getItemCount(): Int {
        return cicloList.size
    }
//Unimos los datos con el elemento por posicion donde tiene que ir a mostrarse
    override fun onBindViewHolder(holder: CycloViewHolder, position: Int) {

    holder.comunaTv.text= cicloList[position].comuna
    holder.cycloTv.text= cicloList[position].nombre


    }

}
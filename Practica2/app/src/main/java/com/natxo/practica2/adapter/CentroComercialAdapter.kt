package com.natxo.practica2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.natxo.practica2.R
import com.natxo.practica2.dataclass.CentroComercial

class CentroComercialAdapter(
    private val centroComercialList : List<CentroComercial>,
    val onClick: (CentroComercial) -> Unit,

) : RecyclerView.Adapter<CentroComercialViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CentroComercialViewHolder {
        val layoutInflater = LayoutInflater.from (parent.context)
        return CentroComercialViewHolder(layoutInflater.inflate(R.layout.item_card, parent, false))
    }

    override fun getItemCount(): Int {
        return centroComercialList.size
    }

    override fun onBindViewHolder(holder: CentroComercialViewHolder, position: Int) {
        val item = centroComercialList[position]
        holder.render(item)

        holder.binding.card.setOnClickListener{
            onClick(item)
        }
    }
}
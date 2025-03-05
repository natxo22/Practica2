package com.natxo.practica2.adapter

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.natxo.practica2.databinding.ItemCardBinding
import com.natxo.practica2.dataclass.CentroComercial

class CentroComercialViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemCardBinding.bind(view)

    @SuppressLint("SetTextI18n")
    fun render(centroComercialModel: CentroComercial) {

        Glide.with(binding.imagen.context).load(centroComercialModel.imagenPortada)
            .into(binding.imagen)
        binding.titulo.text = centroComercialModel.tienda
        binding.direccion.text = centroComercialModel.direccion
        binding.nTiendas.text = centroComercialModel.numeroTiendas.toString()

    }
}

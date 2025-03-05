package com.natxo.practica2

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.natxo.practica2.databinding.ActivityMainBinding
import com.natxo.practica2.databinding.ActivityTiendaBinding

class TiendaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTiendaBinding

    private  var imagen: String? = null
    private  var id: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        imagen = intent.getStringExtra("Imagen") ?: "Imagen no disponible"
        id = intent.getIntExtra("Posicion", 0)

        binding = ActivityTiendaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initTienda()

    }

    private fun initTienda() {
        val tienda = TiendaProvider.tiendaList[id!!]

        Glide.with(binding.imageView.context).load(imagen)
            .into(binding.imageView)

        binding.titulo.text = tienda.tienda
        binding.descripcion.text = tienda.resumen

    }
}
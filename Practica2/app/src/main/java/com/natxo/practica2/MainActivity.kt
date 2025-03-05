package com.natxo.practica2

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.natxo.practica2.adapter.CentroComercialAdapter
import com.natxo.practica2.databinding.ActivityMainBinding
import com.natxo.practica2.dataclass.CentroComercial

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var mediaPlayer: MediaPlayer? = null
    private var lastPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

        mediaPlayer = MediaPlayer.create(this, R.raw.helldivers_metal)
        mediaPlayer?.isLooping = true

        mediaPlayer?.seekTo(lastPosition)
        mediaPlayer?.start()
    }

    private fun initRecyclerView() {

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter =
            CentroComercialAdapter(
                CentroComercialProvider.centroComercialList,
                { centro ->
                    val intent = Intent(this, TiendaActivity::class.java).apply {
                            putExtra("Imagen", centro.imagenPortada)
                            putExtra("Posicion", centro.id)
                    }
                    startActivity(intent)
                }
            )
    }

    override fun onPause() {
        super.onPause()

        lastPosition = mediaPlayer?.currentPosition ?: 0

        mediaPlayer?.pause()
    }

    override fun onResume() {
        super.onResume()

        mediaPlayer?.seekTo(lastPosition)
        mediaPlayer?.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
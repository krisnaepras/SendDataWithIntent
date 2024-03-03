package com.example.senddatawitthintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMA_LENGKAP = "extra_nama_lengkap"
        const val EXTRA_NAMA_PANGGILAN = "extra_nama_panggilan"
        const val EXTRA_NPM = "extra_npm"
        const val EXTRA_ALAMAT = "extra_alamat"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataNamaLengkap: TextView = findViewById(R.id.tv_data_nama_lengkap)
        val tvDataNamaPanggilan: TextView = findViewById(R.id.tv_data_nama_panggilan)
        val tvDataNPM: TextView = findViewById(R.id.tv_data_npm)
        val tvDataAlamat: TextView = findViewById(R.id.tv_data_alamat)

        val nama_lengkap = intent.getStringExtra(EXTRA_NAMA_LENGKAP)
        val nama_panggilan = intent.getStringExtra(EXTRA_NAMA_PANGGILAN)
        val npm = intent.getStringExtra(EXTRA_NPM)
        val alamat = intent.getStringExtra(EXTRA_ALAMAT)

        val textNamaLengkap = "Nama Lengkap : $nama_lengkap"
        val textNamaPanggilan = "Name Panggilan : $nama_panggilan"
        val textNpm = "NPM : $npm"
        val textAlamat = "Alamat : $alamat"

        tvDataNamaLengkap.text = textNamaLengkap
        tvDataNamaPanggilan.text = textNamaPanggilan
        tvDataNPM.text = textNpm
        tvDataAlamat.text = textAlamat
    }
}
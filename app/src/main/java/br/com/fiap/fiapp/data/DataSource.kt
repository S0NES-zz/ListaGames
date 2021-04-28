package br.com.fiap.fiapp.data

import br.com.fiap.fiapp.R
import br.com.fiap.fiapp.model.Jogos

class DataSource {

    fun carregarJogos(): List<Jogos>{
        return listOf<Jogos>(
                Jogos("Uncharted", "PS4", 10.0, R.drawable.ic_baseline_camera_alt_24),
                Jogos("Batman Arkham Knight", "PC/PS4", 10.0, R.drawable.ic_baseline_camera_alt_24),
                Jogos("Transistor", "PC/SWITCH/PS4/XBOX", 50.0/100, R.drawable.ic_baseline_camera_alt_24)
        )
    }

}
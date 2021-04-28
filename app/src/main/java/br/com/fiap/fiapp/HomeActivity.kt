package br.com.fiap.fiapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.fiapp.adapter.ItemAdapter
import br.com.fiap.fiapp.data.DataSource
import br.com.fiap.fiapp.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataset = DataSource().carregarJogos()

        val itemAdapter = ItemAdapter(this, dataset)

        binding.recycler.adapter = itemAdapter

        binding.quantidade.text = "Quantidade: ${itemAdapter.itemCount.toString()}"

        binding.fabtCadastro.setOnClickListener(){
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}
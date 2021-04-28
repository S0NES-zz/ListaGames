package br.com.fiap.fiapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.fiapp.R
import br.com.fiap.fiapp.model.Jogos

class ItemAdapter (val context: Context, val dataset: List<Jogos>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder> ()
{
    class ItemViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.foto)
        val textViewJogo: TextView = view.findViewById(R.id.nomeJogo)
        val textViewConsole: TextView = view.findViewById(R.id.console)
        val textViewNota: TextView = view.findViewById(R.id.nota)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textViewJogo.text = item.Jogo
        holder.textViewConsole.text = item.console
        holder.textViewNota.text = item.nota.toString()
        holder.imageView.setImageResource(item.ImageResourceId)
    }

    override fun getItemCount() = dataset.size

}
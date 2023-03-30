package ni.edu.uca.contenidojson.data


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.contenidojson.dataAdapter.coordinador
import ni.edu.uca.contenidojson.databinding.ItemDataBinding

class DataAdapter(private val coordinadores: List<coordinador>) :
    RecyclerView.Adapter<DataAdapter.CoordinadorViewHolder>() {

    inner class CoordinadorViewHolder(private val binding: ItemDataBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: coordinador) {
            binding.tvNames.text = data.nombres
            binding.tvLastName.text = data.apellidos
            binding.tvFechaNac.text = data.fechaNac
            binding.tvTitulo.text = data.titulo
            binding.tvEmail.text = data.email
            binding.tvFac.text = data.facultad
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoordinadorViewHolder {
        val binding = ItemDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoordinadorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoordinadorViewHolder, position: Int) {
        holder.bind(coordinadores[position])
    }

    override fun getItemCount(): Int {
        return coordinadores.size
    }
}
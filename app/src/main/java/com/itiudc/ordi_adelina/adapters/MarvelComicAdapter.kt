package com.itiudc.ordi_adelina.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.itiudc.ordi_adelina.databinding.CharacterListItemBinding
import com.itiudc.ordi_adelina.models.character

class MarvelComicAdapter(private val characterList: List<character>) : RecyclerView.Adapter<MarvelComicAdapter.ViewHolder>(){
    inner class ViewHolder(private val binding: CharacterListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(character: character) {
            binding.characterName.text = character.name

            if(
                character.description.length == 0)
            {
                binding.characterDsc.text = "There's no description"
            }else{
                binding.characterDsc.text = character.description
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CharacterListItemBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(characterList[position])
    }

    override fun getItemCount(): Int {
        return characterList.count()
    }
}
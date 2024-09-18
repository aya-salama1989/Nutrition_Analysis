package com.misr.nutritionanalysis.modules.summary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.misr.nutritionanalysis.databinding.ItemIngredientBinding
import com.misr.nutritionanalysis.modules.analyse.presentation.NutrientItem

class NutrientsAdapter :
    ListAdapter<NutrientItem, NutrientsAdapter.IngredientItemViewHolder>(DiffCallback) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientItemViewHolder {
        val binding =
            ItemIngredientBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return IngredientItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IngredientItemViewHolder, position: Int) {
        holder.bindData(getItem(position))
    }

    inner class IngredientItemViewHolder(private val binding: ItemIngredientBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(ingredient: NutrientItem) {
            binding.tvFoodName.text = ingredient.name
            binding.tvQuantityUnit.text = ingredient.quantity
            binding.tvWeight.text = ingredient.weight
            binding.tvCalories.text = "${ingredient.calories} kcal"
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<NutrientItem>() {
        override fun areItemsTheSame(
            oldItem: NutrientItem,
            newItem: NutrientItem
        ): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(
            oldItem: NutrientItem,
            newItem: NutrientItem
        ): Boolean {
            return oldItem == newItem
        }
    }
}
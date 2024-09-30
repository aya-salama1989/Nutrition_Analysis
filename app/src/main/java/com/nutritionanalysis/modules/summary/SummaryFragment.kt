package com.nutritionanalysis.modules.summary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.addCallback
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.nutritionanalysis.R
import com.nutritionanalysis.core.BaseViewModelProvider
import com.nutritionanalysis.databinding.SummaryFragmentBinding
import com.nutritionanalysis.modules.analyse.presentation.NutrientsList
import com.nutritionanalysis.modules.analyse.presentation.fragments.KEY_INGREDIENTS_LIST
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SummaryFragment : DaggerFragment() {

    private var _binding: SummaryFragmentBinding? = null

    private val binding get() = _binding!!

    @Inject
    lateinit var baseViewModelProvider: BaseViewModelProvider

    private val viewModel: SummaryViewModel by lazy {
        ViewModelProvider(this, baseViewModelProvider).get(SummaryViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(this) {
            requireActivity().findNavController(R.id.nav_host_fragment)
                .navigate(R.id.dest_analyse_fragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SummaryFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()

    }

    private fun getData() {
        val ingredients = arguments?.getParcelable<NutrientsList>(KEY_INGREDIENTS_LIST)
        initViews(ingredients)
    }

    private fun initViews(ingredients: NutrientsList?) {
        try {
            if (ingredients != null) initSuccessView(ingredients)
        } catch (exception: Exception) {
            initErrorView()
        }
    }

    private fun initErrorView() {
        binding.tvError.visibility = View.VISIBLE
        binding.gpSuccessView.visibility = View.GONE
    }

    private fun initSuccessView(ingredients: NutrientsList) {
        binding.gpSuccessView.visibility = View.VISIBLE
        val adapter = NutrientsAdapter()
        adapter.submitList(ingredients.nutrients)
        binding.rvIngredients.adapter = adapter
        binding.btnTotalCal.setOnClickListener {
            val totalCals = viewModel.countTotalCalories(ingredients)
            Toast.makeText(
                requireContext(),
                "total recipe calories is $totalCals kcal",
                Toast.LENGTH_LONG
            ).show()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
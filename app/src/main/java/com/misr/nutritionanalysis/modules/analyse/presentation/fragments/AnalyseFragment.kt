package com.misr.nutritionanalysis.modules.analyse.presentation.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.misr.nutritionanalysis.R
import com.misr.nutritionanalysis.core.BaseViewModelProvider
import com.misr.nutritionanalysis.databinding.AnalyseFragmentBinding
import com.misr.nutritionanalysis.modules.analyse.presentation.viewmodel.AnalyseViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

const val KEY_INGREDIENTS_LIST = "ingredients_list"

class AnalyseFragment : DaggerFragment() {

    @Inject
    lateinit var baseViewModelProvider: BaseViewModelProvider

    private val viewModel: AnalyseViewModel by lazy {
        ViewModelProvider(this, baseViewModelProvider)
            .get(AnalyseViewModel::class.java)
    }

    private var _binding: AnalyseFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = AnalyseFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        viewModel.nutritionalLiveData.observe(viewLifecycleOwner) {
            val data = Bundle()
            data.putParcelable(KEY_INGREDIENTS_LIST, it)
            findNavController().navigate(R.id.dest_summary_fragment, data)
        }
    }


    private fun initViews() {

        validateEditText()

        binding.btnAnalyse.setOnClickListener {
            viewModel.getAnalysis(binding.etIngredients.text.toString())
        }
    }


    private fun validateEditText() {
        binding.btnAnalyse.apply {
            isEnabled = false
            isClickable = false
        }

        binding.etIngredients.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!s.isNullOrEmpty()) {
                    binding.btnAnalyse.apply {
                        isEnabled = true
                        isClickable = true
                    }
                } else {
                    binding.btnAnalyse.apply {
                        isEnabled = false
                        isClickable = false
                    }
                    Toast.makeText(
                        requireContext(),
                        getString(R.string.add_ingr),
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
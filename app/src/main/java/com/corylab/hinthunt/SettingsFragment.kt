package com.corylab.hinthunt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.corylab.hinthunt.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    private fun init() {
        binding.languageEnglish.setOnClickListener {
            binding.languageRussian.isChecked= false
        }
        binding.languageRussian.setOnClickListener {
            binding.languageEnglish.isChecked = false
        }

        binding.systemSchemeBtn.setOnClickListener {
            binding.lightSchemeBtn.isChecked= false
            binding.darkSchemeBtn.isChecked = false
        }
        binding.lightSchemeBtn.setOnClickListener {
            binding.systemSchemeBtn.isChecked = false
            binding.darkSchemeBtn.isChecked = false
        }
        binding.darkSchemeBtn.setOnClickListener {
            binding.systemSchemeBtn.isChecked = false
            binding.lightSchemeBtn.isChecked = false
        }

    }
}
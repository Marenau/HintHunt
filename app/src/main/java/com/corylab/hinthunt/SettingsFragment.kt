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
            binding.languageEnglish.isChecked= true
        }
        binding.languageRussian.setOnClickListener {
            binding.languageEnglish.isChecked = false
            binding.languageRussian.isChecked= true
        }

        binding.systemSchemeChp.setOnClickListener {
            binding.lightSchemeChp.isChecked= false
            binding.darkSchemeChp.isChecked= false
            binding.systemSchemeChp.isChecked = true
        }
        binding.lightSchemeChp.setOnClickListener {
            binding.systemSchemeChp.isChecked = false
            binding.darkSchemeChp.isChecked = false
            binding.lightSchemeChp.isChecked = true
        }
        binding.darkSchemeChp.setOnClickListener {
            binding.lightSchemeChp.isChecked = false
            binding.systemSchemeChp.isChecked = false
            binding.darkSchemeChp.isChecked = true
        }

    }
}
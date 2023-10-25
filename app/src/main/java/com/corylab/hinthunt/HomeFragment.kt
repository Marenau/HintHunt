package com.corylab.hinthunt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.corylab.hinthunt.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    private fun init() {
        binding.settingsBtn.setOnClickListener { findNavController().navigate(R.id.action_homeFragment_to_settingsFragment) }
        binding.createGameBtn.setOnClickListener { findNavController().navigate(R.id.action_homeFragment_to_createGameFragment) }
        binding.connectGameBtn.setOnClickListener { findNavController().navigate(R.id.action_homeFragment_to_playerFragment) }
    }
}
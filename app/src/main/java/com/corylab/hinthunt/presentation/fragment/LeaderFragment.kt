package com.corylab.hinthunt.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.corylab.hinthunt.databinding.FragmentLeaderBinding
import com.corylab.hinthunt.presentation.adapter.WordCardAdapter
import com.corylab.hinthunt.presentation.viewmodel.WordViewModel


class LeaderFragment : Fragment() {
    private var _binding: FragmentLeaderBinding? = null
    private val binding get() = _binding!!
    private val wordViewModel: WordViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLeaderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        val layoutManager = GridLayoutManager(activity, 3, GridLayoutManager.VERTICAL, false)
        binding.cardRcv.layoutManager = layoutManager
        val wordCardAdapter = WordCardAdapter()
        binding.cardRcv.adapter = wordCardAdapter
        wordViewModel.cards!!.observe(viewLifecycleOwner, wordCardAdapter::submitList)
    }
}
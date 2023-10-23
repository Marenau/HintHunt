package com.corylab.hinthunt

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.corylab.hinthunt.databinding.FragmentCreateGameBinding

class CreateGameFragment : Fragment() {
    private var _binding: FragmentCreateGameBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreateGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()

    }

    private fun init() {
        var background = createButtonBackground(0XFFFF5E5B.toInt(), 0XFF58A6CB.toInt())
        binding.wildBerriesBtn.background = background

        binding.wildBerriesBtn.setOnClickListener {
            val background = createButtonBackground(0XFFFF5E5B.toInt(), 0XFF58A6CB.toInt())
            if (binding.wildBerriesBtn.isChecked) background.setStroke(5, Color.WHITE)
            binding.wildBerriesBtn.background = background
        }

        background = createButtonBackground(0XFF61AD6E.toInt(), 0XFFFF8D45.toInt())
        binding.carrotFreshnessBtn.background = background

        binding.carrotFreshnessBtn.setOnClickListener {
            val background = createButtonBackground(0XFF61AD6E.toInt(), 0XFFFF8D45.toInt())
            if (binding.carrotFreshnessBtn.isChecked) background.setStroke(5, Color.WHITE)
            binding.carrotFreshnessBtn.background = background
        }

        background = createButtonBackground(0XFFB4A414.toInt(), 0XFF27ABA9.toInt())
        binding.mustardFieldBtn.background = background

        binding.mustardFieldBtn.setOnClickListener {
            val background = createButtonBackground(0XFFB4A414.toInt(), 0XFF27ABA9.toInt())
            if (binding.mustardFieldBtn.isChecked) background.setStroke(5, Color.WHITE)
            binding.mustardFieldBtn.background = background
        }

        background = createButtonBackground(0XFF56599E.toInt(), 0XFFCF8A8A.toInt())
        binding.nobleSaffronBtn.background = background

        binding.nobleSaffronBtn.setOnClickListener {
            val background = createButtonBackground(0XFF56599E.toInt(), 0XFFCF8A8A.toInt())
            if (binding.nobleSaffronBtn.isChecked) background.setStroke(5, Color.WHITE)
            binding.nobleSaffronBtn.background = background
        }

        background = createButtonBackground(0XFF7C3E73.toInt(), 0XFF476EBC.toInt())
        binding.lilacAtMidnightBtn.background = background

        binding.lilacAtMidnightBtn.setOnClickListener {
            val background = createButtonBackground(0XFF7C3E73.toInt(), 0XFF476EBC.toInt())
            if (binding.lilacAtMidnightBtn.isChecked) background.setStroke(5, Color.WHITE)
            binding.lilacAtMidnightBtn.background = background
        }

        background = createButtonBackground(0XFF356F40.toInt(), 0XFFBC4749.toInt())
        binding.cranberriesInMossBtn.background = background

        binding.cranberriesInMossBtn.setOnClickListener {
            val background = createButtonBackground(0XFF356F40.toInt(), 0XFFBC4749.toInt())
            if (binding.cranberriesInMossBtn.isChecked) background.setStroke(5, Color.WHITE)
            binding.cranberriesInMossBtn.background = background
        }
    }

    fun createButtonBackground(firstColor: Int, secondColor: Int): GradientDrawable {
        val colors = intArrayOf(firstColor, secondColor)
        val orientation = GradientDrawable.Orientation.LEFT_RIGHT
        val background = GradientDrawable(orientation, colors)
        background.shape = GradientDrawable.RECTANGLE
        background.cornerRadius = 16F
        return background
    }
}
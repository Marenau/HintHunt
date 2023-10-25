package com.corylab.hinthunt

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.corylab.hinthunt.databinding.FragmentCreateGameBinding
import com.google.android.material.button.MaterialButton

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

        binding.size18Btn.setOnClickListener {
            binding.size21Btn.isChecked = false
            binding.size24Btn.isChecked = false
        }

        binding.size21Btn.setOnClickListener {
            binding.size18Btn.isChecked = false
            binding.size24Btn.isChecked = false
        }

        binding.size24Btn.setOnClickListener {
            binding.size18Btn.isChecked = false
            binding.size21Btn.isChecked = false
        }

        binding.oneStarBtn.setOnClickListener {
            binding.twoStarBtn.isChecked = false
            binding.threeStarBtn.isChecked = false
        }

        binding.twoStarBtn.setOnClickListener {
            binding.oneStarBtn.isChecked = false
            binding.threeStarBtn.isChecked = false
        }

        binding.threeStarBtn.setOnClickListener {
            binding.oneStarBtn.isChecked = false
            binding.twoStarBtn.isChecked = false
        }

        var background: GradientDrawable? = createButtonBackground(0XFFFF5E5B.toInt(), 0XFF58A6CB.toInt())
        binding.wildBerriesBtn.background = background

        binding.wildBerriesBtn.setOnClickListener {
            var background: GradientDrawable? = createButtonBackground(0XFFFF5E5B.toInt(), 0XFF58A6CB.toInt())
            if (binding.wildBerriesBtn.isChecked) {
                background!!.setStroke(5, Color.WHITE)
                offCheckedButton(binding.wildBerriesBtn.id)
            }
            binding.wildBerriesBtn.background = background
            background = null
        }

        background = createButtonBackground(0XFF61AD6E.toInt(), 0XFFFF8D45.toInt())
        binding.carrotFreshnessBtn.background = background

        binding.carrotFreshnessBtn.setOnClickListener {
            var background: GradientDrawable? = createButtonBackground(0XFF61AD6E.toInt(), 0XFFFF8D45.toInt())
            if (binding.carrotFreshnessBtn.isChecked) {
                background!!.setStroke(5, Color.WHITE)
                offCheckedButton(binding.carrotFreshnessBtn.id)
            }
            binding.carrotFreshnessBtn.background = background
            background = null
        }

        background = createButtonBackground(0XFFB4A414.toInt(), 0XFF27ABA9.toInt())
        binding.mustardFieldBtn.background = background

        binding.mustardFieldBtn.setOnClickListener {
            var background: GradientDrawable? = createButtonBackground(0XFFB4A414.toInt(), 0XFF27ABA9.toInt())
            if (binding.mustardFieldBtn.isChecked) {
                background!!.setStroke(5, Color.WHITE)
                offCheckedButton(binding.mustardFieldBtn.id)
            }
            binding.mustardFieldBtn.background = background
            background = null
        }

        background = createButtonBackground(0XFF56599E.toInt(), 0XFFCF8A8A.toInt())
        binding.nobleSaffronBtn.background = background

        binding.nobleSaffronBtn.setOnClickListener {
            var background: GradientDrawable? = createButtonBackground(0XFF56599E.toInt(), 0XFFCF8A8A.toInt())
            if (binding.nobleSaffronBtn.isChecked) {
                background!!.setStroke(5, Color.WHITE)
                offCheckedButton(binding.nobleSaffronBtn.id)
            }
            binding.nobleSaffronBtn.background = background
            background = null
        }

        background = createButtonBackground(0XFF7C3E73.toInt(), 0XFF476EBC.toInt())
        binding.lilacAtMidnightBtn.background = background

        binding.lilacAtMidnightBtn.setOnClickListener {
            var background: GradientDrawable? = createButtonBackground(0XFF7C3E73.toInt(), 0XFF476EBC.toInt())
            if (binding.lilacAtMidnightBtn.isChecked) {
                background!!.setStroke(5, Color.WHITE)
                offCheckedButton(binding.lilacAtMidnightBtn.id)
            }
            binding.lilacAtMidnightBtn.background = background
            background = null
        }

        background = createButtonBackground(0XFF356F40.toInt(), 0XFFBC4749.toInt())
        binding.cranberriesInMossBtn.background = background

        binding.cranberriesInMossBtn.setOnClickListener {
            var background: GradientDrawable? = createButtonBackground(0XFF356F40.toInt(), 0XFFBC4749.toInt())
            if (binding.cranberriesInMossBtn.isChecked) {
                background!!.setStroke(5, Color.WHITE)
                offCheckedButton(binding.cranberriesInMossBtn.id)
            }
            binding.cranberriesInMossBtn.background = background
            background = null
        }

        background = null

        binding.createBtn.setOnClickListener { findNavController().navigate(R.id.action_createGameFragment_to_leaderFragment) }
    }

    private fun createButtonBackground(firstColor: Int, secondColor: Int): GradientDrawable {
        val colors = intArrayOf(firstColor, secondColor)
        val orientation = GradientDrawable.Orientation.LEFT_RIGHT
        val background = GradientDrawable(orientation, colors)
        background.shape = GradientDrawable.RECTANGLE
        background.cornerRadius = 16F
        return background
    }

    private fun offCheckedButton(id: Int) {
        when {
            id != binding.wildBerriesBtn.id && binding.wildBerriesBtn.isChecked -> {
                binding.wildBerriesBtn.isChecked = false
                binding.wildBerriesBtn.background = createButtonBackground(0XFFFF5E5B.toInt(), 0XFF58A6CB.toInt())
            }
            id != binding.carrotFreshnessBtn.id && binding.carrotFreshnessBtn.isChecked -> {
                binding.carrotFreshnessBtn.isChecked= false
                binding.carrotFreshnessBtn.background = createButtonBackground(0XFF61AD6E.toInt(), 0XFFFF8D45.toInt())
            }

            id != binding.mustardFieldBtn.id && binding.mustardFieldBtn.isChecked -> {
                binding.mustardFieldBtn.isChecked = false
                binding.mustardFieldBtn.background = createButtonBackground(0XFFB4A414.toInt(), 0XFF27ABA9.toInt())
            }

            id != binding.nobleSaffronBtn.id && binding.nobleSaffronBtn.isChecked -> {
                binding.nobleSaffronBtn.isChecked = false
                binding.nobleSaffronBtn.background = createButtonBackground(0XFF56599E.toInt(), 0XFFCF8A8A.toInt())
            }

            id != binding.lilacAtMidnightBtn.id && binding.lilacAtMidnightBtn.isChecked -> {
                binding.lilacAtMidnightBtn.isChecked = false
                binding.lilacAtMidnightBtn.background = createButtonBackground(0XFF7C3E73.toInt(), 0XFF476EBC.toInt())
            }

            id != binding.cranberriesInMossBtn.id && binding.cranberriesInMossBtn.isChecked -> {
                binding.cranberriesInMossBtn.isChecked = false
                binding.cranberriesInMossBtn.background = createButtonBackground(0XFF356F40.toInt(), 0XFFBC4749.toInt())
            }
        }
    }
}
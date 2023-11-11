package com.corylab.hinthunt.data.model

import android.graphics.Color
import com.corylab.hinthunt.R
import com.corylab.hinthunt.presentation.application.HintHunt

data class WordCard(val word: String, var color: Color = Color.valueOf(HintHunt.context.resources.getColor(R.color.light_gray, HintHunt.context.theme))) {
}
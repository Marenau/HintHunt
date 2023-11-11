package com.corylab.hinthunt.data.datasource

import com.corylab.hinthunt.R
import com.corylab.hinthunt.presentation.application.HintHunt

class WordCardSource() {
    fun getEasyWords(size: Int) = HintHunt.context.resources.openRawResource(R.raw.easy_words).bufferedReader().readLines().shuffled().take(size)
    fun getMediumWords(size: Int) = HintHunt.context.resources.openRawResource(R.raw.medium_words).bufferedReader().readLines().shuffled().take(size)
    fun getHardWords(size: Int) = HintHunt.context.resources.openRawResource(R.raw.hard_words).bufferedReader().readLines().shuffled().take(size)
}
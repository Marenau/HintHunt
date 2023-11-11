package com.corylab.hinthunt.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.corylab.hinthunt.data.model.WordCard
import com.corylab.hinthunt.data.repository.Repository

class WordViewModel(application: Application) : AndroidViewModel(application) {
    private val wordRepository: Repository = Repository(application)
    var cards: LiveData<List<WordCard>>? = null

    init {
        val cardsList = wordRepository.getWords()
        cards = MutableLiveData(cardsList.map { word -> WordCard(word) })
    }
}
package com.corylab.hinthunt.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.corylab.hinthunt.data.repository.Repository

class SharedPreferencesViewModel(application: Application) : AndroidViewModel(application) {
    private val wordRepository: Repository = Repository(application)

    fun getInt(key: String) = wordRepository.getInt(key)

    fun setInt(key: String, number: Int) = wordRepository.setInt(key, number)

    fun getString(key: String) = wordRepository.getString(key)

    fun setString(key: String, text: String) = wordRepository.setString(key, text)
}
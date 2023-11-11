package com.corylab.hinthunt.data.repository

import android.app.Application
import com.corylab.hinthunt.data.datasource.SharedPreferencesSource
import com.corylab.hinthunt.data.datasource.WordCardSource

class Repository(application: Application) {
    private val sharedPreferencesSource = SharedPreferencesSource(application)
    private val wordCardSource = WordCardSource()

    fun getInt(key: String) = sharedPreferencesSource.getInt(key)

    fun setInt(key: String, number: Int) = sharedPreferencesSource.setInt(key, number)

    fun getString(key: String) = sharedPreferencesSource.getString(key)

    fun setString(key: String, text: String) = sharedPreferencesSource.setString(key, text)

    private fun getSize() = getInt("size")

    private fun getEasyWords() = wordCardSource.getEasyWords(getSize())

    private fun getMediumWords() = wordCardSource.getMediumWords(getSize())

    private fun getHardWords() = wordCardSource.getHardWords(getSize())

    fun getWords(): List<String> {
        val words: List<String> = when (sharedPreferencesSource.getInt("complexity")) {
            1 -> getEasyWords()
            2 -> getMediumWords()
            else -> getHardWords()
        }
        return words
    }
}
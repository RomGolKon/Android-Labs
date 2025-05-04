// CityViewModel.kt
package com.example.city

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CityViewModel : ViewModel() {

    private val _recommendations = MutableLiveData<List<String>>()
    val recommendations: LiveData<List<String>> get() = _recommendations

    init {
        loadRecommendations(1)
    }

    fun loadRecommendations(type: Int) {
        when (type) {
            1 -> _recommendations.value = listOf("Позимь", "Кафе-пельменная Горячий пельмень", "Кофе Семь", "Tasty Coffee")
            2 -> _recommendations.value = listOf("Каре", "Бобровая долина", "Вино и Мясо", "Brauplatz")
            3 -> _recommendations.value = listOf("Парк динозавров «Динополис»", "Енот-Парк", "Летний сад им. Горького", "Загородный клуб Wolki & Lipki")
            4 -> _recommendations.value = listOf("Парк культуры им. С.М. Кирова", "Парк Горького (Летний сад им. М. Горького)", "Парк Космонавтов", "Березовая роща (Козий парк)")
            5 -> _recommendations.value = listOf("Петровский", "Талисман", "Омега", "Молл матрица")
            else -> Log.e("CityViewModel", "Неверный тип данных")
        }
    }

}
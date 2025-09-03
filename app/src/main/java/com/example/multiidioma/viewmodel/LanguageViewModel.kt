package com.example.multiidioma.viewmodel

import android.app.Application
import androidx.annotation.StringRes
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.multiidioma.utils.setLocale
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LanguageViewModel(application: Application) : AndroidViewModel(application) {

    private val _language = MutableStateFlow("gl") // idioma por defecto
    val language: StateFlow<String> = _language

    // Función para obtener strings localizados
    fun getString(@StringRes resId: Int): String {
        val localizedContext = getApplication<Application>().setLocale(_language.value)
        return localizedContext.getString(resId)
    }

    fun setLanguage(lang: String) {
        _language.value = lang
    }
}
/*
class LanguageViewModel : ViewModel() {
    private val _language = MutableStateFlow("en") // idioma por defecto
    val language: StateFlow<String> = _language

    fun changeLanguage(lang: String) {
        _language.value = lang
    }
}
*/
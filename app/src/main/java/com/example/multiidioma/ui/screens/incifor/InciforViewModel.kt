package com.example.multiidioma.ui.screens.incifor

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.MiniScreenState
import com.example.multiidioma.data.repository.InciforRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class InciforViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaInciforRepository = InciforRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaInciforRepository.getData(0),
                    listaInciforRepository.getData(1),
                    listaInciforRepository.getData(2),
                    listaInciforRepository.getData(3),
                    listaInciforRepository.getData(4),
                    listaInciforRepository.getData(5),
                    listaInciforRepository.getData(6),
                    listaInciforRepository.getData(7),
                    listaInciforRepository.getData(8),
                    listaInciforRepository.getData(9),
                    listaInciforRepository.getData(10),
                    listaInciforRepository.getData(11),
                    listaInciforRepository.getData(12),

                    )
            )

        }
    }
}
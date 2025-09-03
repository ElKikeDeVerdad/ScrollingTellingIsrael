package com.example.multiidioma.ui.cimus

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.MiniScreenState
import com.example.multiidioma.data.repository.CimusRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class CimusViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

       loadMiniScreens()
    }

    private fun loadMiniScreens(){
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaCimusRepository = CimusRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaCimusRepository.getParrafos(0),
                    listaCimusRepository.getParrafos(1),
                    listaCimusRepository.getParrafos(2)
                    )
                )

        }
    }
}


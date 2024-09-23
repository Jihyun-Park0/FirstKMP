package com.example.jihyun.firstkmp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jihyun.firstkmp.repository.BirdImage
import com.example.jihyun.firstkmp.repository.BirdRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class ListUiState(
    val images: List<BirdImage> = emptyList(),
)

class ListViewModel(private val birdRepository: BirdRepository) : ViewModel() {
    private val _uiState = MutableStateFlow(ListUiState(emptyList()))
    val uiState = _uiState.asStateFlow()

    fun updateImages() {
        viewModelScope.launch {
            val images = birdRepository.getImages()
            _uiState.update {
                it.copy(images = images)
            }
        }
    }

    override fun onCleared() {
        birdRepository.close()
    }
}

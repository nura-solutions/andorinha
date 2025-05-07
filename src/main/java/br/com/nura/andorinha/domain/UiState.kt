package br.com.nura.andorinha.domain

sealed class UiState {
    object Loading : UiState()
    object Error: UiState()
    object Content: UiState()
}
package br.com.nura.andorinha.domain

sealed class ScreenState {
    data object Idle : ScreenState()
    data object Loading : ScreenState()
    data class Error(val message: String?) : ScreenState()
    data object Content : ScreenState()
}

sealed class ResourceState<out T> {
    data object Loading : ResourceState<Nothing>()
    data class Error(val message: String?) : ResourceState<Nothing>()
    data class Content<T>(val data: T) : ResourceState<T>()
}
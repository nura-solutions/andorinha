package br.com.nura.andorinha.components.scaffold

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import br.com.nura.andorinha.components.loading.CircularLoading
import br.com.nura.andorinha.domain.UiState

@Composable
fun StatefulContent(
    uiState: UiState,
    onLoading: @Composable () -> Unit = {
        CircularLoading()
    },
    onError: @Composable () -> Unit = {},
    content: @Composable () -> Unit
) {
    Box {
        when(uiState) {
            UiState.Content -> content()
            UiState.Error -> onError()
            UiState.Loading -> onLoading()
        }
    }
}


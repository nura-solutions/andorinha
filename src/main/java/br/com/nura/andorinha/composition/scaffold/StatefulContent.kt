package br.com.nura.andorinha.composition.scaffold

import androidx.compose.runtime.Composable
import br.com.nura.andorinha.components.loading.CircularLoading
import br.com.nura.andorinha.composition.genericerror.GenericErrorScreen
import br.com.nura.andorinha.domain.ScreenState

@Composable
fun StatefulContent(
    uiState: ScreenState,
    onLoading: @Composable () -> Unit = {
        CircularLoading()
    },
    onError: @Composable () -> Unit = {
        GenericErrorScreen()
    },
    content: @Composable () -> Unit
) {
    when (uiState) {
        ScreenState.Loading -> onLoading()
        is ScreenState.Error -> onError()
        else -> content()
    }
}


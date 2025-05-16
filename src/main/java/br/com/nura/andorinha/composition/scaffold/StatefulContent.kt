package br.com.nura.andorinha.composition.scaffold

import androidx.compose.runtime.Composable
import br.com.nura.andorinha.components.loading.CircularLoading
import br.com.nura.andorinha.composition.genericerror.GenericErrorScreen
import br.com.nura.andorinha.domain.ScreenState

/**
 * A reusable component that handles the UI rendering logic for different resource states: loading, error, and idle.
 *
 * @param uiState The current [ScreenState].
 * @param onLoading Composable displayed while loading. Default: a circular loading [CircularLoading].
 * @param onError Composable displayed on error. Default: a generic error screen [GenericErrorScreen].
 * @param content Composable displayed when the data is ready to be shown.
 *
 * @sample br.com.nura.andorinha.samples.SampleStatefulContent
 */
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


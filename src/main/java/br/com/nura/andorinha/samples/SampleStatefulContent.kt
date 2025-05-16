package br.com.nura.andorinha.samples

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import br.com.nura.andorinha.composition.scaffold.StatefulContent
import br.com.nura.andorinha.domain.ScreenState

@Composable
fun SampleStatefulContent() {
    StatefulContent(
        uiState = ScreenState.Loading,
        content = {
            Text("Stateful Content")
        }
    )
}
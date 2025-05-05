package br.com.nura.andorinha.components.bottomnav

import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun NavLabel(resId: Int) {
    BasicText(
        text = stringResource(resId),
        style = MaterialTheme.typography.bodySmall
    )
}
package br.com.nura.andorinha.components.bottomnav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import br.com.nura.andorinha.theme.Dimens

@Composable
fun SelectedMarker(selected: Boolean) {
    Box(
        modifier = Modifier
            .width(Dimens.Icon.lg)
            .height(2.dp)
            .alpha(if (selected) 0.6f else 0.0f)
            .background(MaterialTheme.colorScheme.onSurface)
    )
}
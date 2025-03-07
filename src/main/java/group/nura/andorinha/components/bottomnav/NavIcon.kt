package group.nura.andorinha.components.bottomnav

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import group.nura.andorinha.components.icon.Icon

@Composable
fun NavIcon(resId: Int, isHighlighted: Boolean) {
    val color = if (isHighlighted) MaterialTheme.colorScheme.surface else Color.Unspecified
    Icon(
        resId = resId,
        tint = color,
        modifier = Modifier
            .height(if (isHighlighted) 48.dp else 24.dp)
            .aspectRatio(1f)
            .clipToBounds()
    )
}
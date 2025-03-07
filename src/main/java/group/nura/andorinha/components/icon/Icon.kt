package group.nura.andorinha.components.icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

@Composable
fun Icon(
    modifier: Modifier = Modifier,
    resId: Int,
    tint: Color = Color.Unspecified,
    contentDescription: String? = null,
) {
    androidx.compose.material3.Icon(
        modifier = modifier,
        painter = painterResource(id = resId),
        contentDescription = contentDescription,
        tint = tint
    )
}

@Composable
fun Icon(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    tint: Color = Color.Unspecified,
    contentDescription: String? = null,
) {
    androidx.compose.material3.Icon(
        modifier = modifier,
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint = tint
    )
}
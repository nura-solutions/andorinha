package group.nura.andorinha.components.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import group.nura.andorinha.R
import group.nura.andorinha.theme.AndorinhaTheme
import group.nura.andorinha.theme.Dimens

@Composable
fun IconButton(@DrawableRes icon: Int, onClick: () -> Unit) {
    androidx.compose.material3.IconButton(
        modifier = Modifier.size(Dimens.Icon.md),
        onClick = onClick
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview
@Composable
fun IconButtonPreview() {
    AndorinhaTheme {
        IconButton(R.drawable.ic_launcher_foreground) {}
    }
}
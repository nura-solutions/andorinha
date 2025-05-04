package group.nura.andorinha.components.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import group.nura.andorinha.theme.Dimens
import group.nura.andorinha.utils.elevation

@Composable
fun RoundedButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        elevation = ButtonDefaults.elevation(Dimens.Elevation.md),
        shape = RoundedCornerShape(Dimens.CornerRadius.xlg),
        onClick = onClick
    ) {
        BasicText(text = text.toUpperCase(Locale.current))
    }
}

@Preview
@Composable
fun PreviewRoundedButton() {
    RoundedButton(text = "Button") {}
}
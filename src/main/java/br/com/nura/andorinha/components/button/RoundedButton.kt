package br.com.nura.andorinha.components.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import br.com.nura.andorinha.theme.Dimens
import br.com.nura.andorinha.theme.LocalAppColors
import br.com.nura.andorinha.utils.elevation

@Composable
fun ButtonDefaults.defaultRoundedButtonColors() = ButtonDefaults.buttonColors(
    containerColor = LocalAppColors.current.primary,
    contentColor = LocalAppColors.current.onPrimary,
    disabledContainerColor = LocalAppColors.current.disabledContainer,
    disabledContentColor = LocalAppColors.current.disabled
)

@Composable
fun RoundedButton(
    modifier: Modifier = Modifier,
    text: String,
    colors: ButtonColors = ButtonDefaults.defaultRoundedButtonColors(),
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        elevation = ButtonDefaults.elevation(Dimens.Elevation.md),
        shape = RoundedCornerShape(Dimens.CornerRadius.XLarge),
        colors = colors,
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
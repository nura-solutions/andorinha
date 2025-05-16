package br.com.nura.andorinha.components.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.nura.andorinha.theme.ComponentSpecs
import br.com.nura.andorinha.theme.Dimens

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    OutlinedButton(
        modifier = modifier
            .fillMaxWidth()
            .height(ComponentSpecs.Button.height),
        shape = RoundedCornerShape(Dimens.CornerRadius.Medium),
        onClick = onClick
    ) {
        BasicText(
            text = text,
        )
    }
}

@Composable
@Preview
fun PreviewSecondaryButton() {
    SecondaryButton(
        modifier = Modifier,
        text = "Secondary Button"
    ) {}
}


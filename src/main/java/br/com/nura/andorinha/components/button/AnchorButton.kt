package br.com.nura.andorinha.components.button

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AnchorButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    ClickableText(
        modifier = modifier,
        text = AnnotatedString(text),
        onClick = { onClick() },
        overflow = TextOverflow.Visible,
    )
}

@Composable
@Preview
fun PreviewAnchorButton() {
    AnchorButton(text = "Anchor button") {

    }
}
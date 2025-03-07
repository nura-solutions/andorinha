package group.nura.andorinha.components.button

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    OutlinedButton(
        modifier = modifier
            .width(305.dp)
            .height(56.dp),
        shape = RoundedCornerShape(5.dp),
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


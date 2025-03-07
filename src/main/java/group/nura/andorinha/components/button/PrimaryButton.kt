package group.nura.andorinha.components.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import group.nura.andorinha.theme.AndorinhaTheme
import group.nura.andorinha.theme.Dimens
import group.nura.andorinha.utils.elevation

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
            disabledContentColor = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f)
        ),
        shape = RoundedCornerShape(5.dp),
        onClick = onClick
    ) {
        BasicText(text = text)
    }
}

@Composable
@Preview
fun PreviewPrimaryButton() {
    AndorinhaTheme {
        Column {
            PrimaryButton(
                modifier = Modifier,
                text = "Primary Button"
            ) {}
            Spacer(modifier = Modifier.height(Dimens.Small_100))
            PrimaryButton(
                modifier = Modifier,
                text = "Primary Button"
            ) {}
            Spacer(modifier = Modifier.height(Dimens.Small_100))
            PrimaryButton(
                modifier = Modifier,
                enabled = false,
                text = "Primary Button"
            ) {}
            Spacer(modifier = Modifier.height(Dimens.Small_100))
            PrimaryButton(
                modifier = Modifier,
                enabled = false,
                text = "Primary Button"
            ) {}
            Spacer(modifier = Modifier.height(Dimens.Small_100))
        }
    }
}
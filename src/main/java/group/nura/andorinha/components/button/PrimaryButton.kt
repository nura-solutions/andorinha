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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import group.nura.andorinha.theme.AndorinhaTheme
import group.nura.andorinha.theme.ComponentSpecs
import group.nura.andorinha.theme.Dimens

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
            .height(ComponentSpecs.Button.height),
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
            disabledContentColor = MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f)
        ),
        shape = RoundedCornerShape(Dimens.CornerRadius.md),
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
            Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
            PrimaryButton(
                modifier = Modifier,
                text = "Primary Button"
            ) {}
            Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
            PrimaryButton(
                modifier = Modifier,
                enabled = false,
                text = "Primary Button"
            ) {}
            Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
            PrimaryButton(
                modifier = Modifier,
                enabled = false,
                text = "Primary Button"
            ) {}
            Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
        }
    }
}
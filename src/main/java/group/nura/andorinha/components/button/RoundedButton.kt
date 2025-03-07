package group.nura.andorinha.components.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import group.nura.andorinha.utils.elevation

@Composable
fun RoundedButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        elevation = ButtonDefaults.elevation(3.dp),
        shape = RoundedCornerShape(30.dp),
        onClick = onClick
    ) {
        BasicText(text = text.toUpperCase(Locale.current))
    }
}